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

import contact.manager.service.model.Muni;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Muni in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Muni
 * @generated
 */
@ProviderType
public class MuniCacheModel implements CacheModel<Muni>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MuniCacheModel)) {
			return false;
		}

		MuniCacheModel muniCacheModel = (MuniCacheModel)obj;

		if (muniId == muniCacheModel.muniId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, muniId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{muniId=");
		sb.append(muniId);
		sb.append(", muniName=");
		sb.append(muniName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Muni toEntityModel() {
		MuniImpl muniImpl = new MuniImpl();

		muniImpl.setMuniId(muniId);

		if (muniName == null) {
			muniImpl.setMuniName(StringPool.BLANK);
		}
		else {
			muniImpl.setMuniName(muniName);
		}

		if (zipCode == null) {
			muniImpl.setZipCode(StringPool.BLANK);
		}
		else {
			muniImpl.setZipCode(zipCode);
		}

		muniImpl.resetOriginalValues();

		return muniImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		muniId = objectInput.readLong();
		muniName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(muniId);

		if (muniName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(muniName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long muniId;
	public String muniName;
	public String zipCode;
}