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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the UccPeopleChurchStanding service. Represents a row in the &quot;UCC_Data_Warehouse.dbo.People_Church_Standing&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleChurchStandingModel
 * @see ucc.portal.model.impl.UccPeopleChurchStandingImpl
 * @see ucc.portal.model.impl.UccPeopleChurchStandingModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.UccPeopleChurchStandingImpl")
@ProviderType
public interface UccPeopleChurchStanding extends UccPeopleChurchStandingModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.UccPeopleChurchStandingImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UccPeopleChurchStanding, Integer> UCC_PEOPLE_CHURCH_STANDING_ID_ACCESSOR =
		new Accessor<UccPeopleChurchStanding, Integer>() {
			@Override
			public Integer get(UccPeopleChurchStanding uccPeopleChurchStanding) {
				return uccPeopleChurchStanding.getUccPeopleChurchStandingId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<UccPeopleChurchStanding> getTypeClass() {
				return UccPeopleChurchStanding.class;
			}
		};
}