<%@ page language="java" import="com.duroty.cookie.CookieManager" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<fmt:setLocale value='${sessionScope["org.apache.struts.action.LOCALE"]}' scope="session" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="<c:out value="${sessionScope['org.apache.struts.action.LOCALE']}" />" lang="<c:out value="${sessionScope['org.apache.struts.action.LOCALE']}" />">

	<head>
		<base href="<%=basePath%>" />
		<title>Duroty System</title>
		<meta http-equiv="keywords" content="jordi marquès, duroty, gmail, lucene, jboss, mail, james, tomcat, pop3, imap, java, email, webmail, network" />
		<meta http-equiv="description" content="Duroty is a service of personal feeds, email management, link management and briefly it will also include electronic calendar and server file indexation. Duroty is addressed to SMEs which need information and knowledge management systems in order to diminish the barrier to the access to information." />
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<meta name="ROBOTS" content="INDEX, FOLLOW" />
		<meta name="ROBOTS" content="INDEX, ALL" />
		<meta name="language" content="<c:out value="${sessionScope['org.apache.struts.action.LOCALE']}" />" />		
		
		<!-- The AJAX Library -->
		<script type="text/javascript" src="<%=basePath%>javascript/ajax.js"></script>
		
		<!-- The Utils Library -->
		<script type="text/javascript" src="<%=basePath%>javascript/utils.js"></script>

		<link href="<%=basePath%>style/login_style.css" rel="stylesheet" type="text/css" />
		
		<script language="javascript" type="text/javascript">
			try {
				if (parent && parent.document.body.rows) {
					parent.document.body.rows = "100%,*,*";
				}
			} catch (e) {
			}
		
			function setLocale(_locale) {
				window.location.href = "<%=basePath%>language/setLocale.drt?language=" + _locale;
			}					
		</script>
	</head>
	<body>
		<div id="mesh">
			<table width="100%" align="center" border="0" cellspacing="0" cellpadding="0" class="mesh">
				<tr>
					<td>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td class="headLeft">
									<img src="<%=basePath%>images/duroty_anim.gif" border="0" />
								</td>
								<td width="100%" class="headCenter">
									<fmt:message key="general.welcome" />
								</td>
							</tr>
							<tr>
								<td height="2" colspan="2"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td class="contents" colspan="2">
									<!-- BODY -->
									<c:set var="dlanguage" value="en" />
									<c:choose>
										<c:when test="${!empty sessionScope['org.apache.struts.action.LOCALE']}">
											<c:set var="dlanguage" value="${sessionScope['org.apache.struts.action.LOCALE']}" />
										</c:when>
									</c:choose>
									<c:import url="/login/message_${dlanguage}.jsp" />	
									<!-- FI BODY -->
								</td>
								<td class="right" nowrap="nowrap">
									<!-- RIGHT -->
									<br />
									<br />									
									<table width="100%" border="0" cellspacing="0" cellpadding="3" style="border: 1px solid #d5ad3f;">
										<tr>
											<td width="100%">
												<form method="post" action="<%=basePath%>login/forgotPassword.drt" style="margin: 0px; padding: 0px;" enctype="multipart/form-data">
												<table width="100%" border="0" cellspacing="0" cellpadding="4" style="background-color: #eeeeee;">
													<c:choose>
														<c:when test="${!empty exception}">
															<tr>
																<td style="text-align: center; color: red; font-size: 13px;" nowrap="nowrap" colspan="2">																																			
																	<fmt:message key="${exception}" />
																</td>
															</tr>															
														</c:when>
														<c:otherwise>
														</c:otherwise>
													</c:choose>
													<tr>
														<td style="text-align: right;" nowrap="nowrap">
															<fmt:message key="general.forgot.data" />:
														</td>
														<td width="100%" style="text-align: left;">
															<input type="text" name="j_data" size="17" maxlength="255" style="width: 95%;" />
														</td>
													</tr>
													<tr>
														<td style="text-align: right;" nowrap="nowrap">
														</td>
														<td width="100%" style="text-align: left;">
															<img src="jcaptcha" />
														</td>
													</tr>	
													<tr>
														<td style="text-align: right;" nowrap="nowrap">
														</td>
														<td width="100%" style="text-align: left;">
															<input type='text' name='j_captcha_response' size="17" maxlength="255" style="width: 95%;" />
														</td>
													</tr>		
													<tr>
														<td style="text-align: right;" nowrap="nowrap">
														</td>
														<td width="100%" style="text-align: left;">
															<input type="submit" style="background-color: #fbcc4b;" name="general.send" value="<fmt:message key="general.send" />" />
														</td>
													</tr>											
													<tr>
														<td width="100%" style="text-align: center;" colspan="2">
															<select name="j_language" size="1" onchange="javascript:setLocale(this.options[this.selectedIndex].value);">
																<option value="0"><fmt:message key="general.language.choose" /></option>
																<c:choose>
																	<c:when test="${sessionScope['org.apache.struts.action.LOCALE'] == 'en'}">
																		<option value="en" selected="selected">English</option>
																		<option value="ca">Català</option>
																		<option value="es">Castellano</option>
																	</c:when>
																	<c:when test="${sessionScope['org.apache.struts.action.LOCALE'] == 'es'}">
																		<option value="en" selected="selected">English</option>
																		<option value="ca">Català</option>
																		<option value="es" selected="selected">Castellano</option>
																	</c:when>
																	<c:when test="${sessionScope['org.apache.struts.action.LOCALE'] == 'ca'}">
																		<option value="en">English</option>
																		<option value="ca" selected="selected">Català</option>
																		<option value="es">Castellano</option>
																	</c:when>
																	<c:otherwise>
																		<option value="en" selected="selected">English</option>
																		<option value="ca">Català</option>
																		<option value="es">Castellano</option>
																	</c:otherwise>
																</c:choose>																
															</select>
														</td>
													</tr>
													<tr>
														<td width="100%" height="4" colspan="2"></td>
													</tr>
													<tr>
														<td width="100%" style="text-align: center; padding-right: 5px; padding-left: 5px;" colspan="2">
															<a href="<%=basePath%>index.jsp" target="_top"><fmt:message key="mail.button.back" /></a>
														</td>
													</tr>
													<tr>
														<td width="100%" height="4" colspan="2"></td>
													</tr>													
												</table>
												</form>
											</td>
										</tr>
									</table>
									<!-- FI RIGHT -->
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td class="foot">
						<!-- FOOT -->
						<!-- FI FOOT -->
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
