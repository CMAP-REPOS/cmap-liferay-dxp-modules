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

import ucc.portal.model.UccAssociation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UccAssociation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UccAssociation
 * @generated
 */
@ProviderType
public class UccAssociationCacheModel implements CacheModel<UccAssociation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UccAssociationCacheModel)) {
			return false;
		}

		UccAssociationCacheModel uccAssociationCacheModel = (UccAssociationCacheModel)obj;

		if (uccAssociationId == uccAssociationCacheModel.uccAssociationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, uccAssociationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uccAssociationId=");
		sb.append(uccAssociationId);
		sb.append(", uccConferenceId=");
		sb.append(uccConferenceId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", abbreviation=");
		sb.append(abbreviation);
		sb.append(", myActive=");
		sb.append(myActive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UccAssociation toEntityModel() {
		UccAssociationImpl uccAssociationImpl = new UccAssociationImpl();

		uccAssociationImpl.setUccAssociationId(uccAssociationId);
		uccAssociationImpl.setUccConferenceId(uccConferenceId);

		if (name == null) {
			uccAssociationImpl.setName("");
		}
		else {
			uccAssociationImpl.setName(name);
		}

		if (abbreviation == null) {
			uccAssociationImpl.setAbbreviation("");
		}
		else {
			uccAssociationImpl.setAbbreviation(abbreviation);
		}

		uccAssociationImpl.setMyActive(myActive);

		uccAssociationImpl.resetOriginalValues();

		return uccAssociationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uccAssociationId = objectInput.readInt();

		uccConferenceId = objectInput.readInt();
		name = objectInput.readUTF();
		abbreviation = objectInput.readUTF();

		myActive = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(uccAssociationId);

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

		objectOutput.writeBoolean(myActive);
	}

	public int uccAssociationId;
	public int uccConferenceId;
	public String name;
	public String abbreviation;
	public boolean myActive;
}