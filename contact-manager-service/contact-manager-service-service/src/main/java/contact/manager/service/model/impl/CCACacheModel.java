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

import contact.manager.service.model.CCA;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CCA in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CCA
 * @generated
 */
@ProviderType
public class CCACacheModel implements CacheModel<CCA>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CCACacheModel)) {
			return false;
		}

		CCACacheModel ccaCacheModel = (CCACacheModel)obj;

		if (ccaId == ccaCacheModel.ccaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ccaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{ccaId=");
		sb.append(ccaId);
		sb.append(", ccaName=");
		sb.append(ccaName);
		sb.append(", zipCode=");
		sb.append(zipCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CCA toEntityModel() {
		CCAImpl ccaImpl = new CCAImpl();

		ccaImpl.setCcaId(ccaId);

		if (ccaName == null) {
			ccaImpl.setCcaName(StringPool.BLANK);
		}
		else {
			ccaImpl.setCcaName(ccaName);
		}

		if (zipCode == null) {
			ccaImpl.setZipCode(StringPool.BLANK);
		}
		else {
			ccaImpl.setZipCode(zipCode);
		}

		ccaImpl.resetOriginalValues();

		return ccaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ccaId = objectInput.readLong();
		ccaName = objectInput.readUTF();
		zipCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ccaId);

		if (ccaName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ccaName);
		}

		if (zipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipCode);
		}
	}

	public long ccaId;
	public String ccaName;
	public String zipCode;
}