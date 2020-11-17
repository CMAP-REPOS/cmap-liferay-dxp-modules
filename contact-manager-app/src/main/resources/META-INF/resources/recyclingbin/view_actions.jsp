<%@ include file="../init.jsp"%>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmContactViewModel viewModel = (CrmContactViewModel) searchContainerRow.getObject();

%>

<liferay-ui:icon-menu>

<c:if test='<%= CrmContactPermission.contains(permissionChecker, viewModel.getCrmContactId(), "DELETE") %>'>
	<portlet:actionURL name="deleteContact" var="deleteContactURL">
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(viewModel.getCrmContactId())%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete  message="Delete" confirmation="Are you sure you want to delete?" url="<%=deleteContactURL.toString()%>" />
</c:if>

</liferay-ui:icon-menu>