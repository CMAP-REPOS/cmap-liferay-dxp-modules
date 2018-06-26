<%@ include file="../init.jsp"%>

<portlet:renderURL var="addContactURL">
	<portlet:param name="mvcPath" value="/contacts/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
</portlet:renderURL>


<%
	List<CrmContactViewModel> viewModels = new ArrayList<CrmContactViewModel>();

	String firstName = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.FIRST_NAME);
	String lastName = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.LAST_NAME);
	String organization = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.ORGANIZATION);
	String jobTitle = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.JOB_TITLE);
	String primaryAddress1 = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.PRIMARY_ADDRESS_1);
	String primaryAddress2 = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.PRIMARY_ADDRESS_2);
	String primaryAddressCity = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.PRIMARY_ADDRESS_CITY);
	String primaryAddressZip = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.PRIMARY_ADDRESS_ZIP);
	String primaryAddressCounty = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.PRIMARY_ADDRESS_COUNTY);
	String primaryPhone = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.PRIMARY_PHONE);
	String primaryCell = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.PRIMARY_CELL);
	String primaryEmailAddress = ParamUtil.getString(request, "orderByCol",
			CrmContactFieldKeys.PRIMARY_EMAIL_ADDRESS);
	String modifiedDate = ParamUtil.getString(request, "orderByCol", CrmContactFieldKeys.MODIFIED_DATE);

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

	if (organization.equals(CrmContactFieldKeys.ORGANIZATION)) {
		orderByComparator = new CrmContactOrganizationComparator(orderByAsc);
	}

	if (jobTitle.equals(CrmContactFieldKeys.JOB_TITLE)) {
		orderByComparator = new CrmContactJobTitleComparator(orderByAsc);
	}

	if (primaryAddress1.equals(CrmContactFieldKeys.PRIMARY_ADDRESS_1)) {
		orderByComparator = new CrmContactPrimaryAddress1Comparator(orderByAsc);
	}

	if (primaryAddress2.equals(CrmContactFieldKeys.PRIMARY_ADDRESS_2)) {
		orderByComparator = new CrmContactPrimaryAddress2Comparator(orderByAsc);
	}

	if (primaryAddressCity.equals(CrmContactFieldKeys.PRIMARY_ADDRESS_CITY)) {
		orderByComparator = new CrmContactPrimaryAddressCityComparator(orderByAsc);
	}

	if (primaryAddressZip.equals(CrmContactFieldKeys.PRIMARY_ADDRESS_ZIP)) {
		orderByComparator = new CrmContactPrimaryAddressZipComparator(orderByAsc);
	}

	if (primaryAddressCounty.equals(CrmContactFieldKeys.PRIMARY_ADDRESS_COUNTY)) {
		orderByComparator = new CrmContactPrimaryAddressCountyComparator(orderByAsc);
	}

	if (primaryPhone.equals(CrmContactFieldKeys.PRIMARY_PHONE)) {
		orderByComparator = new CrmContactPrimaryPhoneComparator(orderByAsc);
	}

	if (primaryCell.equals(CrmContactFieldKeys.PRIMARY_CELL)) {
		orderByComparator = new CrmContactPrimaryCellComparator(orderByAsc);
	}

	if (primaryEmailAddress.equals(CrmContactFieldKeys.PRIMARY_EMAIL_ADDRESS)) {
		orderByComparator = new CrmContactPrimaryEmailAddressComparator(orderByAsc);
	}

	if (modifiedDate.equals(CrmContactFieldKeys.MODIFIED_DATE)) {
		orderByComparator = new CrmContactModifiedDateComparator(orderByAsc);
	}
%>

<div class="container-fluid-1280">

	<%-- TODO: check role --%>
	<aui:button onClick="<%= addContactURL.toString() %>"
		value="Add Contact"></aui:button>

	<liferay-ui:search-container delta="20" deltaConfigurable="true"
		emptyResultsMessage="No contacts found"
		total="<%=CrmContactLocalServiceUtil.getCrmContactsCount()%>"
		var="crmContactsSearchContainer">

		<liferay-ui:search-container-results>
			<%
				List<CrmContact> crmContacts = CrmContactLocalServiceUtil.getCrmContactsByStatus(
								ConstantContactKeys.CC_STATUS_ACTIVE, crmContactsSearchContainer.getStart(),
								crmContactsSearchContainer.getEnd(), orderByComparator);

						for (CrmContact crmContact : crmContacts) {
							viewModels.add(new CrmContactViewModel(crmContact));
						}

						pageContext.setAttribute("results", viewModels);
			%>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="contact.manager.app.viewmodel.CrmContactViewModel"
			modelVar="viewModel">
			<liferay-ui:search-container-column-jsp
				path="/contacts/view_actions.jsp" name="Actions" />
			<liferay-ui:search-container-column-text property="firstName"
				name="First Name" orderable="true" orderableProperty="firstName" />
			<liferay-ui:search-container-column-text property="lastName"
				name="Last Name" orderable="true" orderableProperty="lastName" />
			<liferay-ui:search-container-column-text property="organization"
				name="Organization" orderable="true"
				orderableProperty="organization" />
			<liferay-ui:search-container-column-text property="jobTitle"
				name="Job Title" orderable="true" orderableProperty="jobTitle" />
			<liferay-ui:search-container-column-text property="primaryAddress1"
				name="Address 1" orderable="true"
				orderableProperty="primaryAddress1" />
			<liferay-ui:search-container-column-text property="primaryAddress2"
				name="Address 2" orderable="true"
				orderableProperty="primaryAddress2" />
			<liferay-ui:search-container-column-text
				property="primaryAddressCity" name="City" orderable="true"
				orderableProperty="primaryAddressCity" />
			<liferay-ui:search-container-column-text property="primaryAddressZip"
				name="ZIP" orderable="true" orderableProperty="primaryAddressZip" />
			<liferay-ui:search-container-column-text
				property="primaryAddressCounty" name="County" orderable="true"
				orderableProperty="primaryAddressCounty" />
			<liferay-ui:search-container-column-text property="primaryPhone"
				name="Phone" orderable="true" orderableProperty="primaryPhone" />
			<liferay-ui:search-container-column-text property="primaryCell"
				name="Cell" orderable="true" orderableProperty="primaryCell" />
			<liferay-ui:search-container-column-text
				property="primaryEmailAddress" name="Email Address" orderable="true"
				orderableProperty="primaryEmailAddress" />
			<liferay-ui:search-container-column-text property="groupsList"
				name="Groups" />
			<liferay-ui:search-container-column-text property="tagsList"
				name="Tags" />
			<liferay-ui:search-container-column-text property="modifiedDate"
				name="Modified" orderable="true" orderableProperty="modifiedDate" />
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</div>