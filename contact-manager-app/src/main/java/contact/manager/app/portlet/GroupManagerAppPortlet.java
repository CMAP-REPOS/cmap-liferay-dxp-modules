package contact.manager.app.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
import contact.manager.comparator.CrmContactCreateDateComparator;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.service.CrmContactLocalService;
import contact.manager.service.CrmContactLocalServiceUtil;
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
		
		if(command.equals("exportCSV")) {
			try {
				exportCSVData(resourceRequest, resourceResponse);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	
public void exportCSVData(ResourceRequest request, ResourceResponse response) throws PortalException {
		
		try {
			StringBundler sb = new StringBundler();
			int getStart = 0; //ParamUtil.getInteger(request, "getStart");
			int getEnd = CrmContactLocalServiceUtil.getCrmContactsCount(); //ParamUtil.getInteger(request, "getEnd");
			long crmGroupId = ParamUtil.getLong(request, "crmGroupId");
			
			OrderByComparator orderByComparator = new CrmContactCreateDateComparator(false);
			
			
			System.out.println("=======Start -> " + getStart + "=======");
			System.out.println("=======End -> " + getEnd + "=======");
			
			for (String columnName : ConstantContactKeys.CSV_COLUMMN_NAMES) {
				sb.append(getCSVFormattedValue(columnName));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				}
			
			List<CrmContact> crmContacts = _crmGroupLocalService.getCrmContacts(crmGroupId, getStart,getEnd, orderByComparator);
			
			sb.setIndex(sb.index() - 1);
			sb.append(CharPool.NEW_LINE);
			
			for (CrmContact crmContact : crmContacts) {
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getFirstName())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getLastName())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getOrganization())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getJobTitle())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryAddress1())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryAddress2())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryAddressCity())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryAddressZip())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryAddressCounty())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryPhone())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryCell())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getPrimaryEmailAddress())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getGroupsList())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getTagsList())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.append(getCSVFormattedValue(String.valueOf(crmContact.getModifiedDate())));
				sb.append(ConstantContactKeys.CSV_SEPARATOR);
				
				sb.setIndex(sb.index() - 1);
				sb.append(CharPool.NEW_LINE);
			}
			
			String fileName = "groupContacts.csv";
			byte[] bytes = sb.toString().getBytes();
			String contentType = ContentTypes.APPLICATION_TEXT;
			PortletResponseUtil.sendFile(request, response, fileName, bytes, contentType);
			
		} catch (Exception e) {
			LOGGER.error("Exception in GroupManagerAppPortlet.exportCSVData: " + e.getMessage());
		}
	}
	
	protected String getCSVFormattedValue(String value) {
		
		StringBundler sb = new StringBundler(3);
		sb.append(CharPool.QUOTE);
		sb.append(StringUtil.replace(value, CharPool.QUOTE,
		StringPool.DOUBLE_QUOTE));
		sb.append(CharPool.QUOTE);
		return sb.toString();
	}

	@Reference(unbind = "-")
	protected void setEntryService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private CrmGroupLocalService _crmGroupLocalService;
	private CrmContactLocalService _crmContactLocalService;
}
