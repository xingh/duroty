/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.home.ejb;


/**
 * Session layer for Home.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public class HomeSession extends com.duroty.application.home.ejb.HomeBean
    implements javax.ejb.SessionBean {
    /**
          *
          */
    private static final long serialVersionUID = 6295030096796166467L;

    /**
     * DOCUMENT ME!
     *
     * @throws javax.ejb.EJBException DOCUMENT ME!
     * @throws java.rmi.RemoteException DOCUMENT ME!
     */
    public void ejbActivate()
        throws javax.ejb.EJBException, java.rmi.RemoteException {
        super.ejbActivate();
    }

    /**
     * DOCUMENT ME!
     *
     * @throws javax.ejb.EJBException DOCUMENT ME!
     * @throws java.rmi.RemoteException DOCUMENT ME!
     */
    public void ejbPassivate()
        throws javax.ejb.EJBException, java.rmi.RemoteException {
        super.ejbPassivate();
    }

    /**
     * DOCUMENT ME!
     *
     * @param ctx DOCUMENT ME!
     *
     * @throws javax.ejb.EJBException DOCUMENT ME!
     */
    public void setSessionContext(javax.ejb.SessionContext ctx)
        throws javax.ejb.EJBException {
        super.setSessionContext(ctx);
    }

    /**
     * DOCUMENT ME!
     */
    public void unsetSessionContext() {
    }

    /**
     * DOCUMENT ME!
     *
     * @throws javax.ejb.EJBException DOCUMENT ME!
     * @throws java.rmi.RemoteException DOCUMENT ME!
     */
    public void ejbRemove()
        throws javax.ejb.EJBException, java.rmi.RemoteException {
        super.ejbRemove();
    }
}
