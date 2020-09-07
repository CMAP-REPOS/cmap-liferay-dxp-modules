package contact.manager.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import contact.manager.model.CrmGroup;
import contact.manager.service.CrmGroupLocalService;

@Component(immediate = true, property = { "model.class.name=com.contact.manager.model.CrmGroup" })
public class CrmGroupPermission implements BaseModelPermissionChecker {

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

	public static boolean contains(PermissionChecker permissionChecker, long groupId, long crmGroupId, String actionId)
			throws PortalException {

		CrmGroup crmGroup = _crmGroupLocalService.getCrmGroup(crmGroupId);

		return CrmGroupModelPermission.contains(permissionChecker, groupId, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long crmGroupId, String actionId)
			throws PortalException, SystemException {

		CrmGroup crmGroup = _crmGroupLocalService.getCrmGroup(crmGroupId);
		return contains(permissionChecker, crmGroup, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, CrmGroup crmGroup, String actionId)
			throws PortalException, SystemException {

		return permissionChecker.hasPermission(crmGroup.getGroupId(), CrmGroup.class.getName(),
				crmGroup.getCrmGroupId(), actionId);

	}

	@Reference(unbind = "-")
	protected void setCrmGroupLocalService(CrmGroupLocalService crmGroupLocalService) {
		_crmGroupLocalService = crmGroupLocalService;
	}

	private static CrmGroupLocalService _crmGroupLocalService;

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long guestbookId, String actionId)
			throws PortalException {
		check(permissionChecker, guestbookId, actionId);
	}
}
