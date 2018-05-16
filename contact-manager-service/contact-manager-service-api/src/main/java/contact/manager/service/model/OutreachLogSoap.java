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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class OutreachLogSoap implements Serializable {
	public static OutreachLogSoap toSoapModel(OutreachLog model) {
		OutreachLogSoap soapModel = new OutreachLogSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setContactId(model.getContactId());
		soapModel.setNote(model.getNote());
		soapModel.setMedium(model.getMedium());
		soapModel.setActivityType(model.getActivityType());
		soapModel.setOutreachDate(model.getOutreachDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static OutreachLogSoap[] toSoapModels(OutreachLog[] models) {
		OutreachLogSoap[] soapModels = new OutreachLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OutreachLogSoap[][] toSoapModels(OutreachLog[][] models) {
		OutreachLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OutreachLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OutreachLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OutreachLogSoap[] toSoapModels(List<OutreachLog> models) {
		List<OutreachLogSoap> soapModels = new ArrayList<OutreachLogSoap>(models.size());

		for (OutreachLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OutreachLogSoap[soapModels.size()]);
	}

	public OutreachLogSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getMedium() {
		return _medium;
	}

	public void setMedium(String medium) {
		_medium = medium;
	}

	public String getActivityType() {
		return _activityType;
	}

	public void setActivityType(String activityType) {
		_activityType = activityType;
	}

	public Date getOutreachDate() {
		return _outreachDate;
	}

	public void setOutreachDate(Date outreachDate) {
		_outreachDate = outreachDate;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _id;
	private long _userId;
	private long _contactId;
	private String _note;
	private String _medium;
	private String _activityType;
	private Date _outreachDate;
	private Date _createDate;
	private Date _modifiedDate;
}