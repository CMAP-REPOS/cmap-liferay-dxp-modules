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

package contact.manager.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import contact.manager.service.model.State_Senate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing State_Senate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see State_Senate
 * @generated
 */
@ProviderType
public class State_SenateCacheModel implements CacheModel<State_Senate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof State_SenateCacheModel)) {
			return false;
		}

		State_SenateCacheModel state_SenateCacheModel = (State_SenateCacheModel)obj;

		if (stateSenateId == state_SenateCacheModel.stateSenateId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, stateSenateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{stateSenateId=");
		sb.append(stateSenateId);
		sb.append(", stateSenateNumber=");
		sb.append(stateSenateNumber);
		sb.append(", stateSenateName=");
		sb.append(stateSenateName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public State_Senate toEntityModel() {
		State_SenateImpl state_SenateImpl = new State_SenateImpl();

		state_SenateImpl.setStateSenateId(stateSenateId);
		state_SenateImpl.setStateSenateNumber(stateSenateNumber);

		if (stateSenateName == null) {
			state_SenateImpl.setStateSenateName(StringPool.BLANK);
		}
		else {
			state_SenateImpl.setStateSenateName(stateSenateName);
		}

		if (zipCode == null) {
			state_SenateImpl.setZipCode(StringPool.BLANK);
		}
		else {
			state_SenateImpl.setZipCode(zipCode);
		}

		state_SenateImpl.resetOriginalValues();

		return state_SenateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stateSenateId = objectInput.readLong();

		stateSenateNumber = objectInput.readInt();
		stateSenateName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(stateSenateId);

		objectOutput.writeInt(stateSenateNumber);

		if (stateSenateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateSenateName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long stateSenateId;
	public int stateSenateNumber;
	public String stateSenateName;
	public String zipCode;
}