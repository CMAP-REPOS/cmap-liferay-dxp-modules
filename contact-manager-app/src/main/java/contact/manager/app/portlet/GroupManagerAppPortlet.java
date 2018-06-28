package contact.manager.app.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.app.util.GroupUtil;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
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

	private static final Log LOGGER = LogFactoryUtil.getLog(GroupManagerAppPortlet.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		super.render(request, response);
	}

	public void add(ActionRequest request, ActionResponse response) throws PortalException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
			long crmGroupId = CounterLocalServiceUtil.increment(CrmGroup.class.getName());

			CrmGroup crmGroup = _crmGroupLocalService.createCrmGroup(crmGroupId);
			crmGroup = GroupUtil.updateCrmGroupProperties(crmGroup, request, serviceContext, true);

			_crmGroupLocalService.addCrmGroup(crmGroup);
			response.setRenderParameter("crmGroupId", Long.toString(crmGroupId));
			response.setRenderParameter("mvcPath", "/groups/details.jsp");
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

			_crmGroupLocalService.updateCrmGroup(crmGroup);
			response.setRenderParameter("crmGroupId", Long.toString(crmGroupId));
			response.setRenderParameter("mvcPath", "/groups/details.jsp");
		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.update: " + e.getMessage());
		}
	}

	public void delete(ActionRequest request, ActionResponse response) throws PortalException {

		//		TODO: implement status
		//		try {
		//			ServiceContext serviceContext = ServiceContextFactory.getInstance(CrmContact.class.getName(), request);
		//			long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
		//			long userId = serviceContext.getUserId();
		//			Date now = new Date();
		//
		//			CrmGroup crmGroup = _crmGroupLocalService.getCrmGroup(crmGroupId);
		//			crmGroup.setStatus(ConstantContactKeys.CC_STATUS_REMOVED);
		//			crmGroup.setUserId(userId);
		//			crmGroup.setUserName(StringPool.BLANK);
		//			crmGroup.setModifiedDate(serviceContext.getModifiedDate(now));
		//
		//			_crmGroupLocalService.updateCrmGroup(crmGroup);
		//			response.setRenderParameter("jspPage", "/view.jsp");
		//		} catch (Exception e) {
		//			LOGGER.error("Exception in GroupManagerAppPortlet.delete: " + e.getMessage());
		//		}
	}
	
	@Reference(unbind = "-")
	protected void setEntryService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private CrmGroupLocalService _crmGroupLocalService;

}
