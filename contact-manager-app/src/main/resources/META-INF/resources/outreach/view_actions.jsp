<%@ include file="../init.jsp"%>

<liferay-ui:icon-menu>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmOutreachLog crmOutreachLog = (CrmOutreachLog) searchContainerRow.getObject();
	
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	long crmOutreachLogId = crmOutreachLog.getCrmOutreachLogId();
	
	
%>
	
	<portlet:renderURL var="updateOutreachLogURL">
		<portlet:param name="mvcPath" value="/outreach/edit.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContactId)%>" />
		<portlet:param name="crmOutreachLogId"
			value="<%=String.valueOf(crmOutreachLogId)%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>
	
	
	<liferay-ui:icon image="edit" message="Edit"
		url="<%= updateOutreachLogURL.toString() %>" />
		
		
	
	<portlet:actionURL name="deleteOutreachLog" var="deleteOutreachLogURL">
		<portlet:param name="crmOutreachLogId"
		value="<%=String.valueOf(crmOutreachLogId)%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message="Delete"
		url="<%=deleteOutreachLogURL.toString()%>" />

		
</liferay-ui:icon-menu>