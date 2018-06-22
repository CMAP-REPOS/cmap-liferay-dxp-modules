package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;

import javax.portlet.ActionRequest;

import contact.manager.model.CrmGroup;

public class GroupUtil {

	public static CrmGroup updateCrmGroupProperties(CrmGroup crmGroup, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {
		
		Date now = new Date();
		long userId = serviceContext.getUserId();

		String name = ParamUtil.getString(request, "name");

		crmGroup.setName(name);
		crmGroup.setUserId(userId);
		crmGroup.setUserName(StringPool.BLANK);
		crmGroup.setModifiedDate(serviceContext.getModifiedDate(now));

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmGroup.setGroupId(groupId);
			crmGroup.setCompanyId(companyId);
			crmGroup.setCreateDate(serviceContext.getCreateDate(now));
			// TODO: implement status
			// crmGroup.setStatus(ConstantContactKeys.CC_STATUS_ACTIVE);
		}

		return crmGroup;
	}
}
