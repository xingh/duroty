/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.mail.ejb;

/**
 * Session layer for Mail.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public class MailSession
   extends com.duroty.application.mail.ejb.MailBean
   implements javax.ejb.SessionBean
{
   /**
	 * 
	 */
	private static final long serialVersionUID = -5152091376405944137L;

public void ejbActivate() throws javax.ejb.EJBException, java.rmi.RemoteException
   {

      super.ejbActivate();
   }

   public void ejbPassivate() throws javax.ejb.EJBException, java.rmi.RemoteException
   {
      super.ejbPassivate();
   }

   public void setSessionContext(javax.ejb.SessionContext ctx) throws javax.ejb.EJBException
   {
      super.setSessionContext(ctx);
   }

   public void unsetSessionContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.EJBException, java.rmi.RemoteException
   {
      super.ejbRemove();
   }

}
