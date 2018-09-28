package contact.manager.app.application.service;

public interface ContentUtilityService {

	public String touchElementsOfAllChilderPages(long groupId, String friendlyURL);
	public String updateLayoutAndChildrenTypeSettingsProperty(long groupId, String friendlyURL, String typeSettingProperty, String value);
}
