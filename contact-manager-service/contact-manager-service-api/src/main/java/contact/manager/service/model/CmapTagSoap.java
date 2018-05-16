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

package contact.manager.service.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CmapTagSoap implements Serializable {
	public static CmapTagSoap toSoapModel(CmapTag model) {
		CmapTagSoap soapModel = new CmapTagSoap();

		soapModel.setTagId(model.getTagId());
		soapModel.setTagName(model.getTagName());

		return soapModel;
	}

	public static CmapTagSoap[] toSoapModels(CmapTag[] models) {
		CmapTagSoap[] soapModels = new CmapTagSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CmapTagSoap[][] toSoapModels(CmapTag[][] models) {
		CmapTagSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CmapTagSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CmapTagSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CmapTagSoap[] toSoapModels(List<CmapTag> models) {
		List<CmapTagSoap> soapModels = new ArrayList<CmapTagSoap>(models.size());

		for (CmapTag model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CmapTagSoap[soapModels.size()]);
	}

	public CmapTagSoap() {
	}

	public long getPrimaryKey() {
		return _tagId;
	}

	public void setPrimaryKey(long pk) {
		setTagId(pk);
	}

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
	}

	public String getTagName() {
		return _tagName;
	}

	public void setTagName(String tagName) {
		_tagName = tagName;
	}

	private long _tagId;
	private String _tagName;
}