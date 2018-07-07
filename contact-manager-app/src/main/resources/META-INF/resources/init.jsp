<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>

<%@ page import="com.liferay.portal.kernel.model.PersistedModel"%>
<%@ page import="com.liferay.portal.kernel.model.User" %>

<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>

<%@ page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>

<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="contact.manager.app.constants.ConstantContactKeys"%>
<%@ page import="contact.manager.app.constants.ContactManagerAppPortletKeys"%>
<%@ page import="contact.manager.app.constants.CrmContactAuditLogKeys" %>
<%@ page import="contact.manager.app.constants.CrmContactFieldKeys"%>
<%@ page import="contact.manager.app.constants.CrmNoteKeys"%>
<%@ page import="contact.manager.app.constants.CrmOutreachLogKeys" %>

<%@ page import="contact.manager.app.util.GroupUtil" %>
<%@ page import="contact.manager.app.util.PermissionUtil"%>

<%@ page import="contact.manager.app.viewmodel.CrmContactViewModel" %>
<%@ page import="contact.manager.app.viewmodel.CrmGroupViewModel"%>

<%@ page import="contact.manager.comparator.*"%>

<%@ page import="contact.manager.model.CrmContact"%>
<%@ page import="contact.manager.model.CrmContactAuditLog"%>
<%@ page import="contact.manager.model.CrmContactAuditLogChange"%>
<%@ page import="contact.manager.model.CrmGroup"%>
<%@ page import="contact.manager.model.CrmNote"%>
<%@ page import="contact.manager.model.CrmOutreachLog"%>

<%@ page import="contact.manager.service.CrmContactAuditLogServiceUtil"%>
<%@ page import="contact.manager.service.CrmContactAuditLogChangeServiceUtil"%>
<%@ page import="contact.manager.service.CrmContactServiceUtil"%>
<%@ page import="contact.manager.service.CrmGroupServiceUtil"%>
<%@ page import="contact.manager.service.CrmNoteServiceUtil"%>
<%@ page import="contact.manager.service.CrmOutreachLogServiceUtil"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>

<%@ page import="javax.portlet.PortletURL" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	String currentURL = PortalUtil.getCurrentURL(request);
	User currentUser =  PortalUtil.getUser(request);
%>