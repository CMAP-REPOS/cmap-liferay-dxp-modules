<%@ include file="/init.jsp"%>

<%-- https://web.liferay.com/community/forums/-/message_boards/message/40902770 --%>
<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmContact crmContact = (CrmContact) searchContainerRow.getObject();
%>

<portlet:renderURL var="viewContactURL">
	<portlet:param name="mvcPath" value="/details.jsp" />
	<portlet:param name="crmContactId"
		value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
</portlet:renderURL>

<portlet:renderURL var="editContactURL">
	<portlet:param name="mvcPath" value="/edit.jsp" />
	<portlet:param name="crmContactId"
		value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
</portlet:renderURL>

<portlet:renderURL var="deleteContactURL">
	<portlet:param name="mvcPath" value="/delete.jsp" />
	<portlet:param name="crmContactId"
		value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
</portlet:renderURL>

<aui:button onClick="<%= viewContactURL.toString() %>" value="Details"></aui:button>
<%-- <aui:button onClick="<%= editContactURL.toString() %>" value="Edit"></aui:button>
<aui:button onClick="<%= deleteContactURL.toString() %>" value="Delete"></aui:button> --%>
