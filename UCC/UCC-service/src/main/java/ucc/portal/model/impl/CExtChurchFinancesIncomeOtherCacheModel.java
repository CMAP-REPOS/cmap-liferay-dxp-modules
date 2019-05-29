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

import ucc.portal.model.CExtChurchFinancesIncomeOther;

import ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtChurchFinancesIncomeOther in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOther
 * @generated
 */
@ProviderType
public class CExtChurchFinancesIncomeOtherCacheModel implements CacheModel<CExtChurchFinancesIncomeOther>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtChurchFinancesIncomeOtherCacheModel)) {
			return false;
		}

		CExtChurchFinancesIncomeOtherCacheModel cExtChurchFinancesIncomeOtherCacheModel =
			(CExtChurchFinancesIncomeOtherCacheModel)obj;

		if (cExtChurchFinancesIncomeOtherPK.equals(
					cExtChurchFinancesIncomeOtherCacheModel.cExtChurchFinancesIncomeOtherPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtChurchFinancesIncomeOtherPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextChurchFinancesIncomeOtherId=");
		sb.append(cextChurchFinancesIncomeOtherId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", fnIncomeOther=");
		sb.append(fnIncomeOther);
		sb.append(", fnIncomeOtherDescription=");
		sb.append(fnIncomeOtherDescription);
		sb.append(", fnPriority=");
		sb.append(fnPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtChurchFinancesIncomeOther toEntityModel() {
		CExtChurchFinancesIncomeOtherImpl cExtChurchFinancesIncomeOtherImpl = new CExtChurchFinancesIncomeOtherImpl();

		cExtChurchFinancesIncomeOtherImpl.setOrganizationId(organizationId);
		cExtChurchFinancesIncomeOtherImpl.setCextChurchFinancesIncomeOtherId(cextChurchFinancesIncomeOtherId);
		cExtChurchFinancesIncomeOtherImpl.setCompanyId(companyId);
		cExtChurchFinancesIncomeOtherImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtChurchFinancesIncomeOtherImpl.setCreateDate(null);
		}
		else {
			cExtChurchFinancesIncomeOtherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtChurchFinancesIncomeOtherImpl.setModifiedDate(null);
		}
		else {
			cExtChurchFinancesIncomeOtherImpl.setModifiedDate(new Date(
					modifiedDate));
		}

		cExtChurchFinancesIncomeOtherImpl.setFnIncomeOther(fnIncomeOther);

		if (fnIncomeOtherDescription == null) {
			cExtChurchFinancesIncomeOtherImpl.setFnIncomeOtherDescription("");
		}
		else {
			cExtChurchFinancesIncomeOtherImpl.setFnIncomeOtherDescription(fnIncomeOtherDescription);
		}

		cExtChurchFinancesIncomeOtherImpl.setFnPriority(fnPriority);

		cExtChurchFinancesIncomeOtherImpl.resetOriginalValues();

		return cExtChurchFinancesIncomeOtherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextChurchFinancesIncomeOtherId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		fnIncomeOther = objectInput.readInt();
		fnIncomeOtherDescription = objectInput.readUTF();

		fnPriority = objectInput.readDouble();

		cExtChurchFinancesIncomeOtherPK = new CExtChurchFinancesIncomeOtherPK(organizationId,
				cextChurchFinancesIncomeOtherId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextChurchFinancesIncomeOtherId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(fnIncomeOther);

		if (fnIncomeOtherDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnIncomeOtherDescription);
		}

		objectOutput.writeDouble(fnPriority);
	}

	public long organizationId;
	public long cextChurchFinancesIncomeOtherId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public int fnIncomeOther;
	public String fnIncomeOtherDescription;
	public double fnPriority;
	public transient CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK;
}