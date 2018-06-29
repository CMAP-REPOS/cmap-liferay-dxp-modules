package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import contact.manager.app.viewmodel.CrmContactAuditLogChangeViewModel;
import contact.manager.model.CrmContact;
import contact.manager.model.CrmContactAuditLog;
import contact.manager.model.CrmContactAuditLogChange;
import contact.manager.service.CrmContactAuditLogChangeLocalServiceUtil;

public class AuditLogUtil {

	public static CrmContactAuditLog updateCrmContactAuditLogProperties(CrmContactAuditLog crmContactAuditLog,
			ServiceContext serviceContext, long crmContactId, String action) {
		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);

		crmContactAuditLog.setAction(action);
		crmContactAuditLog.setUserId(userId);
		crmContactAuditLog.setUserName(userName);
		crmContactAuditLog.setModifiedDate(serviceContext.getCreateDate(now));
		crmContactAuditLog.setCrmContactId(crmContactId);

		long companyId = serviceContext.getCompanyId();
		long groupId = serviceContext.getScopeGroupId();

		crmContactAuditLog.setGroupId(groupId);
		crmContactAuditLog.setCompanyId(companyId);
		crmContactAuditLog.setCreateDate(serviceContext.getCreateDate(now));

		return crmContactAuditLog;
	}

	public static List<CrmContactAuditLogChangeViewModel> collectCrmContactAuditLogChanges(CrmContact crmContactOld,
			CrmContact crmContactNew) {

		List<CrmContactAuditLogChangeViewModel> crmContactAuditLogChanges = new ArrayList<CrmContactAuditLogChangeViewModel>();

		if (!StringUtil.matches(crmContactOld.getAlternateContact(), crmContactNew.getAlternateContact())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Alternate Contact",
					crmContactOld.getAlternateContact(), crmContactNew.getAlternateContact());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getAlternateEmail(), crmContactNew.getAlternateEmail())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Alternate Email",
					crmContactOld.getAlternateEmail(), crmContactNew.getAlternateEmail());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getFacebookId(), crmContactNew.getFacebookId())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Facebook ID",
					crmContactOld.getFacebookId(), crmContactNew.getFacebookId());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getFirstName(), crmContactNew.getFirstName())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("First Name",
					crmContactOld.getFirstName(), crmContactNew.getFirstName());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getGroupsList(), crmContactNew.getGroupsList())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Groups",
					crmContactOld.getGroupsList(), crmContactNew.getGroupsList());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (Long.compare(crmContactOld.getImageFileEntryId(), crmContactNew.getImageFileEntryId()) != 0) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Image",
					String.valueOf(crmContactOld.getImageFileEntryId()),
					String.valueOf(crmContactNew.getImageFileEntryId()));
			crmContactAuditLogChanges.add(viewModel);
		}

		if (crmContactOld.getIsVip() == crmContactNew.getIsVip()) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("VIP",
					String.valueOf(crmContactOld.getIsVip()), String.valueOf(crmContactNew.getIsVip()));
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getJobTitle(), crmContactNew.getJobTitle())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Job Title",
					crmContactOld.getJobTitle(), crmContactNew.getJobTitle());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getLastName(), crmContactNew.getLastName())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Last Name",
					crmContactOld.getLastName(), crmContactNew.getLastName());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getLinkedInUrl(), crmContactNew.getLinkedInUrl())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Linked In URL",
					crmContactOld.getLinkedInUrl(), crmContactNew.getLinkedInUrl());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getMiddleName(), crmContactNew.getMiddleName())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Middle Name",
					crmContactOld.getMiddleName(), crmContactNew.getMiddleName());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getOrganization(), crmContactNew.getOrganization())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Organization",
					crmContactOld.getOrganization(), crmContactNew.getOrganization());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrefix(), crmContactNew.getPrefix())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Prefix",
					crmContactOld.getPrefix(), crmContactNew.getPrefix());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddress1(), crmContactNew.getPrimaryAddress1())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address 1",
					crmContactOld.getPrimaryAddress1(), crmContactNew.getPrimaryAddress1());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddress2(), crmContactNew.getPrimaryAddress2())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("",
					crmContactOld.getPrimaryAddress2(), crmContactNew.getPrimaryAddress2());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddressCity(), crmContactNew.getPrimaryAddressCity())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address City",
					crmContactOld.getPrimaryAddressCity(), crmContactNew.getPrimaryAddressCity());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddressCountry(), crmContactNew.getPrimaryAddressCountry())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address Country",
					crmContactOld.getPrimaryAddressCountry(), crmContactNew.getPrimaryAddressCountry());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddressCounty(), crmContactNew.getPrimaryAddressCounty())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address County",
					crmContactOld.getPrimaryAddressCounty(), crmContactNew.getPrimaryAddressCounty());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddressState(), crmContactNew.getPrimaryAddressState())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address State",
					crmContactOld.getPrimaryAddressState(), crmContactNew.getPrimaryAddressState());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryAddressZip(), crmContactNew.getPrimaryAddressZip())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Address Zip",
					crmContactOld.getPrimaryAddressZip(), crmContactNew.getPrimaryAddressZip());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryCell(), crmContactNew.getPrimaryCell())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Cell",
					crmContactOld.getPrimaryCell(), crmContactNew.getPrimaryCell());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryEmailAddress(), crmContactNew.getPrimaryEmailAddress())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Email Address",
					crmContactOld.getPrimaryEmailAddress(), crmContactNew.getPrimaryEmailAddress());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryFax(), crmContactNew.getPrimaryFax())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Fax",
					crmContactOld.getPrimaryFax(), crmContactNew.getPrimaryFax());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryPhone(), crmContactNew.getPrimaryPhone())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("",
					crmContactOld.getPrimaryPhone(), crmContactNew.getPrimaryPhone());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getPrimaryPhoneExtension(), crmContactNew.getPrimaryPhoneExtension())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Primary Phone Extension",
					crmContactOld.getPrimaryPhoneExtension(), crmContactNew.getPrimaryPhoneExtension());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSalutation(), crmContactNew.getSalutation())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Salutation",
					crmContactOld.getSalutation(), crmContactNew.getSalutation());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddress1(), crmContactNew.getSecondaryAddress1())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address 1",
					crmContactOld.getSecondaryAddress1(), crmContactNew.getSecondaryAddress1());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddress2(), crmContactNew.getSecondaryAddress2())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address 2",
					crmContactOld.getSecondaryAddress2(), crmContactNew.getSecondaryAddress2());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddressCity(), crmContactNew.getSecondaryAddressCity())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address City",
					crmContactOld.getSecondaryAddressCity(), crmContactNew.getSecondaryAddressCity());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddressCountry(),
				crmContactNew.getSecondaryAddressCountry())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address Country",
					crmContactOld.getSecondaryAddressCountry(), crmContactNew.getSecondaryAddressCountry());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddressCounty(), crmContactNew.getSecondaryAddressCounty())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address County",
					crmContactOld.getSecondaryAddressCounty(), crmContactNew.getSecondaryAddressCounty());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddressState(), crmContactNew.getSecondaryAddressState())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address State",
					crmContactOld.getSecondaryAddressState(), crmContactNew.getSecondaryAddressState());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getSecondaryAddressZip(), crmContactNew.getSecondaryAddressZip())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Secondary Address ZIP",
					crmContactOld.getSecondaryAddressZip(), crmContactNew.getSecondaryAddressZip());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getTagsList(), crmContactNew.getTagsList())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Tags",
					crmContactOld.getTagsList(), crmContactNew.getTagsList());
			crmContactAuditLogChanges.add(viewModel);
		}

		if (!StringUtil.matches(crmContactOld.getTwitterHandle(), crmContactNew.getTwitterHandle())) {
			CrmContactAuditLogChangeViewModel viewModel = new CrmContactAuditLogChangeViewModel("Twitter Handle",
					crmContactOld.getTwitterHandle(), crmContactNew.getTwitterHandle());
			crmContactAuditLogChanges.add(viewModel);
		}

		return crmContactAuditLogChanges;
	}

	public static void setCrmContactAuditLogChanges(
			List<CrmContactAuditLogChangeViewModel> crmContactAuditLogChangeViewModels, ServiceContext serviceContext,
			long crmContactAuditLogId) {

		Date now = new Date();
		long userId = serviceContext.getUserId();
		long companyId = serviceContext.getCompanyId();
		long groupId = serviceContext.getScopeGroupId();
		String userName = UserUtil.getUserName(userId);

		for (CrmContactAuditLogChangeViewModel viewModel : crmContactAuditLogChangeViewModels) {

			CrmContactAuditLogChange crmContactAuditLogChange = CrmContactAuditLogChangeLocalServiceUtil
					.createCrmContactAuditLogChange(0);

			crmContactAuditLogChange.setCrmContactAuditLogId(crmContactAuditLogId);
			crmContactAuditLogChange.setCompanyId(companyId);
			crmContactAuditLogChange.setCreateDate(now);
			crmContactAuditLogChange.setCreateDate(serviceContext.getCreateDate(now));
			crmContactAuditLogChange.setFieldName(viewModel.getFieldName());
			crmContactAuditLogChange.setGroupId(groupId);
			crmContactAuditLogChange.setModifiedDate(now);
			crmContactAuditLogChange.setNewValue(viewModel.getNewValue());
			crmContactAuditLogChange.setOldValue(viewModel.getOldValue());
			crmContactAuditLogChange.setUserId(userId);
			crmContactAuditLogChange.setUserName(userName);

			CrmContactAuditLogChangeLocalServiceUtil.addCrmContactAuditLogChange(crmContactAuditLogChange);
		}
	}

}
