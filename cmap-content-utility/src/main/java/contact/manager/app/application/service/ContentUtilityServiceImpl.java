package contact.manager.app.application.service;

import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletPreferencesLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.UnicodeProperties;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class ContentUtilityServiceImpl implements ContentUtilityService {

	@Reference
	JournalArticleLocalService _journalArticleLocalService;
	
	@Reference
	PortletPreferencesLocalService _portletPreferencesLocalService;
	
	@Reference
	DLAppLocalService _dlAppLocalService;
	
	@Reference
	LayoutLocalService _layoutLocalService;
	
	@Override
	public String touchElementsOfAllChilderPages(long groupId, String friendlyURL) {
		
		Layout layout = LayoutLocalServiceUtil.fetchLayoutByFriendlyURL(groupId, false, friendlyURL);
		
		Set<String> articleIds = new HashSet<String>();
		Set<String> documentURL = new HashSet<String>();
		if (layout != null) {
			List<Layout> layouts = layout.getAllChildren();
			layouts.add(0, layout);
			Date now = new Date();
			ServiceContext serviceContext = new ServiceContext();
	        serviceContext.setScopeGroupId(groupId);
	        serviceContext.setUserId(10158L);
			for (Layout childLayout : layouts) {
				List<PortletPreferences> pagePortletPreferences = _portletPreferencesLocalService.getPortletPreferencesByPlid(childLayout.getPlid());
				if (!pagePortletPreferences.isEmpty()) { //if portlers are found in the page
					for (PortletPreferences portletPreferencesInPage : pagePortletPreferences) { //itereate portlets in page
						String xmlPrteferences = portletPreferencesInPage.getPreferences();
						javax.portlet.PortletPreferences prefs = PortletPreferencesFactoryUtil.fromDefaultXML(xmlPrteferences);
						Map<String, String[]> prefMap = prefs.getMap();
						for (String st : prefMap.keySet()) { // iterates preference for each portlet
							if ("articleId".equals(st)) { //if the preference is articleId, then is a WebContentViwer Portlet
								for (String articleId : prefMap.get(st)) {
									if (articleIds.add(articleId)) { //if is the first time the content is found
										JournalArticle journalArticle = null;
										try {
											journalArticle = _journalArticleLocalService.getArticle(groupId, articleId);
										} catch (Exception e) {
											System.out.println("PROBLEM GETTING ARTICLE: "+ articleId);
											articleIds.remove(articleId);
										}
										if (journalArticle!=null) {
											try {
												journalArticle.setModifiedDate(now);
												_journalArticleLocalService.updateJournalArticle(journalArticle);
											}catch (Exception e) {
												System.out.println("PROBLEM UPDATING ARTICLE: "+ articleId);
												articleIds.remove(articleId);
											}
											String content = journalArticle.getContent();
											while(content.indexOf("/documents/") > -1) { //while there are documents in content
												content = content.substring(content.indexOf("/documents/"));
												int indexQuote = content.indexOf("\"");
												int indexCorchete = content.indexOf("]");
												if (indexQuote > -1 || indexCorchete >-1 ) {
													int sbindex = 0;
													if (indexQuote == -1) {
														sbindex = indexCorchete;
													} else if (indexCorchete == -1) {
														sbindex = indexQuote;
													} else {
														sbindex = indexQuote > indexCorchete ? indexCorchete : indexQuote;														
													}
													String documentUUID = content.substring(0, sbindex);
													String []urlparts = documentUUID.split("/");
													if (urlparts.length > 5) { //if is a valid document URL
														documentUUID = urlparts[urlparts.length-1];
														if (documentUUID.length()>35) {
															documentUUID = documentUUID.substring(0, 36); // lenght of the UUID
															if (documentURL.add(documentUUID)) {
																FileEntry file = null;
																try {
																	file = _dlAppLocalService.getFileEntryByUuidAndGroupId(documentUUID, groupId);
																} catch (Exception e) {
																	System.out.println("PROBLEM GETTING FILE: "+ documentUUID);
																	documentURL.remove(documentUUID);
																}
																try {
																	file.setModifiedDate(now);
																	_dlAppLocalService.updateFileEntry(10158L, file.getFileEntryId(), null, null, null, file.getDescription(), "Touch migration from STG to PROD", false, null, 0, serviceContext);
																} catch (Exception e) {
																	System.out.println("PROBLEM UPDATING FILE: "+ documentUUID + " REASON" + e.getMessage());
																	documentURL.remove(documentUUID);
																}
															}
														}
													}
													content = content.substring(sbindex);
												} else {
													break;
												}
											}
										}
									}
								}								
							}
						}						
					}
				}
			}
			System.out.println("RESSSSSS FILE ENTRY " + documentURL+ "\n\n\n\n\n");
			System.out.println("RESSSSSS ArticleIDs " + articleIds+ "\n\n\n\n\n");
		}
		
		return "";
	}

	
	//include sitemap NO = sitemap-include=0
	//include sitemap YES = sitemap-include=1
	@Override
	public String updateLayoutAndChildrenTypeSettingsProperty(long groupId, String friendlyURL, String typeSettingProperty, String value) {
		Layout layout = LayoutLocalServiceUtil.fetchLayoutByFriendlyURL(groupId, false, friendlyURL);
		if (layout != null) {
			List<Layout> layouts = layout.getAllChildren();
			layouts.add(0, layout);
			for (Layout childLayout : layouts) {
				try {
					UnicodeProperties prop = childLayout.getTypeSettingsProperties();
					prop.setProperty(typeSettingProperty, value);
					childLayout.setTypeSettingsProperties(prop);
					LayoutLocalServiceUtil.updateLayout(childLayout);					
				} catch (Exception e) {
					System.out.println("PROBLEM PRICESSING LAYOUT: "+ childLayout);
				}
			}
		}
		return "";
	}
}
