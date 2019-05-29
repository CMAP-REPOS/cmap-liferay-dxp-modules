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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import ucc.portal.model.CExtStaffingChurch;

import ucc.portal.service.CExtStaffingChurchLocalServiceUtil;

/**
 * The extended model base implementation for the CExtStaffingChurch service. Represents a row in the &quot;UCC_CExtStaffingChurch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CExtStaffingChurchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtStaffingChurchImpl
 * @see CExtStaffingChurch
 * @generated
 */
@ProviderType
public abstract class CExtStaffingChurchBaseImpl
	extends CExtStaffingChurchModelImpl implements CExtStaffingChurch {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a c ext staffing church model instance should use the {@link CExtStaffingChurch} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CExtStaffingChurchLocalServiceUtil.addCExtStaffingChurch(this);
		}
		else {
			CExtStaffingChurchLocalServiceUtil.updateCExtStaffingChurch(this);
		}
	}
}