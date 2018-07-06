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

import contact.manager.service.CrmCountyCommissionerServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link CrmCountyCommissionerServiceUtil} service utility. The
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
 * @see CrmCountyCommissionerServiceSoap
 * @see HttpPrincipal
 * @see CrmCountyCommissionerServiceUtil
 * @generated
 */
@ProviderType
public class CrmCountyCommissionerServiceHttp {
	public static java.util.List<contact.manager.model.CrmCountyCommissioner> findByZipCode(
		HttpPrincipal httpPrincipal, java.lang.String zipCode) {
		try {
			MethodKey methodKey = new MethodKey(CrmCountyCommissionerServiceUtil.class,
					"findByZipCode", _findByZipCodeParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, zipCode);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<contact.manager.model.CrmCountyCommissioner>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CrmCountyCommissionerServiceHttp.class);
	private static final Class<?>[] _findByZipCodeParameterTypes0 = new Class[] {
			java.lang.String.class
		};
}