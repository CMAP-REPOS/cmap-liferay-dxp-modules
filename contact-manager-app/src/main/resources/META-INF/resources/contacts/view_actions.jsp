<%@ include file="../init.jsp"%>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmContactViewModel viewModel = (CrmContactViewModel) searchContainerRow.getObject();
%>

<liferay-ui:icon-menu>

	<portlet:renderURL var="viewContactURL">
		<portlet:param name="mvcPath" value="/contacts/details.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(viewModel.getCrmContactId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>

	<portlet:renderURL var="editContactURL">
		<portlet:param name="mvcPath" value="/contacts/edit.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(viewModel.getCrmContactId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>

	<portlet:actionURL name="deleteContact" var="deleteContactURL">
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(viewModel.getCrmContactId())%>" />
	</portlet:actionURL>

	<liferay-ui:icon image="view_articles" message="View"
		url="<%=viewContactURL.toString()%>" />

	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editContactURL.toString()%>" />

	<liferay-ui:icon-delete url="<%=deleteContactURL.toString()%>" />

</liferay-ui:icon-menu>