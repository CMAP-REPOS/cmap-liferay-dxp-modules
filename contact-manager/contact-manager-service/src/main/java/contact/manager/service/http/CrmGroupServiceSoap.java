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

import contact.manager.service.CrmGroupServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link CrmGroupServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link contact.manager.model.CrmGroupSoap}.
 * If the method in the service utility returns a
 * {@link contact.manager.model.CrmGroup}, that is translated to a
 * {@link contact.manager.model.CrmGroupSoap}. Methods that SOAP cannot
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
 * @see CrmGroupServiceHttp
 * @see contact.manager.model.CrmGroupSoap
 * @see CrmGroupServiceUtil
 * @generated
 */
@ProviderType
public class CrmGroupServiceSoap {
	public static contact.manager.model.CrmGroupSoap[] findAll()
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmGroup> returnValue = CrmGroupServiceUtil.findAll();

			return contact.manager.model.CrmGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmGroupSoap[] findAll(int start,
		int end) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmGroup> returnValue = CrmGroupServiceUtil.findAll(start,
					end);

			return contact.manager.model.CrmGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmGroupSoap[] findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator)
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmGroup> returnValue = CrmGroupServiceUtil.findAll(start,
					end, orderByComparator);

			return contact.manager.model.CrmGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] getCrmContacts(
		long crmGroupId) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmGroupServiceUtil.getCrmContacts(crmGroupId);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] getCrmContacts(
		long crmGroupId, int start, int end) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmGroupServiceUtil.getCrmContacts(crmGroupId,
					start, end);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmContactSoap[] getCrmContacts(
		long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator)
		throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmContact> returnValue = CrmGroupServiceUtil.getCrmContacts(crmGroupId,
					start, end, orderByComparator);

			return contact.manager.model.CrmContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void setCrmContacts(long crmGroupPk, long[] crmContactPks)
		throws RemoteException {
		try {
			CrmGroupServiceUtil.setCrmContacts(crmGroupPk, crmContactPks);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getCrmContactsCount(long crmGroupId)
		throws RemoteException {
		try {
			int returnValue = CrmGroupServiceUtil.getCrmContactsCount(crmGroupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmGroupSoap[] getCrmGroupsByName(
		java.lang.String crmGroupName) throws RemoteException {
		try {
			java.util.List<contact.manager.model.CrmGroup> returnValue = CrmGroupServiceUtil.getCrmGroupsByName(crmGroupName);

			return contact.manager.model.CrmGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static contact.manager.model.CrmGroupSoap getCrmGroup(
		long crmGroupId) throws RemoteException {
		try {
			contact.manager.model.CrmGroup returnValue = CrmGroupServiceUtil.getCrmGroup(crmGroupId);

			return contact.manager.model.CrmGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countAll() throws RemoteException {
		try {
			int returnValue = CrmGroupServiceUtil.countAll();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CrmGroupServiceSoap.class);
}