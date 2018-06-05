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

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name='<%=crmGroup == null ? "add" : "update"%>'
	var="editURL" />

<div class="container-fluid-1280">

	<aui:form action="<%=editURL%>" name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmGroupId"
			value='<%=crmGroup == null ? "" : crmGroup.getCrmGroupId()%>'>
		</aui:input>

		<aui:row>
			<aui:col md="4">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="name"
							value='<%=crmGroup == null ? "" : crmGroup.getName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
				</aui:fieldset-group>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col md="12">
				<aui:button-row>
					<aui:button type="submit"></aui:button>
					<aui:button type="cancel" onClick="<%=redirect%>"></aui:button>
				</aui:button-row>
			</aui:col>
		</aui:row>

	</aui:form>

</div>