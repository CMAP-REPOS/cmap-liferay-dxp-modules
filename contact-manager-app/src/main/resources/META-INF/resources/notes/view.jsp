<%@ include file="../init.jsp"%>

<%
	long crmContactId = ParamUtil.getLong(request, "crmContactId");
	String orderByType = ParamUtil.getString(request, "orderByType", "asc");

	CrmContact crmContact = null;

	if (crmContactId > 0) {
		crmContact = CrmContactLocalServiceUtil.getCrmContact(crmContactId);
	}

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/notes/view.jsp");
	iteratorURL.setParameter("crmContactId", String.valueOf(crmContactId));

	String redirect = ParamUtil.getString(request, "redirect");
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);

	String modifiedDate = ParamUtil.getString(request, "orderByCol", CrmNoteKeys.MODIFIED_DATE);
	String userName = ParamUtil.getString(request, "orderByCol", CrmNoteKeys.USER_NAME);
	String note = ParamUtil.getString(request, "orderByCol", CrmNoteKeys.NOTE);

	boolean orderByAsc = false;

	if (orderByType.equals("asc")) {
		orderByAsc = true;
	}

	OrderByComparator orderByComparator = null;

	if (modifiedDate.equals(CrmNoteKeys.MODIFIED_DATE)) {
		orderByComparator = new CrmNoteModifiedDateComparator(orderByAsc);
	}

	if (userName.equals(CrmContactAuditLogKeys.USER_NAME)) {
		orderByComparator = new CrmNoteUserNameComparator(orderByAsc);
	}

	if (note.equals(CrmNoteKeys.NOTE)) {
		orderByComparator = new CrmNoteNoteComparator(orderByAsc);
	}

	renderResponse.setTitle((crmContact != null)
			? ("Notes " + crmContact.getFirstName() + " " + crmContact.getLastName()) : "Notes");
%>

<portlet:renderURL var="addNoteURL">
	<portlet:param name="mvcPath" value="/notes/edit.jsp"></portlet:param>
	<portlet:param name="redirect" value="<%=currentURL%>" />
	<portlet:param name="crmContactId"
		value="<%=String.valueOf(crmContactId)%>" />
</portlet:renderURL>

<div class="container-fluid">
	<%@ include file="nav.jsp"%>
	<% if (PermissionUtil.userHasRole(currentUser, ContactManagerAppPortletKeys.ROLE_EDITOR) || 
			PermissionUtil.userHasRole(currentUser, ContactManagerAppPortletKeys.ROLE_MANAGER)) { %>
	<aui:row>
		<aui:col md="12">
			<aui:button onClick="<%= addNoteURL.toString() %>"
				value="Add Note"></aui:button>
		</aui:col>
	</aui:row>
	<% } %>
	<aui:row>
		<aui:col md="12">
			<liferay-ui:search-container delta="20" deltaConfigurable="true"
				emptyResultsMessage="No notes found" iteratorURL="<%=iteratorURL%>"
				total="<%=CrmNoteLocalServiceUtil.countByCrmContactId(crmContactId)%>"
				var="crmNoteSearchContainer">
				<liferay-ui:search-container-results>
					<%
						List<CrmNote> crmNotes = CrmNoteLocalServiceUtil.findByCrmContactId(crmContactId,
												crmNoteSearchContainer.getStart(), crmNoteSearchContainer.getEnd(),
												orderByComparator);
						
						pageContext.setAttribute("results", crmNotes);
					%>
				</liferay-ui:search-container-results>
				<liferay-ui:search-container-row
					className="contact.manager.model.CrmNote" modelVar="crmNote">
					
					<c:choose>
					  <c:when test='<%= PermissionUtil.userHasRole(currentUser, ContactManagerAppPortletKeys.ROLE_EDITOR) && (currentUser.getUserId() == crmNote.getUserId()) %>'>
					    <liferay-ui:search-container-column-jsp
							path="/notes/view_actions.jsp" name="Actions" />
					  </c:when>
					  <c:when test='<%= PermissionUtil.userHasRole(currentUser, ContactManagerAppPortletKeys.ROLE_MANAGER)%>'>
					    <liferay-ui:search-container-column-jsp
							path="/notes/view_actions.jsp" name="Actions" />
					  </c:when>
					  <c:otherwise>
					    <liferay-ui:search-container-column-jsp
							path="/notes/empty.jsp" name="Actions" />
					  </c:otherwise>
					</c:choose>
						
					<liferay-ui:search-container-column-text property="userName"
						name="User" orderable="true" orderableProperty="userName" />
					<liferay-ui:search-container-column-text property="modifiedDate"
						name="Date" orderable="true" orderableProperty="modifiedDate" />
					<liferay-ui:search-container-column-text property="note"
						name="Note" orderable="true" orderableProperty="note" />
				</liferay-ui:search-container-row>
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</aui:col>
	</aui:row>
</div>
