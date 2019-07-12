<%@ include file="/init.jsp" %>

<liferay-ui:success key="408" message="Email added to newsletter"/>
<liferay-ui:success key="409" message="Adress already added. An email has been sent"/>
<liferay-ui:success key="410" message="Adress is not active. An email has been sent"/>
<liferay-ui:error key="400" message="Contact already exists!"/>
  
  <div >
  	<p class="caption">
       <liferay-ui:message key="Subscribe to our newsletter" />
    </p>
  </div>
  
  
  <%//AQUI SE MANDA LLAMAR EL NOMBRE DEL METODO EN EL PORTLET.JAVA!!!!!!! %>
  <portlet:actionURL name = "signupEmail" var="signupURL"/>
  		
	<aui:form action="<%= signupURL %>" style="margin-top: 2rem;">
	
		<aui:input name="contactEmail" type="textarea" label="Sign up for our mailing list to stay updated on what's happening around our region each week"
			placeholder="Email">
			<aui:validator name="required" />
			<aui:validator name="maxLength">500</aui:validator>
		</aui:input>
		
		<aui:button-row>
  			<aui:button type="submit" value="Submit"/>
  		</aui:button-row>
	</aui:form>
	
	
  	
  		