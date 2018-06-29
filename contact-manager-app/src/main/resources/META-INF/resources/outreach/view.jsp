<%@ include file="../init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String orderByType = ParamUtil.getString(request, "orderByType", "asc");
	
	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/outreach/view.jsp");
	iteratorURL.setParameter("crmContactId", String.valueOf(crmContactId));

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	String outreachDate = ParamUtil.getString(request, "orderByCol", CrmOutreachLogKeys.OUTREACH_DATE);
	String userName = ParamUtil.getString(request, "orderByCol", CrmOutreachLogKeys.USER_NAME);
	String medium = ParamUtil.getString(request, "orderByCol", CrmOutreachLogKeys.MEDIUM);
	String activityType = ParamUtil.getString(request, "orderByCol", CrmOutreachLogKeys.ACTIVITY_TYPE);

	boolean orderByAsc = false;

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (outreachDate.equals(CrmOutreachLogKeys.OUTREACH_DATE)) {
		orderByComparator = new CrmOutreachLogOutreachDateComparator(orderByAsc);
	}

	if (userName.equals(CrmOutreachLogKeys.USER_NAME)) {
		orderByComparator = new CrmOutreachLogUserNameComparator(orderByAsc);
	}

	if (medium.equals(CrmOutreachLogKeys.MEDIUM)) {
		orderByComparator = new CrmOutreachLogMediumComparator(orderByAsc);
	}

	if (activityType.equals(CrmOutreachLogKeys.ACTIVITY_TYPE)) {
		orderByComparator = new CrmOutreachLogActivityTypeComparator(orderByAsc);
	}

	renderResponse.setTitle((crmContact != null)
			? ("Outreach Log for " + crmContact.getFirstName() + " " + crmContact.getLastName())
			: "Outreach Log");
%>

<portlet:renderURL var="addOutreachLogURL">
	<portlet:param name="mvcPath" value="/outreach/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
	<portlet:param name="crmContactId"
		value="<%=String.valueOf(crmContactId)%>" />
</portlet:renderURL>

<div class="container-fluid">
	<%@ include file="nav.jsp"%>
	<aui:row>
		<aui:col md="12">
			<%-- TODO: check role --%>
			<aui:button onClick="<%= addOutreachLogURL.toString() %>"
				value="Add Outreach Log"></aui:button>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col md="12">
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No outreach logs found"
				iteratorURL="<%=iteratorURL%>"
				total="<%=CrmOutreachLogLocalServiceUtil.countByCrmContactIdId(crmContactId)%>"
				var="crmOutreachLogSearchContainer">
				<liferay-ui:search-container-results>
					<%
						List<CrmOutreachLog> crmOutreachLogs = CrmOutreachLogLocalServiceUtil.findByCrmContactId(
												crmContactId, crmOutreachLogSearchContainer.getStart(),
												crmOutreachLogSearchContainer.getEnd(), orderByComparator);

										pageContext.setAttribute("results", crmOutreachLogs);
					%>
				</liferay-ui:search-container-results>
				<liferay-ui:search-container-row
					className="contact.manager.model.CrmOutreachLog"
					modelVar="outreachLog">
					<liferay-ui:search-container-column-text property="outreachDate"
						name="Date" orderable="true" orderableProperty="outreachDate" />
					<liferay-ui:search-container-column-text property="userName"
						name="User Name" orderable="true" orderableProperty="userName" />
					<liferay-ui:search-container-column-text property="medium"
						name="Medium" orderable="true" orderableProperty="medium" />
					<liferay-ui:search-container-column-text property="activityType"
						name="Activity Type" orderable="true"
						orderableProperty="activityType" />
					<liferay-ui:search-container-column-text property="note"
						name="Note" orderableProperty="note" />
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>
</div>
