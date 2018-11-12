package contact.manager.app.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.StringPool;

public class UserUtil {

	private static final Log LOGGER = LogFactoryUtil.getLog(OutreachLogUtil.class);

	public static User getUser(long userId) {
		User user = null;
		try {
			user = UserLocalServiceUtil.getUser(userId);
		} catch (PortalException e) {
			LOGGER.error("Exception in UserUtil.getUser: " + e.getMessage());
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
			LOGGER.error("Exception in UserUtil.getUserName: " + e.getMessage());
		}
		return userName;
	}
}
