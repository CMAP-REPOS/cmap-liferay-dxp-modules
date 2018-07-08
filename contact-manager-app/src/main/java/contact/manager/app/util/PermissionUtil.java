package contact.manager.app.util;

import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;

import java.util.List;

import contact.manager.app.constants.ContactManagerAppPortletKeys;

public class PermissionUtil {

	public static boolean canUserViewContacts(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_USER);
	}

	public static boolean canUserAddContact(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_MANAGER);
	}

	public static boolean canUserUpdateContact(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_MANAGER);
	}

	public static boolean canUserDeleteContact(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_ADMINISTRATOR);
	}

	public static boolean canUserAddNote(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_NOTES_CONTRIBUTOR);
	}

	public static boolean canUserUpdateNote(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_NOTES_CONTRIBUTOR);
	}

	public static boolean canUserDeleteNote(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_NOTES_CONTRIBUTOR);
	}

	public static boolean canUserAddOutreach(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_OUTREACH_CONTRIBUTOR);
	}

	public static boolean canUserUpdateOutreach(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_OUTREACH_CONTRIBUTOR);
	}

	public static boolean canUserDeleteOutreach(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_OUTREACH_CONTRIBUTOR);
	}

	public static boolean canUserAddGroup(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_ADMINISTRATOR);
	}

	public static boolean canUserUpdateGroup(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_ADMINISTRATOR);
	}

	public static boolean canUserDeleteGroup(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_ADMINISTRATOR);
	}

	public static boolean canUserAccessMediaContacts(User user) {
		return userHasRole(user, ContactManagerAppPortletKeys.ROLE_MEDIA_CONTACTS_MANAGER);
	}

	private static boolean userHasRole(User user, String roleName) {
		boolean userHasRole = false;
		List<Role> roles = user.getRoles();
		for (Role role : roles) {
			if (role.getName().equals(roleName)) {
				userHasRole = true;
	            break;
			}
		}
		
		return userHasRole;
	}
}
