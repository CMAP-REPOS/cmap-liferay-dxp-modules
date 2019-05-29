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
 * The extended model interface for the ExtValidation service. Represents a row in the &quot;UCC_ExtValidation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExtValidationModel
 * @see ucc.portal.model.impl.ExtValidationImpl
 * @see ucc.portal.model.impl.ExtValidationModelImpl
 * @generated
 */
@ImplementationClassName("ucc.portal.model.impl.ExtValidationImpl")
@ProviderType
public interface ExtValidation extends ExtValidationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ucc.portal.model.impl.ExtValidationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExtValidation, Long> EXT_VALIDATION_ID_ACCESSOR =
		new Accessor<ExtValidation, Long>() {
			@Override
			public Long get(ExtValidation extValidation) {
				return extValidation.getExtValidationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ExtValidation> getTypeClass() {
				return ExtValidation.class;
			}
		};
}