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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringUtil;
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
import java.util.Objects;
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
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPrimaryEmailAddress",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPrimaryEmailAddress",
			new String[] { String.class.getName() },
			ContactModelImpl.PRIMARYEMAILADDRESS_COLUMN_BITMASK |
			ContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPrimaryEmailAddress",
			new String[] { String.class.getName() });

	/**
	 * Returns all the contacts where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @return the matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddress(String primaryEmailAddress) {
		return findByPrimaryEmailAddress(primaryEmailAddress,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddress(String primaryEmailAddress,
		int start, int end) {
		return findByPrimaryEmailAddress(primaryEmailAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddress(String primaryEmailAddress,
		int start, int end, OrderByComparator<Contact> orderByComparator) {
		return findByPrimaryEmailAddress(primaryEmailAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contacts where primaryEmailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddress(String primaryEmailAddress,
		int start, int end, OrderByComparator<Contact> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS;
			finderArgs = new Object[] { primaryEmailAddress };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS;
			finderArgs = new Object[] {
					primaryEmailAddress,
					
					start, end, orderByComparator
				};
		}

		List<Contact> list = null;

		if (retrieveFromCache) {
			list = (List<Contact>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Contact contact : list) {
					if (!Objects.equals(primaryEmailAddress,
								contact.getPrimaryEmailAddress())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

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
	 * Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByPrimaryEmailAddress_First(String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByPrimaryEmailAddress_First(primaryEmailAddress,
				orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByPrimaryEmailAddress_First(
		String primaryEmailAddress, OrderByComparator<Contact> orderByComparator) {
		List<Contact> list = findByPrimaryEmailAddress(primaryEmailAddress, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByPrimaryEmailAddress_Last(String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByPrimaryEmailAddress_Last(primaryEmailAddress,
				orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByPrimaryEmailAddress_Last(String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator) {
		int count = countByPrimaryEmailAddress(primaryEmailAddress);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByPrimaryEmailAddress(primaryEmailAddress,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where primaryEmailAddress = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param primaryEmailAddress the primary email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact[] findByPrimaryEmailAddress_PrevAndNext(long contactId,
		String primaryEmailAddress, OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = findByPrimaryKey(contactId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByPrimaryEmailAddress_PrevAndNext(session, contact,
					primaryEmailAddress, orderByComparator, true);

			array[1] = contact;

			array[2] = getByPrimaryEmailAddress_PrevAndNext(session, contact,
					primaryEmailAddress, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contact getByPrimaryEmailAddress_PrevAndNext(Session session,
		Contact contact, String primaryEmailAddress,
		OrderByComparator<Contact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

		boolean bindPrimaryEmailAddress = false;

		if (primaryEmailAddress == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
		}
		else if (primaryEmailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
		}
		else {
			bindPrimaryEmailAddress = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPrimaryEmailAddress) {
			qPos.add(primaryEmailAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where primaryEmailAddress = &#63; from the database.
	 *
	 * @param primaryEmailAddress the primary email address
	 */
	@Override
	public void removeByPrimaryEmailAddress(String primaryEmailAddress) {
		for (Contact contact : findByPrimaryEmailAddress(primaryEmailAddress,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where primaryEmailAddress = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @return the number of matching contacts
	 */
	@Override
	public int countByPrimaryEmailAddress(String primaryEmailAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS;

		Object[] finderArgs = new Object[] { primaryEmailAddress };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_1 =
		"contact.primaryEmailAddress IS NULL";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_2 =
		"contact.primaryEmailAddress = ?";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESS_PRIMARYEMAILADDRESS_3 =
		"(contact.primaryEmailAddress IS NULL OR contact.primaryEmailAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { String.class.getName() },
			ContactModelImpl.STATUS_COLUMN_BITMASK |
			ContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the contacts where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching contacts
	 */
	@Override
	public List<Contact> findByStatus(String status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	@Override
	public List<Contact> findByStatus(String status, int start, int end) {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByStatus(String status, int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contacts where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByStatus(String status, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<Contact> list = null;

		if (retrieveFromCache) {
			list = (List<Contact>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Contact contact : list) {
					if (!Objects.equals(status, contact.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONTACT_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

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
	 * Returns the first contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByStatus_First(String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByStatus_First(status, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByStatus_First(String status,
		OrderByComparator<Contact> orderByComparator) {
		List<Contact> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByStatus_Last(String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByStatus_Last(status, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByStatus_Last(String status,
		OrderByComparator<Contact> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where status = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact[] findByStatus_PrevAndNext(long contactId, String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = findByPrimaryKey(contactId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByStatus_PrevAndNext(session, contact, status,
					orderByComparator, true);

			array[1] = contact;

			array[2] = getByStatus_PrevAndNext(session, contact, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contact getByStatus_PrevAndNext(Session session, Contact contact,
		String status, OrderByComparator<Contact> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(String status) {
		for (Contact contact : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching contacts
	 */
	@Override
	public int countByStatus(String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTACT_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "contact.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "contact.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(contact.status IS NULL OR contact.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPrimaryEmailAddressAndStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPrimaryEmailAddressAndStatus",
			new String[] { String.class.getName(), String.class.getName() },
			ContactModelImpl.PRIMARYEMAILADDRESS_COLUMN_BITMASK |
			ContactModelImpl.STATUS_COLUMN_BITMASK |
			ContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPrimaryEmailAddressAndStatus",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @return the matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return findByPrimaryEmailAddressAndStatus(primaryEmailAddress, status,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS;
			finderArgs = new Object[] { primaryEmailAddress, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS;
			finderArgs = new Object[] {
					primaryEmailAddress, status,
					
					start, end, orderByComparator
				};
		}

		List<Contact> list = null;

		if (retrieveFromCache) {
			list = (List<Contact>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Contact contact : list) {
					if (!Objects.equals(primaryEmailAddress,
								contact.getPrimaryEmailAddress()) ||
							!Objects.equals(status, contact.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

				if (bindStatus) {
					qPos.add(status);
				}

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
	 * Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByPrimaryEmailAddressAndStatus_First(primaryEmailAddress,
				status, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByPrimaryEmailAddressAndStatus_First(
		String primaryEmailAddress, String status,
		OrderByComparator<Contact> orderByComparator) {
		List<Contact> list = findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByPrimaryEmailAddressAndStatus_Last(primaryEmailAddress,
				status, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("primaryEmailAddress=");
		msg.append(primaryEmailAddress);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByPrimaryEmailAddressAndStatus_Last(
		String primaryEmailAddress, String status,
		OrderByComparator<Contact> orderByComparator) {
		int count = countByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByPrimaryEmailAddressAndStatus(primaryEmailAddress,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact[] findByPrimaryEmailAddressAndStatus_PrevAndNext(
		long contactId, String primaryEmailAddress, String status,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = findByPrimaryKey(contactId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByPrimaryEmailAddressAndStatus_PrevAndNext(session,
					contact, primaryEmailAddress, status, orderByComparator,
					true);

			array[1] = contact;

			array[2] = getByPrimaryEmailAddressAndStatus_PrevAndNext(session,
					contact, primaryEmailAddress, status, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contact getByPrimaryEmailAddressAndStatus_PrevAndNext(
		Session session, Contact contact, String primaryEmailAddress,
		String status, OrderByComparator<Contact> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

		boolean bindPrimaryEmailAddress = false;

		if (primaryEmailAddress == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
		}
		else if (primaryEmailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
		}
		else {
			bindPrimaryEmailAddress = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
		}

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPrimaryEmailAddress) {
			qPos.add(primaryEmailAddress);
		}

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where primaryEmailAddress = &#63; and status = &#63; from the database.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 */
	@Override
	public void removeByPrimaryEmailAddressAndStatus(
		String primaryEmailAddress, String status) {
		for (Contact contact : findByPrimaryEmailAddressAndStatus(
				primaryEmailAddress, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where primaryEmailAddress = &#63; and status = &#63;.
	 *
	 * @param primaryEmailAddress the primary email address
	 * @param status the status
	 * @return the number of matching contacts
	 */
	@Override
	public int countByPrimaryEmailAddressAndStatus(String primaryEmailAddress,
		String status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS;

		Object[] finderArgs = new Object[] { primaryEmailAddress, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONTACT_WHERE);

			boolean bindPrimaryEmailAddress = false;

			if (primaryEmailAddress == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1);
			}
			else if (primaryEmailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3);
			}
			else {
				bindPrimaryEmailAddress = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrimaryEmailAddress) {
					qPos.add(primaryEmailAddress);
				}

				if (bindStatus) {
					qPos.add(status);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_1 =
		"contact.primaryEmailAddress IS NULL AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_2 =
		"contact.primaryEmailAddress = ? AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_PRIMARYEMAILADDRESS_3 =
		"(contact.primaryEmailAddress IS NULL OR contact.primaryEmailAddress = '') AND ";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_1 =
		"contact.status IS NULL";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_2 =
		"contact.status = ?";
	private static final String _FINDER_COLUMN_PRIMARYEMAILADDRESSANDSTATUS_STATUS_3 =
		"(contact.status IS NULL OR contact.status = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_CONSTANTCONTACTID = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByConstantContactId",
			new String[] { Long.class.getName() },
			ContactModelImpl.CONSTANTCONTACTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONSTANTCONTACTID = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConstantContactId", new String[] { Long.class.getName() });

	/**
	 * Returns the contact where constantContactId = &#63; or throws a {@link NoSuchContactException} if it could not be found.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByConstantContactId(long constantContactId)
		throws NoSuchContactException {
		Contact contact = fetchByConstantContactId(constantContactId);

		if (contact == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("constantContactId=");
			msg.append(constantContactId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchContactException(msg.toString());
		}

		return contact;
	}

	/**
	 * Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByConstantContactId(long constantContactId) {
		return fetchByConstantContactId(constantContactId, true);
	}

	/**
	 * Returns the contact where constantContactId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param constantContactId the constant contact ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByConstantContactId(long constantContactId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { constantContactId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
					finderArgs, this);
		}

		if (result instanceof Contact) {
			Contact contact = (Contact)result;

			if ((constantContactId != contact.getConstantContactId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

				List<Contact> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"ContactPersistenceImpl.fetchByConstantContactId(long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Contact contact = list.get(0);

					result = contact;

					cacheResult(contact);

					if ((contact.getConstantContactId() != constantContactId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
							finderArgs, contact);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Contact)result;
		}
	}

	/**
	 * Removes the contact where constantContactId = &#63; from the database.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the contact that was removed
	 */
	@Override
	public Contact removeByConstantContactId(long constantContactId)
		throws NoSuchContactException {
		Contact contact = findByConstantContactId(constantContactId);

		return remove(contact);
	}

	/**
	 * Returns the number of contacts where constantContactId = &#63;.
	 *
	 * @param constantContactId the constant contact ID
	 * @return the number of matching contacts
	 */
	@Override
	public int countByConstantContactId(long constantContactId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONSTANTCONTACTID;

		Object[] finderArgs = new Object[] { constantContactId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(constantContactId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CONSTANTCONTACTID_CONSTANTCONTACTID_2 =
		"contact.constantContactId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VIPFLAG = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVipFlag",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG =
		new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, ContactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVipFlag",
			new String[] { Boolean.class.getName() },
			ContactModelImpl.ISVIP_COLUMN_BITMASK |
			ContactModelImpl.LASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VIPFLAG = new FinderPath(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVipFlag",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the contacts where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @return the matching contacts
	 */
	@Override
	public List<Contact> findByVipFlag(boolean isVip) {
		return findByVipFlag(isVip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	@Override
	public List<Contact> findByVipFlag(boolean isVip, int start, int end) {
		return findByVipFlag(isVip, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByVipFlag(boolean isVip, int start, int end,
		OrderByComparator<Contact> orderByComparator) {
		return findByVipFlag(isVip, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contacts where isVip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param isVip the is vip
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contacts
	 */
	@Override
	public List<Contact> findByVipFlag(boolean isVip, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG;
			finderArgs = new Object[] { isVip };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VIPFLAG;
			finderArgs = new Object[] { isVip, start, end, orderByComparator };
		}

		List<Contact> list = null;

		if (retrieveFromCache) {
			list = (List<Contact>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Contact contact : list) {
					if ((isVip != contact.getIsVip())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContactModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isVip);

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
	 * Returns the first contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByVipFlag_First(boolean isVip,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByVipFlag_First(isVip, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isVip=");
		msg.append(isVip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the first contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByVipFlag_First(boolean isVip,
		OrderByComparator<Contact> orderByComparator) {
		List<Contact> list = findByVipFlag(isVip, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	@Override
	public Contact findByVipFlag_Last(boolean isVip,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = fetchByVipFlag_Last(isVip, orderByComparator);

		if (contact != null) {
			return contact;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isVip=");
		msg.append(isVip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContactException(msg.toString());
	}

	/**
	 * Returns the last contact in the ordered set where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	@Override
	public Contact fetchByVipFlag_Last(boolean isVip,
		OrderByComparator<Contact> orderByComparator) {
		int count = countByVipFlag(isVip);

		if (count == 0) {
			return null;
		}

		List<Contact> list = findByVipFlag(isVip, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where isVip = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param isVip the is vip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	@Override
	public Contact[] findByVipFlag_PrevAndNext(long contactId, boolean isVip,
		OrderByComparator<Contact> orderByComparator)
		throws NoSuchContactException {
		Contact contact = findByPrimaryKey(contactId);

		Session session = null;

		try {
			session = openSession();

			Contact[] array = new ContactImpl[3];

			array[0] = getByVipFlag_PrevAndNext(session, contact, isVip,
					orderByComparator, true);

			array[1] = contact;

			array[2] = getByVipFlag_PrevAndNext(session, contact, isVip,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contact getByVipFlag_PrevAndNext(Session session,
		Contact contact, boolean isVip,
		OrderByComparator<Contact> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONTACT_WHERE);

		query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ContactModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isVip);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contact);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Contact> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts where isVip = &#63; from the database.
	 *
	 * @param isVip the is vip
	 */
	@Override
	public void removeByVipFlag(boolean isVip) {
		for (Contact contact : findByVipFlag(isVip, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(contact);
		}
	}

	/**
	 * Returns the number of contacts where isVip = &#63;.
	 *
	 * @param isVip the is vip
	 * @return the number of matching contacts
	 */
	@Override
	public int countByVipFlag(boolean isVip) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VIPFLAG;

		Object[] finderArgs = new Object[] { isVip };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTACT_WHERE);

			query.append(_FINDER_COLUMN_VIPFLAG_ISVIP_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isVip);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_VIPFLAG_ISVIP_2 = "contact.isVip = ?";

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

		finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
			new Object[] { contact.getConstantContactId() }, contact);

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

		clearUniqueFindersCache((ContactModelImpl)contact, true);
	}

	@Override
	public void clearCache(List<Contact> contacts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Contact contact : contacts) {
			entityCache.removeResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
				ContactImpl.class, contact.getPrimaryKey());

			clearUniqueFindersCache((ContactModelImpl)contact, true);
		}
	}

	protected void cacheUniqueFindersCache(ContactModelImpl contactModelImpl) {
		Object[] args = new Object[] { contactModelImpl.getConstantContactId() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID, args,
			contactModelImpl, false);
	}

	protected void clearUniqueFindersCache(ContactModelImpl contactModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] { contactModelImpl.getConstantContactId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
				args);
		}

		if ((contactModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CONSTANTCONTACTID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					contactModelImpl.getOriginalConstantContactId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CONSTANTCONTACTID,
				args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_CONSTANTCONTACTID,
				args);
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

		if (!ContactModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					contactModelImpl.getPrimaryEmailAddress()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
				args);

			args = new Object[] { contactModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] {
					contactModelImpl.getPrimaryEmailAddress(),
					contactModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
				args);

			args = new Object[] { contactModelImpl.getIsVip() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalPrimaryEmailAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
					args);

				args = new Object[] { contactModelImpl.getPrimaryEmailAddress() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESS,
					args);
			}

			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { contactModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contactModelImpl.getOriginalPrimaryEmailAddress(),
						contactModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);

				args = new Object[] {
						contactModelImpl.getPrimaryEmailAddress(),
						contactModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRIMARYEMAILADDRESSANDSTATUS,
					args);
			}

			if ((contactModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { contactModelImpl.getOriginalIsVip() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
					args);

				args = new Object[] { contactModelImpl.getIsVip() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VIPFLAG, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VIPFLAG,
					args);
			}
		}

		entityCache.putResult(ContactModelImpl.ENTITY_CACHE_ENABLED,
			ContactImpl.class, contact.getPrimaryKey(), contact, false);

		clearUniqueFindersCache(contactModelImpl, false);
		cacheUniqueFindersCache(contactModelImpl);

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
	private static final String _SQL_SELECT_CONTACT_WHERE = "SELECT contact FROM Contact contact WHERE ";
	private static final String _SQL_COUNT_CONTACT = "SELECT COUNT(contact) FROM Contact contact";
	private static final String _SQL_COUNT_CONTACT_WHERE = "SELECT COUNT(contact) FROM Contact contact WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Contact exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Contact exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ContactPersistenceImpl.class);
}