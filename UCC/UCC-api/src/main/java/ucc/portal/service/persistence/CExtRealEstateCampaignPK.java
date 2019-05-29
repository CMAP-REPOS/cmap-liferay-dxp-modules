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

package ucc.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignPK implements Comparable<CExtRealEstateCampaignPK>,
	Serializable {
	public long organizationId;
	public long cextRealEstateCampaignId;

	public CExtRealEstateCampaignPK() {
	}

	public CExtRealEstateCampaignPK(long organizationId,
		long cextRealEstateCampaignId) {
		this.organizationId = organizationId;
		this.cextRealEstateCampaignId = cextRealEstateCampaignId;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public long getCextRealEstateCampaignId() {
		return cextRealEstateCampaignId;
	}

	public void setCextRealEstateCampaignId(long cextRealEstateCampaignId) {
		this.cextRealEstateCampaignId = cextRealEstateCampaignId;
	}

	@Override
	public int compareTo(CExtRealEstateCampaignPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (organizationId < pk.organizationId) {
			value = -1;
		}
		else if (organizationId > pk.organizationId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (cextRealEstateCampaignId < pk.cextRealEstateCampaignId) {
			value = -1;
		}
		else if (cextRealEstateCampaignId > pk.cextRealEstateCampaignId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtRealEstateCampaignPK)) {
			return false;
		}

		CExtRealEstateCampaignPK pk = (CExtRealEstateCampaignPK)obj;

		if ((organizationId == pk.organizationId) &&
				(cextRealEstateCampaignId == pk.cextRealEstateCampaignId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, organizationId);
		hashCode = HashUtil.hash(hashCode, cextRealEstateCampaignId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("organizationId=");

		sb.append(organizationId);
		sb.append(", cextRealEstateCampaignId=");

		sb.append(cextRealEstateCampaignId);

		sb.append("}");

		return sb.toString();
	}
}