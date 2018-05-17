package contact.manager.app.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.app.constants.ContactManagerAppPortletKeys;
import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalService;

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
			"javax.portlet.display-name=Contact Manager",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.name=" + ContactManagerAppPortletKeys.ContactManagerApp,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.supports.mime-type=text/html"
		},
		service = Portlet.class
	)
public class ContactManagerAppPortlet extends MVCPortlet {

	private static final Log LOGGER = LogFactoryUtil.getLog(ContactManagerAppPortlet.class);

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {

		try {
			List<CrmContact> contacts = _crmContactLocalService.getCrmContacts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			request.setAttribute("contacts", contacts);
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.render: " + e.getMessage());
		}

		super.render(request, response);
	}

	public void addContact(ActionRequest request, ActionResponse response) throws PortalException {

		long crmContactId = CounterLocalServiceUtil.increment(CrmContact.class.getName());

		String firstName = ParamUtil.getString(request, "firstName");
		String lastName = ParamUtil.getString(request, "lastName");

		try {
			CrmContact crmContact = _crmContactLocalService.createCrmContact(crmContactId);
			crmContact.setFirstName(firstName);
			crmContact.setLastName(lastName);

			_crmContactLocalService.addCrmContact(crmContact);

			SessionMessages.add(request, "crmContactAdded");
			response.setRenderParameter("crmContactId", Long.toString(crmContactId));
		} catch (Exception e) {
			LOGGER.error("Exception in ContactManagerAppPortlet.addContact: " + e.getMessage());
		}
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmContactLocalService crmContactLocalService) {
		_crmContactLocalService = crmContactLocalService;
	}

	private CrmContactLocalService _crmContactLocalService;
}