<%@ include file="../init.jsp"%>

<%
	ResultRow searchContainerRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	CrmContact crmContact = (CrmContact) searchContainerRow.getObject();
%>

<aui:button-row cssClass="contact-buttons">
   <portlet:renderURL var="viewContactURL">
		<portlet:param name="mvcPath" value="/contacts/details.jsp" />
 		<portlet:param name="crmContactId"
			value="<%=String.valueOf(crmContact.getCrmContactId())%>" />
		<portlet:param name="redirect" value="<%=currentURL%>" />
	</portlet:renderURL>	
    <aui:button onClick="<%=viewContactURL.toString()%>" value="Details"></aui:button>
</aui:button-row>
