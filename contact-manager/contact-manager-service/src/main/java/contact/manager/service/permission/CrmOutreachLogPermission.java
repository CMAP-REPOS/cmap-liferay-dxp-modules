package contact.manager.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.model.CrmContact;
import contact.manager.model.CrmGroup;
import contact.manager.model.CrmOutreachLog;
import contact.manager.service.CrmOutreachLogLocalService;

@Component(immediate = true, property = { "model.class.name=com.contact.manager.model.CrmOutreachLog" })
public class CrmOutreachLogPermission implements BaseModelPermissionChecker {

	public static void check(PermissionChecker permissionChecker, long guestbookId, String actionId)
			throws PortalException, SystemException {

		if (!contains(permissionChecker, guestbookId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long groupId, long guestbookId, String actionId)
			throws PortalException {

		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException.MustHavePermission(permissionChecker, CrmGroup.class.getName(), guestbookId,
					actionId);
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId, long crmOutreachLogId,
			String actionId) throws PortalException {

		CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.getCrmOutreachLog(crmOutreachLogId);

		return CrmGroupModelPermission.contains(permissionChecker, groupId, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long crmOutreachLogId, String actionId)
			throws PortalException, SystemException {

		CrmOutreachLog crmOutreachLog = _crmOutreachLogLocalService.getCrmOutreachLog(crmOutreachLogId);
		return contains(permissionChecker, crmOutreachLog, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, CrmOutreachLog crmOutreachLog, String actionId)
			throws PortalException, SystemException {

		return permissionChecker.hasPermission(crmOutreachLog.getGroupId(), CrmContact.class.getName(),
				crmOutreachLog.getCrmOutreachLogId(), actionId);

	}

	@Reference(unbind = "-")
	protected void setCrmGroupLocalService(CrmOutreachLogLocalService crmOutreachLogLocalService) {
		_crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	private static CrmOutreachLogLocalService _crmOutreachLogLocalService;

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long guestbookId, String actionId)
			throws PortalException {
		check(permissionChecker, guestbookId, actionId);
	}
}
