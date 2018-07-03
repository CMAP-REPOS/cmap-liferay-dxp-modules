<portlet:renderURL var="contactInfoUrl">
	<portlet:param name="mvcPath" value="/contacts/details.jsp"></portlet:param>
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

<aui:nav-bar cssClass="container-fluid" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item href="<%=contactInfoUrl.toString()%>"
			label="Contact Information" selected="false" />
		<aui:nav-item href="<%=outreachLogUrl.toString()%>"
			label="Outreach Log" selected="false" />
		<aui:nav-item href="<%=currentURL%>" label="Audit Log"
			selected="true" />
		<aui:nav-item href="<%=notesUrl.toString()%>" label="Notes"
			selected="false" />
	</aui:nav>
</aui:nav-bar>
