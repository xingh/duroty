/*
 * Generated by XDoclet - Do not edit!
 */
package com.duroty.application.chat.interfaces;


/**
 * Home interface for Chat.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ChatHome extends javax.ejb.EJBHome {
    /**
     * DOCUMENT ME!
     */
    public static final String COMP_NAME = "duroty/ejb/Chat";

    /**
     * DOCUMENT ME!
     */
    public static final String JNDI_NAME = "duroty/ejb/Chat";

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws javax.ejb.CreateException DOCUMENT ME!
     * @throws java.rmi.RemoteException DOCUMENT ME!
     */
    public com.duroty.application.chat.interfaces.Chat create()
        throws javax.ejb.CreateException, java.rmi.RemoteException;
}
