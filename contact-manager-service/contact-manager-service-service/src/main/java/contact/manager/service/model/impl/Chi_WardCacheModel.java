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

import contact.manager.service.model.Chi_Ward;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Chi_Ward in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Chi_Ward
 * @generated
 */
@ProviderType
public class Chi_WardCacheModel implements CacheModel<Chi_Ward>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Chi_WardCacheModel)) {
			return false;
		}

		Chi_WardCacheModel chi_WardCacheModel = (Chi_WardCacheModel)obj;

		if (chiWardId == chi_WardCacheModel.chiWardId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, chiWardId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{chiWardId=");
		sb.append(chiWardId);
		sb.append(", chiWardName=");
		sb.append(chiWardName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Chi_Ward toEntityModel() {
		Chi_WardImpl chi_WardImpl = new Chi_WardImpl();

		chi_WardImpl.setChiWardId(chiWardId);

		if (chiWardName == null) {
			chi_WardImpl.setChiWardName(StringPool.BLANK);
		}
		else {
			chi_WardImpl.setChiWardName(chiWardName);
		}

		if (zipCode == null) {
			chi_WardImpl.setZipCode(StringPool.BLANK);
		}
		else {
			chi_WardImpl.setZipCode(zipCode);
		}

		chi_WardImpl.resetOriginalValues();

		return chi_WardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		chiWardId = objectInput.readLong();
		chiWardName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(chiWardId);

		if (chiWardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiWardName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long chiWardId;
	public String chiWardName;
	public String zipCode;
}