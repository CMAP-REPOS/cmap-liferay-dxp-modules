package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ConstantContactKeys;
import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.GroupUtil;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmGroupLocalService;
import contact.manager.service.CrmGroupLocalServiceUtil;

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
			"com.liferay.portlet.header-portlet-css=/css/main.css",
			"com.liferay.portlet.header-portlet-css=/css/select2.css",
			"com.liferay.portlet.header-portlet-javascript=/js/select2.js",
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

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String command = ParamUtil.getString(resourceRequest, "cmd");

		if (command.equals("getPotentialContacts")) {
			String nameParam = ParamUtil.getString(resourceRequest, "name");
			String potentialContactsSerialized = GroupUtil.getCrmContactsByName(nameParam);

			PrintWriter writer = resourceResponse.getWriter();
			writer.write(potentialContactsSerialized);
			writer.close();
		} else if (command.equals("getExistingContacts")) {
			String nameParam = ParamUtil.getString(resourceRequest, "name");
			String groupIdParam = ParamUtil.getString(resourceRequest, "crmGroupId");
			String potentialContactsSerialized = GroupUtil.getCrmContactsByNameAndCrmGroupId(nameParam, Long.parseLong(groupIdParam));

			PrintWriter writer = resourceResponse.getWriter();
			writer.write(potentialContactsSerialized);
			writer.close();
		}
	}

	public void add(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);

			CrmGroup crmGroup = _crmGroupLocalService.createCrmGroup(0);
			crmGroup = GroupUtil.updateCrmGroupProperties(crmGroup, request, serviceContext, true);
			_crmGroupLocalService.addCrmGroup(crmGroup);

			long[] crmContactIds = ParamUtil.getLongValues(request, "crmContactIds");
			CrmGroupLocalServiceUtil.setCrmContacts(crmGroup.getCrmGroupId(), crmContactIds);
			
			_crmGroupLocalService.updateCrmGroup(crmGroup);

		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.add: " + e.getMessage());
		}
	}

	public void update(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmGroupId = ParamUtil.getLong(request, "crmGroupId");

			CrmGroup crmGroup = _crmGroupLocalService.getCrmGroup(crmGroupId);
			crmGroup = GroupUtil.updateCrmGroupProperties(crmGroup, request, serviceContext, false);

			long[] crmContactIds = ParamUtil.getLongValues(request, "crmContactIds");
			CrmGroupLocalServiceUtil.setCrmContacts(crmGroup.getCrmGroupId(), crmContactIds);

			_crmGroupLocalService.updateCrmGroup(crmGroup);
			response.setRenderParameter("crmGroupId", Long.toString(crmGroupId));
			response.setRenderParameter("mvcPath", "/groups/details.jsp");

		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.update: " + e.getMessage());
		}
	}
	
	public void deleteGroup(ActionRequest request, ActionResponse response) throws PortalException {
		try {
			long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
			CrmGroup crmGroup = _crmGroupLocalService.getCrmGroup(crmGroupId);
			crmGroup.setStatus(ConstantContactKeys.CC_STATUS_REMOVED);
			_crmGroupLocalService.updateCrmGroup(crmGroup);
			
		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.delete: " + e.getMessage());
		}
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private CrmGroupLocalService _crmGroupLocalService;
}
