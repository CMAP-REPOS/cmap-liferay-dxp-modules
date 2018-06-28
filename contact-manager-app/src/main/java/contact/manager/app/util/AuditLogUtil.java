package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

import contact.manager.model.CrmContactAuditLog;

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
}
