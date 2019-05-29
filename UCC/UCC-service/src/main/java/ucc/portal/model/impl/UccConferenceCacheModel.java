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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.UccConference;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UccConference in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UccConference
 * @generated
 */
@ProviderType
public class UccConferenceCacheModel implements CacheModel<UccConference>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccConferenceCacheModel)) {
			return false;
		}

		UccConferenceCacheModel uccConferenceCacheModel = (UccConferenceCacheModel)obj;

		if (uccConferenceId == uccConferenceCacheModel.uccConferenceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, uccConferenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uccConferenceId=");
		sb.append(uccConferenceId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", abbreviation=");
		sb.append(abbreviation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UccConference toEntityModel() {
		UccConferenceImpl uccConferenceImpl = new UccConferenceImpl();

		uccConferenceImpl.setUccConferenceId(uccConferenceId);

		if (name == null) {
			uccConferenceImpl.setName("");
		}
		else {
			uccConferenceImpl.setName(name);
		}

		if (abbreviation == null) {
			uccConferenceImpl.setAbbreviation("");
		}
		else {
			uccConferenceImpl.setAbbreviation(abbreviation);
		}

		uccConferenceImpl.resetOriginalValues();

		return uccConferenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uccConferenceId = objectInput.readInt();
		name = objectInput.readUTF();
		abbreviation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(uccConferenceId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (abbreviation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(abbreviation);
		}
	}

	public int uccConferenceId;
	public String name;
	public String abbreviation;
}