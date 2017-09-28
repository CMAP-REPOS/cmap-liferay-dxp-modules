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

package com.cmap.services.custom.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.cmap.services.custom.service.base.UtilLocalServiceBaseImpl;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Base64;

/**
 * The implementation of the util local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.cmap.services.custom.service.UtilLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UtilLocalServiceBaseImpl
 * @see com.cmap.services.custom.service.UtilLocalServiceUtil
 */
@ProviderType
public class UtilLocalServiceImpl extends UtilLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.cmap.services.custom.service.UtilLocalServiceUtil} to access the util
	 * local service.
	 */

	private static final Log LOGGER = LogFactoryUtil.getLog(UtilLocalServiceImpl.class);

	public String Base64Encode(String string) {
		String encoded = StringPool.BLANK;
		try {
			encoded = Base64.getEncoder().encodeToString(string.getBytes("utf-8"));
		} catch (Exception ex) {
			LOGGER.error("Exception in UtilLocalService.Base64Encode: " + ex.getMessage(), ex);
		}
		return encoded;
	}

	public String Base64Decode(String string) {
		String decoded = StringPool.BLANK;
		try {
			byte[] asBytes = Base64.getDecoder().decode(string);
			if (asBytes instanceof byte[]) {
				decoded = new String(asBytes, "utf-8");
			}
		} catch (Exception ex) {
			LOGGER.error("Exception in UtilLocalService.Base64Decode: " + ex.getMessage(), ex);
		}
		return decoded;
	}

	public String GenerateEncodedVcard(String firstName, String lastName, String title, String phone, String email) {
		// BEGIN:VCARD
		// VERSION:4.0
		// N:Ambriz;Yesenia;;;
		// FN:Yesenia Ambriz
		// ORG:Chicago Metropolitan Agency for Planning
		// TITLE:Admin II
		// TEL;TYPE=work,voice;VALUE=uri:tel:+1-312-386-8660
		// EMAIL:yambriz@cmap.illinois.gov
		// END:VCARD
		String encodedCard = StringPool.BLANK;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("BEGIN:VCARD");
			sb.append("\n");
			sb.append("VERSION:4.0");
			sb.append("\n");
			sb.append("N:" + firstName + ";" + lastName + ";;;");
			sb.append("\n");
			sb.append("FN:" + lastName + " " + firstName);
			sb.append("\n");
			sb.append("ORG:Chicago Metropolitan Agency for Planning");
			sb.append("\n");
			sb.append("TITLE:" + title);
			sb.append("\n");
			sb.append("TEL;TYPE=work,voice;VALUE=uri:tel:" + phone);
			sb.append("\n");
			sb.append("EMAIL:" + email);
			sb.append("\n");
			sb.append("END:VCARD");
			encodedCard = Base64.getEncoder().encodeToString(sb.toString().getBytes("utf-8"));
		} catch (Exception ex) {
			LOGGER.error("Exception in UtilLocalService.GenerateEncodedVcard: " + ex.getMessage(), ex);
		}
		return encodedCard;
	}
	
	public String GenerateEncodedCal(String uid, String dtStamp, String organizer, String dtStart, String dtEnd,
			String summary, String url, String location) {
		// BEGIN:VCALENDAR
		// VERSION:2.0
		// PRODID:-//hacksw/handcal//NONSGML v1.0//EN
		// BEGIN:VEVENT
		// UID:uid1@example.com
		// DTSTAMP:19970714T170000Z
		// ORGANIZER;CN=John Doe:MAILTO:john.doe@example.com
		// DTSTART:19970714T170000Z
		// DTEND:19970715T035959Z
		// SUMMARY:Bastille Day Party
		// END:VEVENT
		// END:VCALENDAR
		String encodedCal = StringPool.BLANK;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("BEGIN:VCALENDAR");
			sb.append("\n");
			sb.append("VERSION:2.0");
			sb.append("\n");
			sb.append("BEGIN:VEVENT");
			sb.append("\n");
			sb.append("UID:" + uid);
			sb.append("\n");
			sb.append("DTSTAMP:" + dtStamp);
			sb.append("\n");
			sb.append("DTSTART:" + dtStart);
			sb.append("\n");
			sb.append("DTEND:" + dtEnd);
			sb.append("\n");
			sb.append("SUMMARY:" + summary);
			sb.append("\n");
			sb.append("URL:" + url);
			sb.append("\n");
			sb.append("LOCATION:" + location);
			sb.append("\n");
			sb.append("END:VEVENT");
			sb.append("\n");
			sb.append("END:VCALENDAR");
			encodedCal = Base64.getEncoder().encodeToString(sb.toString().getBytes("utf-8"));
		} catch (Exception ex) {
			LOGGER.error("Exception in UtilLocalService.GenerateEncodedCal: " + ex.getMessage(), ex);
		}

		return encodedCal;

	}
}