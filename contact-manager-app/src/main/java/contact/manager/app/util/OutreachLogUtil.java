package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;

import javax.portlet.ActionRequest;

import contact.manager.app.constants.CrmOutreachLogKeys;
import contact.manager.model.CrmOutreachLog;

public class OutreachLogUtil {

	public static CrmOutreachLog updateCrmOutreachLogProperties(CrmOutreachLog crmOutreachLog, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);
		
		Date outreachDate = ParamUtil.getDate(request, CrmOutreachLogKeys.OUTREACH_DATE, null);
		String medium = ParamUtil.getString(request, CrmOutreachLogKeys.MEDIUM);
		String note = ParamUtil.getString(request, CrmOutreachLogKeys.NOTE);
		long crmContactId = ParamUtil.getLong(request, CrmOutreachLogKeys.CRM_CONTACT_ID);

		crmOutreachLog.setOutreachDate(outreachDate);
		crmOutreachLog.setMedium(medium);
		crmOutreachLog.setNote(note);
		crmOutreachLog.setUserId(userId);
		crmOutreachLog.setUserName(userName);
		crmOutreachLog.setModifiedDate(serviceContext.getCreateDate(now));
		crmOutreachLog.setCrmContactId(crmContactId);

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmOutreachLog.setGroupId(groupId);
			crmOutreachLog.setCompanyId(companyId);
			crmOutreachLog.setCreateDate(serviceContext.getCreateDate(now));
		}

		return crmOutreachLog;
	}	
}
