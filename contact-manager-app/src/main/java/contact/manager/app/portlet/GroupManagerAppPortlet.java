package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.PermissionUtil;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmGroupLocalService;
import contact.manager.service.CrmGroupService;

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

	private static final Log LOGGER = LogFactoryUtil.getLog(GroupManagerAppPortlet.class);

	public void add(ActionRequest request, ActionResponse response) throws PortalException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserAddGroup(user)) {
			// TODO: set session message
			return;
		}
		
		try {
			CrmGroup crmGroup = _crmGroupLocalService.createCrmGroup(0);
			
			String name = ParamUtil.getString(request, "name");
			long[] crmContactIds = ParamUtil.getLongValues(request, "crmContactIds");
		
			crmGroup.setName(name);
			
			_crmGroupService.setCrmGroupCrmContacts(crmGroup.getCrmGroupId(), crmContactIds);
			_crmGroupService.addCrmGroup(crmGroup);

			response.setRenderParameter("crmGroupId", Long.toString(crmGroup.getCrmGroupId()));
			response.setRenderParameter("mvcPath", "/groups/details.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.add: " + e.getMessage());
		}
	}

	public void update(ActionRequest request, ActionResponse response) throws PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		if (!PermissionUtil.canUserUpdateGroup(user)) {
			// TODO: set session message
			return;
		}
		
		try {
			long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
			String name = ParamUtil.getString(request, "name");
			long[] crmContactIds = ParamUtil.getLongValues(request, "crmContactIds");

			CrmGroup crmGroup = _crmGroupService.getCrmGroup(crmGroupId);

			crmGroup.setName(name);
			System.out.println(crmGroup.getName());

			_crmGroupService.setCrmGroupCrmContacts(crmGroup.getCrmGroupId(), crmContactIds);
			_crmGroupService.updateCrmGroup(crmGroup);

			response.setRenderParameter("crmGroupId", Long.toString(crmGroupId));
			response.setRenderParameter("mvcPath", "/groups/details.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.update: " + e.getMessage());
		}
	}

	@Reference(unbind = "-")
	protected void setCrmGroupService(CrmGroupService crmGroupService ) {
		_crmGroupService  = crmGroupService;
	}

	@Reference(unbind = "-")
	protected void setCrmGroupLocalService(CrmGroupLocalService crmGroupLocalService ) {
		_crmGroupLocalService  = crmGroupLocalService;
	}

	private CrmGroupService _crmGroupService;
	private CrmGroupLocalService _crmGroupLocalService;
}
