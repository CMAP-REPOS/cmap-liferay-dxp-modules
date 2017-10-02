<%@ include file="/init.jsp"%>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"
	var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%=true%>"
	var="configurationRenderURL" />

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />

	<aui:input name="redirect" type="hidden"
		value="<%=configurationRenderURL%>" />

	<aui:fieldset>
	
		<aui:input label="How many days before today to include" name="numberOfDaysInThePast" value="<%=numberOfDaysInThePast%>">
			<aui:validator name="number" />
		</aui:input>

		<aui:input label="How many events to show" name="numberOfEventsToShow" value="<%=numberOfEventsToShow%>">
			<aui:validator name="number" />
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>