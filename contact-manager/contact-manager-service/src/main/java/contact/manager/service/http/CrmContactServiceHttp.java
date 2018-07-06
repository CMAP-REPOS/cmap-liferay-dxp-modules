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

import contact.manager.service.CrmContactServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link CrmContactServiceUtil} service utility. The
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
 * @see CrmContactServiceSoap
 * @see HttpPrincipal
 * @see CrmContactServiceUtil
 * @generated
 */
@ProviderType
public class CrmContactServiceHttp {
	public static contact.manager.model.CrmContact findByConstantContactId(
		HttpPrincipal httpPrincipal, long constantContactId)
		throws com.liferay.portal.kernel.exception.NoSuchContactException,
			com.liferay.portal.kernel.exception.SystemException,
			contact.manager.exception.NoSuchCrmContactException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"findByConstantContactId",
					_findByConstantContactIdParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					constantContactId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.NoSuchContactException) {
					throw (com.liferay.portal.kernel.exception.NoSuchContactException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof contact.manager.exception.NoSuchCrmContactException) {
					throw (contact.manager.exception.NoSuchCrmContactException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (contact.manager.model.CrmContact)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddress(
		HttpPrincipal httpPrincipal, java.lang.String primaryEmailAddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"findByPrimaryEmailAddress",
					_findByPrimaryEmailAddressParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					primaryEmailAddress);

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

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> findByPrimaryEmailAddressAndStatus(
		HttpPrincipal httpPrincipal, java.lang.String primaryEmailAddress,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"findByPrimaryEmailAddressAndStatus",
					_findByPrimaryEmailAddressAndStatusParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					primaryEmailAddress, status);

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

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> findByStatus(
		HttpPrincipal httpPrincipal, java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"findByStatus", _findByStatusParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, status);

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

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> getCrmContactsByStatus(
		HttpPrincipal httpPrincipal, java.lang.String status, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"getCrmContactsByStatus",
					_getCrmContactsByStatusParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, status,
					start, end, obc);

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

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countCrmContactsByStatus(HttpPrincipal httpPrincipal,
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"countCrmContactsByStatus",
					_countCrmContactsByStatusParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, status);

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

	public static contact.manager.model.CrmContact getCrmContact(
		HttpPrincipal httpPrincipal, long crmContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"getCrmContact", _getCrmContactParameterTypes6);

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

			return (contact.manager.model.CrmContact)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmContact> findByVipFlag(
		HttpPrincipal httpPrincipal, boolean isVip)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"findByVipFlag", _findByVipFlagParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, isVip);

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

			return (java.util.List<contact.manager.model.CrmContact>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<contact.manager.model.CrmTag> getCrmTags(
		HttpPrincipal httpPrincipal, long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"getCrmTags", _getCrmTagsParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, contactId);

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

			return (java.util.List<contact.manager.model.CrmTag>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void setCrmTags(HttpPrincipal httpPrincipal, long contactId,
		long[] tagIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"setCrmTags", _setCrmTagsParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					contactId, tagIds);

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

	public static java.util.List<contact.manager.model.CrmGroup> getCrmGroups(
		HttpPrincipal httpPrincipal, long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"getCrmGroups", _getCrmGroupsParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey, contactId);

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

	public static void setCrmGroups(HttpPrincipal httpPrincipal,
		long contactId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(CrmContactServiceUtil.class,
					"setCrmGroups", _setCrmGroupsParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					contactId, groupIds);

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

	private static Log _log = LogFactoryUtil.getLog(CrmContactServiceHttp.class);
	private static final Class<?>[] _findByConstantContactIdParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _findByPrimaryEmailAddressParameterTypes1 = new Class[] {
			java.lang.String.class
		};
	private static final Class<?>[] _findByPrimaryEmailAddressAndStatusParameterTypes2 =
		new Class[] { java.lang.String.class, java.lang.String.class };
	private static final Class<?>[] _findByStatusParameterTypes3 = new Class[] {
			java.lang.String.class
		};
	private static final Class<?>[] _getCrmContactsByStatusParameterTypes4 = new Class[] {
			java.lang.String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _countCrmContactsByStatusParameterTypes5 = new Class[] {
			java.lang.String.class
		};
	private static final Class<?>[] _getCrmContactParameterTypes6 = new Class[] {
			long.class
		};
	private static final Class<?>[] _findByVipFlagParameterTypes7 = new Class[] {
			boolean.class
		};
	private static final Class<?>[] _getCrmTagsParameterTypes8 = new Class[] {
			long.class
		};
	private static final Class<?>[] _setCrmTagsParameterTypes9 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _getCrmGroupsParameterTypes10 = new Class[] {
			long.class
		};
	private static final Class<?>[] _setCrmGroupsParameterTypes11 = new Class[] {
			long.class, long[].class
		};
}