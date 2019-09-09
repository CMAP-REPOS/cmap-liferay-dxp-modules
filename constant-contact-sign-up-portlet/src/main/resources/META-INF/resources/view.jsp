<%@ include file="/init.jsp" %>
<liferay-ui:success key="408" message="Email added to newsletter"/>
<liferay-ui:success key="409" message="Adress already added. An email has been sent"/>
<liferay-ui:success key="410" message="Adress is not active. An email has been sent"/>
<liferay-ui:success key="411" message="Adress is not confirmed. An email has been sent"/>
<liferay-ui:error key="400" message="Contact already exists"/>
  
  
  
  <%//AQUI SE MANDA LLAMAR EL NOMBRE DEL METODO EN EL PORTLET.JAVA!!!!!!! %>
  <portlet:actionURL name = "signupEmail" var="signupURL"/>
    
      
 <div class="row page-layout b-signup-form">
 	
 	<div class="col-md-8">
    	<p class="sign-up-text">Sign up for our mailing list to stay updated on what's happening around our region each week</p>
    </div>
    
    <div class="col-md-8">
   		<aui:form cssClass="b-signup-form__form" action="<%= signupURL %>">
    
	        <aui:input cssClass="b-signup-form__input" name="contactEmail" type="textarea" resizable="false" autoSize="false" placeholder="Email" label="">
	            <aui:validator name="required" errorMessage="*Field cannot be empty"/>
	            <aui:validator name="email" errorMessage="*Enter a valid email address"/>
	            <aui:validator name="maxLength">500</aui:validator>
	        </aui:input>
        
	        <aui:button-row>
	            <aui:button cssClass="b-signup-form__button" type="submit" value="Submit"/>
	        </aui:button-row>
	        
    	</aui:form>
    </div>
   
 </div>