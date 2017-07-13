<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<portlet:defineObjects />

<%
	//Get url to put on form ... i.e. name method that will be called on form submit
	PortletURL uploadAction = renderResponse.createActionURL();
	uploadAction.setParameter(ActionRequest.ACTION_NAME, "uploadImage");
%>

<form name="<portlet:namespace/>fm" method="POST"
	id="<portlet:namespace/>fm" enctype='multipart/form-data'
	action="<%=uploadAction.toString()%>">
	<input type="file" name="<portlet:namespace/>fileInput" /> <br /> <br />
	<input type="submit" value="upload" />
</form>
