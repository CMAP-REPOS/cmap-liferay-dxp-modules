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

package com.cmap.services.custom.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.cmap.services.custom.model.Util;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Util in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Util
 * @generated
 */
@ProviderType
public class UtilCacheModel implements CacheModel<Util>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UtilCacheModel)) {
			return false;
		}

		UtilCacheModel utilCacheModel = (UtilCacheModel)obj;

		if (utilId == utilCacheModel.utilId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, utilId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", utilId=");
		sb.append(utilId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Util toEntityModel() {
		UtilImpl utilImpl = new UtilImpl();

		if (uuid == null) {
			utilImpl.setUuid(StringPool.BLANK);
		}
		else {
			utilImpl.setUuid(uuid);
		}

		utilImpl.setUtilId(utilId);

		utilImpl.resetOriginalValues();

		return utilImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		utilId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(utilId);
	}

	public String uuid;
	public long utilId;
}