package com.duroty.jmx.mbean;

import org.jboss.system.ServiceMBean;


/**
 * DOCUMENT ME!
 *
 * @author $author$
 * @version $Revision: 1.1 $
 */
public interface DurotyMailFactoryMBean extends ServiceMBean {
    /**
     * DOCUMENT ME!
     *
     * @param JNDIName DOCUMENT ME!
     */
    public void setJNDIName(String JNDIName);

    /**
     * DOCUMENT ME!
     */
    public String getJNDIName();

    /**
     * DOCUMENT ME!
     *
     * @param username DOCUMENT ME!
     */
    public void setUsername(String username);

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getUsername();

    /**
     * DOCUMENT ME!
     *
     * @param password DOCUMENT ME!
     */
    public void setPassword(String password);

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getPassword();

    /**
    * Configuration for the mail service.
    */
    public org.w3c.dom.Element getConfiguration();

    /**
     * Configuration for the mail service.
     */
    public void setConfiguration(org.w3c.dom.Element element);
}
