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

package contact.manager.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import contact.manager.exception.NoSuchCrmKioskSurveyException;

import contact.manager.model.CrmKioskSurvey;

/**
 * The persistence interface for the CRM Kiosk Survey service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.persistence.impl.CrmKioskSurveyPersistenceImpl
 * @see CrmKioskSurveyUtil
 * @generated
 */
@ProviderType
public interface CrmKioskSurveyPersistence extends BasePersistence<CrmKioskSurvey> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrmKioskSurveyUtil} to access the CRM Kiosk Survey persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63;.
	*
	* @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public CrmKioskSurvey[] findByUuid_PrevAndNext(long crmKioskSurveyId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Removes all the CRM Kiosk Surveies where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching CRM Kiosk Surveies
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the CRM Kiosk Survey where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the CRM Kiosk Survey that was removed
	*/
	public CrmKioskSurvey removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching CRM Kiosk Surveies
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the first CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the last CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching CRM Kiosk Survey, or <code>null</code> if a matching CRM Kiosk Survey could not be found
	*/
	public CrmKioskSurvey fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns the CRM Kiosk Surveies before and after the current CRM Kiosk Survey in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param crmKioskSurveyId the primary key of the current CRM Kiosk Survey
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public CrmKioskSurvey[] findByUuid_C_PrevAndNext(long crmKioskSurveyId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Removes all the CRM Kiosk Surveies where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of CRM Kiosk Surveies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching CRM Kiosk Surveies
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the CRM Kiosk Survey in the entity cache if it is enabled.
	*
	* @param crmKioskSurvey the CRM Kiosk Survey
	*/
	public void cacheResult(CrmKioskSurvey crmKioskSurvey);

	/**
	* Caches the CRM Kiosk Surveies in the entity cache if it is enabled.
	*
	* @param crmKioskSurveies the CRM Kiosk Surveies
	*/
	public void cacheResult(java.util.List<CrmKioskSurvey> crmKioskSurveies);

	/**
	* Creates a new CRM Kiosk Survey with the primary key. Does not add the CRM Kiosk Survey to the database.
	*
	* @param crmKioskSurveyId the primary key for the new CRM Kiosk Survey
	* @return the new CRM Kiosk Survey
	*/
	public CrmKioskSurvey create(long crmKioskSurveyId);

	/**
	* Removes the CRM Kiosk Survey with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey that was removed
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public CrmKioskSurvey remove(long crmKioskSurveyId)
		throws NoSuchCrmKioskSurveyException;

	public CrmKioskSurvey updateImpl(CrmKioskSurvey crmKioskSurvey);

	/**
	* Returns the CRM Kiosk Survey with the primary key or throws a {@link NoSuchCrmKioskSurveyException} if it could not be found.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey
	* @throws NoSuchCrmKioskSurveyException if a CRM Kiosk Survey with the primary key could not be found
	*/
	public CrmKioskSurvey findByPrimaryKey(long crmKioskSurveyId)
		throws NoSuchCrmKioskSurveyException;

	/**
	* Returns the CRM Kiosk Survey with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param crmKioskSurveyId the primary key of the CRM Kiosk Survey
	* @return the CRM Kiosk Survey, or <code>null</code> if a CRM Kiosk Survey with the primary key could not be found
	*/
	public CrmKioskSurvey fetchByPrimaryKey(long crmKioskSurveyId);

	@Override
	public java.util.Map<java.io.Serializable, CrmKioskSurvey> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the CRM Kiosk Surveies.
	*
	* @return the CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findAll();

	/**
	* Returns a range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @return the range of CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findAll(int start, int end);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator);

	/**
	* Returns an ordered range of all the CRM Kiosk Surveies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CrmKioskSurveyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of CRM Kiosk Surveies
	* @param end the upper bound of the range of CRM Kiosk Surveies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of CRM Kiosk Surveies
	*/
	public java.util.List<CrmKioskSurvey> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CrmKioskSurvey> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the CRM Kiosk Surveies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of CRM Kiosk Surveies.
	*
	* @return the number of CRM Kiosk Surveies
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}