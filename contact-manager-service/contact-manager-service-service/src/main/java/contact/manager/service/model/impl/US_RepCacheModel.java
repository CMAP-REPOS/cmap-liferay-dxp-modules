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

import contact.manager.service.model.US_Rep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing US_Rep in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see US_Rep
 * @generated
 */
@ProviderType
public class US_RepCacheModel implements CacheModel<US_Rep>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof US_RepCacheModel)) {
			return false;
		}

		US_RepCacheModel us_RepCacheModel = (US_RepCacheModel)obj;

		if (usRepId == us_RepCacheModel.usRepId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, usRepId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{usRepId=");
		sb.append(usRepId);
		sb.append(", usRepNumber=");
		sb.append(usRepNumber);
		sb.append(", usRepName=");
		sb.append(usRepName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public US_Rep toEntityModel() {
		US_RepImpl us_RepImpl = new US_RepImpl();

		us_RepImpl.setUsRepId(usRepId);

		if (usRepNumber == null) {
			us_RepImpl.setUsRepNumber(StringPool.BLANK);
		}
		else {
			us_RepImpl.setUsRepNumber(usRepNumber);
		}

		if (usRepName == null) {
			us_RepImpl.setUsRepName(StringPool.BLANK);
		}
		else {
			us_RepImpl.setUsRepName(usRepName);
		}

		if (zipCode == null) {
			us_RepImpl.setZipCode(StringPool.BLANK);
		}
		else {
			us_RepImpl.setZipCode(zipCode);
		}

		us_RepImpl.resetOriginalValues();

		return us_RepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		usRepId = objectInput.readLong();
		usRepNumber = objectInput.readUTF();
		usRepName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(usRepId);

		if (usRepNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usRepNumber);
		}

		if (usRepName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(usRepName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long usRepId;
	public String usRepNumber;
	public String usRepName;
	public String zipCode;
}