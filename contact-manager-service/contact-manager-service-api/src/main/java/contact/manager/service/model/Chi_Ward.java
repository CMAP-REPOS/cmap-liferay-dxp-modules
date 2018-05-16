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

package contact.manager.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Chi_Ward service. Represents a row in the &quot;contactmanager_Chi_Ward&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Chi_WardModel
 * @see contact.manager.service.model.impl.Chi_WardImpl
 * @see contact.manager.service.model.impl.Chi_WardModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.service.model.impl.Chi_WardImpl")
@ProviderType
public interface Chi_Ward extends Chi_WardModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.service.model.impl.Chi_WardImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Chi_Ward, Long> CHI_WARD_ID_ACCESSOR = new Accessor<Chi_Ward, Long>() {
			@Override
			public Long get(Chi_Ward chi_Ward) {
				return chi_Ward.getChiWardId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Chi_Ward> getTypeClass() {
				return Chi_Ward.class;
			}
		};
}