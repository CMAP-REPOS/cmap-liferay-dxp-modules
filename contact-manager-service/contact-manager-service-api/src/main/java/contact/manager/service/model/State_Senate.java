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
 * The extended model interface for the State_Senate service. Represents a row in the &quot;contactmanager_State_Senate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see State_SenateModel
 * @see contact.manager.service.model.impl.State_SenateImpl
 * @see contact.manager.service.model.impl.State_SenateModelImpl
 * @generated
 */
@ImplementationClassName("contact.manager.service.model.impl.State_SenateImpl")
@ProviderType
public interface State_Senate extends State_SenateModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link contact.manager.service.model.impl.State_SenateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<State_Senate, Long> STATE_SENATE_ID_ACCESSOR = new Accessor<State_Senate, Long>() {
			@Override
			public Long get(State_Senate state_Senate) {
				return state_Senate.getStateSenateId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<State_Senate> getTypeClass() {
				return State_Senate.class;
			}
		};
}