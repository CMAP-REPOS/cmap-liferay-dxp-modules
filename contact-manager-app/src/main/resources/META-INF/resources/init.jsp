<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@ page import="com.liferay.portal.kernel.model.PersistedModel"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@ page import="contact.manager.comparator.*"%>

<%@ page import="com.liferay.portal.kernel.util.OrderByComparator"%>

<%@ page import="contact.manager.app.constants.ConstantContactKeys"%>

<%@ page import="contact.manager.app.viewmodel.CrmContactViewModel" %>
<%@ page import="contact.manager.model.CrmContact"%>
<%@ page import="contact.manager.service.CrmContactLocalServiceUtil"%>

<%@ page import="contact.manager.app.viewmodel.CrmGroupViewModel"%>
<%@ page import="contact.manager.model.CrmGroup"%>
<%@ page import="contact.manager.model.CrmContact"%>
<%@ page import="contact.manager.service.CrmGroupLocalServiceUtil"%>

<%@ page import="contact.manager.service.permission.CrmContactModelPermission" %>
<%@ page import="contact.manager.service.permission.CrmContactPermission" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	String currentURL = PortalUtil.getCurrentURL(request);
%>