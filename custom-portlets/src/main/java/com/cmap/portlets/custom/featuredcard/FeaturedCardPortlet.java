package com.cmap.portlets.custom.featuredcard;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=CMAP",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=Featured Card Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/featuredcard/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
	)

public class FeaturedCardPortlet extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(FeaturedCardPortlet.class);
	private static Locale _enUs = new Locale.Builder().setLanguage("en").setRegion("US").build();

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(FeaturedCardPortlet.class.getName(),
					renderRequest);

			if (serviceContext.getUserId() == 0) {
				// long[] plids = { 10818L, 11674L, 117101L, 12317L, 14136L };
				long[] plids = { 12317L };
				
				
				List<String> results = new ArrayList<String>();

				for (int i = 0; i < plids.length; i++) {
					List<PortletPreferences> pagePortletPreferences = GetPagePortletPreferences(plids[i]);

					for (PortletPreferences portletPreferences : pagePortletPreferences) {
						if (portletPreferences.getPortletId()
								.contains("featuredcard_WAR_CustomPortletsportlet_INSTANCE_")) {
							String featuredCardContent = GetFeaturedCardContent(portletPreferences.getPortletId(),
									portletPreferences.getPreferences());
							String featuredCardTitle = GetFeaturedCardTitle(portletPreferences.getPortletId(),
									portletPreferences.getPreferences());
							JournalArticle result = CreateFeaturedCardArticle(featuredCardTitle, featuredCardContent,
									portletPreferences.getPortletId(), serviceContext);
							if (result != null) {
								results.add(result.getTitle(_enUs));
							}
						}
					}
				}
				
				renderRequest.setAttribute("results", results);
			} else {
				_log.warn("Not running because wrong user");
			}

			super.doView(renderRequest, renderResponse);

		} catch (IOException ex) {
			_log.error("Exception in FeaturedCardPortlet.doView: " + ex.getMessage(), ex);
		} catch (PortalException ex) {
			// TODO Auto-generated catch block
			_log.error("Exception in FeaturedCardPortlet.doView: " + ex.getMessage(), ex);
		}
	}

	private JournalArticle CreateFeaturedCardArticle(String title, String content, String portletId, ServiceContext serviceContext) {

		long userId = 102474;
		long groupId = 10180;
		long folderId = 0;
		String ddmStructureKey = "675484";
		String ddmTemplateKey = "675499";
		
		System.out.println("Creating JournalArticle: " + title);
		Map<Locale, String> titleMap = new HashMap<Locale, String>();
		titleMap.put(_enUs, title);
		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		descriptionMap.put(_enUs, "Featured Card generated from portlet " + portletId);
		try {
			return JournalArticleLocalServiceUtil.addArticle(userId, groupId, folderId, titleMap, descriptionMap,
					content, ddmStructureKey, ddmTemplateKey, serviceContext);
		} catch (PortalException ex) {
			_log.error("Exception in FeaturedCardPortlet.CreateFeaturedCardArticle: " + ex.getMessage(), ex);
			return null;
		}
	}

	private String[] ParsePortletPreferences(String portletPreferencesXml) {
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
	
	private String GetFeaturedCardTitle(String portletId, String portletPreferencesXml) {
		String[] preferencesArray = ParsePortletPreferences(portletPreferencesXml);
		String featuredCardTitle = StringPool.BLANK;
		for (int j = 0; j < preferencesArray.length; j++) {
			String[] keyValueArray = preferencesArray[j].split("=");

			if (keyValueArray.length == 2 && keyValueArray[0].equals(portletId + "title")) {
				featuredCardTitle = keyValueArray[1];
			}
		}
		return featuredCardTitle;
	}

	private String GetFeaturedCardContent(String portletId, String portletPreferencesXml) {
		String[] preferencesArray = ParsePortletPreferences(portletPreferencesXml);
		
		String featuredCardXml = StringPool.BLANK;
		String featuredCardXmlTitle = StringPool.BLANK;
		String featuredCardXmlCaption = StringPool.BLANK;
		String featuredCardXmlImageToDisplay = StringPool.BLANK;
		String featuredCardXmlDocument = StringPool.BLANK;
		String featuredCardXmlPage = StringPool.BLANK;

		for (int j = 0; j < preferencesArray.length; j++) {
			String[] keyValueArray = preferencesArray[j].split("=");

			if (keyValueArray.length == 2) {

				if (keyValueArray[0].equals(portletId + "title")) {
					// get title
					featuredCardXmlTitle = FeaturedCardXmlTitle(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "caption")) {
					// get caption
					featuredCardXmlCaption = FeaturedCardXmlCaption(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredUrl")) {
					// get featuredUrl
					featuredCardXmlTitle = FeaturedCardXmlTitle(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredImage")) {
					// get featuredImage
					// System.out.println("featuredImage: " + keyValueArray[1]);
					featuredCardXmlImageToDisplay = FeaturedCardXmlImageToDisplay(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredAssetId")) {
					// get featuredAssetId
					// System.out.println("featuredAssetId: " + keyValueArray[1]);
					featuredCardXmlDocument = FeaturedCardXmlDocument(portletId, keyValueArray[1]);
				}
				if (keyValueArray[0].equals(portletId + "featuredPlid")) {
					// get featuredPlid
					featuredCardXmlPage = FeaturedCardXmlPage(portletId, keyValueArray[1]);
				}

			} else {
				// System.out.println(keyValueArray[0] + ": no value");
			}
		}

		featuredCardXml = FeaturedCardXml(featuredCardXmlTitle, featuredCardXmlCaption,
				featuredCardXmlImageToDisplay, featuredCardXmlDocument, featuredCardXmlPage);

		if (featuredCardXml.length() < 100) {
			return StringPool.BLANK;
		} else {
			return featuredCardXml;
		}
	}

	
	private List<PortletPreferences> GetPagePortletPreferences(long plid) {
		try {
			List<PortletPreferences> pagePortletPreferences = PortletPreferencesLocalServiceUtil.getPortletPreferences(0, 3,
					plid);
			return pagePortletPreferences;
		} catch (Exception ex) {
			_log.error("Exception in FeaturedCardPortlet.GetPagePortletPreferences " + ex.getMessage(), ex);
			return null;
		}
	}
	
	private String FeaturedCardXml(String title, String caption, String imageToDisplay, String document, String page) {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\"?>");
		sb.append("<root available-locales=\"en_US\" default-locale=\"en_US\">");
		sb.append(title);
		sb.append(caption);
		sb.append(imageToDisplay);
		sb.append("</root>");
		return sb.toString();
	}

	private String FeaturedCardXmlTitle(String portletId, String title) {
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"CardTitle\" type=\"text\" index-type=\"keyword\" instance-id=\"");
		sb.append(GetInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(title);
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");
		return sb.toString();
	}

	private String FeaturedCardXmlCaption(String portletId, String caption) {
		StringBuilder sb = new StringBuilder();
		sb.append("<dynamic-element name=\"Caption\" type=\"text\" index-type=\"keyword\" instance-id=\"");
		sb.append(GetInstanceId());
		sb.append("\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[");
		sb.append(caption);
		sb.append("]]></dynamic-content>");
		sb.append("</dynamic-element>");
		return sb.toString();
	}

	private String FeaturedCardXmlImageToDisplay(String portletId, String featuredImage) {
		try {
			if (featuredImage.equals("-1")) {
				_log.warn("featuredImage is -1 for portletId: " + portletId);
				return StringPool.BLANK;
			}
			List<DLFileEntry> fileEntries = DLFileEntryLocalServiceUtil.getDLFileEntriesByUuidAndCompanyId(featuredImage, 10154);
			if (fileEntries.size() > 1) {
				_log.warn("fileEntries size > 1 for portletId: " + portletId);
				return StringPool.BLANK;
			} else {
				DLFileEntry image = fileEntries.get(0);
				StringBuilder sb = new StringBuilder();
				sb.append("<dynamic-element name=\"ImageToDisplay\" type=\"image\" index-type=\"keyword\" instance-id=\"");
				sb.append(GetInstanceId());
				sb.append("\">");
				sb.append("<dynamic-content language-id=\"en_US\" alt=\"");
				sb.append(image.getTitle());
				sb.append("\" name=\"");
				sb.append(featuredImage + "." + image.getExtension());
				sb.append("\" title=\"");
				sb.append(featuredImage + "." + image.getExtension());
				sb.append("\" type=\"document\"><![CDATA[");
				sb.append(GetDLFileURL(image));
				sb.append("]]></dynamic-content>");
				sb.append("</dynamic-element>");
				return sb.toString();
			}
		} catch (Exception ex) {
			_log.error("Exception in FeaturedCardPortlet.FeaturedCardXmlImageToDisplay " + ex.getMessage(), ex);
			return StringPool.BLANK;
		}
	}

	private String FeaturedCardXmlDocument(String portletId, String document) {
		try {
			if (document.equals("-1")) {
				_log.warn("document is -1 for portletId: " + portletId);
				return StringPool.BLANK;
			}
			Long fileEntryId = Long.parseLong(document,10);
			DLFileEntry fileEntry;
			try {
				fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(fileEntryId);
				StringBuilder sb = new StringBuilder();
				sb.append(
						"<dynamic-element name=\"Document\" type=\"document_library\" index-type=\"keyword\" instance-id=\"");
				sb.append(GetInstanceId());
				sb.append("\">");
				sb.append(
						"<dynamic-content language-id=\"en_US\"><![CDATA[");
				sb.append(GetDLFileURL(fileEntry));
				sb.append("]]></dynamic-content>");
				sb.append("</dynamic-element>");
				return sb.toString();

			} catch (PortalException ex) {
				_log.error("Exception in FeaturedCardPortlet.FeaturedCardXmlDocument " + ex.getMessage(), ex);
				return StringPool.BLANK;
			}
		} catch (NumberFormatException ex) {
			_log.error("Exception in FeaturedCardPortlet.FeaturedCardXmlDocument " + ex.getMessage(), ex);
			return StringPool.BLANK;
		}
	}

	private String FeaturedCardXmlPage(String portletId, String page) {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"<dynamic-element name=\"Page\" type=\"link_to_layout\" index-type=\"keyword\" instance-id=\"laxk\">");
		sb.append("<dynamic-content language-id=\"en_US\"><![CDATA[]]></dynamic-content>");
		sb.append("</dynamic-element>");
		return sb.toString();
	}

	public static String GetDLFileURL(DLFileEntry file) {
		try {
			return "/documents/" + file.getGroupId() + StringPool.SLASH + file.getFolderId() + StringPool.SLASH
					+ file.getTitle() + StringPool.SLASH + file.getUuid();
		} catch (Exception ex) {
			_log.error("Exception in FeaturedCardPortlet.GetDLFileURL " + ex.getMessage(), ex);
			return StringPool.BLANK;
		}
	}

	private String GetInstanceId() {
		return org.apache.commons.lang.RandomStringUtils.random(4, true, false);
	}	
}
