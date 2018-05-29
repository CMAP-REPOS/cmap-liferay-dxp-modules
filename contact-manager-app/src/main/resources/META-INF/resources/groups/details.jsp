<%@ include file="../init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");

	CrmGroup crmGroup = null;

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	renderResponse.setTitle((crmGroup != null) ? (crmGroup.getName()) : "New Group");
%>

<div class="container-fluid-1280">

	<aui:fieldset-group markupView="lexicon">
		<aui:row>
			<aui:col md="12">
				<p>
					<strong><liferay-ui:message key="crm.label.name" /></strong>
				</p>
				<p><%=crmGroup.getName()%></p>
			</aui:col>

		</aui:row>
	</aui:fieldset-group>
</div>