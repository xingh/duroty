/**
 *
 */
package com.duroty.service;

import com.duroty.lucene.bookmark.LuceneBookmarkContants;
import com.duroty.lucene.bookmark.indexer.BookmarkIndexer;
import com.duroty.lucene.bookmark.indexer.BookmarkIndexerConstants;

import com.duroty.utils.log.DLog;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;


/**
 * @author durot
 *
 */
public class BookmarkOptimizerThread implements Runnable,
    BookmarkIndexerConstants, LuceneBookmarkContants {
    /**
     * DOCUMENT ME!
     */
    private Servible servible;

    /**
        * DOCUMENT ME!
        */
    private String simplePath;

    /**
     * DOCUMENT ME!
     */
    private String optimizedPath;

    /**
     * DOCUMENT ME!
     */
    private Analyzer analyzer;

    /**
     * DOCUMENT ME!
     */
    private String userPath;

    /**
     * DOCUMENT ME!
     */
    private String lockFile;

    /**
     *
     */
    public BookmarkOptimizerThread(Servible servible, String lockFile,
        String userPath, String simplePath, String optimizedPath,
        Analyzer analyzer) {
        super();
        this.servible = servible;
        this.lockFile = lockFile;
        this.userPath = userPath;
        this.simplePath = simplePath;
        this.optimizedPath = optimizedPath;
        this.analyzer = analyzer;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
        try {
            File simple = new File(simplePath);
            File[] childs = simple.listFiles();

            if (childs != null) {
                try {
                    flush(childs);
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
            System.gc();
        } catch (OutOfMemoryError e2) {
            System.gc();
        } catch (Throwable e2) {
            System.gc();
        } finally {
        	try {
                File lock = new File(lockFile);

                if (lock.exists()) {
                    lock.delete();
                }
            } catch (Exception e) {
            }
            
            if (servible != null) {
            	servible.removePool(optimizedPath);
            }
        }
    }

    /**
     * DOCUMENT ME!
     *
     * @param childs DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    private void flush(File[] childs) throws Exception {
    	if (childs == null || childs.length == 0) {
    		return;
    	}
    	
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        File optimized = new File(optimizedPath);
        boolean create = false;
        IndexWriter writer = null;

        try {
            if (!IndexReader.indexExists(optimized)) {
                optimized.mkdirs();
                create = true;
            }

            synchronized (this) {
                if (IndexReader.isLocked(optimizedPath)) {
                    return;
                } else {
                    Directory dir = FSDirectory.getDirectory(new File(
                                optimizedPath), create);
                    writer = new IndexWriter(dir, analyzer, create);
                }

                for (int i = 0; i < childs.length; i++) {
                    boolean lock = true;
                    File child = childs[i];
                    File[] faux = child.listFiles();

                    for (int j = 0; j < faux.length; j++) {
                        if (faux[j].getName().equals("is.unlock")) {
                            faux[j].delete();
                            lock = false;

                            break;
                        }
                    }

                    if (!lock) {
                        Directory[] aux = new Directory[1];
                        aux[0] = FSDirectory.getDirectory(child, false);

                        IndexSearcher searcher = null;

                        try {
                            searcher = new IndexSearcher(aux[0]);

                            Document doc = searcher.doc(0);

                            if (doc != null) {
                                BookmarkIndexer.createSpell(userPath + SPELL,
                                    Field_title, doc);
                                BookmarkIndexer.createSpell(userPath + SPELL,
                                    Field_keywords, doc);
                                BookmarkIndexer.createSpell(userPath + SPELL,
                                    Field_contents, doc);
                                BookmarkIndexer.createSpell(userPath + SPELL,
                                    Field_comments, doc);
                            }
                        } catch (Exception ex) {
                            if ((ex != null) &&
                                    !(ex instanceof NullPointerException)) {
                                DLog.log(DLog.INFO, this.getClass(), ex);
                            }
                        } finally {
                            if (searcher != null) {
                                try {
                                    searcher.close();
                                } catch (Exception e) {
                                }
                            }
                        }

                        writer.addIndexes(aux);
                        writer.optimize();

                        for (int j = 0; j < faux.length; j++) {
                            faux[j].delete();
                        }

                        child.delete();
                    }
                }

                writer.close();
                writer = null;
            }
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
