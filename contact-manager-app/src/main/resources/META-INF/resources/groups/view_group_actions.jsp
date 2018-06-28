<%@ include file="../init.jsp"%>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmGroupViewModel viewModel = (CrmGroupViewModel) searchContainerRow.getObject();
%>

<aui:button-row cssClass="group-buttons">

   <portlet:renderURL var="viewGroupURL">
		<portlet:param name="mvcPath" value="/groups/details.jsp" />
		<portlet:param name="crmGroupId"
			value="<%=String.valueOf(viewModel.getCrmGroupId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>	
    <aui:button onClick="<%=viewGroupURL.toString()%>" value="Details"></aui:button>
    
</aui:button-row>