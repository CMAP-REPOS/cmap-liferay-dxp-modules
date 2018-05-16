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

import contact.manager.service.model.County_Commissioner_or_Board_Dist;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing County_Commissioner_or_Board_Dist in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see County_Commissioner_or_Board_Dist
 * @generated
 */
@ProviderType
public class County_Commissioner_or_Board_DistCacheModel implements CacheModel<County_Commissioner_or_Board_Dist>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof County_Commissioner_or_Board_DistCacheModel)) {
			return false;
		}

		County_Commissioner_or_Board_DistCacheModel county_Commissioner_or_Board_DistCacheModel =
			(County_Commissioner_or_Board_DistCacheModel)obj;

		if (ccbdId == county_Commissioner_or_Board_DistCacheModel.ccbdId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ccbdId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{ccbdId=");
		sb.append(ccbdId);
		sb.append(", ccbdNumber=");
		sb.append(ccbdNumber);
		sb.append(", ccbdName=");
		sb.append(ccbdName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public County_Commissioner_or_Board_Dist toEntityModel() {
		County_Commissioner_or_Board_DistImpl county_Commissioner_or_Board_DistImpl =
			new County_Commissioner_or_Board_DistImpl();

		county_Commissioner_or_Board_DistImpl.setCcbdId(ccbdId);
		county_Commissioner_or_Board_DistImpl.setCcbdNumber(ccbdNumber);

		if (ccbdName == null) {
			county_Commissioner_or_Board_DistImpl.setCcbdName(StringPool.BLANK);
		}
		else {
			county_Commissioner_or_Board_DistImpl.setCcbdName(ccbdName);
		}

		if (zipCode == null) {
			county_Commissioner_or_Board_DistImpl.setZipCode(StringPool.BLANK);
		}
		else {
			county_Commissioner_or_Board_DistImpl.setZipCode(zipCode);
		}

		county_Commissioner_or_Board_DistImpl.resetOriginalValues();

		return county_Commissioner_or_Board_DistImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ccbdId = objectInput.readLong();

		ccbdNumber = objectInput.readInt();
		ccbdName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ccbdId);

		objectOutput.writeInt(ccbdNumber);

		if (ccbdName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccbdName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long ccbdId;
	public int ccbdNumber;
	public String ccbdName;
	public String zipCode;
}