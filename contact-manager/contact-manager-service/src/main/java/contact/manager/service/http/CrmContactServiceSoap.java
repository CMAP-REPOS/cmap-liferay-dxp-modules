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

package contact.manager.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import contact.manager.service.CrmContactServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link CrmContactServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link contact.manager.model.CrmContactSoap}.
 * If the method in the service utility returns a
 * {@link contact.manager.model.CrmContact}, that is translated to a
 * {@link contact.manager.model.CrmContactSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactServiceHttp
 * @see contact.manager.model.CrmContactSoap
 * @see CrmContactServiceUtil
 * @generated
 */
@ProviderType
public class CrmContactServiceSoap {
	public static contact.manager.model.CrmContactSoap findByConstantContactId(
		long constantContactId) throws RemoteException {
		try {
			contact.manager.model.CrmContact returnValue = CrmContactServiceUtil.findByConstantContactId(constantContactId);

			return contact.manager.model.CrmContactSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] findByPrimaryEmailAddress(
		java.lang.String primaryEmailAddress) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmContactServiceUtil.findByPrimaryEmailAddress(primaryEmailAddress);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] findByPrimaryEmailAddressAndStatus(
		java.lang.String primaryEmailAddress, java.lang.String status)
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmContactServiceUtil.findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
					status);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] findByStatus(
		java.lang.String status) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmContactServiceUtil.findByStatus(status);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] getCrmContactsByStatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmContactServiceUtil.getCrmContactsByStatus(status,
					start, end, obc);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countCrmContactsByStatus(java.lang.String status)
		throws RemoteException {
		try {
			int returnValue = CrmContactServiceUtil.countCrmContactsByStatus(status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap getCrmContact(
		long crmContactId) throws RemoteException {
		try {
			contact.manager.model.CrmContact returnValue = CrmContactServiceUtil.getCrmContact(crmContactId);

			return contact.manager.model.CrmContactSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] findByVipFlag(
		boolean isVip) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmContactServiceUtil.findByVipFlag(isVip);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmTagSoap[] getCrmTags(long contactId)
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmTag> returnValue = CrmContactServiceUtil.getCrmTags(contactId);

			return contact.manager.model.CrmTagSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void setCrmTags(long contactId, long[] tagIds)
		throws RemoteException {
		try {
			CrmContactServiceUtil.setCrmTags(contactId, tagIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmGroupSoap[] getCrmGroups(
		long contactId) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmGroup> returnValue = CrmContactServiceUtil.getCrmGroups(contactId);

			return contact.manager.model.CrmGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void setCrmGroups(long contactId, long[] groupIds)
		throws RemoteException {
		try {
			CrmContactServiceUtil.setCrmGroups(contactId, groupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CrmContactServiceSoap.class);
}