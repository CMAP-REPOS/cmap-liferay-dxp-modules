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
public class CExtStaffingChurchPK implements Comparable<CExtStaffingChurchPK>,
	Serializable {
	public long organizationId;
	public long cextStaffingChurchId;

	public CExtStaffingChurchPK() {
	}

	public CExtStaffingChurchPK(long organizationId, long cextStaffingChurchId) {
		this.organizationId = organizationId;
		this.cextStaffingChurchId = cextStaffingChurchId;
	}

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public long getCextStaffingChurchId() {
		return cextStaffingChurchId;
	}

	public void setCextStaffingChurchId(long cextStaffingChurchId) {
		this.cextStaffingChurchId = cextStaffingChurchId;
	}

	@Override
	public int compareTo(CExtStaffingChurchPK pk) {
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

		if (cextStaffingChurchId < pk.cextStaffingChurchId) {
			value = -1;
		}
		else if (cextStaffingChurchId > pk.cextStaffingChurchId) {
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

		if (!(obj instanceof CExtStaffingChurchPK)) {
			return false;
		}

		CExtStaffingChurchPK pk = (CExtStaffingChurchPK)obj;

		if ((organizationId == pk.organizationId) &&
				(cextStaffingChurchId == pk.cextStaffingChurchId)) {
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
		hashCode = HashUtil.hash(hashCode, cextStaffingChurchId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("organizationId=");

		sb.append(organizationId);
		sb.append(", cextStaffingChurchId=");

		sb.append(cextStaffingChurchId);

		sb.append("}");

		return sb.toString();
	}
}