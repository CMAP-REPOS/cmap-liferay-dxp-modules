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
	public static contact.manager.model.CrmGroup getCrmGroup(
		HttpPrincipal httpPrincipal, long crmGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmGroup", _getCrmGroupParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static contact.manager.model.CrmGroup deleteCrmGroup(
		HttpPrincipal httpPrincipal, contact.manager.model.CrmGroup crmGroup,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"deleteCrmGroup", _deleteCrmGroupParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroup, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static contact.manager.model.CrmGroup deleteCrmGroup(
		HttpPrincipal httpPrincipal, long crmGroupId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"deleteCrmGroup", _deleteCrmGroupParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static contact.manager.model.CrmGroup addCrmGroup(
		HttpPrincipal httpPrincipal, contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"addCrmGroup", _addCrmGroupParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, crmGroup);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static contact.manager.model.CrmGroup updateCrmGroup(
		HttpPrincipal httpPrincipal, contact.manager.model.CrmGroup crmGroup)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"updateCrmGroup", _updateCrmGroupParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, crmGroup);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void setCrmGroupCrmContacts(HttpPrincipal httpPrincipal,
		long crmGroupId, long[] crmContactIds) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"setCrmGroupCrmContacts",
					_setCrmGroupCrmContactsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId, crmContactIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmGroup> findAll(
		HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
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
		HttpPrincipal httpPrincipal, int start, int end) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, start,
					end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
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
		com.liferay.portal.kernel.util.OrderByComparator<contact.manager.model.CrmGroup> orderByComparator) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"findAll", _findAllParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, start,
					end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countAll(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"countAll", _countAllParameterTypes9);

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

	public static java.util.List<contact.manager.model.CrmContact> getCrmContacts(
		HttpPrincipal httpPrincipal, long crmGroupId) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContacts", _getCrmContactsParameterTypes10);

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

	public static int getCrmContactsSize(HttpPrincipal httpPrincipal,
		long crmGroupId) {
		try {
			MethodKey methodKey = new MethodKey(CrmGroupServiceUtil.class,
					"getCrmContactsSize", _getCrmContactsSizeParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					crmGroupId);

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
	private static final Class<?>[] _getCrmGroupParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _deleteCrmGroupParameterTypes1 = new Class[] {
			contact.manager.model.CrmGroup.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteCrmGroupParameterTypes2 = new Class[] {
			long.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _addCrmGroupParameterTypes3 = new Class[] {
			contact.manager.model.CrmGroup.class
		};
	private static final Class<?>[] _updateCrmGroupParameterTypes4 = new Class[] {
			contact.manager.model.CrmGroup.class
		};
	private static final Class<?>[] _setCrmGroupCrmContactsParameterTypes5 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _findAllParameterTypes6 = new Class[] {  };
	private static final Class<?>[] _findAllParameterTypes7 = new Class[] {
			int.class, int.class
		};
	private static final Class<?>[] _findAllParameterTypes8 = new Class[] {
			int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _countAllParameterTypes9 = new Class[] {  };
	private static final Class<?>[] _getCrmContactsParameterTypes10 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getCrmContactsSizeParameterTypes11 = new Class[] {
			long.class
		};
}