<%@ include file="/init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addContact" var="addContactURL"></portlet:actionURL>

<aui:form action="<%=addContactURL%>" name="<portlet:namespace />fm">
	<aui:fieldset>
		<aui:input name="firstName"></aui:input>
		<aui:input name="lastName"></aui:input>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>
