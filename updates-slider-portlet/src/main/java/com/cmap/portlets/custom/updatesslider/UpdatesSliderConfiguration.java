package com.cmap.portlets.custom.updatesslider;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
	id = "com.cmap.portlets.custom.updatesslider.UpdatesSliderConfiguration"
)
public interface UpdatesSliderConfiguration {

	@Meta.AD(required = false)
	public String assetCategoryId();

	@Meta.AD(deflt = "20",
			required = false)
	public String assetCount();

	@Meta.AD(deflt = "200",
			required = false)
	public String summaryLength();
}
