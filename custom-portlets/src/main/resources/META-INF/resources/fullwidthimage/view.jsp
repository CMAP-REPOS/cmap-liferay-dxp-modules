<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %> 
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %> 
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil "%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>

<%@page import="java.util.*"%>
<%@page import="java.io.*"%>

<%@ page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>	

<portlet:defineObjects />

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<liferay-theme:defineObjects />

<p>
	<b>fullwidthimage</b>
</p>


<% 
	//Get url to put on form ... i.e. name method that will be called on form submit
	PortletURL uploadUrl = renderResponse.createRenderURL();
	uploadUrl.setParameter("jspPage", "/html/fullwidthimage/upload.jsp");
	uploadUrl.setWindowState(WindowState.MAXIMIZED);
	
	Folder folder = (Folder)renderRequest.getAttribute("folder");
	List<FileEntry> fileentries = (List<FileEntry>)renderRequest.getAttribute("files");
	FileEntry selectedFile = (FileEntry)renderRequest.getAttribute("selectedFile");
	boolean edit = (Boolean)renderRequest.getAttribute("edit");
	boolean hasRole = (Boolean)renderRequest.getAttribute("hasRole");
	String selectedFileUrl = "%s/documents/%s/%s/%s/%s";
	if (selectedFile != null) 
		selectedFileUrl = String.format(selectedFileUrl, themeDisplay.getPortalURL(), themeDisplay.getLayout().getGroupId(), themeDisplay.getLayout().getPlid(), selectedFile.getTitle(), selectedFile.getUuid());
%>
<div id="<portlet:namespace/>divDisplay" class="span12">
	<%  if(selectedFile != null || hasRole) 
		{
	%>
		<img style="width:100%;" id="<portlet:namespace/>imgDisplay" src="<%=selectedFileUrl %>" />
	<%
		}
	%>
	</div>
<%
    if(hasRole)
    {
    %>

<form  name="<portlet:namespace/>fm" method="POST"	id="<portlet:namespace/>fm" enctype="multipart/form-data" action="<%=uploadUrl.toString() %>">
    	<br />
    	<br />
		<input type="button" value="Edit Image" id="<portlet:namespace/>btnEdit" onclick="<portlet:namespace/>Edit();"/>
		
	<div id="<portlet:namespace/>divEdit" class="container-fluid">
		<div class="row-fluid" >
			<div class="span10 offset2">
				<%-- <input type="file" value="Choose Image File To Upload" id="<portlet:namespace/>btnUpload" name="<portlet:namespace/>btnUpload" /> --%>
				<input type="submit" value="Upload New" /> <strong style="color:red;">!!! Warning all unsaved changes on page will be lost !!!</strong>
			</div>
		</div>
		
		<div class="row-fluid" >
			<div class="span2">
				<strong>Image to Display:</strong>
			</div>	
			<div class="span10">
				<select  style="height: 100px; width: 200px;" id='<portlet:namespace/>sliderImagesList'>
				<%
				if(fileentries != null)
				{
					for(int i = 0; i < fileentries.size(); i++)
					{
						FileEntry f = fileentries.get(i);
						if(!f.getTitle().equals("Thumbs.db"))
						{
							if(selectedFile != null && f.getUuid().equals(selectedFile.getUuid()))
							{
						%>
							<option value="<%= f.getUuid()%>" selected="selected"><%= f.getTitle() %></option>
						<%
							}
							else 
							{
						%>
								<option value="<%= f.getUuid()%>" ><%= f.getTitle() %></option>					
						
						<% 		
							}
						}
			    	}
				}
				%>
				</select>
				&nbsp;&nbsp;
				<img id="<portlet:namespace/>imgPreview" src="<%=selectedFileUrl %>" alt="#" width="100px" height="100px" />
			</div>
		</div>
		<input type="button" value="Save" onclick="<portlet:namespace/>Save();" />
		<input type="button" value="Cancel" onclick="<portlet:namespace/>Cancel();" />
	</div>
</form>

<script type="text/javascript">
$(document).ready(function() {
	if(<%=Boolean.toString(edit)%>)
	{
		$("#<portlet:namespace/>divDisplay").hide();
	}
	else
	{
		$("#<portlet:namespace/>divEdit").hide();
	}
});
Liferay.on(
	'DoPageEdit',
	function(event) {
		<portlet:namespace/>Edit();
	}
);
Liferay.on(
	'DoPageSave',
	function(event) {
		<portlet:namespace/>Save();
	}
);
Liferay.on(
	'DoPageCancel',
	function(event) {
		<portlet:namespace/>Cancel();
	}
);
$("#<portlet:namespace/>sliderImagesList").change(
	function(){
		$("#<portlet:namespace/>imgPreview").attr("src",'<%=themeDisplay.getPortalURL()%>/c/document_library/get_file?uuid='+$("#<portlet:namespace/>sliderImagesList").val()+'&groupId=<%=themeDisplay.getLayout().getGroupId() %>');
	}
);
function <portlet:namespace/>Edit()
{
	$("#<portlet:namespace/>divDisplay").hide();
	$("#<portlet:namespace/>divEdit").show();
	$("#<portlet:namespace/>btnEdit").hide();
}
function <portlet:namespace/>Cancel()
{
	$("#<portlet:namespace/>divDisplay").show();
	$("#<portlet:namespace/>divEdit").hide();
	$("#<portlet:namespace/>btnEdit").show();
}
function <portlet:namespace/>Save()
{
	$("#<portlet:namespace/>divDisplay").show();
	$("#<portlet:namespace/>divEdit").hide();
	$("#<portlet:namespace/>btnEdit").show();
	
	//get resource url then make ajax call to call serveResource method
	var url = '<portlet:resourceURL id="getDataResourceURL"></portlet:resourceURL>';
	url += "&<portlet:namespace/>image=" + $("#<portlet:namespace/>sliderImagesList").val();	
 	$.ajax({
		type: "POST",
        url: url,                         
        success: function(data){
        	$("#<portlet:namespace/>imgDisplay").attr("src",'<%=themeDisplay.getPortalURL()%>/c/document_library/get_file?uuid='+$("#<portlet:namespace/>sliderImagesList").val()+'&groupId=<%=themeDisplay.getLayout().getGroupId() %>');
        	$("#<portlet:namespace/>divDisplay").attr("class", "span" +$("#<portlet:namespace/>txtColumns").val() );
        }
	}); 
}
</script>
	<%
	}
%>
<div style="clear: both;"> </div>