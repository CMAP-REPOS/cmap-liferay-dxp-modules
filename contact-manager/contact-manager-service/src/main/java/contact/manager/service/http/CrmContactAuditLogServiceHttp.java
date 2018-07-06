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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import contact.manager.service.CrmContactAuditLogServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link CrmContactAuditLogServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CrmContactAuditLogServiceSoap
 * @see HttpPrincipal
 * @see CrmContactAuditLogServiceUtil
 * @generated
 */
@ProviderType
public class CrmContactAuditLogServiceHttp {
	public static java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		HttpPrincipal httpPrincipal, long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactAuditLogServiceUtil.class,
					"findByCrmContactId", _findByCrmContactIdParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmContactId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContactAuditLog>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		HttpPrincipal httpPrincipal, long crmContactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactAuditLogServiceUtil.class,
					"findByCrmContactId", _findByCrmContactIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmContactId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContactAuditLog>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContactAuditLog> findByCrmContactId(
		HttpPrincipal httpPrincipal, long crmContactId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContactAuditLog> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactAuditLogServiceUtil.class,
					"findByCrmContactId", _findByCrmContactIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmContactId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContactAuditLog>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countByCrmContactId(HttpPrincipal httpPrincipal,
		long crmContactId) {
		try {
			MethodKey methodKey = new MethodKey(CrmContactAuditLogServiceUtil.class,
					"countByCrmContactId", _countByCrmContactIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmContactId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CrmContactAuditLogServiceHttp.class);
	private static final Class<?>[] _findByCrmContactIdParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _findByCrmContactIdParameterTypes1 = new Class[] {
			long.class, int.class, int.class
		};
	private static final Class<?>[] _findByCrmContactIdParameterTypes2 = new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _countByCrmContactIdParameterTypes3 = new Class[] {
			long.class
		};
}