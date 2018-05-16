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
 * The extended model interface for the CmapGroup service. Represents a row in the &quot;contactmanager_CmapGroup&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CmapGroupModel
 * @see contact.manager.service.model.impl.CmapGroupImpl
 * @see contact.manager.service.model.impl.CmapGroupModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.service.model.impl.CmapGroupImpl")
@ProviderType
public interface CmapGroup extends CmapGroupModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.service.model.impl.CmapGroupImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CmapGroup, Long> GROUP_ID_ACCESSOR = new Accessor<CmapGroup, Long>() {
			@Override
			public Long get(CmapGroup cmapGroup) {
				return cmapGroup.getGroupId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CmapGroup> getTypeClass() {
				return CmapGroup.class;
			}
		};
}