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

import ucc.portal.model.CExtParticipation;

import ucc.portal.service.persistence.CExtParticipationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtParticipation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtParticipation
 * @generated
 */
@ProviderType
public class CExtParticipationCacheModel implements CacheModel<CExtParticipation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtParticipationCacheModel)) {
			return false;
		}

		CExtParticipationCacheModel cExtParticipationCacheModel = (CExtParticipationCacheModel)obj;

		if (cExtParticipationPK.equals(
					cExtParticipationCacheModel.cExtParticipationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cExtParticipationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", cextParticipationId=");
		sb.append(cextParticipationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", ppGatheringId=");
		sb.append(ppGatheringId);
		sb.append(", ppGatheringKey=");
		sb.append(ppGatheringKey);
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
		sb.append(", ppGatheringAdditionalKey=");
		sb.append(ppGatheringAdditionalKey);
		sb.append(", ppGatheringAdditionalType=");
		sb.append(ppGatheringAdditionalType);
		sb.append(", ppAdditionalInformation=");
		sb.append(ppAdditionalInformation);
		sb.append(", ppPriority=");
		sb.append(ppPriority);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtParticipation toEntityModel() {
		CExtParticipationImpl cExtParticipationImpl = new CExtParticipationImpl();

		cExtParticipationImpl.setOrganizationId(organizationId);
		cExtParticipationImpl.setCextParticipationId(cextParticipationId);
		cExtParticipationImpl.setCompanyId(companyId);
		cExtParticipationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtParticipationImpl.setCreateDate(null);
		}
		else {
			cExtParticipationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtParticipationImpl.setModifiedDate(null);
		}
		else {
			cExtParticipationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ppGatheringId == null) {
			cExtParticipationImpl.setPpGatheringId("");
		}
		else {
			cExtParticipationImpl.setPpGatheringId(ppGatheringId);
		}

		if (ppGatheringKey == null) {
			cExtParticipationImpl.setPpGatheringKey("");
		}
		else {
			cExtParticipationImpl.setPpGatheringKey(ppGatheringKey);
		}

		cExtParticipationImpl.setPpCount(ppCount);
		cExtParticipationImpl.setPpLay(ppLay);
		cExtParticipationImpl.setPpPastor(ppPastor);
		cExtParticipationImpl.setPpStaff(ppStaff);
		cExtParticipationImpl.setPpOther(ppOther);

		if (ppGatheringAdditionalKey == null) {
			cExtParticipationImpl.setPpGatheringAdditionalKey("");
		}
		else {
			cExtParticipationImpl.setPpGatheringAdditionalKey(ppGatheringAdditionalKey);
		}

		if (ppGatheringAdditionalType == null) {
			cExtParticipationImpl.setPpGatheringAdditionalType("");
		}
		else {
			cExtParticipationImpl.setPpGatheringAdditionalType(ppGatheringAdditionalType);
		}

		if (ppAdditionalInformation == null) {
			cExtParticipationImpl.setPpAdditionalInformation("");
		}
		else {
			cExtParticipationImpl.setPpAdditionalInformation(ppAdditionalInformation);
		}

		cExtParticipationImpl.setPpPriority(ppPriority);

		cExtParticipationImpl.resetOriginalValues();

		return cExtParticipationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		cextParticipationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ppGatheringId = objectInput.readUTF();
		ppGatheringKey = objectInput.readUTF();

		ppCount = objectInput.readInt();

		ppLay = objectInput.readBoolean();

		ppPastor = objectInput.readBoolean();

		ppStaff = objectInput.readBoolean();

		ppOther = objectInput.readBoolean();
		ppGatheringAdditionalKey = objectInput.readUTF();
		ppGatheringAdditionalType = objectInput.readUTF();
		ppAdditionalInformation = objectInput.readUTF();

		ppPriority = objectInput.readDouble();

		cExtParticipationPK = new CExtParticipationPK(organizationId,
				cextParticipationId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(cextParticipationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (ppGatheringId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppGatheringId);
		}

		if (ppGatheringKey == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppGatheringKey);
		}

		objectOutput.writeInt(ppCount);

		objectOutput.writeBoolean(ppLay);

		objectOutput.writeBoolean(ppPastor);

		objectOutput.writeBoolean(ppStaff);

		objectOutput.writeBoolean(ppOther);

		if (ppGatheringAdditionalKey == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppGatheringAdditionalKey);
		}

		if (ppGatheringAdditionalType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppGatheringAdditionalType);
		}

		if (ppAdditionalInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppAdditionalInformation);
		}

		objectOutput.writeDouble(ppPriority);
	}

	public long organizationId;
	public long cextParticipationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String ppGatheringId;
	public String ppGatheringKey;
	public int ppCount;
	public boolean ppLay;
	public boolean ppPastor;
	public boolean ppStaff;
	public boolean ppOther;
	public String ppGatheringAdditionalKey;
	public String ppGatheringAdditionalType;
	public String ppAdditionalInformation;
	public double ppPriority;
	public transient CExtParticipationPK cExtParticipationPK;
}