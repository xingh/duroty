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


/**
 *
 */
package com.duroty.application.mail.actions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.duroty.application.mail.interfaces.Mail;
import com.duroty.application.mail.interfaces.Preferences;
import com.duroty.application.mail.interfaces.Send;
import com.duroty.application.mail.utils.MailDefaultAction;
import com.duroty.application.mail.utils.MailPartObj;
import com.duroty.constants.Constants;
import com.duroty.constants.ExceptionCode;
import com.duroty.utils.exceptions.ExceptionUtilities;
import com.duroty.utils.log.DLog;
import com.duroty.utils.log.DMessage;


/**
 * @author durot
 *
 */
public class SendAction extends MailDefaultAction {
    /**
     * Creates a new SendAction object.
     */
    public SendAction() {
        super();
    }

    /* (non-Javadoc)
     * @see com.duroty.controller.actions.DefaultAction#doExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected ActionForward doExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        ActionMessages errors = new ActionMessages();
        InputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            boolean isMultipart = FileUpload.isMultipartContent(request);

            Mail mailInstance = getMailInstance(request);

            if (isMultipart) {
                Map fields = new HashMap();
                Vector attachments = new Vector();

                //Parse the request
                List items = diskFileUpload.parseRequest(request);

                //Process the uploaded items
                Iterator iter = items.iterator();

                while (iter.hasNext()) {
                    FileItem item = (FileItem) iter.next();

                    if (item.isFormField()) {
                        if (item.getFieldName().equals("forwardAttachments")) {
                            String[] aux = item.getString().split(":");
                            MailPartObj part = mailInstance.getAttachment(aux[0], aux[1]);
                            inputStream = new ByteArrayInputStream(part.getAttachent());

                            File dir = new File(System.getProperty("user.home") + File.separator + "tmp");

                            if (!dir.exists()) {
                                dir.mkdir();
                            }

                            File out = new File(dir, part.getName());
                            outputStream = new FileOutputStream(out);

                            IOUtils.copy(inputStream, outputStream);

                            IOUtils.closeQuietly(inputStream);
                            IOUtils.closeQuietly(outputStream);

                            attachments.addElement(out);
                        } else {
                            fields.put(item.getFieldName(), item.getString());
                        }
                    } else {
                        if (!StringUtils.isBlank(item.getName())) {
                            File dir = new File(System.getProperty("user.home") +
                                    File.separator + "tmp");

                            if (!dir.exists()) {
                                dir.mkdir();
                            }

                            File out = new File(dir, item.getName());
                            item.write(out);

                            attachments.addElement(out);
                        }
                    }
                }

                String body = "";

                if (fields.get("taBody") != null) {
                    body = (String) fields.get("taBody");
                } else if (fields.get("taReplyBody") != null) {
                    body = (String) fields.get("taReplyBody");
                }

                Preferences preferencesInstance = getPreferencesInstance(request);

                Send sendInstance = getSendInstance(request);

                String mid = (String) fields.get("mid");

                if (StringUtils.isBlank(mid)) {
                    request.setAttribute("action", "compose");
                } else {
                    request.setAttribute("action", "reply");
                }

                Boolean isHtml = null;

                if (StringUtils.isBlank((String) fields.get("isHtml"))) {
                    isHtml = new Boolean(preferencesInstance.getPreferences()
                                                            .isHtmlMessage());
                } else {
                    isHtml = Boolean.valueOf((String) fields.get("isHtml"));
                }

                sendInstance.send(mid,
                    Integer.parseInt((String) fields.get("identity")),
                    (String) fields.get("to"), (String) fields.get("cc"),
                    (String) fields.get("bcc"), (String) fields.get("subject"),
                    body, attachments, isHtml.booleanValue(),
                    Charset.defaultCharset().displayName(),
                    (String) fields.get("priority"));
            } else {
                errors.add("general",
                    new ActionMessage(ExceptionCode.ERROR_MESSAGES_PREFIX +
                        "mail.send", "The form is null"));
                request.setAttribute("exception", "The form is null");
                request.setAttribute("newLocation", null);
                doTrace(request, DLog.ERROR, getClass(), "The form is null");
            }
        } catch (Exception ex) {
            String errorMessage = ExceptionUtilities.parseMessage(ex);

            if (errorMessage == null) {
                errorMessage = "NullPointerException";
            }

            errors.add("general",
                new ActionMessage(ExceptionCode.ERROR_MESSAGES_PREFIX +
                    "general", errorMessage));
            request.setAttribute("exception", errorMessage);
            doTrace(request, DLog.ERROR, getClass(), errorMessage);
        } finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }

        if (errors.isEmpty()) {
            doTrace(request, DLog.INFO, getClass(), "OK");

            return mapping.findForward(Constants.ACTION_SUCCESS_FORWARD);
        } else {
            saveErrors(request, errors);

            return mapping.findForward(Constants.ACTION_FAIL_FORWARD);
        }
    }

    /* (non-Javadoc)
     * @see com.duroty.controller.actions.DefaultAction#doTrace(javax.servlet.http.HttpServletRequest, int, java.lang.Class, java.lang.String)
     */
    protected void doTrace(HttpServletRequest request, int level, Class classe,
        String message) throws Exception {
        DLog.log(level, classe, DMessage.toString(request, message));
    }
}
