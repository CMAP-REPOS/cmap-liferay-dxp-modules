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

import ucc.portal.model.CExtParticipationOther;

import ucc.portal.service.persistence.CExtParticipationOtherPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtParticipationOther in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipationOther
 * @generated
 */
@ProviderType
public class CExtParticipationOtherCacheModel implements CacheModel<CExtParticipationOther>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtParticipationOtherCacheModel)) {
			return false;
		}

		CExtParticipationOtherCacheModel cExtParticipationOtherCacheModel = (CExtParticipationOtherCacheModel)obj;

		if (cExtParticipationOtherPK.equals(
					cExtParticipationOtherCacheModel.cExtParticipationOtherPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtParticipationOtherPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextParticipationOtherId=");
		sb.append(cextParticipationOtherId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", ppGathering=");
		sb.append(ppGathering);
		sb.append(", ppCount=");
		sb.append(ppCount);
		sb.append(", ppLay=");
		sb.append(ppLay);
		sb.append(", ppPastor=");
		sb.append(ppPastor);
		sb.append(", ppStaff=");
		sb.append(ppStaff);
		sb.append(", ppOther=");
		sb.append(ppOther);
		sb.append(", ppAdditionalInformation=");
		sb.append(ppAdditionalInformation);
		sb.append(", ppPriority=");
		sb.append(ppPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtParticipationOther toEntityModel() {
		CExtParticipationOtherImpl cExtParticipationOtherImpl = new CExtParticipationOtherImpl();

		cExtParticipationOtherImpl.setOrganizationId(organizationId);
		cExtParticipationOtherImpl.setCextParticipationOtherId(cextParticipationOtherId);
		cExtParticipationOtherImpl.setCompanyId(companyId);
		cExtParticipationOtherImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtParticipationOtherImpl.setCreateDate(null);
		}
		else {
			cExtParticipationOtherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtParticipationOtherImpl.setModifiedDate(null);
		}
		else {
			cExtParticipationOtherImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ppGathering == null) {
			cExtParticipationOtherImpl.setPpGathering("");
		}
		else {
			cExtParticipationOtherImpl.setPpGathering(ppGathering);
		}

		cExtParticipationOtherImpl.setPpCount(ppCount);
		cExtParticipationOtherImpl.setPpLay(ppLay);
		cExtParticipationOtherImpl.setPpPastor(ppPastor);
		cExtParticipationOtherImpl.setPpStaff(ppStaff);
		cExtParticipationOtherImpl.setPpOther(ppOther);

		if (ppAdditionalInformation == null) {
			cExtParticipationOtherImpl.setPpAdditionalInformation("");
		}
		else {
			cExtParticipationOtherImpl.setPpAdditionalInformation(ppAdditionalInformation);
		}

		cExtParticipationOtherImpl.setPpPriority(ppPriority);

		cExtParticipationOtherImpl.resetOriginalValues();

		return cExtParticipationOtherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextParticipationOtherId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ppGathering = objectInput.readUTF();

		ppCount = objectInput.readInt();

		ppLay = objectInput.readBoolean();

		ppPastor = objectInput.readBoolean();

		ppStaff = objectInput.readBoolean();

		ppOther = objectInput.readBoolean();
		ppAdditionalInformation = objectInput.readUTF();

		ppPriority = objectInput.readDouble();

		cExtParticipationOtherPK = new CExtParticipationOtherPK(organizationId,
				cextParticipationOtherId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextParticipationOtherId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (ppGathering == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppGathering);
		}

		objectOutput.writeInt(ppCount);

		objectOutput.writeBoolean(ppLay);

		objectOutput.writeBoolean(ppPastor);

		objectOutput.writeBoolean(ppStaff);

		objectOutput.writeBoolean(ppOther);

		if (ppAdditionalInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppAdditionalInformation);
		}

		objectOutput.writeDouble(ppPriority);
	}

	public long organizationId;
	public long cextParticipationOtherId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String ppGathering;
	public int ppCount;
	public boolean ppLay;
	public boolean ppPastor;
	public boolean ppStaff;
	public boolean ppOther;
	public String ppAdditionalInformation;
	public double ppPriority;
	public transient CExtParticipationOtherPK cExtParticipationOtherPK;
}