/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.files.interfaces;

/**
 * Remote interface for Files.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface Files
   extends javax.ejb.EJBObject
{
   /**
    * Get user labels
    * @throws MailException Thrown if method fails due to system-level error.    */
   public java.util.Vector getLabels(  )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Situa els missatges identificats per mids en un flag característic
    * @throws MailException Thrown if method fails due to system-level error.    */
   public void flagFiles( java.lang.Integer[] idints )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Mou els missatges dels attachments seleccionats a la papelera
    * @throws MailException Thrown if method fails due to system-level error.    */
   public void deleteFiles( java.lang.Integer[] idints )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Mou els missatges dels attachments de la paperera a FILES
    * @throws MailException Thrown if method fails due to system-level error.    */
   public void restoreFiles( java.lang.Integer[] idints )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Get messages by folder
    * @return Vector
    * @throws MailException Thrown if method fails due to system-level error.    */
   public java.util.Vector getFiles( java.lang.String folderName,int label,int page,int messagesByPage,int order,java.lang.String orderType )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Get count messages in folder
    * @return Vector
    * @throws MailException Thrown if method fails due to system-level error.    */
   public int getCountFiles( java.lang.String folderName,int label )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Get attachment by mid and hash part
    * @return MailPartObj
    * @throws MailException Thrown if method fails due to system-level error.    */
   public com.duroty.application.mail.utils.MailPartObj getAttachment( java.lang.String mid,java.lang.String hash )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Get counter for info to boxes and labels
    * @return Counters
    * @throws MailException Thrown if method fails due to system-level error.    */
   public com.duroty.application.mail.utils.Counters getInfoCounters(  )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Move messages to folder
    * @throws MailException Thrown if method fails due to system-level error.    */
   public void moveFiles( java.lang.String[] mids,java.lang.String folder )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Apply label to messages
    * @throws MailException Thrown if method fails due to system-level error.    */
   public void applyLabel( java.lang.Integer label,java.lang.Integer[] idints )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

}
