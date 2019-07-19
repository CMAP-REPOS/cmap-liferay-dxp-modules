<%@ include file="../init.jsp"%>

<liferay-ui:icon-menu>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmNote crmNote = (CrmNote) searchContainerRow.getObject();
	
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	long crmNoteId = crmNote.getCrmNoteId();
	
%>
	
	<portlet:renderURL var="updateNoteURL">
		<portlet:param name="mvcPath" value="/notes/edit.jsp" />
		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContactId)%>" />
		<portlet:param name="crmNoteId"
			value="<%=String.valueOf(crmNoteId)%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>
	
	
	<liferay-ui:icon image="edit" message="Edit"
		url="<%= updateNoteURL.toString() %>" />
		
		
	
	<portlet:actionURL name="deleteNote" var="deleteNoteURL">
		<portlet:param name="crmNoteId" value="<%=String.valueOf(crmNoteId)%>" />
	</portlet:actionURL>
	
	<liferay-ui:icon image="delete" message="Delete"
		url="<%=deleteNoteURL.toString()%>" />

		
</liferay-ui:icon-menu>