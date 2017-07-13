package com.cmap.portlets.custom.taxonomynav;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetCategoryProperty;
import com.liferay.asset.kernel.service.AssetCategoryPropertyLocalServiceUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

public class AssetCategoryOrderByComparator extends OrderByComparator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Object arg0, Object arg1) {
		try {
			AssetCategory cat0 = (AssetCategory) arg0;
			AssetCategory cat1 = (AssetCategory) arg1;
			AssetCategoryProperty prop0 = null;
			AssetCategoryProperty prop1 = null;
			long order0 = 99999;
			long order1 = 99999;
			try {
				prop0 = AssetCategoryPropertyLocalServiceUtil.getCategoryProperty(cat0.getCategoryId(),
						"taxonomyOrder");
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			try {
				prop1 = AssetCategoryPropertyLocalServiceUtil.getCategoryProperty(cat1.getCategoryId(),
						"taxonomyOrder");
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			if (prop0 != null) {
				try {
					order0 = Long.parseLong(prop0.getValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
			}
			if (prop1 != null) {
				try {
					order1 = Long.parseLong(prop1.getValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
			}
			if (order0 == order1)
				return 0;
			if (order0 < order1)
				return -1;
			if (order0 > order1)
				return 1;
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
