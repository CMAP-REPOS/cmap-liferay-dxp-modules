package contact.manager.service.util;

import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.resource.Resource;
import org.apache.velocity.runtime.resource.loader.ResourceLoader;

public class VelocityWebApplicationResourceLoader extends ResourceLoader {
	private static ServletContext context = null;

	@Override
	public long getLastModified(Resource arg0) {
		return 0;
	}

	private static ServletContext getServletContext() {
		return context;
	}

	public static void setServletContext(ServletContext context) {
		VelocityWebApplicationResourceLoader.context = context;
	}

	@Override
	public InputStream getResourceStream(String name) throws ResourceNotFoundException {
		
		InputStream result = null;
		if (name == null || name.length() == 0) {
			throw new ResourceNotFoundException("No template name provided");
		}
		
		try {
			if (!name.startsWith("/")) {
				name = "/" + name;
			}
			result = getServletContext().getResourceAsStream(name);
		} 
		catch (NullPointerException npe) {
			throw new ResourceNotFoundException("ServletContext not found");
		} 
		catch (Exception ex) {
			throw new ResourceNotFoundException(ex.getMessage());
		}
		
		return result;
	}

	@Override
	public void init(ExtendedProperties arg0) {
	}

	@Override
	public boolean isSourceModified(Resource arg0) {
		return false;
	}
}
