package contact.manager.app.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.service.CrmGroupLocalService;

/**
 * @author jon
 */
@Component(
	immediate = true, 
	property = { 
			"com.liferay.portlet.add-default-resource=true",
			"com.liferay.portlet.display-category=category.hidden", 
			"com.liferay.portlet.layout-cacheable=true",
			"com.liferay.portlet.private-request-attributes=false", 
			"com.liferay.portlet.private-session-attributes=false",
			"com.liferay.portlet.render-weight=50", 
			"com.liferay.portlet.use-default-template=true",
			"javax.portlet.display-name=Group Manager", 
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.template-path=/", 
			"javax.portlet.init-param.view-template=/groups/view.jsp",
			"javax.portlet.name=" + ContactManagerAppPortletKeys.GroupManagerApp,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.supports.mime-type=text/html" 
	}, 
	service = Portlet.class
)

public class GroupManagerAppPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		super.render(request, response);
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private CrmGroupLocalService _crmGroupLocalService;

}
