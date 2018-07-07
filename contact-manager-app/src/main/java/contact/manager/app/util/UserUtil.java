package contact.manager.app.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.StringPool;

public class UserUtil {

	public static User getUser(long userId) {
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
		}
		return user;
	}

	public static String getUserName(long userId) {
		User user = null;
		String userName = StringPool.BLANK;
		try {
			user = UserLocalServiceUtil.getUser(userId);
			userName = user.getFullName();
		} catch (PortalException e) {
		}
		return userName;
	}
}
