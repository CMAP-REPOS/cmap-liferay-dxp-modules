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
