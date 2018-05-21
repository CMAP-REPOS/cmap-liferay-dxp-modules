<%@ include file="/init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addContact" var="addContactURL"></portlet:actionURL>

<liferay-ui:panel title="Contact Manager">

	<liferay-ui:panel title="Add Contact">

		<aui:form action="<%=addContactURL%>" name="<portlet:namespace />fm">
			<aui:row>
				<aui:col md="4">
					<aui:fieldset>
						<aui:input label="Photo" name="photo" type="file" />
						<aui:input name="firstName">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="middleName"></aui:input>
						<aui:input name="lastName">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="organization"></aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="isVip" label="Subscriber Alert" type="checkbox"></aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="crmGroups" label="Groups"></aui:input>
						<aui:input name="crmTags" label="Tags"></aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="prefix" label="Prefix"></aui:input>
						<aui:input name="salutation" label="Salutation"></aui:input>
						<aui:input name="jobTitle" label="Job Title"></aui:input>
					</aui:fieldset>
				</aui:col>
				<aui:col md="4">
					<aui:fieldset>
						<aui:input name="primaryAddress1" label="Primary Address 1">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="primaryAddress2" label="Primary Address 2"></aui:input>
						<aui:input name="primaryAddressCity" label="Primary Address City">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="primaryAddressState"
							label="Primary Address State">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="primaryAddressZip" label="Primary Address ZIP">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="primaryAddressCounty"
							label="Primary Address County"></aui:input>
						<aui:input name="primaryAddressCountry"
							label="Primary Address Country"></aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="secondaryAddress1" label="Secondary Address 1"></aui:input>
						<aui:input name="secondaryAddress2" label="Secondary Address 2"></aui:input>
						<aui:input name="secondaryAddressCity"
							label="Secondary Address City"></aui:input>
						<aui:input name="secondaryAddressState"
							label="Secondary Address State"></aui:input>
						<aui:input name="secondaryAddressZip"
							label="Secondary Address ZIP"></aui:input>
						<aui:input name="secondaryAddressCounty"
							label="Secondary Address County"></aui:input>
						<aui:input name="secondaryAddressCountry"
							label="Secondary Address Country"></aui:input>
					</aui:fieldset>
				</aui:col>
				<aui:col md="4">
					<aui:fieldset>
						<aui:input name="primaryPhone" label="Primary Phone">
							<aui:validator name="required" />
						</aui:input>
						<aui:input name="primaryPhoneExtension"
							label="Primary Phone Extension"></aui:input>
						<aui:input name="primaryFax" label="Primary Fax"></aui:input>
						<aui:input name="primaryCell" label="Primary Cell"></aui:input>
						<aui:input name="primaryEmailAddress"
							label="Primary Email Address">
							<aui:validator name="required" />
							<aui:validator name="email" />
						</aui:input>
						<aui:input name="alternateContact" label="Alternate Contact"></aui:input>
						<aui:input name="alternateEmail" label="Alternate Email Address">
							<aui:validator name="email" />
						</aui:input>
					</aui:fieldset>
					<aui:fieldset>
						<aui:input name="facebookId" label="Facebook ID"></aui:input>
						<aui:input name="twitterHandle" label="Twitter Handle"></aui:input>
						<aui:input name="linkedInUrl" label="LinkedIn URL"></aui:input>
					</aui:fieldset>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col md="12">
					<aui:button-row>
						<aui:button type="submit"></aui:button>
						<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
					</aui:button-row>
				</aui:col>
			</aui:row>
		</aui:form>

	</liferay-ui:panel>
</liferay-ui:panel>