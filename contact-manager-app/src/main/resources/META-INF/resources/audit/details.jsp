<%@ include file="../init.jsp"%>

<%
	long crmContactAuditLogId = ParamUtil.getLong(request, "auditLogId");
	CrmContactAuditLog crmContactAuditLog = null;

	if (crmContactAuditLogId > 0) {
		crmContactAuditLog = CrmContactAuditLogLocalServiceUtil.getCrmContactAuditLog(crmContactAuditLogId);
	}

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/audit/view.jsp");
	iteratorURL.setParameter("auditLogId", String.valueOf(crmContactAuditLogId));

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle("Audit Log Details");
%>

<div class="container-fluid-1280">
	<aui:row>
		<aui:col md="12">
			<div class="panel-body">
				<liferay-ui:search-container delta="20" deltaConfigurable="true"
					emptyResultsMessage="No details found for this audit log"
					iteratorURL="<%=iteratorURL%>"
					total="<%=CrmContactAuditLogChangeLocalServiceUtil
								.countByCrmContactAuditLogId(crmContactAuditLogId)%>"
					var="crmContactAuditLogChangeSearchContainer">
					<liferay-ui:search-container-results>
						<%
							List<CrmContactAuditLogChange> crmContactAuditLogChanges = CrmContactAuditLogChangeLocalServiceUtil
													.findByCrmContactAuditLogId(crmContactAuditLogId,
															crmContactAuditLogChangeSearchContainer.getStart(),
															crmContactAuditLogChangeSearchContainer.getEnd());

											pageContext.setAttribute("results", crmContactAuditLogChanges);
						%>
					</liferay-ui:search-container-results>

					<liferay-ui:search-container-row
						className="contact.manager.model.CrmContactAuditLogChange"
						modelVar="auditLogChange">
						<liferay-ui:search-container-column-text property="fieldName"
							name="Field" orderableProperty="fieldName" />
						<liferay-ui:search-container-column-text property="oldValue"
							name="Old Value" orderableProperty="oldValue" />
						<liferay-ui:search-container-column-text property="newValue"
							name="New Value" orderableProperty="newValue" />
					</liferay-ui:search-container-row>
					<liferay-ui:search-iterator />
				</liferay-ui:search-container>
			</div>
		</aui:col>
	</aui:row>
</div>
