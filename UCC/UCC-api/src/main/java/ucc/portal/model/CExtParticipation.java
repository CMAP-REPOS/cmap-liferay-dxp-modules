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
 * The extended model interface for the CExtParticipation service. Represents a row in the &quot;UCC_CExtParticipation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationModel
 * @see ucc.portal.model.impl.CExtParticipationImpl
 * @see ucc.portal.model.impl.CExtParticipationModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.CExtParticipationImpl")
@ProviderType
public interface CExtParticipation extends CExtParticipationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.CExtParticipationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CExtParticipation, Long> ORGANIZATION_ID_ACCESSOR =
		new Accessor<CExtParticipation, Long>() {
			@Override
			public Long get(CExtParticipation cExtParticipation) {
				return cExtParticipation.getOrganizationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtParticipation> getTypeClass() {
				return CExtParticipation.class;
			}
		};

	public static final Accessor<CExtParticipation, Long> CEXT_PARTICIPATION_ID_ACCESSOR =
		new Accessor<CExtParticipation, Long>() {
			@Override
			public Long get(CExtParticipation cExtParticipation) {
				return cExtParticipation.getCextParticipationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CExtParticipation> getTypeClass() {
				return CExtParticipation.class;
			}
		};
}