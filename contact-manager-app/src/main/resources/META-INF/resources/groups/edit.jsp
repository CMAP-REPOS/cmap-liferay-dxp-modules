<%@ include file="../init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
	String redirect = ParamUtil.getString(request, "redirect");

	CrmGroup crmGroup = null;
	List<CrmContact> crmGroupContacts = new ArrayList<CrmContact>();
	List<CrmContact> crmGroupPotentialContacts = new ArrayList<CrmContact>();

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
		crmGroupContacts = CrmGroupLocalServiceUtil.getCrmContacts(crmGroupId);
		/* 		crmGroupPotentialContacts = GroupUtil.getPotentialCrmContacts(crmGroupId); */
	}

	renderResponse.setTitle((crmGroup != null) ? (crmGroup.getName()) : "New Group");
%>

<portlet:actionURL name='<%=crmGroup == null ? "add" : "update"%>'
	var="editURL" />

<div class="container-fluid-1280">

	<aui:form action="<%=editURL%>" name="<portlet:namespace />fm">
		<aui:input type="hidden" name="crmGroupId"
			value='<%=crmGroup == null ? "" : crmGroup.getCrmGroupId()%>'>
		</aui:input>

		<aui:row>
			<aui:col md="12">
				<aui:fieldset-group markupView="lexicon">
					<aui:fieldset>
						<aui:input name="name"
							value='<%=crmGroup == null ? "" : crmGroup.getName()%>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">500</aui:validator>
						</aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:row>
							<aui:col md="6">
								<div class="form-group">
									<label class="control-label"> Assigned Contacts </label>
									<ul>
										<%
											for (CrmContact crmContact : crmGroupContacts) {
										%>
										<li><%=crmContact.getFirstName() + ' ' + crmContact.getLastName()%>
											<aui:input name="crmContactIds" type="hidden"
												value="<%=crmContact.getCrmContactId()%>"></aui:input></li>
										<%
											}
										%>
									</ul>
								</div>
							</aui:col>
						</aui:row>
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