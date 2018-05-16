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

import contact.manager.service.model.LTA;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LTA in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LTA
 * @generated
 */
@ProviderType
public class LTACacheModel implements CacheModel<LTA>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LTACacheModel)) {
			return false;
		}

		LTACacheModel ltaCacheModel = (LTACacheModel)obj;

		if (ltaId == ltaCacheModel.ltaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ltaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ltaId=");
		sb.append(ltaId);
		sb.append(", ltaName=");
		sb.append(ltaName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LTA toEntityModel() {
		LTAImpl ltaImpl = new LTAImpl();

		ltaImpl.setLtaId(ltaId);

		if (ltaName == null) {
			ltaImpl.setLtaName(StringPool.BLANK);
		}
		else {
			ltaImpl.setLtaName(ltaName);
		}

		if (zipCode == null) {
			ltaImpl.setZipCode(StringPool.BLANK);
		}
		else {
			ltaImpl.setZipCode(zipCode);
		}

		ltaImpl.resetOriginalValues();

		return ltaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ltaId = objectInput.readLong();
		ltaName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ltaId);

		if (ltaName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ltaName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long ltaId;
	public String ltaName;
	public String zipCode;
}