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

package ucc.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import ucc.portal.model.CExtChurchFinancesIncomeOther;

import ucc.portal.service.persistence.CExtChurchFinancesIncomeOtherPK;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CExtChurchFinancesIncomeOther. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CExtChurchFinancesIncomeOtherLocalServiceUtil
 * @see ucc.portal.service.base.CExtChurchFinancesIncomeOtherLocalServiceBaseImpl
 * @see ucc.portal.service.impl.CExtChurchFinancesIncomeOtherLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CExtChurchFinancesIncomeOtherLocalService
	extends BaseLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CExtChurchFinancesIncomeOtherLocalServiceUtil} to access the c ext church finances income other local service. Add custom service methods to {@link ucc.portal.service.impl.CExtChurchFinancesIncomeOtherLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the c ext church finances income other to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CExtChurchFinancesIncomeOther addCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther);

	/**
	* Creates a new c ext church finances income other with the primary key. Does not add the c ext church finances income other to the database.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key for the new c ext church finances income other
	* @return the new c ext church finances income other
	*/
	@Transactional(enabled = false)
	public CExtChurchFinancesIncomeOther createCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK);

	/**
	* Deletes the c ext church finances income other from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CExtChurchFinancesIncomeOther deleteCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther);

	/**
	* Deletes the c ext church finances income other with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other that was removed
	* @throws PortalException if a c ext church finances income other with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CExtChurchFinancesIncomeOther deleteCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CExtChurchFinancesIncomeOther fetchCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the c ext church finances income other with the primary key.
	*
	* @param cExtChurchFinancesIncomeOtherPK the primary key of the c ext church finances income other
	* @return the c ext church finances income other
	* @throws PortalException if a c ext church finances income other with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CExtChurchFinancesIncomeOther getCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOtherPK cExtChurchFinancesIncomeOtherPK)
		throws PortalException;

	/**
	* Returns a range of all the c ext church finances income others.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtChurchFinancesIncomeOtherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext church finances income others
	* @param end the upper bound of the range of c ext church finances income others (not inclusive)
	* @return the range of c ext church finances income others
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CExtChurchFinancesIncomeOther> getCExtChurchFinancesIncomeOthers(
		int start, int end);

	/**
	* Returns the number of c ext church finances income others.
	*
	* @return the number of c ext church finances income others
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCExtChurchFinancesIncomeOthersCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the c ext church finances income other in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtChurchFinancesIncomeOther the c ext church finances income other
	* @return the c ext church finances income other that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CExtChurchFinancesIncomeOther updateCExtChurchFinancesIncomeOther(
		CExtChurchFinancesIncomeOther cExtChurchFinancesIncomeOther);
}