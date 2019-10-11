<%@ page import="com.cmap.portlets.custom.updatesslider.UpdatesSliderAssetModel" %>
<%@ page import="com.cmap.portlets.custom.updatesslider.UpdatesSliderConfiguration" %>

<%@ page import="com.liferay.portal.kernel.dao.orm.Criterion" %>


<%@ page import="com.liferay.asset.kernel.model.AssetEntry" %>
<%@ page import="com.liferay.asset.kernel.model.AssetCategory" %>
<%@ page import="com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil" %>
<%@ page import="com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.DynamicQuery" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.Order" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.OrderFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil" %>

<%@ page import="java.util.List" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	UpdatesSliderConfiguration updatesSliderConfiguration =
		(UpdatesSliderConfiguration)
		renderRequest.getAttribute(UpdatesSliderConfiguration.class.getName());

	long assetCategoryId = 0;
	long assetCategoryId2 = 0;
	long assetCategoryId3 = 0;
	int assetCount = 0;
	int summaryLength = 150;
	//String summaryDefault = "";

	if (Validator.isNotNull(updatesSliderConfiguration)) {
		String assetCategoryIdPref = 
				portletPreferences.getValue("assetCategoryId", updatesSliderConfiguration.assetCategoryId());

		String assetCategoryId2Pref = 
				portletPreferences.getValue("assetCategoryId2", updatesSliderConfiguration.assetCategoryId2());

		String assetCategoryId3Pref = 
				portletPreferences.getValue("assetCategoryId3", updatesSliderConfiguration.assetCategoryId3());

		String assetCountPref = 
				portletPreferences.getValue("assetCount", updatesSliderConfiguration.assetCount());

		//String summaryLengthPref = 
		//		portletPreferences.getValue("summaryLength", updatesSliderConfiguration.summaryLength());
		
		//String summaryDefaultPref = 
		//		portletPreferences.getValue("summaryDefault", updatesSliderConfiguration.summaryDefault());

		if (Validator.isDigit(assetCategoryIdPref)) {
			assetCategoryId = Long.parseLong(assetCategoryIdPref);
		}

		if (Validator.isDigit(assetCategoryId2Pref)) {
			assetCategoryId2 = Long.parseLong(assetCategoryId2Pref);
		}

		if (Validator.isDigit(assetCategoryId3Pref)) {
			assetCategoryId3 = Long.parseLong(assetCategoryId3Pref);
		}

		if (Validator.isDigit(assetCountPref)) {
			assetCount = Integer.parseInt(assetCountPref);
		}

		//if (Validator.isDigit(summaryLengthPref)) {
		//	summaryLength = Integer.parseInt(summaryLengthPref);
		//}
		
		//summaryDefault = summaryDefaultPref;
	}

	Order assetCategoryOrder = OrderFactoryUtil.asc("name");
	DynamicQuery assetCategoryQuery = AssetCategoryLocalServiceUtil.dynamicQuery();
	
	Criterion criterion = null;
	criterion = RestrictionsFactoryUtil.eq("vocabularyId", 424402L);
	criterion = RestrictionsFactoryUtil.or(criterion , RestrictionsFactoryUtil.eq("vocabularyId", 64259L));

	assetCategoryQuery.add(criterion).addOrder(assetCategoryOrder);
	
	List<AssetCategory> assetCategories = AssetCategoryLocalServiceUtil.dynamicQuery(assetCategoryQuery);
%>
