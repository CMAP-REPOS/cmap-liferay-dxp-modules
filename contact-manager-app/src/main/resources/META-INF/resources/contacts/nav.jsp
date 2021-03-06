<portlet:renderURL var="viewURL">
    <portlet:param 
        name="mvcPath" 
        value="/contacts/view.jsp" 
    />
</portlet:renderURL>

<portlet:renderURL var="auditLogUrl">
	<portlet:param name="mvcPath" value="/audit/view.jsp"></portlet:param>
	<portlet:param name="crmContactId" value="<%=String.valueOf(crmContactId)%>"></portlet:param>
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:renderURL>

<portlet:renderURL var="outreachLogUrl">
	<portlet:param name="mvcPath" value="/outreach/view.jsp"></portlet:param>
	<portlet:param name="crmContactId" value="<%=String.valueOf(crmContactId)%>"></portlet:param>
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:renderURL>

<portlet:renderURL var="notesUrl">
	<portlet:param name="mvcPath" value="/notes/view.jsp"></portlet:param>
	<portlet:param name="crmContactId" value="<%=String.valueOf(crmContactId)%>"></portlet:param>
	<portlet:param name="redirect" value="<%=redirect%>" />
</portlet:renderURL>

<liferay-ui:header
    backURL="<%= viewURL.toString() %>"
    title="back"
/>

<aui:nav-bar cssClass="container-fluid" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item href="<%=currentURL%>" label="Contact Information"
			selected="true" />
		<aui:nav-item href="<%=outreachLogUrl.toString()%>"
			label="Outreach Log" selected="false" />
		<aui:nav-item href="<%=auditLogUrl.toString()%>" label="Audit Log"
			selected="false" />
		<aui:nav-item href="<%=notesUrl.toString()%>" label="Notes"
			selected="false" /> 
	</aui:nav>
</aui:nav-bar>