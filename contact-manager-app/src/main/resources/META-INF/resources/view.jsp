<%@ include file="/init.jsp"%>

<portlet:renderURL var="addContactURL">
	<portlet:param name="mvcPath" value="/add.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
	<aui:button onClick="<%= addContactURL.toString() %>"
		value="Add Contact"></aui:button>
</aui:button-row>

<liferay-ui:search-container
	total="<%=CrmContactLocalServiceUtil.getCrmContactsCount()%>">
	<liferay-ui:search-container-results
		results="<%=CrmContactLocalServiceUtil.getCrmContacts(QueryUtil.ALL_POS, QueryUtil.ALL_POS)%>" />
	<liferay-ui:search-container-row
		className="contact.manager.model.CrmContact" modelVar="crmContact">

		<portlet:renderURL var="viewContactURL">
			<portlet:param name="mvcPath" value="/details.jsp" />
			<portlet:param name="crmContactId" value="<%= String.valueOf(crmContact.getCrmContactId()) %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text property="crmContactId"
			href="<%=viewContactURL.toString()%>" />
		<liferay-ui:search-container-column-text property="firstName" />
		<liferay-ui:search-container-column-text property="lastName" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
