package contact.manager.service.permission;

import contact.manager.model.CrmContact;
import contact.manager.service.CrmContactLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {"model.class.name=contact.manager.model.CrmContact"}
)
public class CrmContactPermission implements BaseModelPermissionChecker {

    public static void check(
        PermissionChecker permissionChecker, long crmContactId, String actionId)
        throws PortalException, SystemException {

        if (!contains(permissionChecker, crmContactId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static void check(
        PermissionChecker permissionChecker, long groupId, long crmContactId,
        String actionId)
        throws PortalException {

        if (!contains(permissionChecker, groupId, actionId)) {
            throw new PrincipalException.MustHavePermission(
                permissionChecker, CrmContact.class.getName(), crmContactId,
                actionId);
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long groupId, long crmContactId, String actionId) 
            throws PortalException {

    	CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);

        return CrmContactModelPermission.contains(permissionChecker, groupId, actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long crmContactId, String actionId)
        throws PortalException, SystemException {

    	CrmContact crmContact = _crmContactLocalService.getCrmContact(crmContactId);
    	
        return contains(permissionChecker, crmContact, actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, CrmContact crmContact, String actionId) 
            throws PortalException, SystemException {

        return permissionChecker.hasPermission(
        		crmContact.getGroupId(), CrmContact.class.getName(), crmContact.getCrmContactId(), actionId);

    }

    @Reference(unbind = "-")
    protected void setCrmContactLocalService(CrmContactLocalService crmContactLocalService) {
        _crmContactLocalService = crmContactLocalService;
    }

    private static CrmContactLocalService _crmContactLocalService;

    @Override
    public void checkBaseModel(
        PermissionChecker permissionChecker, long groupId, long crmContactId, String actionId) throws PortalException {
            check(permissionChecker, crmContactId, actionId);
    }
}
