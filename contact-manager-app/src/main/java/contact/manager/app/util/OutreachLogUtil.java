package contact.manager.app.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmOutreachLogLocalServiceUtil;

public class OutreachLogUtil {

	private static final Log LOGGER = LogFactoryUtil.getLog(OutreachLogUtil.class);

	public static void addOutreachLog() {
		// TODO: implement
		// TODO: check permission
	}

	public static CrmOutreachLog getOutreachLog(long crmOutreachLogId) {
		// TODO: implement
		// TODO: check permission
		CrmOutreachLog contactOutreachLog = null;
		try {
			contactOutreachLog = CrmOutreachLogLocalServiceUtil.getCrmOutreachLog(crmOutreachLogId);
		} catch (PortalException e) {
			LOGGER.error("Exception in OutreachLogUtil.getOutreachLog: " + e.getMessage());
			e.printStackTrace();
		}
		return contactOutreachLog;
	}

	public static List<CrmOutreachLog> getOutreachLogs(long crmContactId) {
		// TODO: implement
		// TODO: check permission
		List<CrmOutreachLog> contactOutreachLogs = CrmOutreachLogLocalServiceUtil.findByCrmContactId(crmContactId);
		return contactOutreachLogs;
	}
}
