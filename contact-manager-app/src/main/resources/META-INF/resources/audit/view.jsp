<%@ include file="../init.jsp"%>
<%@ include file="init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String crmContactIdString = ParamUtil.getString(request, "crmContactId");
	CrmContact crmContact = null;
	List<CrmContactAuditLog> crmContactAuditLogs = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
		crmContactAuditLogs = CrmContactAuditLogLocalServiceUtil.findByCrmContactId(crmContactId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmContact != null)
			? ("Audit Log for " + crmContact.getFirstName() + " " + crmContact.getLastName()) : "Audit Log");
%>

<div class="container-fluid-1280">

	<%@ include file="nav.jsp"%>

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No audit logs found"
		total="<%=crmContactAuditLogs.size()%>"
		var="crmContactAuditLogSearchContainer">
		<liferay-ui:search-container-results>
			<%
				pageContext.setAttribute("results", crmContactAuditLogs);
			%>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="contact.manager.model.CrmContactAuditLog"
			modelVar="auditLog">
			<portlet:renderURL var="detailsURL">
				<portlet:param name="jspPage" value="/audit/details.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="auditLogId"
					value="<%=String.valueOf(auditLog.getCrmContactAuditLogId()) %>" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text name="From"
				value="Details"
				href="<%= detailsURL.toString()%>" />
			<liferay-ui:search-container-column-text property="modifiedDate"
				name="Date" orderable="true" orderableProperty="modifiedDate" />
			<liferay-ui:search-container-column-text property="userName"
				name="User" orderable="true" orderableProperty="userName" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>
