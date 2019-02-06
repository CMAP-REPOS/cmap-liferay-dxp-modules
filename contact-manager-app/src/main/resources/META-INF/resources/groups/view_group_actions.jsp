<%@ include file="../init.jsp"%>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmGroupViewModel viewModel = (CrmGroupViewModel) searchContainerRow.getObject();
%>

<liferay-ui:icon-menu>
   
   <portlet:renderURL var="viewGroupURL">
		<portlet:param name="mvcPath" value="/groups/details.jsp" />
		<portlet:param name="crmGroupId"
			value="<%=String.valueOf(viewModel.getCrmGroupId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>	
	
	<portlet:actionURL name="deleteGroup" var="deleteGroupURL">
		<portlet:param name="crmGroupId"
			value="<%=String.valueOf(viewModel.getCrmGroupId())%>" />
	</portlet:actionURL>
	
	
    <liferay-ui:icon image="view_articles" message="View" url="<%=viewGroupURL.toString()%>" />
    
    <liferay-ui:icon-delete  message="Delete" url="<%=deleteGroupURL.toString()%>" />
    
    
</liferay-ui:icon-menu>