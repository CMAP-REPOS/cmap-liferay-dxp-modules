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

import contact.manager.service.CrmGroupServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link CrmGroupServiceUtil} service utility. The
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
 * @see CrmGroupServiceSoap
 * @see HttpPrincipal
 * @see CrmGroupServiceUtil
 * @generated
 */
@ProviderType
public class CrmGroupServiceHttp {
	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

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

			return (java.util.List<contact.manager.model.CrmGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		HttpPrincipal httpPrincipal, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, start,
					end);

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

			return (java.util.List<contact.manager.model.CrmGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		HttpPrincipal httpPrincipal, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, start,
					end, orderByComparator);

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

			return (java.util.List<contact.manager.model.CrmGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		HttpPrincipal httpPrincipal, long crmGroupId) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContacts", _getCrmContactsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		HttpPrincipal httpPrincipal, long crmGroupId, int start, int end) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContacts", _getCrmContactsParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		HttpPrincipal httpPrincipal, long crmGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmContact> orderByComparator) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContacts", _getCrmContactsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void setCrmContacts(HttpPrincipal httpPrincipal,
		long crmGroupPk, long[] crmContactPks)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"setCrmContacts", _setCrmContactsParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupPk, crmContactPks);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getCrmContactsCount(HttpPrincipal httpPrincipal,
		long crmGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContactsCount", _getCrmContactsCountParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId);

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

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroupsByName(
		HttpPrincipal httpPrincipal, java.lang.String crmGroupName)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmGroupsByName", _getCrmGroupsByNameParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupName);

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

			return (java.util.List<contact.manager.model.CrmGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static contact.manager.model.CrmGroup getCrmGroup(
		HttpPrincipal httpPrincipal, long crmGroupId) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmGroup", _getCrmGroupParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countAll(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"countAll", _countAllParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey);

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

	private static Log _log = LogFactoryUtil.getLog(CrmGroupServiceHttp.class);
	private static final Class<?>[] _findAllParameterTypes0 = new Class[] {  };
	private static final Class<?>[] _findAllParameterTypes1 = new Class[] {
			int.class, int.class
		};
	private static final Class<?>[] _findAllParameterTypes2 = new Class[] {
			int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getCrmContactsParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getCrmContactsParameterTypes4 = new Class[] {
			long.class, int.class, int.class
		};
	private static final Class<?>[] _getCrmContactsParameterTypes5 = new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _setCrmContactsParameterTypes6 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _getCrmContactsCountParameterTypes7 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getCrmGroupsByNameParameterTypes8 = new Class[] {
			java.lang.String.class
		};
	private static final Class<?>[] _getCrmGroupParameterTypes9 = new Class[] {
			long.class
		};
	private static final Class<?>[] _countAllParameterTypes10 = new Class[] {  };
}