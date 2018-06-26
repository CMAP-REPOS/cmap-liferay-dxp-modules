<%@ include file="../init.jsp"%>
<%@ include file="init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String crmContactIdString = ParamUtil.getString(request, "crmContactId");
	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}
	
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/audit/view.jsp");
	iteratorURL.setParameter("crmContactId", crmContactIdString);

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmContact != null)
			? ("Audit Log for " + crmContact.getFirstName() + " " + crmContact.getLastName()) : "Audit Log");

	String createDate = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogFieldKeys.CREATE_DATE);
	String userName = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogFieldKeys.USER_NAME);
	String action = ParamUtil.getString(request, "orderByCol", CrmContactAuditLogFieldKeys.ACTION);

	boolean orderByAsc = false;

	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (createDate.equals(CrmContactAuditLogFieldKeys.CREATE_DATE)) {
		orderByComparator = new CrmContactAuditLogCreateDateComparator(orderByAsc);
	}

	if (userName.equals(CrmContactAuditLogFieldKeys.USER_NAME)) {
		orderByComparator = new CrmContactAuditLogUserNameComparator(orderByAsc);
	}

	if (action.equals(CrmContactAuditLogFieldKeys.ACTION)) {
		orderByComparator = new CrmContactAuditLogActionComparator(orderByAsc);
	}
%>

<div class="container-fluid-1280">
	<%@ include file="nav.jsp"%>
	<aui:row>
		<aui:col md="12">
			<div class="panel-body">
				<liferay-ui:search-container delta="20" deltaConfigurable="true"
					emptyResultsMessage="No audit logs found"
					iteratorURL="<%=iteratorURL %>"  
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
							name="Date" orderable="true" orderableProperty="createDate"
							href="<%=currentURL%>" />
						<liferay-ui:search-container-column-text property="userName"
							name="User" orderable="true" orderableProperty="userName"
							href="<%=currentURL%>" />
						<liferay-ui:search-container-column-text property="action"
							name="Action" orderable="true" orderableProperty="action"
							href="<%=currentURL%>" />
					</liferay-ui:search-container-row>
					<liferay-ui:search-iterator />
				</liferay-ui:search-container>
			</div>
		</aui:col>
	</aui:row>
</div>
