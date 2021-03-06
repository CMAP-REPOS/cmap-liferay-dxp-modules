<portlet:renderURL var="contactInfoUrl">
	<portlet:param name="mvcPath" value="/contacts/details.jsp"></portlet:param>
	<portlet:param name="crmContactId" value="<%=String.valueOf(crmContactId)%>"></portlet:param>
	<portlet:param name="redirect" value="<%=redirect%>" />
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


<aui:nav-bar cssClass="container-fluid" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item href="<%=contactInfoUrl.toString()%>"
			label="Contact Information" selected="false" />
		<aui:nav-item href="<%=outreachLogUrl.toString() %>"
			label="Outreach Log" selected="false" />
		<aui:nav-item href="<%=auditLogUrl.toString() %>" label="Audit Log"
			selected="false" />
		<aui:nav-item href="<%=currentURL %>" label="Notes"
			selected="true" /> 
	</aui:nav>
</aui:nav-bar>
