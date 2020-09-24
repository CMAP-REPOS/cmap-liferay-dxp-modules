<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/asset" prefix="liferay-asset" %><%@
taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/comment" prefix="liferay-comment" %><%@
taglib uri="http://liferay.com/tld/ddm" prefix="liferay-ddm" %><%@
taglib uri="http://liferay.com/tld/flags" prefix="liferay-flags" %><%@
taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/site" prefix="liferay-site" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %><%@
taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="com.liferay.asset.kernel.AssetRendererFactoryRegistryUtil" %><%@
page import="com.liferay.asset.kernel.exception.DuplicateQueryRuleException" %><%@
page import="com.liferay.asset.kernel.model.AssetCategory" %><%@
page import="com.liferay.asset.kernel.model.AssetEntry" %><%@
page import="com.liferay.asset.kernel.model.AssetRenderer" %><%@
page import="com.liferay.asset.kernel.model.AssetRendererFactory" %><%@
page import="com.liferay.asset.kernel.model.AssetVocabulary" %><%@
page import="com.liferay.asset.kernel.model.ClassType" %><%@
page import="com.liferay.asset.kernel.model.ClassTypeField" %><%@
page import="com.liferay.asset.kernel.model.ClassTypeReader" %><%@
page import="com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil" %><%@
page import="com.liferay.asset.kernel.service.AssetVocabularyLocalServiceUtil" %><%@
page import="com.liferay.asset.kernel.util.AssetEntryQueryProcessor" %><%@
page import="com.liferay.asset.kernel.util.comparator.AssetRendererFactoryTypeNameComparator" %><%@
page import="com.liferay.asset.publisher.web.internal.configuration.AssetPublisherPortletInstanceConfiguration" %><%@
page import="com.liferay.asset.publisher.web.internal.configuration.AssetPublisherWebConfiguration" %><%@
page import="com.liferay.asset.publisher.web.internal.action.AssetEntryActionRegistry" %><%@
page import="com.liferay.asset.publisher.constants.AssetPublisherConstants" %><%@
page import="com.liferay.asset.publisher.constants.AssetPublisherPortletKeys" %><%@
page import="com.liferay.asset.publisher.constants.AssetPublisherWebKeys" %><%@
page import="com.liferay.asset.publisher.util.AssetEntryResult" %><%@
page import="com.liferay.asset.publisher.web.internal.display.context.AssetPublisherDisplayContext" %><%@
page import="com.liferay.asset.publisher.web.internal.display.context.ItemSelectorViewDisplayContext" %><%@
page import="com.liferay.asset.publisher.web.internal.util.AssetPublisherCustomizer" %><%@
page import="com.liferay.asset.publisher.util.AssetPublisherHelper" %><%@
page import="com.liferay.asset.publisher.web.internal.util.AssetPublisherWebUtil" %><%@
page import="com.liferay.document.library.kernel.document.conversion.DocumentConversionUtil" %><%@
page import="com.liferay.document.library.kernel.util.DLUtil" %><%@
page import="com.liferay.dynamic.data.mapping.model.DDMStructure" %><%@
page import="com.liferay.item.selector.ItemSelector" %><%@
page import="com.liferay.item.selector.ItemSelectorReturnType" %><%@
page import="com.liferay.portal.kernel.dao.search.ResultRow" %><%@
page import="com.liferay.portal.kernel.dao.search.SearchContainer" %><%@
page import="com.liferay.portal.kernel.exception.NoSuchGroupException" %><%@
page import="com.liferay.portal.kernel.exception.NoSuchModelException" %><%@
page import="com.liferay.portal.kernel.language.LanguageUtil" %><%@
page import="com.liferay.portal.kernel.log.Log" %><%@
page import="com.liferay.portal.kernel.log.LogFactoryUtil" %><%@
page import="com.liferay.portal.kernel.model.ClassName" %><%@
page import="com.liferay.portal.kernel.model.Group" %><%@
page import="com.liferay.portal.kernel.model.Portlet" %><%@
page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %><%@
page import="com.liferay.portal.kernel.portlet.PortletProvider" %><%@
page import="com.liferay.portal.kernel.portlet.PortletProviderUtil" %><%@
page import="com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil" %><%@
page import="com.liferay.portal.kernel.portletdisplaytemplate.PortletDisplayTemplateManager" %><%@
page import="com.liferay.portal.kernel.security.permission.ActionKeys" %><%@
page import="com.liferay.portal.kernel.security.permission.ResourceActionsUtil" %><%@
page import="com.liferay.portal.kernel.service.ClassNameLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.PortletLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.permission.PortletPermissionUtil" %><%@
page import="com.liferay.portal.kernel.servlet.SessionErrors" %><%@
page import="com.liferay.portal.kernel.servlet.SessionMessages" %><%@
page import="com.liferay.portal.kernel.trash.TrashHandler" %><%@
page import="com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil" %><%@
page import="com.liferay.portal.kernel.util.ArrayUtil" %><%@
page import="com.liferay.portal.kernel.util.Constants" %><%@
page import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil" %><%@
page import="com.liferay.portal.kernel.util.GetterUtil" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.HttpUtil" %><%@
page import="com.liferay.portal.kernel.util.KeyValuePair" %><%@
page import="com.liferay.portal.kernel.util.KeyValuePairComparator" %><%@
page import="com.liferay.portal.kernel.util.ListUtil" %><%@
page import="com.liferay.portal.kernel.util.LocaleUtil" %><%@
page import="com.liferay.portal.kernel.util.MapUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.PortalUtil" %><%@
page import="com.liferay.portal.kernel.util.PrefsParamUtil" %><%@
page import="com.liferay.portal.kernel.util.RSSUtil" %><%@
page import="com.liferay.portal.kernel.util.SetUtil" %><%@
page import="com.liferay.portal.kernel.util.StringPool" %><%@
page import="com.liferay.portal.kernel.util.StringUtil" %><%@
page import="com.liferay.portal.kernel.util.TextFormatter" %><%@
page import="com.liferay.portal.kernel.util.Validator" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %><%@
page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %><%@
page import="com.liferay.portlet.asset.util.AssetUtil" %><%@
page import="com.liferay.portlet.usersadmin.search.GroupSearch" %><%@
page import="com.liferay.site.item.selector.criteria.SiteItemSelectorReturnType" %><%@
page import="com.liferay.site.item.selector.criterion.SiteItemSelectorCriterion" %><%@
page import="com.liferay.taglib.servlet.PipingServletResponse" %><%@
page import="com.liferay.asset.util.AssetHelper" %><%@
page import="com.liferay.asset.list.asset.entry.provider.AssetListAssetEntryProvider" %><%@
page import="com.liferay.info.list.provider.InfoListProviderTracker" %><%@
page import="com.liferay.asset.util.AssetPublisherAddItemHolder" %><%@
page import="com.liferay.asset.constants.AssetWebKeys" %><%@
page import="com.liferay.registry.Registry" %><%@
page import="com.liferay.registry.RegistryUtil" %>

<%@ page import="java.io.Serializable" %>

<%@ page import="java.text.Format" %>

<%@ page import="java.util.ArrayList" %><%@
page import="java.util.Arrays" %><%@
page import="java.util.HashMap" %><%@
page import="java.util.HashSet" %><%@
page import="java.util.List" %><%@
page import="java.util.Map" %><%@
page import="java.util.Objects" %><%@
page import="java.util.Set" %>

<%@ page import="javax.portlet.PortletMode" %><%@
page import="javax.portlet.PortletRequest" %><%@
page import="javax.portlet.PortletURL" %>


<%@ page import="com.liferay.osgi.service.tracker.collections.list.ServiceTrackerList" %>
<%@ page import="com.liferay.osgi.service.tracker.collections.list.ServiceTrackerListFactory" %>
<%@ page import="org.osgi.framework.Bundle" %>
<%@ page import="org.osgi.framework.BundleContext" %>
<%@ page import="org.osgi.framework.FrameworkUtil" %>
<%@ page import="com.liferay.asset.publisher.web.internal.portlet.AssetPublisherPortlet" %>
<%@ page import="com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil" %>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
// serviceTrackerListFactory (sp?) instead of RegistryUtil
Registry registry = RegistryUtil.getRegistry();
System.out.println("registry: " + registry);

//Bundle bundle = FrameworkUtil.getBundle(AssetPublisherPortlet.class);
//BundleContext bundleContext = bundle.getBundleContext();

//String filter = StringPool.BLANK;

//ServiceTrackerList<InfoListProviderTracker, InfoListProviderTracker> serviceTrackerInfoListProvider = ServiceTrackerListFactory.open(bundleContext, InfoListProviderTracker.class, filter);

InfoListProviderTracker infoListProviderTracker = registry.getService(InfoListProviderTracker.class);
System.out.println("infoListProviderTracker: " + infoListProviderTracker);
AssetListAssetEntryProvider assetListAssetEntryProvider = registry.getService(AssetListAssetEntryProvider.class);
System.out.println("assetListAssetEntryProvider: " + assetListAssetEntryProvider);

AssetEntryActionRegistry assetEntryActionRegistry = registry.getService(AssetEntryActionRegistry.class);
System.out.println("assetEntryActionRegistry: " + assetEntryActionRegistry);

AssetHelper assetHelper = (AssetHelper)request.getAttribute(AssetWebKeys.ASSET_HELPER);
System.out.println("assetHelper: " + assetHelper);

AssetPublisherHelper assetPublisherHelper = (AssetPublisherHelper)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_HELPER);
System.out.println("assetPublisherHelper: " + assetPublisherHelper);

Map<String, Object> properties = new HashMap<String, Object>();
AssetPublisherWebConfiguration assetPublisherWebConfiguration = ConfigurableUtil.createConfigurable(AssetPublisherWebConfiguration.class, properties);
System.out.println("assetPublisherWebConfiguration: " + assetPublisherWebConfiguration);

AssetPublisherWebUtil assetPublisherWebUtil = (AssetPublisherWebUtil)request.getAttribute(AssetPublisherWebKeys.ASSET_PUBLISHER_WEB_UTIL);
System.out.println("assetPublisherWebUtil: " + assetPublisherWebUtil);

AssetPublisherCustomizer assetPublisherCustomizer = registry.getService(AssetPublisherCustomizer.class);
System.out.println("assetPublisherCustomizer: " + assetPublisherCustomizer);

AssetPublisherDisplayContext assetPublisherDisplayContext = new AssetPublisherDisplayContext(
			assetEntryActionRegistry, assetHelper, assetListAssetEntryProvider, 
			assetPublisherCustomizer, 
			assetPublisherHelper, assetPublisherWebConfiguration, assetPublisherWebUtil, infoListProviderTracker,
			liferayPortletRequest, liferayPortletResponse, portletPreferences);
System.out.println("assetPublisherDisplayContext: " + assetPublisherDisplayContext);

AssetPublisherPortletInstanceConfiguration assetPublisherPortletInstanceConfiguration = portletDisplay.getPortletInstanceConfiguration(AssetPublisherPortletInstanceConfiguration.class);
System.out.println("assetPublisherPortletInstanceConfiguration: " + assetPublisherPortletInstanceConfiguration);

Format dateFormatDate = FastDateFormatFactoryUtil.getDate(locale, timeZone);

%>

<%@ include file="/init-ext.jsp" %>