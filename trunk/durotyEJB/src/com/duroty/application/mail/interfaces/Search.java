/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.mail.interfaces;

/**
 * Remote interface for Search.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface Search
   extends javax.ejb.EJBObject
{
   /**
    * Search messages by text
    * @return SearchObj
    * @throws MailException Thrown if method fails due to system-level error.    */
   public com.duroty.application.mail.utils.SearchObj simple( java.lang.String token,int page,int messagesByPage,int order,java.lang.String orderType,boolean excludeTrash )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Advanced Search messages by AdvacedObj
    * @return SearchObj
    * @throws MailException Thrown if method fails due to system-level error.    */
   public com.duroty.application.mail.utils.SearchObj advanced( com.duroty.application.mail.utils.AdvancedObj advancedObj,int page,int messagesByPage,int order,java.lang.String orderType )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Test filter search
    * @return SearchObj
    * @throws MailException Thrown if method fails due to system-level error.    */
   public com.duroty.application.mail.utils.SearchObj testFilter( com.duroty.application.mail.utils.FilterObj filterObj,int page,int messagesByPage,int order,java.lang.String orderType )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

   /**
    * Did you mean
    * @return String
    * @throws MailException Thrown if method fails due to system-level error.    */
   public java.lang.String didYouMean( java.lang.String token )
      throws com.duroty.application.mail.exceptions.MailException, java.rmi.RemoteException;

}
