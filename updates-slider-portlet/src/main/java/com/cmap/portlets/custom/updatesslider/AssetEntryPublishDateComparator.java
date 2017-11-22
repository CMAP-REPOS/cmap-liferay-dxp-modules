package com.cmap.portlets.custom.updatesslider;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

public class AssetEntryPublishDateComparator 
	extends OrderByComparator<AssetEntry> {

	private static final long serialVersionUID = 1L;
	public static final String ORDER_BY_ASC = "AssetEntry.publishDate ASC";
	public static final String ORDER_BY_DESC = "AssetEntry.publishDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"publishDate"};

	public AssetEntryPublishDateComparator() {
		this(false);
	}

	public AssetEntryPublishDateComparator(boolean ascending) {
		_ascending = ascending;
	}
	
	@Override
	public int compare(AssetEntry a1, AssetEntry a2) {
		int value = DateUtil.compareTo(
				a1.getPublishDate(), a2.getPublishDate());

			if (_ascending) {
				return value;
			}
			else {
				return -value;
			}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private final boolean _ascending;
}
