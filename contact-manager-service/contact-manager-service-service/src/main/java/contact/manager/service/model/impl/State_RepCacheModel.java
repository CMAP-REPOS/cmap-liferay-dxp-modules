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

import contact.manager.service.model.State_Rep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing State_Rep in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see State_Rep
 * @generated
 */
@ProviderType
public class State_RepCacheModel implements CacheModel<State_Rep>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof State_RepCacheModel)) {
			return false;
		}

		State_RepCacheModel state_RepCacheModel = (State_RepCacheModel)obj;

		if (stateRepId == state_RepCacheModel.stateRepId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, stateRepId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{stateRepId=");
		sb.append(stateRepId);
		sb.append(", stateRepNumber=");
		sb.append(stateRepNumber);
		sb.append(", stateRepName=");
		sb.append(stateRepName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public State_Rep toEntityModel() {
		State_RepImpl state_RepImpl = new State_RepImpl();

		state_RepImpl.setStateRepId(stateRepId);
		state_RepImpl.setStateRepNumber(stateRepNumber);

		if (stateRepName == null) {
			state_RepImpl.setStateRepName(StringPool.BLANK);
		}
		else {
			state_RepImpl.setStateRepName(stateRepName);
		}

		if (zipCode == null) {
			state_RepImpl.setZipCode(StringPool.BLANK);
		}
		else {
			state_RepImpl.setZipCode(zipCode);
		}

		state_RepImpl.resetOriginalValues();

		return state_RepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stateRepId = objectInput.readLong();

		stateRepNumber = objectInput.readInt();
		stateRepName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(stateRepId);

		objectOutput.writeInt(stateRepNumber);

		if (stateRepName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateRepName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long stateRepId;
	public int stateRepNumber;
	public String stateRepName;
	public String zipCode;
}