/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.home.interfaces;


/**
 * Home interface for Home.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface HomeHome extends javax.ejb.EJBHome {
    /**
     * DOCUMENT ME!
     */
    public static final String COMP_NAME = "duroty/ejb/Home";

    /**
     * DOCUMENT ME!
     */
    public static final String JNDI_NAME = "duroty/ejb/Home";

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws javax.ejb.CreateException DOCUMENT ME!
     * @throws java.rmi.RemoteException DOCUMENT ME!
     */
    public com.duroty.application.home.interfaces.Home create()
        throws javax.ejb.CreateException, java.rmi.RemoteException;
}
