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

import ucc.portal.model.UccPeopleChurchStanding;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UccPeopleChurchStanding in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UccPeopleChurchStanding
 * @generated
 */
@ProviderType
public class UccPeopleChurchStandingCacheModel implements CacheModel<UccPeopleChurchStanding>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccPeopleChurchStandingCacheModel)) {
			return false;
		}

		UccPeopleChurchStandingCacheModel uccPeopleChurchStandingCacheModel = (UccPeopleChurchStandingCacheModel)obj;

		if (uccPeopleChurchStandingId == uccPeopleChurchStandingCacheModel.uccPeopleChurchStandingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, uccPeopleChurchStandingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uccPeopleChurchStandingId=");
		sb.append(uccPeopleChurchStandingId);
		sb.append(", uccPeopleId=");
		sb.append(uccPeopleId);
		sb.append(", uccConferenceId=");
		sb.append(uccConferenceId);
		sb.append(", uccAssociationId=");
		sb.append(uccAssociationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UccPeopleChurchStanding toEntityModel() {
		UccPeopleChurchStandingImpl uccPeopleChurchStandingImpl = new UccPeopleChurchStandingImpl();

		uccPeopleChurchStandingImpl.setUccPeopleChurchStandingId(uccPeopleChurchStandingId);
		uccPeopleChurchStandingImpl.setUccPeopleId(uccPeopleId);
		uccPeopleChurchStandingImpl.setUccConferenceId(uccConferenceId);
		uccPeopleChurchStandingImpl.setUccAssociationId(uccAssociationId);

		uccPeopleChurchStandingImpl.resetOriginalValues();

		return uccPeopleChurchStandingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uccPeopleChurchStandingId = objectInput.readInt();

		uccPeopleId = objectInput.readInt();

		uccConferenceId = objectInput.readInt();

		uccAssociationId = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(uccPeopleChurchStandingId);

		objectOutput.writeInt(uccPeopleId);

		objectOutput.writeInt(uccConferenceId);

		objectOutput.writeInt(uccAssociationId);
	}

	public int uccPeopleChurchStandingId;
	public int uccPeopleId;
	public int uccConferenceId;
	public int uccAssociationId;
}