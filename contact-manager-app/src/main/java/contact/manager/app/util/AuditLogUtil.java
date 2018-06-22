package contact.manager.app.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import contact.manager.model.CrmContactAuditLog;
import contact.manager.service.CrmContactAuditLogLocalServiceUtil;

public class AuditLogUtil {

	private static final Log LOGGER = LogFactoryUtil.getLog(AuditLogUtil.class);

	public static void addAuditLog() {
		// TODO: implement
		// TODO: check permissions
	}

	public static CrmContactAuditLog getContactAuditLog(long crmContactAuditLogId) {
		// TODO: implement
		// TODO: check permissions
		CrmContactAuditLog contactAuditLog = null;
		try {
			contactAuditLog = CrmContactAuditLogLocalServiceUtil.getCrmContactAuditLog(crmContactAuditLogId);
		} catch (PortalException e) {
			LOGGER.error("Exception in AuditLogUtil.getContactAuditLog: " + e.getMessage());
		}
		return contactAuditLog;
	}

	public static List<CrmContactAuditLog> getContactAuditLogs(long crmContactId) {
		// TODO: implement
		// TODO: check permissions
		List<CrmContactAuditLog> contactAuditLogs = CrmContactAuditLogLocalServiceUtil.findByCrmContactId(crmContactId);
		return contactAuditLogs;
	}
}
