package contact.manager.app.application.service;

import java.util.Map;

public interface ContentUtilityService {

	public String touchElementsOfAllChilderPages(long groupId, String friendlyURL);
	public String updateLayoutAndChildrenTypeSettingsProperty(long groupId, String friendlyURL, String typeSettingProperty, String value);
	public String addURolesToUsers(long roles[], long groupId, long userIds[]);
	public String addRolesToPages(long groupId, Map<Long, String[]> roles, String friendlyURL);
	public String addRolesToContentInPages(long groupId, Map<Long, String[]> roles, String friendlyURL);
}
