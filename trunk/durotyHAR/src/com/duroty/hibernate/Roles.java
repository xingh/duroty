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
import java.util.HashSet;
import java.util.Set;


/**
 * Roles generated by hbm2java
 */
public class Roles implements java.io.Serializable {
    // Fields    

    /**
     *
     */
    private static final long serialVersionUID = 7640687925400503718L;

    /**
     * DOCUMENT ME!
     */
    private int rolIdint;

    /**
     * DOCUMENT ME!
     */
    private String rolName;

    /**
     * DOCUMENT ME!
     */
    private Set userRoles = new HashSet(0);

    // Constructors

    /** default constructor */
    public Roles() {
    }

    /** minimal constructor */
    public Roles(int rolIdint, String rolName) {
        this.rolIdint = rolIdint;
        this.rolName = rolName;
    }

    /** full constructor */
    public Roles(int rolIdint, String rolName, Set userRoles) {
        this.rolIdint = rolIdint;
        this.rolName = rolName;
        this.userRoles = userRoles;
    }

    // Property accessors

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int getRolIdint() {
        return this.rolIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @param rolIdint DOCUMENT ME!
     */
    public void setRolIdint(int rolIdint) {
        this.rolIdint = rolIdint;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getRolName() {
        return this.rolName;
    }

    /**
     * DOCUMENT ME!
     *
     * @param rolName DOCUMENT ME!
     */
    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Set getUserRoles() {
        return this.userRoles;
    }

    /**
     * DOCUMENT ME!
     *
     * @param userRoles DOCUMENT ME!
     */
    public void setUserRoles(Set userRoles) {
        this.userRoles = userRoles;
    }
}
