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

import contact.manager.service.model.CmapTag;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CmapTag in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CmapTag
 * @generated
 */
@ProviderType
public class CmapTagCacheModel implements CacheModel<CmapTag>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CmapTagCacheModel)) {
			return false;
		}

		CmapTagCacheModel cmapTagCacheModel = (CmapTagCacheModel)obj;

		if (tagId == cmapTagCacheModel.tagId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tagId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tagId=");
		sb.append(tagId);
		sb.append(", tagName=");
		sb.append(tagName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CmapTag toEntityModel() {
		CmapTagImpl cmapTagImpl = new CmapTagImpl();

		cmapTagImpl.setTagId(tagId);

		if (tagName == null) {
			cmapTagImpl.setTagName(StringPool.BLANK);
		}
		else {
			cmapTagImpl.setTagName(tagName);
		}

		cmapTagImpl.resetOriginalValues();

		return cmapTagImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tagId = objectInput.readLong();
		tagName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tagId);

		if (tagName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagName);
		}
	}

	public long tagId;
	public String tagName;
}