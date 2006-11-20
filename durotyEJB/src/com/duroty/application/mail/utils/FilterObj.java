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


package com.duroty.application.mail.utils;

import java.io.Serializable;


/**
 * @author Jordi Marquès
 * @version 1.0
*/
public class FilterObj implements Serializable {
    /**
     * DOCUMENT ME!
     */
    private static final long serialVersionUID = -577160996797886556L;

    /**
     * DOCUMENT ME!
     */
    private Integer idint;

    /**
     * DOCUMENT ME!
     */
    private LabelObj label;

    /**
     * DOCUMENT ME!
     */
    private String from;

    /**
     * DOCUMENT ME!
     */
    private String to;

    /**
     * DOCUMENT ME!
     */
    private String subject;

    /**
     * DOCUMENT ME!
     */
    private String hasWords;

    /**
     * DOCUMENT ME!
     */
    private String doesntHaveWords;

    /**
     * DOCUMENT ME!
     */
    private boolean hasAttachment;

    /**
     * DOCUMENT ME!
     */
    private boolean archive;

    /**
     * DOCUMENT ME!
     */
    private boolean important;

    /**
     * DOCUMENT ME!
     */
    private String forward;

    /**
     * DOCUMENT ME!
     */
    private boolean trash;

    /**
     * DOCUMENT ME!
     */
    private boolean operator;

    /**
     * Creates a new FilterObj object.
     */
    public FilterObj() {
        super();
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getDoesntHaveWords() {
        return doesntHaveWords;
    }

    /**
     * DOCUMENT ME!
     *
     * @param doesntHaveWords DOCUMENT ME!
     */
    public void setDoesntHaveWords(String doesntHaveWords) {
        this.doesntHaveWords = doesntHaveWords;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getFrom() {
        return from;
    }

    /**
     * DOCUMENT ME!
     *
     * @param from DOCUMENT ME!
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * DOCUMENT ME!
     *
     * @param hasAttachment DOCUMENT ME!
     */
    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getHasWords() {
        return hasWords;
    }

    /**
     * DOCUMENT ME!
     *
     * @param hasWords DOCUMENT ME!
     */
    public void setHasWords(String hasWords) {
        this.hasWords = hasWords;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Integer getIdint() {
        return idint;
    }

    /**
     * DOCUMENT ME!
     *
     * @param idint DOCUMENT ME!
     */
    public void setIdint(Integer idint) {
        this.idint = idint;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getSubject() {
        return subject;
    }

    /**
     * DOCUMENT ME!
     *
     * @param subject DOCUMENT ME!
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getTo() {
        return to;
    }

    /**
     * DOCUMENT ME!
     *
     * @param to DOCUMENT ME!
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * DOCUMENT ME!
     *
     * @param archive DOCUMENT ME!
     */
    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getForward() {
        return forward;
    }

    /**
     * DOCUMENT ME!
     *
     * @param forward DOCUMENT ME!
     */
    public void setForward(String forward) {
        this.forward = forward;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isImportant() {
        return important;
    }

    /**
     * DOCUMENT ME!
     *
     * @param important DOCUMENT ME!
     */
    public void setImportant(boolean important) {
        this.important = important;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isTrash() {
        return trash;
    }

    /**
     * DOCUMENT ME!
     *
     * @param trash DOCUMENT ME!
     */
    public void setTrash(boolean trash) {
        this.trash = trash;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public LabelObj getLabel() {
        return label;
    }

    /**
     * DOCUMENT ME!
     *
     * @param label DOCUMENT ME!
     */
    public void setLabel(LabelObj label) {
        this.label = label;
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isOperator() {
        return operator;
    }

    /**
     * DOCUMENT ME!
     *
     * @param operator DOCUMENT ME!
     */
    public void setOperator(boolean operator) {
        this.operator = operator;
    }
}
