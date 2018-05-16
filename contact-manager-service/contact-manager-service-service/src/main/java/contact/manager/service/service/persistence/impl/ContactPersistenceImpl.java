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

package contact.manager.service.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.service.persistence.impl.TableMapper;
import com.liferay.portal.kernel.service.persistence.impl.TableMapperFactory;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.service.exception.NoSuchContactException;
import contact.manager.service.model.Contact;
import contact.manager.service.model.impl.ContactImpl;
import contact.manager.service.model.impl.ContactModelImpl;
import contact.manager.service.service.persistence.CmapSubGroupPersistence;
import contact.manager.service.service.persistence.CmapTagPersistence;
import contact.manager.service.service.persistence.ContactPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactPersistence
 * @see contact.manager.service.service.persistence.ContactUtil
 * @generated
 */
@ProviderType
public class ContactPersistenceImpl extends BasePersistenceImpl<Contact>
	implements ContactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ContactPersistenceImpl() {
		setModelClass(Contact.class);
	}

	/**
	 * Caches the contact in the entity cache if it is enabled.
	 *
	 * @param contact the contact
	 */
	@Override
	public void cacheResult(Contact contact) {
		entityCache.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey(), contact);

		contact.resetOriginalValues();
	}

	/**
	 * Caches the contacts in the entity cache if it is enabled.
	 *
	 * @param contacts the contacts
	 */
	@Override
	public void cacheResult(List<Contact> contacts) {
		for (Contact contact : contacts) {
			if (entityCache.getResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
						ContactImpl.class, contact.getPrimaryKey()) == null) {
				cacheResult(contact);
			}
			else {
				contact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contacts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ContactImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contact.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Contact contact) {
		entityCache.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Contact> contacts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Contact contact : contacts) {
			entityCache.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
				ContactImpl.class, contact.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param contactId the primary key for the new contact
	 * @return the new contact
	 */
	@Override
	public Contact create(long contactId) {
		Contact contact = new ContactImpl();

		contact.setNew(true);
		contact.setPrimaryKey(contactId);

		contact.setCompanyId(companyProvider.getCompanyId());

		return contact;
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact that was removed
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact remove(long contactId) throws NoSuchContactException {
		return remove((Serializable)contactId);
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact that was removed
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact remove(Serializable primaryKey)
		throws NoSuchContactException {
		Session session = null;

		try {
			session = openSession();

			Contact contact = (Contact)session.get(ContactImpl.class, primaryKey);

			if (contact == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contact);
		}
		catch (NoSuchContactException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Contact removeImpl(Contact contact) {
		contact = toUnwrappedModel(contact);

		contactToCmapTagTableMapper.deleteLeftPrimaryKeyTableMappings(contact.getPrimaryKey());

		contactToCmapSubGroupTableMapper.deleteLeftPrimaryKeyTableMappings(contact.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contact)) {
				contact = (Contact)session.get(ContactImpl.class,
						contact.getPrimaryKeyObj());
			}

			if (contact != null) {
				session.delete(contact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contact != null) {
			clearCache(contact);
		}

		return contact;
	}

	@Override
	public Contact updateImpl(Contact contact) {
		contact = toUnwrappedModel(contact);

		boolean isNew = contact.isNew();

		ContactModelImpl contactModelImpl = (ContactModelImpl)contact;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (contact.getCreateDate() == null)) {
			if (serviceContext == null) {
				contact.setCreateDate(now);
			}
			else {
				contact.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!contactModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				contact.setModifiedDate(now);
			}
			else {
				contact.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (contact.isNew()) {
				session.save(contact);

				contact.setNew(false);
			}
			else {
				contact = (Contact)session.merge(contact);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey(), contact, false);

		contact.resetOriginalValues();

		return contact;
	}

	protected Contact toUnwrappedModel(Contact contact) {
		if (contact instanceof ContactImpl) {
			return contact;
		}

		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setNew(contact.isNew());
		contactImpl.setPrimaryKey(contact.getPrimaryKey());

		contactImpl.setContactId(contact.getContactId());
		contactImpl.setConstantContactId(contact.getConstantContactId());
		contactImpl.setGroupId(contact.getGroupId());
		contactImpl.setCompanyId(contact.getCompanyId());
		contactImpl.setUserId(contact.getUserId());
		contactImpl.setCreateDate(contact.getCreateDate());
		contactImpl.setModifiedDate(contact.getModifiedDate());
		contactImpl.setPrefix(contact.getPrefix());
		contactImpl.setSalutation(contact.getSalutation());
		contactImpl.setFirstName(contact.getFirstName());
		contactImpl.setMiddleName(contact.getMiddleName());
		contactImpl.setLastName(contact.getLastName());
		contactImpl.setOrganization(contact.getOrganization());
		contactImpl.setJobTitle(contact.getJobTitle());
		contactImpl.setPrimaryAddress1(contact.getPrimaryAddress1());
		contactImpl.setPrimaryAddress2(contact.getPrimaryAddress2());
		contactImpl.setPrimaryAddressCity(contact.getPrimaryAddressCity());
		contactImpl.setPrimaryAddressState(contact.getPrimaryAddressState());
		contactImpl.setPrimaryAddressZip(contact.getPrimaryAddressZip());
		contactImpl.setPrimaryAddressCounty(contact.getPrimaryAddressCounty());
		contactImpl.setPrimaryAddressCountry(contact.getPrimaryAddressCountry());
		contactImpl.setSecondaryAddress1(contact.getSecondaryAddress1());
		contactImpl.setSecondaryAddress2(contact.getSecondaryAddress2());
		contactImpl.setSecondaryAddressCity(contact.getSecondaryAddressCity());
		contactImpl.setSecondaryAddressState(contact.getSecondaryAddressState());
		contactImpl.setSecondaryAddressZip(contact.getSecondaryAddressZip());
		contactImpl.setSecondaryAddressCounty(contact.getSecondaryAddressCounty());
		contactImpl.setSecondaryAddressCountry(contact.getSecondaryAddressCountry());
		contactImpl.setPrimaryPhone(contact.getPrimaryPhone());
		contactImpl.setPrimaryFax(contact.getPrimaryFax());
		contactImpl.setPrimaryCell(contact.getPrimaryCell());
		contactImpl.setPrimaryEmailAddress(contact.getPrimaryEmailAddress());
		contactImpl.setAlternateContact(contact.getAlternateContact());
		contactImpl.setAlternateEmail(contact.getAlternateEmail());
		contactImpl.setIsVip(contact.isIsVip());
		contactImpl.setFacebookId(contact.getFacebookId());
		contactImpl.setTwitterHandle(contact.getTwitterHandle());
		contactImpl.setLinkedInUrl(contact.getLinkedInUrl());
		contactImpl.setStatus(contact.getStatus());
		contactImpl.setKioskUuid(contact.getKioskUuid());
		contactImpl.setImageFileEntryId(contact.getImageFileEntryId());
		contactImpl.setTagsList(contact.getTagsList());
		contactImpl.setSubGroupsList(contact.getSubGroupsList());

		return contactImpl;
	}

	/**
	 * Returns the contact with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContactException {
		Contact contact = fetchByPrimaryKey(primaryKey);

		if (contact == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contact;
	}

	/**
	 * Returns the contact with the primary key or throws a {@link NoSuchContactException} if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact findByPrimaryKey(long contactId)
		throws NoSuchContactException {
		return findByPrimaryKey((Serializable)contactId);
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 */
	@Override
	public Contact fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
				ContactImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Contact contact = (Contact)serializable;

		if (contact == null) {
			Session session = null;

			try {
				session = openSession();

				contact = (Contact)session.get(ContactImpl.class, primaryKey);

				if (contact != null) {
					cacheResult(contact);
				}
				else {
					entityCache.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
						ContactImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
					ContactImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contact;
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 */
	@Override
	public Contact fetchByPrimaryKey(long contactId) {
		return fetchByPrimaryKey((Serializable)contactId);
	}

	@Override
	public Map<Serializable, Contact> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Contact> map = new HashMap<Serializable, Contact>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Contact contact = fetchByPrimaryKey(primaryKey);

			if (contact != null) {
				map.put(primaryKey, contact);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
					ContactImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Contact)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTACT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Contact contact : (List<Contact>)q.list()) {
				map.put(contact.getPrimaryKeyObj(), contact);

				cacheResult(contact);

				uncachedPrimaryKeys.remove(contact.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
					ContactImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the contacts.
	 *
	 * @return the contacts
	 */
	@Override
	public List<Contact> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of contacts
	 */
	@Override
	public List<Contact> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contacts
	 */
	@Override
	public List<Contact> findAll(int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contacts
	 */
	@Override
	public List<Contact> findAll(int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Contact> list = null;

		if (retrieveFromCache) {
			list = (List<Contact>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACT;

				if (pagination) {
					sql = sql.concat(ContactModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Contact>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the contacts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Contact contact : findAll()) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTACT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the primaryKeys of cmap tags associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return long[] of the primaryKeys of cmap tags associated with the contact
	 */
	@Override
	public long[] getCmapTagPrimaryKeys(long pk) {
		long[] pks = contactToCmapTagTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the cmap tags associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return the cmap tags associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapTag> getCmapTags(long pk) {
		return getCmapTags(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the cmap tags associated with the contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the contact
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of cmap tags associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapTag> getCmapTags(long pk,
		int start, int end) {
		return getCmapTags(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap tags associated with the contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the contact
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmap tags associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapTag> getCmapTags(long pk,
		int start, int end,
		OrderByComparator<contact.manager.service.model.CmapTag> orderByComparator) {
		return contactToCmapTagTableMapper.getRightBaseModels(pk, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of cmap tags associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return the number of cmap tags associated with the contact
	 */
	@Override
	public int getCmapTagsSize(long pk) {
		long[] pks = contactToCmapTagTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the cmap tag is associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPK the primary key of the cmap tag
	 * @return <code>true</code> if the cmap tag is associated with the contact; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCmapTag(long pk, long cmapTagPK) {
		return contactToCmapTagTableMapper.containsTableMapping(pk, cmapTagPK);
	}

	/**
	 * Returns <code>true</code> if the contact has any cmap tags associated with it.
	 *
	 * @param pk the primary key of the contact to check for associations with cmap tags
	 * @return <code>true</code> if the contact has any cmap tags associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCmapTags(long pk) {
		if (getCmapTagsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPK the primary key of the cmap tag
	 */
	@Override
	public void addCmapTag(long pk, long cmapTagPK) {
		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			contactToCmapTagTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, cmapTagPK);
		}
		else {
			contactToCmapTagTableMapper.addTableMapping(contact.getCompanyId(),
				pk, cmapTagPK);
		}
	}

	/**
	 * Adds an association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTag the cmap tag
	 */
	@Override
	public void addCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag) {
		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			contactToCmapTagTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, cmapTag.getPrimaryKey());
		}
		else {
			contactToCmapTagTableMapper.addTableMapping(contact.getCompanyId(),
				pk, cmapTag.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPKs the primary keys of the cmap tags
	 */
	@Override
	public void addCmapTags(long pk, long[] cmapTagPKs) {
		long companyId = 0;

		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = contact.getCompanyId();
		}

		contactToCmapTagTableMapper.addTableMappings(companyId, pk, cmapTagPKs);
	}

	/**
	 * Adds an association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTags the cmap tags
	 */
	@Override
	public void addCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		addCmapTags(pk,
			ListUtil.toLongArray(cmapTags,
				contact.manager.service.model.CmapTag.TAG_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the contact and its cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact to clear the associated cmap tags from
	 */
	@Override
	public void clearCmapTags(long pk) {
		contactToCmapTagTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPK the primary key of the cmap tag
	 */
	@Override
	public void removeCmapTag(long pk, long cmapTagPK) {
		contactToCmapTagTableMapper.deleteTableMapping(pk, cmapTagPK);
	}

	/**
	 * Removes the association between the contact and the cmap tag. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTag the cmap tag
	 */
	@Override
	public void removeCmapTag(long pk,
		contact.manager.service.model.CmapTag cmapTag) {
		contactToCmapTagTableMapper.deleteTableMapping(pk,
			cmapTag.getPrimaryKey());
	}

	/**
	 * Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPKs the primary keys of the cmap tags
	 */
	@Override
	public void removeCmapTags(long pk, long[] cmapTagPKs) {
		contactToCmapTagTableMapper.deleteTableMappings(pk, cmapTagPKs);
	}

	/**
	 * Removes the association between the contact and the cmap tags. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTags the cmap tags
	 */
	@Override
	public void removeCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		removeCmapTags(pk,
			ListUtil.toLongArray(cmapTags,
				contact.manager.service.model.CmapTag.TAG_ID_ACCESSOR));
	}

	/**
	 * Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTagPKs the primary keys of the cmap tags to be associated with the contact
	 */
	@Override
	public void setCmapTags(long pk, long[] cmapTagPKs) {
		Set<Long> newCmapTagPKsSet = SetUtil.fromArray(cmapTagPKs);
		Set<Long> oldCmapTagPKsSet = SetUtil.fromArray(contactToCmapTagTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCmapTagPKsSet = new HashSet<Long>(oldCmapTagPKsSet);

		removeCmapTagPKsSet.removeAll(newCmapTagPKsSet);

		contactToCmapTagTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeCmapTagPKsSet));

		newCmapTagPKsSet.removeAll(oldCmapTagPKsSet);

		long companyId = 0;

		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = contact.getCompanyId();
		}

		contactToCmapTagTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newCmapTagPKsSet));
	}

	/**
	 * Sets the cmap tags associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapTags the cmap tags to be associated with the contact
	 */
	@Override
	public void setCmapTags(long pk,
		List<contact.manager.service.model.CmapTag> cmapTags) {
		try {
			long[] cmapTagPKs = new long[cmapTags.size()];

			for (int i = 0; i < cmapTags.size(); i++) {
				contact.manager.service.model.CmapTag cmapTag = cmapTags.get(i);

				cmapTagPKs[i] = cmapTag.getPrimaryKey();
			}

			setCmapTags(pk, cmapTagPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	/**
	 * Returns the primaryKeys of cmap sub groups associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return long[] of the primaryKeys of cmap sub groups associated with the contact
	 */
	@Override
	public long[] getCmapSubGroupPrimaryKeys(long pk) {
		long[] pks = contactToCmapSubGroupTableMapper.getRightPrimaryKeys(pk);

		return pks.clone();
	}

	/**
	 * Returns all the cmap sub groups associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return the cmap sub groups associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk) {
		return getCmapSubGroups(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the cmap sub groups associated with the contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the contact
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of cmap sub groups associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end) {
		return getCmapSubGroups(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cmap sub groups associated with the contact.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the contact
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmap sub groups associated with the contact
	 */
	@Override
	public List<contact.manager.service.model.CmapSubGroup> getCmapSubGroups(
		long pk, int start, int end,
		OrderByComparator<contact.manager.service.model.CmapSubGroup> orderByComparator) {
		return contactToCmapSubGroupTableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of cmap sub groups associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @return the number of cmap sub groups associated with the contact
	 */
	@Override
	public int getCmapSubGroupsSize(long pk) {
		long[] pks = contactToCmapSubGroupTableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the cmap sub group is associated with the contact.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPK the primary key of the cmap sub group
	 * @return <code>true</code> if the cmap sub group is associated with the contact; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCmapSubGroup(long pk, long cmapSubGroupPK) {
		return contactToCmapSubGroupTableMapper.containsTableMapping(pk,
			cmapSubGroupPK);
	}

	/**
	 * Returns <code>true</code> if the contact has any cmap sub groups associated with it.
	 *
	 * @param pk the primary key of the contact to check for associations with cmap sub groups
	 * @return <code>true</code> if the contact has any cmap sub groups associated with it; <code>false</code> otherwise
	 */
	@Override
	public boolean containsCmapSubGroups(long pk) {
		if (getCmapSubGroupsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPK the primary key of the cmap sub group
	 */
	@Override
	public void addCmapSubGroup(long pk, long cmapSubGroupPK) {
		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			contactToCmapSubGroupTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, cmapSubGroupPK);
		}
		else {
			contactToCmapSubGroupTableMapper.addTableMapping(contact.getCompanyId(),
				pk, cmapSubGroupPK);
		}
	}

	/**
	 * Adds an association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroup the cmap sub group
	 */
	@Override
	public void addCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			contactToCmapSubGroupTableMapper.addTableMapping(companyProvider.getCompanyId(),
				pk, cmapSubGroup.getPrimaryKey());
		}
		else {
			contactToCmapSubGroupTableMapper.addTableMapping(contact.getCompanyId(),
				pk, cmapSubGroup.getPrimaryKey());
		}
	}

	/**
	 * Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPKs the primary keys of the cmap sub groups
	 */
	@Override
	public void addCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		long companyId = 0;

		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = contact.getCompanyId();
		}

		contactToCmapSubGroupTableMapper.addTableMappings(companyId, pk,
			cmapSubGroupPKs);
	}

	/**
	 * Adds an association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroups the cmap sub groups
	 */
	@Override
	public void addCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		addCmapSubGroups(pk,
			ListUtil.toLongArray(cmapSubGroups,
				contact.manager.service.model.CmapSubGroup.SUB_GROUP_ID_ACCESSOR));
	}

	/**
	 * Clears all associations between the contact and its cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact to clear the associated cmap sub groups from
	 */
	@Override
	public void clearCmapSubGroups(long pk) {
		contactToCmapSubGroupTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPK the primary key of the cmap sub group
	 */
	@Override
	public void removeCmapSubGroup(long pk, long cmapSubGroupPK) {
		contactToCmapSubGroupTableMapper.deleteTableMapping(pk, cmapSubGroupPK);
	}

	/**
	 * Removes the association between the contact and the cmap sub group. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroup the cmap sub group
	 */
	@Override
	public void removeCmapSubGroup(long pk,
		contact.manager.service.model.CmapSubGroup cmapSubGroup) {
		contactToCmapSubGroupTableMapper.deleteTableMapping(pk,
			cmapSubGroup.getPrimaryKey());
	}

	/**
	 * Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPKs the primary keys of the cmap sub groups
	 */
	@Override
	public void removeCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		contactToCmapSubGroupTableMapper.deleteTableMappings(pk, cmapSubGroupPKs);
	}

	/**
	 * Removes the association between the contact and the cmap sub groups. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroups the cmap sub groups
	 */
	@Override
	public void removeCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		removeCmapSubGroups(pk,
			ListUtil.toLongArray(cmapSubGroups,
				contact.manager.service.model.CmapSubGroup.SUB_GROUP_ID_ACCESSOR));
	}

	/**
	 * Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroupPKs the primary keys of the cmap sub groups to be associated with the contact
	 */
	@Override
	public void setCmapSubGroups(long pk, long[] cmapSubGroupPKs) {
		Set<Long> newCmapSubGroupPKsSet = SetUtil.fromArray(cmapSubGroupPKs);
		Set<Long> oldCmapSubGroupPKsSet = SetUtil.fromArray(contactToCmapSubGroupTableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCmapSubGroupPKsSet = new HashSet<Long>(oldCmapSubGroupPKsSet);

		removeCmapSubGroupPKsSet.removeAll(newCmapSubGroupPKsSet);

		contactToCmapSubGroupTableMapper.deleteTableMappings(pk,
			ArrayUtil.toLongArray(removeCmapSubGroupPKsSet));

		newCmapSubGroupPKsSet.removeAll(oldCmapSubGroupPKsSet);

		long companyId = 0;

		Contact contact = fetchByPrimaryKey(pk);

		if (contact == null) {
			companyId = companyProvider.getCompanyId();
		}
		else {
			companyId = contact.getCompanyId();
		}

		contactToCmapSubGroupTableMapper.addTableMappings(companyId, pk,
			ArrayUtil.toLongArray(newCmapSubGroupPKsSet));
	}

	/**
	 * Sets the cmap sub groups associated with the contact, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the contact
	 * @param cmapSubGroups the cmap sub groups to be associated with the contact
	 */
	@Override
	public void setCmapSubGroups(long pk,
		List<contact.manager.service.model.CmapSubGroup> cmapSubGroups) {
		try {
			long[] cmapSubGroupPKs = new long[cmapSubGroups.size()];

			for (int i = 0; i < cmapSubGroups.size(); i++) {
				contact.manager.service.model.CmapSubGroup cmapSubGroup = cmapSubGroups.get(i);

				cmapSubGroupPKs[i] = cmapSubGroup.getPrimaryKey();
			}

			setCmapSubGroups(pk, cmapSubGroupPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ContactModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contact persistence.
	 */
	public void afterPropertiesSet() {
		contactToCmapTagTableMapper = TableMapperFactory.getTableMapper("contactmanager_Contacts_Tags",
				"companyId", "contactId", "tagId", this, cmapTagPersistence);

		contactToCmapSubGroupTableMapper = TableMapperFactory.getTableMapper("contactmanager_Contacts_CmapSubGroups",
				"companyId", "contactId", "subGroupId", this,
				cmapSubGroupPersistence);
	}

	public void destroy() {
		entityCache.removeCache(ContactImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("contactmanager_Contacts_Tags");
		TableMapperFactory.removeTableMapper(
			"contactmanager_Contacts_CmapSubGroups");
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	@BeanReference(type = CmapTagPersistence.class)
	protected CmapTagPersistence cmapTagPersistence;
	protected TableMapper<Contact, contact.manager.service.model.CmapTag> contactToCmapTagTableMapper;
	@BeanReference(type = CmapSubGroupPersistence.class)
	protected CmapSubGroupPersistence cmapSubGroupPersistence;
	protected TableMapper<Contact, contact.manager.service.model.CmapSubGroup> contactToCmapSubGroupTableMapper;
	private static final String _SQL_SELECT_CONTACT = "SELECT contact FROM Contact contact";
	private static final String _SQL_SELECT_CONTACT_WHERE_PKS_IN = "SELECT contact FROM Contact contact WHERE contactId IN (";
	private static final String _SQL_COUNT_CONTACT = "SELECT COUNT(contact) FROM Contact contact";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Contact exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ContactPersistenceImpl.class);
}