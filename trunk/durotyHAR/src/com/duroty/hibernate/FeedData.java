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


// Generated 31-jul-2006 11:12:15 by Hibernate Tools 3.1.0.beta5

/**
 * FeedData generated by hbm2java
 */
public class FeedData implements java.io.Serializable {
    // Fields    

    /**
     *
     */
    private static final long serialVersionUID = -4268626554007818458L;

    /**
     * DOCUMENT ME!
     */
    private int fedaIdint;

    /**
     * DOCUMENT ME!
     */
    private FeedChannel feedChannel;

    /**
     * DOCUMENT ME!
     */
    private String fedaName;

    /**
     * DOCUMENT ME!
     */
    private String fedaValue;

    // Constructors

    /** default constructor */
    public FeedData() {
    }

    /** full constructor */
    public FeedData(int fedaIdint, FeedChannel feedChannel, String fedaName,
        String fedaValue) {
        this.fedaIdint = fedaIdint;
        this.feedChannel = feedChannel;
        this.fedaName = fedaName;
        this.fedaValue = fedaValue;
    }

    // Property accessors

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int getFedaIdint() {
        return this.fedaIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @param fedaIdint DOCUMENT ME!
     */
    public void setFedaIdint(int fedaIdint) {
        this.fedaIdint = fedaIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public FeedChannel getFeedChannel() {
        return this.feedChannel;
    }

    /**
     * DOCUMENT ME!
     *
     * @param feedChannel DOCUMENT ME!
     */
    public void setFeedChannel(FeedChannel feedChannel) {
        this.feedChannel = feedChannel;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getFedaName() {
        return this.fedaName;
    }

    /**
     * DOCUMENT ME!
     *
     * @param fedaName DOCUMENT ME!
     */
    public void setFedaName(String fedaName) {
        this.fedaName = fedaName;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getFedaValue() {
        return this.fedaValue;
    }

    /**
     * DOCUMENT ME!
     *
     * @param fedaValue DOCUMENT ME!
     */
    public void setFedaValue(String fedaValue) {
        this.fedaValue = fedaValue;
    }
}
