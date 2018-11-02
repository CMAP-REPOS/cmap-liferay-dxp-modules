package contact.manager.app.application.rest;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.application.service.ContentUtilityService;

/**
 * @author benjaminaguilar
 */
@ApplicationPath("/contentutility")
@Component(immediate = true, service = Application.class, property={"jaxrs.application=true"})
public class CMAPContentUtilityApplication extends Application {
	
	protected ContentUtilityService _contentUtilityService;
	
	@Reference
	public void setContentImporterService(ContentUtilityService contentUtilityService){
		_contentUtilityService = contentUtilityService;
	}
	
	public Set<Object> getSingletons() {
		
		Set<Object> singletons = new HashSet<Object>();
		
		singletons.add(new JacksonJsonProvider());
		singletons.add(new ContentUtilMethods(_contentUtilityService));
		
		return singletons;
		
	}
	
	
}