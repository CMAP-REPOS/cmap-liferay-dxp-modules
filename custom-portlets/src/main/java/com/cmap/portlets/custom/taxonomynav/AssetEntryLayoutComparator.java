package com.cmap.portlets.custom.taxonomynav;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.asset.kernel.model.AssetEntry;

import java.io.Serializable;

public class AssetEntryLayoutComparator extends OrderByComparator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Object arg0, Object arg1) {
		try {
			AssetEntry entry0 = (AssetEntry) arg0;
			AssetEntry entry1 = (AssetEntry) arg1;
			Layout l0 = null;
			Layout l1 = null;
			try {
				l0 = LayoutLocalServiceUtil.getLayout(entry0.getClassPK());
				l1 = LayoutLocalServiceUtil.getLayout(entry1.getClassPK());
			} catch (Exception e) {
				return 0;
			}
			Serializable order0 = 99999;
			Serializable order1 = 99999;
			if (l0.getExpandoBridge().hasAttribute("taxonomyOrder"))
				order0 = l0.getExpandoBridge().getAttribute("taxonomyOrder");
			if (l1.getExpandoBridge().hasAttribute("taxonomyOrder"))
				order1 = l1.getExpandoBridge().getAttribute("taxonomyOrder");
			Integer intOrder0 = (Integer) order0;
			Integer intOrder1 = (Integer) order1;

			if (intOrder0 == intOrder1)
				return 0;
			if (intOrder0 < intOrder1)
				return -1;
			if (intOrder0 > intOrder1)
				return 1;
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
