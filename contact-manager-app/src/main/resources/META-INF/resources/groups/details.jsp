<%@ include file="../init.jsp"%>
<%@ include file="init.jsp"%>

<%
	long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
	CrmGroup crmGroup = null;

	if (crmGroupId > 0) {
		crmGroup = CrmGroupLocalServiceUtil.getCrmGroup(crmGroupId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	String firstName = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.FIRST_NAME);
	String lastName = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.LAST_NAME);
	String primaryPhone = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.PRIMARY_PHONE);
	String primaryEmailAddress = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.PRIMARY_EMAIL_ADDRESS);

	boolean orderByAsc = false;

	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (firstName.equals(CrmContactFieldKeys.FIRST_NAME)) {
		orderByComparator = new CrmContactFirstNameComparator(orderByAsc);
	}

	if (lastName.equals(CrmContactFieldKeys.LAST_NAME)) {
		orderByComparator = new CrmContactLastNameComparator(orderByAsc);
	}

	if (primaryPhone.equals(CrmContactFieldKeys.PRIMARY_PHONE)) {
		orderByComparator = new CrmContactPrimaryPhoneComparator(orderByAsc);
	}

	if (primaryEmailAddress.equals(CrmContactFieldKeys.PRIMARY_EMAIL_ADDRESS)) {
		orderByComparator = new CrmContactPrimaryEmailAddressComparator(orderByAsc);
	}

	renderResponse.setTitle(
			(crmGroup != null) ? ("Group Information for " + crmGroup.getName()) : "Group Information");
%>

<div class="container-fluid-1280">

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No contacts found "
		iteratorURL="<%=iteratorURL%>" total="<%=crmContactList.size()%>"
		var="crmGroupsSearchContainer">
		<liferay-ui:search-container-results>
			<%
				List<CrmContact> crmContacts = crmGroup.getcr CrmGroupLocalServiceUtil.getcrm(
								ConstantContactKeys.CC_STATUS_ACTIVE, crmContactsSearchContainer.getStart(),
								crmContactsSearchContainer.getEnd(), orderByComparator);

						for (CrmContact crmContact : crmContacts) {
							viewModels.add(new CrmContactViewModel(crmContact));
						}

						pageContext.setAttribute("results", viewModels);
			%>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="contact.manager.model.CrmContact" modelVar="crmContact">

			<liferay-ui:search-container-column-jsp
				path="/groups/view_contact_actions.jsp" name="Actions" />

			<liferay-ui:search-container-column-text property="firstName"
				name="First Name" orderable="true" orderableProperty="firstName" />
			<liferay-ui:search-container-column-text property="lastName"
				name="Last Name" orderable="true" orderableProperty="lastName" />
			<liferay-ui:search-container-column-text
				property="primaryEmailAddress" name="Primary Email Address"
				orderable="true" orderableProperty="primaryEmailAddress" />
			<liferay-ui:search-container-column-text property="primaryPhone"
				name="Primary Phone" orderable="true"
				orderableProperty="primaryPhone" />
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>