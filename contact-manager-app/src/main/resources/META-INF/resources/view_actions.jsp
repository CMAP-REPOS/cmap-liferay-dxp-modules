<%@ include file="/init.jsp"%>

<%-- https://web.liferay.com/community/forums/-/message_boards/message/40902770 --%>
<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmContact crmContact = (CrmContact) searchContainerRow.getObject();
%>

<liferay-ui:icon-menu>

	<portlet:renderURL var="viewContactURL">
		<portlet:param name="mvcPath" value="/details.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>

	<portlet:renderURL var="editContactURL">
		<portlet:param name="mvcPath" value="/edit.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>

	<portlet:actionURL name="deleteContact" var="deleteContactURL">
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
	</portlet:actionURL>

	<liferay-ui:icon image="view_articles" message="View"
		url="<%=viewContactURL.toString()%>" />

	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editContactURL.toString()%>" />

	<liferay-ui:icon-delete url="<%=deleteContactURL.toString()%>" />

</liferay-ui:icon-menu>