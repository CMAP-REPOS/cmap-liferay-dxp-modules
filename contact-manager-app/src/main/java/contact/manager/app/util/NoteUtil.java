package contact.manager.app.util;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;

import javax.portlet.ActionRequest;

import contact.manager.model.CrmNote;

public class NoteUtil {
	
	public static CrmNote updateCrmNoteProperties(CrmNote crmNote, ActionRequest request,
			ServiceContext serviceContext, boolean isNew) {

		Date now = new Date();
		long userId = serviceContext.getUserId();
		String userName = UserUtil.getUserName(userId);

		String note = ParamUtil.getString(request, "note");
		long crmContactId = ParamUtil.getLong(request, "crmContactId");

		crmNote.setNote(note);
		crmNote.setUserId(userId);
		crmNote.setUserName(userName);
		crmNote.setModifiedDate(serviceContext.getModifiedDate(now));
		crmNote.setCrmContactId(crmContactId);

		if (isNew) {
			long companyId = serviceContext.getCompanyId();
			long groupId = serviceContext.getScopeGroupId();

			crmNote.setGroupId(groupId);
			crmNote.setCompanyId(companyId);
			crmNote.setCreateDate(serviceContext.getCreateDate(now));
		}

		return crmNote;
	}

}
