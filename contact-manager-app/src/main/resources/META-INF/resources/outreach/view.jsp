<%@ include file="../init.jsp"%>
<%@ include file="init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String crmContactIdString = ParamUtil.getString(request, "crmContactId");
	CrmContact crmContact = null;
	List<CrmOutreachLog> crmOutreachLogs = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
		crmOutreachLogs = CrmOutreachLogLocalServiceUtil.findByCrmContactId(crmContactId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmContact != null)
			? ("Outreach Log for " + crmContact.getFirstName() + " " + crmContact.getLastName())
			: "Outreach Log");
%>

<div class="container-fluid-1280">
	<%@ include file="nav.jsp"%>
	<aui:row>
		<aui:col md="12">
			<div class="panel-body">
				<liferay-ui:search-container delta="20" deltaConfigurable="true"
					emptyResultsMessage="No outreach logs found"
					total="<%=crmOutreachLogs.size()%>"
					var="crmOutreachLogSearchContainer">
					<liferay-ui:search-container-results>
						<%
							pageContext.setAttribute("results", crmOutreachLogs);
						%>
					</liferay-ui:search-container-results>
					<liferay-ui:search-container-row
						className="contact.manager.model.CrmOutreachLog"
						modelVar="outreachLog">
						<liferay-ui:search-container-column-text property="createDate"
							name="Date" orderable="true" orderableProperty="createDate" />
						<liferay-ui:search-container-column-text property="userName"
							name="User Name" orderable="true" orderableProperty="userName" />
					</liferay-ui:search-container-row>
					<liferay-ui:search-iterator />
				</liferay-ui:search-container>
			</div>
		</aui:col>
	</aui:row>
</div>
