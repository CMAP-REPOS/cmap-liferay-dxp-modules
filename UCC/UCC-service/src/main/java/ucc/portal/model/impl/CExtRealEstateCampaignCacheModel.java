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

import ucc.portal.model.CExtRealEstateCampaign;

import ucc.portal.service.persistence.CExtRealEstateCampaignPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtRealEstateCampaign in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtRealEstateCampaign
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignCacheModel implements CacheModel<CExtRealEstateCampaign>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtRealEstateCampaignCacheModel)) {
			return false;
		}

		CExtRealEstateCampaignCacheModel cExtRealEstateCampaignCacheModel = (CExtRealEstateCampaignCacheModel)obj;

		if (cExtRealEstateCampaignPK.equals(
					cExtRealEstateCampaignCacheModel.cExtRealEstateCampaignPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtRealEstateCampaignPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextRealEstateCampaignId=");
		sb.append(cextRealEstateCampaignId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", reYear=");
		sb.append(reYear);
		sb.append(", reUnderwayAnticipated=");
		sb.append(reUnderwayAnticipated);
		sb.append(", reGoal=");
		sb.append(reGoal);
		sb.append(", reResult=");
		sb.append(reResult);
		sb.append(", rePurpose=");
		sb.append(rePurpose);
		sb.append(", reImpact=");
		sb.append(reImpact);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtRealEstateCampaign toEntityModel() {
		CExtRealEstateCampaignImpl cExtRealEstateCampaignImpl = new CExtRealEstateCampaignImpl();

		cExtRealEstateCampaignImpl.setOrganizationId(organizationId);
		cExtRealEstateCampaignImpl.setCextRealEstateCampaignId(cextRealEstateCampaignId);
		cExtRealEstateCampaignImpl.setCompanyId(companyId);
		cExtRealEstateCampaignImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtRealEstateCampaignImpl.setCreateDate(null);
		}
		else {
			cExtRealEstateCampaignImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtRealEstateCampaignImpl.setModifiedDate(null);
		}
		else {
			cExtRealEstateCampaignImpl.setModifiedDate(new Date(modifiedDate));
		}

		cExtRealEstateCampaignImpl.setReYear(reYear);
		cExtRealEstateCampaignImpl.setReUnderwayAnticipated(reUnderwayAnticipated);
		cExtRealEstateCampaignImpl.setReGoal(reGoal);
		cExtRealEstateCampaignImpl.setReResult(reResult);

		if (rePurpose == null) {
			cExtRealEstateCampaignImpl.setRePurpose("");
		}
		else {
			cExtRealEstateCampaignImpl.setRePurpose(rePurpose);
		}

		if (reImpact == null) {
			cExtRealEstateCampaignImpl.setReImpact("");
		}
		else {
			cExtRealEstateCampaignImpl.setReImpact(reImpact);
		}

		cExtRealEstateCampaignImpl.resetOriginalValues();

		return cExtRealEstateCampaignImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextRealEstateCampaignId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		reYear = objectInput.readInt();

		reUnderwayAnticipated = objectInput.readBoolean();

		reGoal = objectInput.readInt();

		reResult = objectInput.readInt();
		rePurpose = objectInput.readUTF();
		reImpact = objectInput.readUTF();

		cExtRealEstateCampaignPK = new CExtRealEstateCampaignPK(organizationId,
				cextRealEstateCampaignId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextRealEstateCampaignId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(reYear);

		objectOutput.writeBoolean(reUnderwayAnticipated);

		objectOutput.writeInt(reGoal);

		objectOutput.writeInt(reResult);

		if (rePurpose == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rePurpose);
		}

		if (reImpact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reImpact);
		}
	}

	public long organizationId;
	public long cextRealEstateCampaignId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public int reYear;
	public boolean reUnderwayAnticipated;
	public int reGoal;
	public int reResult;
	public String rePurpose;
	public String reImpact;
	public transient CExtRealEstateCampaignPK cExtRealEstateCampaignPK;
}