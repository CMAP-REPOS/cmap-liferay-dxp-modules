package contact.manager.app.application.rest;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import contact.manager.app.application.service.ContentUtilityService;

@Path("/resources")
public class ContentUtilMethods {
	
	protected ContentUtilityService _contentUtilityService;
	
	public ContentUtilMethods() {
	}
	
	public ContentUtilMethods(ContentUtilityService contentUtilityService) {
		this._contentUtilityService = contentUtilityService;
	}
	
	
	@PUT
	@Path("/touchElementsOfAllChilderPages/")
	@Produces(MediaType.APPLICATION_JSON)
	public String touchElementsOfAllChilderPages(@FormParam("groupId") long groupId, 
			@FormParam("friendlyURL") String friendlyURL,
			@FormParam("language") String language) {
		
		return _contentUtilityService.touchElementsOfAllChilderPages(groupId, friendlyURL);
	}
	
	@POST
	@Path("/updateLayoutAndChildrenTSProp/")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateLayoutAndChildrenTypeSettingsProperty(@FormParam("groupId") long groupId, 
			@FormParam("friendlyURL") String friendlyURL,
			@FormParam("language") String language,
			@FormParam("typeSettingProperty") String typeSettingProperty,
			@FormParam("value") String value) {
		
		return _contentUtilityService.updateLayoutAndChildrenTypeSettingsProperty(groupId, friendlyURL, typeSettingProperty, value);
	}
	
	
	@POST
	@Path("/addURolesToUsers/")
	@Consumes("application/json")
	@Produces("application/json")
	public String addURolesToUsers(Map<String, long[]> parameters, @QueryParam("groupId") long groupId) {
		_contentUtilityService.addURolesToUsers(parameters.get("roles"), groupId, parameters.get("users"));
		return "";
	}
	
	@POST
	@Path("/addRolesToPages/")
	@Consumes("application/json")
	@Produces("application/json")
	public String addRolesToPages(Map<Long, String[]> roles, @QueryParam("groupId") long groupId, @QueryParam("friendlyURL") String friendlyURL) {
		_contentUtilityService.addRolesToPages(groupId, roles, friendlyURL);
		return "";
	}
	
	@POST
	@Path("/addRolesToContentInPages/")
	@Consumes("application/json")
	@Produces("application/json")
	public String addRolesToContentInPages(Map<Long, String[]> roles, @QueryParam("groupId") long groupId, @QueryParam("friendlyURL") String friendlyURL) {
		_contentUtilityService.addRolesToContentInPages(groupId, roles, friendlyURL);
		return "";
	}
	
}
