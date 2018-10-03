package contact.manager.app.application.rest;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.application.service.ContentUtilityService;

/**
 * @author benjaminaguilar
 */
@ApplicationPath("/contentutility")
@Component(immediate = true, service = Application.class)
public class CMAPContentUtilityApplication extends Application {
	
	
	protected ContentUtilityService _contentUtilityService;
	
	
	@Reference
	public void setContentImporterService(ContentUtilityService contentUtilityService){
		_contentUtilityService = contentUtilityService;
	}

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	@PUT
	@Path("/markElments/pagebased/")
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

}