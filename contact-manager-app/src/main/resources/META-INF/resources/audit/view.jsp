<%@ include file="../init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/audit/view.jsp");
	iteratorURL.setParameter("crmContactId", String.valueOf(crmContactId));

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	String createDate = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogKeys.CREATE_DATE);
	String userName = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogKeys.USER_NAME);
	String action = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogKeys.ACTION);

	boolean orderByAsc = false;

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (createDate.equals(CrmContactAuditLogKeys.CREATE_DATE)) {
		orderByComparator = new CrmContactAuditLogCreateDateComparator(orderByAsc);
	}

	if (userName.equals(CrmContactAuditLogKeys.USER_NAME)) {
		orderByComparator = new CrmContactAuditLogUserNameComparator(orderByAsc);
	}

	if (action.equals(CrmContactAuditLogKeys.ACTION)) {
		orderByComparator = new CrmContactAuditLogActionComparator(orderByAsc);
	}

	renderResponse.setTitle((crmContact != null)
			? ("Audit Log for " + crmContact.getFirstName() + " " + crmContact.getLastName()) : "Audit Log");
%>

<div class="container-fluid">
	<%@ include file="nav.jsp"%>
	<aui:row>
		<aui:col md="12">
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No audit logs found"
				iteratorURL="<%=iteratorURL%>"
				total="<%=CrmContactAuditLogLocalServiceUtil.countByCrmContactId(crmContactId)%>"
				var="crmContactAuditLogSearchContainer">
				<liferay-ui:search-container-results>
					<%
						List<CrmContactAuditLog> crmContactAuditLogs = CrmContactAuditLogLocalServiceUtil
								.findByCrmContactId(crmContactId, crmContactAuditLogSearchContainer.getStart(),
										crmContactAuditLogSearchContainer.getEnd(), orderByComparator);
						pageContext.setAttribute("results", crmContactAuditLogs);
					%>
				</liferay-ui:search-container-results>
				<liferay-ui:search-container-row
					className="contact.manager.model.CrmContactAuditLog"
					modelVar="auditLog">
					<portlet:renderURL var="detailsURL">
						<portlet:param name="jspPage" value="/audit/details.jsp" />
						<portlet:param name="redirect" value="<%=currentURL%>" />
						<portlet:param name="auditLogId"
							value="<%=String.valueOf(auditLog.getCrmContactAuditLogId())%>" />
					</portlet:renderURL>
					<liferay-ui:search-container-column-text name="" value="Details"
						href="<%=detailsURL.toString()%>" />
					<liferay-ui:search-container-column-text property="createDate"
						name="Date" orderable="true" orderableProperty="createDate"/>
					<liferay-ui:search-container-column-text property="userName"
						name="User" orderable="true" orderableProperty="userName" />
					<liferay-ui:search-container-column-text property="action"
						name="Action" orderable="true" orderableProperty="action" />
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>
</div>
