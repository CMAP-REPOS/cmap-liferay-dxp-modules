package com.cmap.portlets.custom.featuredcardimporter.portlet;

import com.cmap.portlets.custom.featuredcardimporter.constants.FeaturedCardImporterPortletKeys;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleResource;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.model.ResourceAction;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author jon
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=featured-card-importer-portlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FeaturedCardImporterPortletKeys.FeaturedCardImporter,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

/*
	portlet preferences XML structure
 
	<portlet-preferences>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dtitle</name>
		<value>Full-Cost Water Pricing Guidebook for Sustainable Community Water Systems</value>
	</preference>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dfeaturedAssetId</name>
		<value>107095</value>
	</preference>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dcaption</name>
		<value></value>
	</preference>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dfeaturedImage</name>
		<value>5d552f81-ced4-481f-a694-504f7fbc8a88</value>
	</preference>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dedit</name>
		<value>false</value>
	</preference>
	<preference>
		<name>featuredcard_WAR_CustomPortletsportlet_INSTANCE_0eb2714788ca4714e48d84d9e4bf253dfeaturedPlid</name>
		<value>-1</value>
	</preference>
	</portlet-preferences>
*/

/*
	journal article XML structure
 
	<?xml version="1.0"?>
	
	<root available-locales="en_US" default-locale="en_US">
		<dynamic-element name="CardTitle" type="text" index-type="keyword" instance-id="mgwt">
			<dynamic-content language-id="en_US"><![CDATA[JML Card Title]]></dynamic-content>
		</dynamic-element>
		<dynamic-element name="Caption" type="text" index-type="keyword" instance-id="wbui">
			<dynamic-content language-id="en_US"><![CDATA[JML Caption]]></dynamic-content>
		</dynamic-element>
		<dynamic-element name="ImageToDisplay" type="image" index-type="keyword" instance-id="ctbf">
			<dynamic-content language-id="en_US" alt="LSC Map description" name="LSC Map.png" title="LSC Map.png" type="document" fileEntryId="629322"><![CDATA[/documents/10180/10709/LSC+Map.png/6e85d9c9-4948-4ea8-8c2f-354bb532e111?t=1489504984000]]></dynamic-content>
		</dynamic-element>
		<dynamic-element name="Document" type="document_library" index-type="keyword" instance-id="umwi">
			<dynamic-content language-id="en_US"><![CDATA[/documents/10180/10709/Copy+of+Transit_website.xlsx/91843cde-6a44-43ac-8de0-8694af9f7ed1]]></dynamic-content>
		</dynamic-element>
		<dynamic-element name="Page" type="link_to_layout" index-type="keyword" instance-id="ycql">
			<dynamic-content language-id="en_US"><![CDATA[5@public@10180]]></dynamic-content>
		</dynamic-element>
		<dynamic-element name="Url" type="text" index-type="keyword" instance-id="pkuj">
			<dynamic-content language-id="en_US"><![CDATA[http://us.imdb.com]]></dynamic-content>
		</dynamic-element>
	</root>
*/

public class FeaturedCardImporterPortlet extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(FeaturedCardImporterPortlet.class);
	private static Locale _enUs = new Locale.Builder().setLanguage("en").setRegion("US").build();
	private static long _userId = 102474;
	private static long _groupId = 10180;
	private static long _folderId = 0;
	private static int _ownerId = 0;
	private static int _ownerType = 3;
	private static String _ddmStructureKey = "738516";
	private static String _ddmTemplateKey = "738520";

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException  {
		// System.out.println("FeaturedCardImporterPortlet.doView()");

		List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(_groupId, false);
		List<String> results = new ArrayList<String>();
		int resultsCount = 0;
		
		ServiceContext serviceContext = null;

		try {
			serviceContext = ServiceContextFactory.getInstance(FeaturedCardImporterPortlet.class.getName(),
					renderRequest);
		} catch (PortalException ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.doView serviceContext: " + ex.getMessage());
		}

		if (serviceContext != null) {
			
			layouts = layouts.subList(0, 50);
			
			for (Layout l : layouts) {
				
				List<PortletPreferences> pagePortletPreferences = PortletPreferencesLocalServiceUtil.getPortletPreferencesByPlid(l.getPlid());

				for (PortletPreferences p : pagePortletPreferences) {
					if (p.getPortletId().contains("featuredcard_WAR_CustomPortletsportlet_INSTANCE_") &&
							!p.getPortletId().contains("featuredcard_WAR_CustomPortletsportlet_INSTANCE_[NEWID]")) {
																	
						String title = getCardArticleTitle(p.getPortletId(), p.getPreferences());
						String content = getCardArticleContent(p.getPortletId(), p.getPreferences());

						if (title == null || isValueEmpty(title)) {
							title = p.getPortletId().replace("featuredcard_WAR_CustomPortletsportlet_INSTANCE_", "Featured Card ");
						}
						
						if (content != null || !isValueEmpty(content)) {
							JournalArticle journalArticle = createFeaturedCardArticle(title, content,
									p.getPortletId(), serviceContext);

							if (journalArticle != null) {
								setJournalArticlePermissions(journalArticle, serviceContext);
								// setJournalArticlePreferences(l, serviceContext, journalArticle);
								results.add(l.getFriendlyURL() + ", " + journalArticle.getTitle(_enUs));
								resultsCount = resultsCount + 1;
							}
						} else {
							results.add(l.getFriendlyURL() + "\t" + p.getPortletId().replace("featuredcard_WAR_CustomPortletsportlet_INSTANCE_", "Empty Featured Card "));
						}
						
					}
				}
				
//				try {
//					LayoutLocalServiceUtil.updateLayout(l.getGroupId(),
//							l.isPrivateLayout(),
//							l.getLayoutId(),
//							l.getTypeSettings());
//				} catch (PortalException ex) {
//					_log.error("Exception in FeaturedCardImporterPortlet.doView updateLayout: " + ex.getMessage());
//				}
			}

			renderRequest.setAttribute("resultsCount", resultsCount);		
			renderRequest.setAttribute("results", results);		
		}

		super.doView(renderRequest, renderResponse);
	}

	private JournalArticle createFeaturedCardArticle(String title, String content, String portletId, ServiceContext serviceContext) {
		// System.out.println("FeaturedCardImporterPortlet.createFeaturedCardArticle()");
		
		JournalArticle featuredCardArticle = null;
		
		if (title == null || content == null || isValueEmpty(content)) {
			return featuredCardArticle;
		}
		
		System.out.println("Creating JournalArticle: " + title);
		Map<Locale, String> titleMap = new HashMap<Locale, String>();
		titleMap.put(_enUs, title);
		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		descriptionMap.put(_enUs, "Featured Card generated from portlet " + portletId);
		
		System.out.println("titleMap: " + titleMap);
		System.out.println("descriptionMap: " + descriptionMap);

		try {
			featuredCardArticle = JournalArticleLocalServiceUtil.addArticle(_userId, _groupId, _folderId, titleMap, descriptionMap,
					content, _ddmStructureKey, _ddmTemplateKey, serviceContext);
			
		} catch (PortalException ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.createFeaturedCardArticle: " + ex.getMessage(), ex);
			return featuredCardArticle;
		}
		
		return featuredCardArticle;
	}

	@SuppressWarnings("unused")
	private PortletPreferences setJournalArticlePreferences(Layout layout, ServiceContext serviceContext, JournalArticle journalArticle) throws ReadOnlyException {
		// System.out.println("FeaturedCardImporterPortlet.setJournalArticlePreferences()");

		JournalArticleResource journalArticleResource = null;
		PortletPreferences updatedPreferences = null;
		
		try {
			journalArticleResource = journalArticle.getArticleResource();
		} catch (PortalException ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.setJournalArticlePreferences: " + ex.getMessage());
			return updatedPreferences;
		}

		if (journalArticleResource != null) {
			LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layout.getLayoutType();

			String journalPortletId = layoutTypePortlet.addPortletId(_userId,
					"com_liferay_journal_content_web_portlet_JournalContentPortlet", "column-1", 0);
			
			javax.portlet.PortletPreferences prefs = (javax.portlet.PortletPreferences) PortletPreferencesLocalServiceUtil
					.getPreferences(serviceContext.getCompanyId(), _ownerId, _ownerType, layout.getPlid(),
							journalPortletId);

			AssetEntry assetEntry = AssetEntryLocalServiceUtil.fetchEntry(_groupId, journalArticleResource.getUuid());

			// <portlet-preferences>
			// <preference><name>ddmTemplateKey</name><value>675499</value></preference>
			// <preference><name>assetEntryId</name><value>691943</value></preference>
			// <preference><name>userToolAssetAddonEntryKeys</name><value></value></preference>
			// <preference><name>enableViewCountIncrement</name><value>true</value></preference>
			// <preference><name>groupId</name><value>10180</value></preference>
			// <preference><name>articleId</name><value>691939</value></preference>
			// <preference><name>contentMetadataAssetAddonEntryKeys</name><value></value></preference>
			// </portlet-preferences>							

			prefs.setValue("articleId", journalArticle.getArticleId());
			prefs.setValue("assetEntryId", String.valueOf(assetEntry.getEntryId()));
			prefs.setValue("ddmTemplateKey", _ddmTemplateKey);
			prefs.setValue("enableViewCountIncrement", "true");
			prefs.setValue("groupId", String.valueOf(_groupId));
			prefs.setValue("userToolAssetAddonEntryKeys", "");
			System.out.println("Added Portlet: " + journalPortletId);
			
			updatedPreferences = PortletPreferencesLocalServiceUtil.updatePreferences(_ownerId, _ownerType, layout.getPlid(),
					journalPortletId, prefs);
		}
		
		return updatedPreferences;
	}
	
	private void setJournalArticlePermissions(JournalArticle journalArticle, ServiceContext serviceContext) {
		// System.out.println("FeaturedCardImporterPortlet.setJournalArticlePermissions()");

		try {
			Role memberRole = RoleLocalServiceUtil.getRole(serviceContext.getCompanyId(), RoleConstants.GUEST);
			if (Validator.isNotNull(memberRole)) {
				ResourceAction resourceAction = ResourceActionLocalServiceUtil
						.getResourceAction(JournalArticle.class.getName(), ActionKeys.VIEW);
				ResourcePermission resourcePermission = ResourcePermissionLocalServiceUtil
						.createResourcePermission(CounterLocalServiceUtil.increment(ResourcePermission.class.getName()));
				resourcePermission.setActionIds(resourceAction.getBitwiseValue());
				resourcePermission.setCompanyId(serviceContext.getCompanyId());
				resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
				resourcePermission.setPrimKey(String.valueOf(journalArticle.getPrimaryKey()));
				resourcePermission.setRoleId(memberRole.getRoleId());
				ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
			}

		} catch (PortalException ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.setJournalArticlePermissions: " + ex.getMessage(), ex);
		}
	}
	
	private String[] parsePortletPreferences(String portletPreferencesXml) {
		// System.out.println("FeaturedCardImporterPortlet.parsePortletPreferences()");

		portletPreferencesXml = portletPreferencesXml.replaceAll("<portlet-preferences>", "")
				.replaceAll("</portlet-preferences>", "")
				.replaceAll("<preference>", "")
				.replaceAll("<name>", "")
				.replaceAll("</name>", "")
				.replaceAll("<value>", "=")
				.replaceAll("</value>", "");
		
		String[] preferencesArray = portletPreferencesXml.split("</preference>");
		return preferencesArray;
	}

	private String getCardArticleTitle(String portletId, String portletPreferencesXml) {
		// System.out.println("FeaturedCardImporterPortlet.getCardArticleTitle()");

		String[] preferencesArray = parsePortletPreferences(portletPreferencesXml);
		String cardArticleTitle = StringPool.BLANK;
		
		for (int j = 0; j < preferencesArray.length; j++) {
			String[] keyValueArray = preferencesArray[j].split("=");

			if (keyValueArray.length == 2 && keyValueArray[0].equals(portletId + "title")) {
				cardArticleTitle = keyValueArray[1];
			}
		}
		
		return StringEscapeUtils.unescapeHtml(cardArticleTitle);
	}
	
	private String getCardArticleContent(String portletId, String portletPreferencesXml) {
		// System.out.println("FeaturedCardImporterPortlet.getCardArticleContent()");

		String[] preferencesArray = parsePortletPreferences(portletPreferencesXml);
		
		String cardArticleContent = StringPool.BLANK;
		String cardTitle = StringPool.BLANK;
		String cardCaption = StringPool.BLANK;
		String cardImageToDisplay = StringPool.BLANK;
		String cardDocument = StringPool.BLANK;
		String cardPage = StringPool.BLANK;
		String cardUrl = StringPool.BLANK;

		for (int j = 0; j < preferencesArray.length; j++) {
			String[] keyValueArray = preferencesArray[j].split("=");

			if (keyValueArray.length == 2) {

				if (keyValueArray[0].equals(portletId + "title")) {
					cardTitle = getCardTitle(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "caption")) {
					cardCaption = getCardCaption(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredImage")) {
					cardImageToDisplay = getCardImageToDisplay(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredAssetId")) {
					cardDocument = getCardDocument(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredPlid")) {
					cardPage = getCardPage(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredUrl")) {
					cardUrl = getCardUrl(portletId, keyValueArray[1]);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\"?>");
		sb.append("<root available-locales=\"en_US\" default-locale=\"en_US\">");
		sb.append(cardTitle);
		sb.append(cardCaption);
		sb.append(cardImageToDisplay);
		sb.append(cardDocument);
		sb.append(cardPage);
		sb.append(cardUrl);
		sb.append("</root>");
		cardArticleContent = sb.toString();

		if (cardArticleContent.length() < 100) {
			return StringPool.BLANK;
		} else {
			return cardArticleContent;
		}
	}	

	//	<dynamic-element name="CardTitle" type="text" index-type="keyword" instance-id="mgwt">
	//		<dynamic-content language-id="en_US"><![CDATA[foo]]></dynamic-content>
	//	</dynamic-element>
	private String getCardTitle(String portletId, String title) {
		// System.out.println("FeaturedCardImporterPortlet.getCardTitle()");

		String cardTitle = StringPool.BLANK;
		
		if (isValueEmpty(title)) {
			return cardTitle;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"CardTitle\" type=\"text\" index-type=\"keyword\" instance-id=\"");
		sb.append(getInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(StringEscapeUtils.unescapeHtml(title));
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");
		
		cardTitle = sb.toString();
		return cardTitle;
	}
	
	//	<dynamic-element name="Caption" type="text" index-type="keyword" instance-id="wbui">
	//		<dynamic-content language-id="en_US"><![CDATA[foo]]></dynamic-content>
	//	</dynamic-element>
	private String getCardCaption(String portletId, String caption) {
		// System.out.println("FeaturedCardImporterPortlet.getCardCaption()");

		String cardCaption = StringPool.BLANK;
		
		if (isValueEmpty(caption)) {
			return cardCaption;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"Caption\" type=\"text\" index-type=\"keyword\" instance-id=\"");
		sb.append(getInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(caption);
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");

		cardCaption = sb.toString();
		return cardCaption;
	}
	
	//	<dynamic-element name="ImageToDisplay" type="image" index-type="keyword" instance-id="ctbf">
	//		<dynamic-content language-id="en_US" alt="LSC Map description" name="LSC Map.png" title="LSC Map.png" type="document" fileEntryId="629322"><![CDATA[/documents/10180/10709/LSC+Map.png/6e85d9c9-4948-4ea8-8c2f-354bb532e111?t=1489504984000]]></dynamic-content>
	//	</dynamic-element>
	private String getCardImageToDisplay(String portletId, String featuredImage) {
		// System.out.println("FeaturedCardImporterPortlet.getCardImageToDisplay()");

		String cardImageToDisplay = StringPool.BLANK;

		if (isValueEmpty(featuredImage)) {
			return cardImageToDisplay;
		}

		try {
			List<DLFileEntry> fileEntries = DLFileEntryLocalServiceUtil.getDLFileEntriesByUuidAndCompanyId(featuredImage, 10154);
			
			if (fileEntries.size() > 1) {
				_log.warn("fileEntries size > 1 for portletId: " + portletId);
				return cardImageToDisplay;
			} else {
				DLFileEntry image = fileEntries.get(0);
				StringBuilder sb = new StringBuilder();
				sb.append("<dynamic-element name=\"ImageToDisplay\" type=\"image\" index-type=\"keyword\" instance-id=\"");
				sb.append(getInstanceId());
				sb.append("\">");
				sb.append("<dynamic-content language-id=\"en_US\" alt=\"");
				sb.append(image.getTitle());
				sb.append("\" name=\"");
				sb.append(featuredImage + "." + image.getExtension());
				sb.append("\" title=\"");
				sb.append(featuredImage + "." + image.getExtension());
				sb.append("\" type=\"document\"><![CDATA[");
				sb.append(getFileURL(image));
				sb.append("]]></dynamic-content>");
				sb.append("</dynamic-element>");
				cardImageToDisplay = sb.toString();
			}
			
		} catch (Exception ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.getCardImageToDisplay " + ex.getMessage(), ex);
			return cardImageToDisplay;
		}
		
		return cardImageToDisplay;
	}
	
	//	<dynamic-element name="Document" type="document_library" index-type="keyword" instance-id="umwi">
	//		<dynamic-content language-id="en_US"><![CDATA[/documents/10180/10709/Copy+of+Transit_website.xlsx/91843cde-6a44-43ac-8de0-8694af9f7ed1]]></dynamic-content>
	//	</dynamic-element>
	private String getCardDocument(String portletId, String document) {
		// System.out.println("FeaturedCardImporterPortlet.getCardDocument()");

		String cardDocument = StringPool.BLANK;

		if (isValueEmpty(document)) {
			return cardDocument;
		}
			
		Long fileEntryId = Long.parseLong(document,10);
		DLFileEntry fileEntry = null;

		try {
			fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(fileEntryId);
		} catch (PortalException ex) {
			_log.warn("Exception in FeaturedCardImporterPortlet.getCardDocument: fileEntry not found: " + fileEntryId);
			return cardDocument;
		}

		if (fileEntry != null) {
			StringBuilder sb = new StringBuilder();
			sb.append(
					"<dynamic-element name=\"Document\" type=\"document_library\" index-type=\"keyword\" instance-id=\"");
			sb.append(getInstanceId());
			sb.append("\">");
			sb.append(
					"<dynamic-content language-id=\"en_US\"><![CDATA[");
			sb.append(getFileURL(fileEntry));
			sb.append("]]></dynamic-content>");
			sb.append("</dynamic-element>");
			cardDocument = sb.toString();
		}

		return cardDocument;
	}
	
	//	<dynamic-element name="Page" type="link_to_layout" index-type="keyword" instance-id="ycql">
	//		<dynamic-content language-id="en_US"><![CDATA[5@public@10180]]></dynamic-content>
	//	</dynamic-element>
	private String getCardPage(String portletId, String page) {
		// System.out.println("FeaturedCardImporterPortlet.getCardPage()");
	
		String cardPage = StringPool.BLANK;
		
		if (isValueEmpty(page)) {
			return cardPage; 
		}
			
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"Page\" type=\"link_to_layout\" index-type=\"keyword\" instance-id=\"");
		sb.append(getInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(page);
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");
		
		cardPage = sb.toString();
		return cardPage;
	}

	//	<dynamic-element name="Url" type="text" index-type="keyword" instance-id="pkuj">
	//		<dynamic-content language-id="en_US"><![CDATA[http://us.imdb.com]]></dynamic-content>
	//	</dynamic-element>
	private String getCardUrl(String portletId, String url) {
		// System.out.println("FeaturedCardImporterPortlet.getCardUrl()");

		String cardUrl = StringPool.BLANK;
		
		if (isValueEmpty(url)) {
			return cardUrl;
		}
			
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"Url\" type=\"text\" index-type=\"keyword\" instance-id=\"");
		sb.append(getInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(url);
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");
		
		cardUrl = sb.toString();
		return cardUrl;
	}
	
	private String getFileURL(DLFileEntry file) {
		// System.out.println("FeaturedCardImporterPortlet.getFileURL()");

		try {
			return "/documents/" + file.getGroupId() + StringPool.SLASH + file.getFolderId() + StringPool.SLASH
					+ file.getTitle() + StringPool.SLASH + file.getUuid();
		} catch (Exception ex) {
			_log.error("Exception in FeaturedCardImporterPortlet.getFileURL " + ex.getMessage(), ex);
			return StringPool.BLANK;
		}
	}
	
	private String getInstanceId() {
		// System.out.println("FeaturedCardImporterPortlet.getInstanceId()");
		return RandomStringUtils.random(4, true, false);
	}
		
	private boolean isValueEmpty(String value) {
		return (value == null || value.isEmpty() || value.equals("-1"));
	}
	
//	private boolean isUrlEmpty(String url) {
//		return (url == null || url.isEmpty() || url.equals("-1") || url.equals("http://"));
//	}
	
//	private FeaturedCardModel getFeaturedCardModel(String portletId, String portletPreferencesXml) {
//		String[] preferencesArray = parsePortletPreferences(portletPreferencesXml);
//		String cardTitle = StringPool.BLANK;
//		String cardCaption = StringPool.BLANK;
//		String cardImageToDisplay = StringPool.BLANK;
//		String cardDocument = StringPool.BLANK;
//		String cardPage = StringPool.BLANK;
//		String cardUrl = StringPool.BLANK;
//
//		for (int j = 0; j < preferencesArray.length; j++) {
//			String[] keyValueArray = preferencesArray[j].split("=");
//
//			if (keyValueArray.length == 2) {
//
//				if (keyValueArray[0].equals(portletId + "title")) {
//					cardTitle =  keyValueArray[1];
//				}
//				if (keyValueArray[0].equals(portletId + "caption")) {
//					cardCaption = keyValueArray[1];
//				}
//				if (keyValueArray[0].equals(portletId + "featuredImage")) {
//					cardImageToDisplay = keyValueArray[1];
//				}
//				if (keyValueArray[0].equals(portletId + "featuredAssetId")) {
//					cardDocument = keyValueArray[1];
//				}
//				if (keyValueArray[0].equals(portletId + "featuredPlid")) {
//					cardPage = keyValueArray[1];
//				}
//				if (keyValueArray[0].equals(portletId + "featuredUrl")) {
//					cardUrl = keyValueArray[1];
//				}
//			}
//		}
//		return new FeaturedCardModel(cardTitle, cardCaption, cardImageToDisplay, cardDocument, cardPage, cardUrl);
//	}
}