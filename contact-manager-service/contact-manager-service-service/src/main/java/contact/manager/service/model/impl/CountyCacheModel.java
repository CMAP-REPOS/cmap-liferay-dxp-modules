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

import contact.manager.service.model.County;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing County in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see County
 * @generated
 */
@ProviderType
public class CountyCacheModel implements CacheModel<County>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CountyCacheModel)) {
			return false;
		}

		CountyCacheModel countyCacheModel = (CountyCacheModel)obj;

		if (countyId == countyCacheModel.countyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, countyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{countyId=");
		sb.append(countyId);
		sb.append(", countyName=");
		sb.append(countyName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public County toEntityModel() {
		CountyImpl countyImpl = new CountyImpl();

		countyImpl.setCountyId(countyId);

		if (countyName == null) {
			countyImpl.setCountyName(StringPool.BLANK);
		}
		else {
			countyImpl.setCountyName(countyName);
		}

		if (zipCode == null) {
			countyImpl.setZipCode(StringPool.BLANK);
		}
		else {
			countyImpl.setZipCode(zipCode);
		}

		countyImpl.resetOriginalValues();

		return countyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		countyId = objectInput.readLong();
		countyName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(countyId);

		if (countyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countyName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long countyId;
	public String countyName;
	public String zipCode;
}