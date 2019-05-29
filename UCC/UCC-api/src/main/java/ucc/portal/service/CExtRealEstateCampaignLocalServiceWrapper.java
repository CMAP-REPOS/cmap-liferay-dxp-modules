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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CExtRealEstateCampaignLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CExtRealEstateCampaignLocalService
 * @generated
 */
@ProviderType
public class CExtRealEstateCampaignLocalServiceWrapper
	implements CExtRealEstateCampaignLocalService,
		ServiceWrapper<CExtRealEstateCampaignLocalService> {
	public CExtRealEstateCampaignLocalServiceWrapper(
		CExtRealEstateCampaignLocalService cExtRealEstateCampaignLocalService) {
		_cExtRealEstateCampaignLocalService = cExtRealEstateCampaignLocalService;
	}

	/**
	* Adds the c ext real estate campaign to the database. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaign the c ext real estate campaign
	* @return the c ext real estate campaign that was added
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign addCExtRealEstateCampaign(
		ucc.portal.model.CExtRealEstateCampaign cExtRealEstateCampaign) {
		return _cExtRealEstateCampaignLocalService.addCExtRealEstateCampaign(cExtRealEstateCampaign);
	}

	/**
	* Creates a new c ext real estate campaign with the primary key. Does not add the c ext real estate campaign to the database.
	*
	* @param cExtRealEstateCampaignPK the primary key for the new c ext real estate campaign
	* @return the new c ext real estate campaign
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign createCExtRealEstateCampaign(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		return _cExtRealEstateCampaignLocalService.createCExtRealEstateCampaign(cExtRealEstateCampaignPK);
	}

	/**
	* Deletes the c ext real estate campaign from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaign the c ext real estate campaign
	* @return the c ext real estate campaign that was removed
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign deleteCExtRealEstateCampaign(
		ucc.portal.model.CExtRealEstateCampaign cExtRealEstateCampaign) {
		return _cExtRealEstateCampaignLocalService.deleteCExtRealEstateCampaign(cExtRealEstateCampaign);
	}

	/**
	* Deletes the c ext real estate campaign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign that was removed
	* @throws PortalException if a c ext real estate campaign with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign deleteCExtRealEstateCampaign(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtRealEstateCampaignLocalService.deleteCExtRealEstateCampaign(cExtRealEstateCampaignPK);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtRealEstateCampaignLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cExtRealEstateCampaignLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cExtRealEstateCampaignLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _cExtRealEstateCampaignLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _cExtRealEstateCampaignLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cExtRealEstateCampaignLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _cExtRealEstateCampaignLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ucc.portal.model.CExtRealEstateCampaign fetchCExtRealEstateCampaign(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK) {
		return _cExtRealEstateCampaignLocalService.fetchCExtRealEstateCampaign(cExtRealEstateCampaignPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cExtRealEstateCampaignLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the c ext real estate campaign with the primary key.
	*
	* @param cExtRealEstateCampaignPK the primary key of the c ext real estate campaign
	* @return the c ext real estate campaign
	* @throws PortalException if a c ext real estate campaign with the primary key could not be found
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign getCExtRealEstateCampaign(
		ucc.portal.service.persistence.CExtRealEstateCampaignPK cExtRealEstateCampaignPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtRealEstateCampaignLocalService.getCExtRealEstateCampaign(cExtRealEstateCampaignPK);
	}

	/**
	* Returns a range of all the c ext real estate campaigns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ucc.portal.model.impl.CExtRealEstateCampaignModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of c ext real estate campaigns
	* @param end the upper bound of the range of c ext real estate campaigns (not inclusive)
	* @return the range of c ext real estate campaigns
	*/
	@Override
	public java.util.List<ucc.portal.model.CExtRealEstateCampaign> getCExtRealEstateCampaigns(
		int start, int end) {
		return _cExtRealEstateCampaignLocalService.getCExtRealEstateCampaigns(start,
			end);
	}

	/**
	* Returns the number of c ext real estate campaigns.
	*
	* @return the number of c ext real estate campaigns
	*/
	@Override
	public int getCExtRealEstateCampaignsCount() {
		return _cExtRealEstateCampaignLocalService.getCExtRealEstateCampaignsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cExtRealEstateCampaignLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _cExtRealEstateCampaignLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cExtRealEstateCampaignLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the c ext real estate campaign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cExtRealEstateCampaign the c ext real estate campaign
	* @return the c ext real estate campaign that was updated
	*/
	@Override
	public ucc.portal.model.CExtRealEstateCampaign updateCExtRealEstateCampaign(
		ucc.portal.model.CExtRealEstateCampaign cExtRealEstateCampaign) {
		return _cExtRealEstateCampaignLocalService.updateCExtRealEstateCampaign(cExtRealEstateCampaign);
	}

	@Override
	public CExtRealEstateCampaignLocalService getWrappedService() {
		return _cExtRealEstateCampaignLocalService;
	}

	@Override
	public void setWrappedService(
		CExtRealEstateCampaignLocalService cExtRealEstateCampaignLocalService) {
		_cExtRealEstateCampaignLocalService = cExtRealEstateCampaignLocalService;
	}

	private CExtRealEstateCampaignLocalService _cExtRealEstateCampaignLocalService;
}