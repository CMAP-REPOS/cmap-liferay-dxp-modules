package contact.manager.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;

import contact.manager.model.CrmGroup;

@Component(
		immediate = true, 
		property = { "model.class.name=com.contact.manager.model.CrmGroup" }
)
public class CrmGroupPermission implements BaseModelPermissionChecker {

	public static void check(PermissionChecker permissionChecker, long groupId, long assignmentId, String actionId)
			throws AuthException {

		if (!contains(permissionChecker, groupId, assignmentId, actionId)) {
			throw new AuthException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long groupId, long assignmentId,
			String actionId) {

		return (permissionChecker.hasPermission(groupId, RESOURCE_NAME, assignmentId, actionId));
	}

	public static void checkTopLevel(PermissionChecker permissionChecker, long groupId, String actionId)
			throws AuthException {

		if (!containsTopLevel(permissionChecker, groupId, actionId)) {
			throw new AuthException();
		}
	}

	public static boolean containsTopLevel(PermissionChecker permissionChecker, long groupId, String actionId) {

		return (permissionChecker.hasPermission(groupId, TOP_LEVEL_RESOURCE, groupId, actionId));
	}

	public static final String ADD_GROUP = "ADD_GROUP";
	public static final String UPDATE_GROUP = "UPDATE_GROUP";
	public static final String DELETE_GROUP = "DELETE_GROUP";
	public static final String VIEW_GROUP = "VIEW_GROUP";

	private static final String RESOURCE_NAME = CrmGroup.class.getName();
	private static final String TOP_LEVEL_RESOURCE = "contact.manager.model";

	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId)
			throws PortalException {
		check(permissionChecker, groupId, primaryKey, actionId);
	}}
