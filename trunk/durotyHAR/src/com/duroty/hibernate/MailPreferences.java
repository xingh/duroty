/*
* Copyright (C) 2006 Jordi Marquès Ferré
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this software; see the file DUROTY.txt.
*
* Author: Jordi Marquès Ferré
* c/Mallorca 295 principal B 08037 Barcelona Spain
* Phone: +34 625397324
*/


package com.duroty.hibernate;


// Generated 10-ago-2006 15:30:53 by Hibernate Tools 3.1.0.beta5

/**
 * MailPreferences generated by hbm2java
 */
public class MailPreferences implements java.io.Serializable {
    // Fields    

    /**
         *
         */
    private static final long serialVersionUID = -5359489702803485139L;

    /**
    * DOCUMENT ME!
    */
    private int maprIdint;

    /**
     * DOCUMENT ME!
     */
    private Users users;

    /**
     * DOCUMENT ME!
     */
    private int maprMessagesByPage;

    /**
     * DOCUMENT ME!
     */
    private String maprSignature;

    /**
     * DOCUMENT ME!
     */
    private boolean maprHtmlMessage;

    /**
     * DOCUMENT ME!
     */
    private boolean maprVacationActive;

    /**
     * DOCUMENT ME!
     */
    private String maprVacationSubject;

    /**
     * DOCUMENT ME!
     */
    private String maprVacationBody;

    /**
     * DOCUMENT ME!
     */
    private int maprQuotaSize;

    /**
     * DOCUMENT ME!
     */
    private int maprSpamTolerance;

    // Constructors

    /** default constructor */
    public MailPreferences() {
    }

    /** minimal constructor */
    public MailPreferences(int maprIdint, Users users, int maprMessagesByPage,
        boolean maprHtmlMessage, boolean maprVacationActive, int maprQuotaSize,
        int maprSpamTolerance) {
        this.maprIdint = maprIdint;
        this.users = users;
        this.maprMessagesByPage = maprMessagesByPage;
        this.maprHtmlMessage = maprHtmlMessage;
        this.maprVacationActive = maprVacationActive;
        this.maprQuotaSize = maprQuotaSize;
        this.maprSpamTolerance = maprSpamTolerance;
    }

    /** full constructor */
    public MailPreferences(int maprIdint, Users users, int maprMessagesByPage,
        String maprSignature, boolean maprHtmlMessage,
        boolean maprVacationActive, String maprVacationSubject,
        String maprVacationBody, int maprQuotaSize, int maprSpamTolerance) {
        this.maprIdint = maprIdint;
        this.users = users;
        this.maprMessagesByPage = maprMessagesByPage;
        this.maprSignature = maprSignature;
        this.maprHtmlMessage = maprHtmlMessage;
        this.maprVacationActive = maprVacationActive;
        this.maprVacationSubject = maprVacationSubject;
        this.maprVacationBody = maprVacationBody;
        this.maprQuotaSize = maprQuotaSize;
        this.maprSpamTolerance = maprSpamTolerance;
    }

    // Property accessors
    public int getMaprIdint() {
        return this.maprIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprIdint DOCUMENT ME!
     */
    public void setMaprIdint(int maprIdint) {
        this.maprIdint = maprIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Users getUsers() {
        return this.users;
    }

    /**
     * DOCUMENT ME!
     *
     * @param users DOCUMENT ME!
     */
    public void setUsers(Users users) {
        this.users = users;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int getMaprMessagesByPage() {
        return this.maprMessagesByPage;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprMessagesByPage DOCUMENT ME!
     */
    public void setMaprMessagesByPage(int maprMessagesByPage) {
        this.maprMessagesByPage = maprMessagesByPage;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getMaprSignature() {
        return this.maprSignature;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprSignature DOCUMENT ME!
     */
    public void setMaprSignature(String maprSignature) {
        this.maprSignature = maprSignature;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isMaprHtmlMessage() {
        return this.maprHtmlMessage;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprHtmlMessage DOCUMENT ME!
     */
    public void setMaprHtmlMessage(boolean maprHtmlMessage) {
        this.maprHtmlMessage = maprHtmlMessage;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isMaprVacationActive() {
        return this.maprVacationActive;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprVacationActive DOCUMENT ME!
     */
    public void setMaprVacationActive(boolean maprVacationActive) {
        this.maprVacationActive = maprVacationActive;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getMaprVacationSubject() {
        return this.maprVacationSubject;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprVacationSubject DOCUMENT ME!
     */
    public void setMaprVacationSubject(String maprVacationSubject) {
        this.maprVacationSubject = maprVacationSubject;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getMaprVacationBody() {
        return this.maprVacationBody;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprVacationBody DOCUMENT ME!
     */
    public void setMaprVacationBody(String maprVacationBody) {
        this.maprVacationBody = maprVacationBody;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int getMaprQuotaSize() {
        return this.maprQuotaSize;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprQuotaSize DOCUMENT ME!
     */
    public void setMaprQuotaSize(int maprQuotaSize) {
        this.maprQuotaSize = maprQuotaSize;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int getMaprSpamTolerance() {
        return this.maprSpamTolerance;
    }

    /**
     * DOCUMENT ME!
     *
     * @param maprSpamTolerance DOCUMENT ME!
     */
    public void setMaprSpamTolerance(int maprSpamTolerance) {
        this.maprSpamTolerance = maprSpamTolerance;
    }
}
