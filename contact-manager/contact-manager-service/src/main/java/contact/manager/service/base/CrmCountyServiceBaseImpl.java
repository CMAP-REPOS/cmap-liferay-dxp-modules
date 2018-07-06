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

package contact.manager.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import contact.manager.model.CrmCounty;

import contact.manager.service.CrmCountyService;
import contact.manager.service.persistence.CrmCCAPersistence;
import contact.manager.service.persistence.CrmChiWardPersistence;
import contact.manager.service.persistence.CrmContactAuditLogChangePersistence;
import contact.manager.service.persistence.CrmContactAuditLogPersistence;
import contact.manager.service.persistence.CrmContactPersistence;
import contact.manager.service.persistence.CrmCountyCommissionerPersistence;
import contact.manager.service.persistence.CrmCountyPersistence;
import contact.manager.service.persistence.CrmGroupPersistence;
import contact.manager.service.persistence.CrmLTAPersistence;
import contact.manager.service.persistence.CrmMuniPersistence;
import contact.manager.service.persistence.CrmNotePersistence;
import contact.manager.service.persistence.CrmOutreachLogPersistence;
import contact.manager.service.persistence.CrmStateRepPersistence;
import contact.manager.service.persistence.CrmStateSenatePersistence;
import contact.manager.service.persistence.CrmTagPersistence;
import contact.manager.service.persistence.CrmUsRepPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the CRM County remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link contact.manager.service.impl.CrmCountyServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see contact.manager.service.impl.CrmCountyServiceImpl
 * @see contact.manager.service.CrmCountyServiceUtil
 * @generated
 */
public abstract class CrmCountyServiceBaseImpl extends BaseServiceImpl
	implements CrmCountyService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link contact.manager.service.CrmCountyServiceUtil} to access the CRM County remote service.
	 */

	/**
	 * Returns the CRM CCA local service.
	 *
	 * @return the CRM CCA local service
	 */
	public contact.manager.service.CrmCCALocalService getCrmCCALocalService() {
		return crmCCALocalService;
	}

	/**
	 * Sets the CRM CCA local service.
	 *
	 * @param crmCCALocalService the CRM CCA local service
	 */
	public void setCrmCCALocalService(
		contact.manager.service.CrmCCALocalService crmCCALocalService) {
		this.crmCCALocalService = crmCCALocalService;
	}

	/**
	 * Returns the CRM CCA remote service.
	 *
	 * @return the CRM CCA remote service
	 */
	public contact.manager.service.CrmCCAService getCrmCCAService() {
		return crmCCAService;
	}

	/**
	 * Sets the CRM CCA remote service.
	 *
	 * @param crmCCAService the CRM CCA remote service
	 */
	public void setCrmCCAService(
		contact.manager.service.CrmCCAService crmCCAService) {
		this.crmCCAService = crmCCAService;
	}

	/**
	 * Returns the CRM CCA persistence.
	 *
	 * @return the CRM CCA persistence
	 */
	public CrmCCAPersistence getCrmCCAPersistence() {
		return crmCCAPersistence;
	}

	/**
	 * Sets the CRM CCA persistence.
	 *
	 * @param crmCCAPersistence the CRM CCA persistence
	 */
	public void setCrmCCAPersistence(CrmCCAPersistence crmCCAPersistence) {
		this.crmCCAPersistence = crmCCAPersistence;
	}

	/**
	 * Returns the CRM Chi Ward local service.
	 *
	 * @return the CRM Chi Ward local service
	 */
	public contact.manager.service.CrmChiWardLocalService getCrmChiWardLocalService() {
		return crmChiWardLocalService;
	}

	/**
	 * Sets the CRM Chi Ward local service.
	 *
	 * @param crmChiWardLocalService the CRM Chi Ward local service
	 */
	public void setCrmChiWardLocalService(
		contact.manager.service.CrmChiWardLocalService crmChiWardLocalService) {
		this.crmChiWardLocalService = crmChiWardLocalService;
	}

	/**
	 * Returns the CRM Chi Ward remote service.
	 *
	 * @return the CRM Chi Ward remote service
	 */
	public contact.manager.service.CrmChiWardService getCrmChiWardService() {
		return crmChiWardService;
	}

	/**
	 * Sets the CRM Chi Ward remote service.
	 *
	 * @param crmChiWardService the CRM Chi Ward remote service
	 */
	public void setCrmChiWardService(
		contact.manager.service.CrmChiWardService crmChiWardService) {
		this.crmChiWardService = crmChiWardService;
	}

	/**
	 * Returns the CRM Chi Ward persistence.
	 *
	 * @return the CRM Chi Ward persistence
	 */
	public CrmChiWardPersistence getCrmChiWardPersistence() {
		return crmChiWardPersistence;
	}

	/**
	 * Sets the CRM Chi Ward persistence.
	 *
	 * @param crmChiWardPersistence the CRM Chi Ward persistence
	 */
	public void setCrmChiWardPersistence(
		CrmChiWardPersistence crmChiWardPersistence) {
		this.crmChiWardPersistence = crmChiWardPersistence;
	}

	/**
	 * Returns the CRM Contact local service.
	 *
	 * @return the CRM Contact local service
	 */
	public contact.manager.service.CrmContactLocalService getCrmContactLocalService() {
		return crmContactLocalService;
	}

	/**
	 * Sets the CRM Contact local service.
	 *
	 * @param crmContactLocalService the CRM Contact local service
	 */
	public void setCrmContactLocalService(
		contact.manager.service.CrmContactLocalService crmContactLocalService) {
		this.crmContactLocalService = crmContactLocalService;
	}

	/**
	 * Returns the CRM Contact remote service.
	 *
	 * @return the CRM Contact remote service
	 */
	public contact.manager.service.CrmContactService getCrmContactService() {
		return crmContactService;
	}

	/**
	 * Sets the CRM Contact remote service.
	 *
	 * @param crmContactService the CRM Contact remote service
	 */
	public void setCrmContactService(
		contact.manager.service.CrmContactService crmContactService) {
		this.crmContactService = crmContactService;
	}

	/**
	 * Returns the CRM Contact persistence.
	 *
	 * @return the CRM Contact persistence
	 */
	public CrmContactPersistence getCrmContactPersistence() {
		return crmContactPersistence;
	}

	/**
	 * Sets the CRM Contact persistence.
	 *
	 * @param crmContactPersistence the CRM Contact persistence
	 */
	public void setCrmContactPersistence(
		CrmContactPersistence crmContactPersistence) {
		this.crmContactPersistence = crmContactPersistence;
	}

	/**
	 * Returns the CRM Contact Audit Log local service.
	 *
	 * @return the CRM Contact Audit Log local service
	 */
	public contact.manager.service.CrmContactAuditLogLocalService getCrmContactAuditLogLocalService() {
		return crmContactAuditLogLocalService;
	}

	/**
	 * Sets the CRM Contact Audit Log local service.
	 *
	 * @param crmContactAuditLogLocalService the CRM Contact Audit Log local service
	 */
	public void setCrmContactAuditLogLocalService(
		contact.manager.service.CrmContactAuditLogLocalService crmContactAuditLogLocalService) {
		this.crmContactAuditLogLocalService = crmContactAuditLogLocalService;
	}

	/**
	 * Returns the CRM Contact Audit Log remote service.
	 *
	 * @return the CRM Contact Audit Log remote service
	 */
	public contact.manager.service.CrmContactAuditLogService getCrmContactAuditLogService() {
		return crmContactAuditLogService;
	}

	/**
	 * Sets the CRM Contact Audit Log remote service.
	 *
	 * @param crmContactAuditLogService the CRM Contact Audit Log remote service
	 */
	public void setCrmContactAuditLogService(
		contact.manager.service.CrmContactAuditLogService crmContactAuditLogService) {
		this.crmContactAuditLogService = crmContactAuditLogService;
	}

	/**
	 * Returns the CRM Contact Audit Log persistence.
	 *
	 * @return the CRM Contact Audit Log persistence
	 */
	public CrmContactAuditLogPersistence getCrmContactAuditLogPersistence() {
		return crmContactAuditLogPersistence;
	}

	/**
	 * Sets the CRM Contact Audit Log persistence.
	 *
	 * @param crmContactAuditLogPersistence the CRM Contact Audit Log persistence
	 */
	public void setCrmContactAuditLogPersistence(
		CrmContactAuditLogPersistence crmContactAuditLogPersistence) {
		this.crmContactAuditLogPersistence = crmContactAuditLogPersistence;
	}

	/**
	 * Returns the CRM Contact Audit Log Change local service.
	 *
	 * @return the CRM Contact Audit Log Change local service
	 */
	public contact.manager.service.CrmContactAuditLogChangeLocalService getCrmContactAuditLogChangeLocalService() {
		return crmContactAuditLogChangeLocalService;
	}

	/**
	 * Sets the CRM Contact Audit Log Change local service.
	 *
	 * @param crmContactAuditLogChangeLocalService the CRM Contact Audit Log Change local service
	 */
	public void setCrmContactAuditLogChangeLocalService(
		contact.manager.service.CrmContactAuditLogChangeLocalService crmContactAuditLogChangeLocalService) {
		this.crmContactAuditLogChangeLocalService = crmContactAuditLogChangeLocalService;
	}

	/**
	 * Returns the CRM Contact Audit Log Change remote service.
	 *
	 * @return the CRM Contact Audit Log Change remote service
	 */
	public contact.manager.service.CrmContactAuditLogChangeService getCrmContactAuditLogChangeService() {
		return crmContactAuditLogChangeService;
	}

	/**
	 * Sets the CRM Contact Audit Log Change remote service.
	 *
	 * @param crmContactAuditLogChangeService the CRM Contact Audit Log Change remote service
	 */
	public void setCrmContactAuditLogChangeService(
		contact.manager.service.CrmContactAuditLogChangeService crmContactAuditLogChangeService) {
		this.crmContactAuditLogChangeService = crmContactAuditLogChangeService;
	}

	/**
	 * Returns the CRM Contact Audit Log Change persistence.
	 *
	 * @return the CRM Contact Audit Log Change persistence
	 */
	public CrmContactAuditLogChangePersistence getCrmContactAuditLogChangePersistence() {
		return crmContactAuditLogChangePersistence;
	}

	/**
	 * Sets the CRM Contact Audit Log Change persistence.
	 *
	 * @param crmContactAuditLogChangePersistence the CRM Contact Audit Log Change persistence
	 */
	public void setCrmContactAuditLogChangePersistence(
		CrmContactAuditLogChangePersistence crmContactAuditLogChangePersistence) {
		this.crmContactAuditLogChangePersistence = crmContactAuditLogChangePersistence;
	}

	/**
	 * Returns the CRM County local service.
	 *
	 * @return the CRM County local service
	 */
	public contact.manager.service.CrmCountyLocalService getCrmCountyLocalService() {
		return crmCountyLocalService;
	}

	/**
	 * Sets the CRM County local service.
	 *
	 * @param crmCountyLocalService the CRM County local service
	 */
	public void setCrmCountyLocalService(
		contact.manager.service.CrmCountyLocalService crmCountyLocalService) {
		this.crmCountyLocalService = crmCountyLocalService;
	}

	/**
	 * Returns the CRM County remote service.
	 *
	 * @return the CRM County remote service
	 */
	public CrmCountyService getCrmCountyService() {
		return crmCountyService;
	}

	/**
	 * Sets the CRM County remote service.
	 *
	 * @param crmCountyService the CRM County remote service
	 */
	public void setCrmCountyService(CrmCountyService crmCountyService) {
		this.crmCountyService = crmCountyService;
	}

	/**
	 * Returns the CRM County persistence.
	 *
	 * @return the CRM County persistence
	 */
	public CrmCountyPersistence getCrmCountyPersistence() {
		return crmCountyPersistence;
	}

	/**
	 * Sets the CRM County persistence.
	 *
	 * @param crmCountyPersistence the CRM County persistence
	 */
	public void setCrmCountyPersistence(
		CrmCountyPersistence crmCountyPersistence) {
		this.crmCountyPersistence = crmCountyPersistence;
	}

	/**
	 * Returns the CRM County Commissioner local service.
	 *
	 * @return the CRM County Commissioner local service
	 */
	public contact.manager.service.CrmCountyCommissionerLocalService getCrmCountyCommissionerLocalService() {
		return crmCountyCommissionerLocalService;
	}

	/**
	 * Sets the CRM County Commissioner local service.
	 *
	 * @param crmCountyCommissionerLocalService the CRM County Commissioner local service
	 */
	public void setCrmCountyCommissionerLocalService(
		contact.manager.service.CrmCountyCommissionerLocalService crmCountyCommissionerLocalService) {
		this.crmCountyCommissionerLocalService = crmCountyCommissionerLocalService;
	}

	/**
	 * Returns the CRM County Commissioner remote service.
	 *
	 * @return the CRM County Commissioner remote service
	 */
	public contact.manager.service.CrmCountyCommissionerService getCrmCountyCommissionerService() {
		return crmCountyCommissionerService;
	}

	/**
	 * Sets the CRM County Commissioner remote service.
	 *
	 * @param crmCountyCommissionerService the CRM County Commissioner remote service
	 */
	public void setCrmCountyCommissionerService(
		contact.manager.service.CrmCountyCommissionerService crmCountyCommissionerService) {
		this.crmCountyCommissionerService = crmCountyCommissionerService;
	}

	/**
	 * Returns the CRM County Commissioner persistence.
	 *
	 * @return the CRM County Commissioner persistence
	 */
	public CrmCountyCommissionerPersistence getCrmCountyCommissionerPersistence() {
		return crmCountyCommissionerPersistence;
	}

	/**
	 * Sets the CRM County Commissioner persistence.
	 *
	 * @param crmCountyCommissionerPersistence the CRM County Commissioner persistence
	 */
	public void setCrmCountyCommissionerPersistence(
		CrmCountyCommissionerPersistence crmCountyCommissionerPersistence) {
		this.crmCountyCommissionerPersistence = crmCountyCommissionerPersistence;
	}

	/**
	 * Returns the CRM Group local service.
	 *
	 * @return the CRM Group local service
	 */
	public contact.manager.service.CrmGroupLocalService getCrmGroupLocalService() {
		return crmGroupLocalService;
	}

	/**
	 * Sets the CRM Group local service.
	 *
	 * @param crmGroupLocalService the CRM Group local service
	 */
	public void setCrmGroupLocalService(
		contact.manager.service.CrmGroupLocalService crmGroupLocalService) {
		this.crmGroupLocalService = crmGroupLocalService;
	}

	/**
	 * Returns the CRM Group remote service.
	 *
	 * @return the CRM Group remote service
	 */
	public contact.manager.service.CrmGroupService getCrmGroupService() {
		return crmGroupService;
	}

	/**
	 * Sets the CRM Group remote service.
	 *
	 * @param crmGroupService the CRM Group remote service
	 */
	public void setCrmGroupService(
		contact.manager.service.CrmGroupService crmGroupService) {
		this.crmGroupService = crmGroupService;
	}

	/**
	 * Returns the CRM Group persistence.
	 *
	 * @return the CRM Group persistence
	 */
	public CrmGroupPersistence getCrmGroupPersistence() {
		return crmGroupPersistence;
	}

	/**
	 * Sets the CRM Group persistence.
	 *
	 * @param crmGroupPersistence the CRM Group persistence
	 */
	public void setCrmGroupPersistence(CrmGroupPersistence crmGroupPersistence) {
		this.crmGroupPersistence = crmGroupPersistence;
	}

	/**
	 * Returns the CRM LTA local service.
	 *
	 * @return the CRM LTA local service
	 */
	public contact.manager.service.CrmLTALocalService getCrmLTALocalService() {
		return crmLTALocalService;
	}

	/**
	 * Sets the CRM LTA local service.
	 *
	 * @param crmLTALocalService the CRM LTA local service
	 */
	public void setCrmLTALocalService(
		contact.manager.service.CrmLTALocalService crmLTALocalService) {
		this.crmLTALocalService = crmLTALocalService;
	}

	/**
	 * Returns the CRM LTA remote service.
	 *
	 * @return the CRM LTA remote service
	 */
	public contact.manager.service.CrmLTAService getCrmLTAService() {
		return crmLTAService;
	}

	/**
	 * Sets the CRM LTA remote service.
	 *
	 * @param crmLTAService the CRM LTA remote service
	 */
	public void setCrmLTAService(
		contact.manager.service.CrmLTAService crmLTAService) {
		this.crmLTAService = crmLTAService;
	}

	/**
	 * Returns the CRM LTA persistence.
	 *
	 * @return the CRM LTA persistence
	 */
	public CrmLTAPersistence getCrmLTAPersistence() {
		return crmLTAPersistence;
	}

	/**
	 * Sets the CRM LTA persistence.
	 *
	 * @param crmLTAPersistence the CRM LTA persistence
	 */
	public void setCrmLTAPersistence(CrmLTAPersistence crmLTAPersistence) {
		this.crmLTAPersistence = crmLTAPersistence;
	}

	/**
	 * Returns the CRM Muni local service.
	 *
	 * @return the CRM Muni local service
	 */
	public contact.manager.service.CrmMuniLocalService getCrmMuniLocalService() {
		return crmMuniLocalService;
	}

	/**
	 * Sets the CRM Muni local service.
	 *
	 * @param crmMuniLocalService the CRM Muni local service
	 */
	public void setCrmMuniLocalService(
		contact.manager.service.CrmMuniLocalService crmMuniLocalService) {
		this.crmMuniLocalService = crmMuniLocalService;
	}

	/**
	 * Returns the CRM Muni remote service.
	 *
	 * @return the CRM Muni remote service
	 */
	public contact.manager.service.CrmMuniService getCrmMuniService() {
		return crmMuniService;
	}

	/**
	 * Sets the CRM Muni remote service.
	 *
	 * @param crmMuniService the CRM Muni remote service
	 */
	public void setCrmMuniService(
		contact.manager.service.CrmMuniService crmMuniService) {
		this.crmMuniService = crmMuniService;
	}

	/**
	 * Returns the CRM Muni persistence.
	 *
	 * @return the CRM Muni persistence
	 */
	public CrmMuniPersistence getCrmMuniPersistence() {
		return crmMuniPersistence;
	}

	/**
	 * Sets the CRM Muni persistence.
	 *
	 * @param crmMuniPersistence the CRM Muni persistence
	 */
	public void setCrmMuniPersistence(CrmMuniPersistence crmMuniPersistence) {
		this.crmMuniPersistence = crmMuniPersistence;
	}

	/**
	 * Returns the CRM Note local service.
	 *
	 * @return the CRM Note local service
	 */
	public contact.manager.service.CrmNoteLocalService getCrmNoteLocalService() {
		return crmNoteLocalService;
	}

	/**
	 * Sets the CRM Note local service.
	 *
	 * @param crmNoteLocalService the CRM Note local service
	 */
	public void setCrmNoteLocalService(
		contact.manager.service.CrmNoteLocalService crmNoteLocalService) {
		this.crmNoteLocalService = crmNoteLocalService;
	}

	/**
	 * Returns the CRM Note remote service.
	 *
	 * @return the CRM Note remote service
	 */
	public contact.manager.service.CrmNoteService getCrmNoteService() {
		return crmNoteService;
	}

	/**
	 * Sets the CRM Note remote service.
	 *
	 * @param crmNoteService the CRM Note remote service
	 */
	public void setCrmNoteService(
		contact.manager.service.CrmNoteService crmNoteService) {
		this.crmNoteService = crmNoteService;
	}

	/**
	 * Returns the CRM Note persistence.
	 *
	 * @return the CRM Note persistence
	 */
	public CrmNotePersistence getCrmNotePersistence() {
		return crmNotePersistence;
	}

	/**
	 * Sets the CRM Note persistence.
	 *
	 * @param crmNotePersistence the CRM Note persistence
	 */
	public void setCrmNotePersistence(CrmNotePersistence crmNotePersistence) {
		this.crmNotePersistence = crmNotePersistence;
	}

	/**
	 * Returns the CRM Outreach Log local service.
	 *
	 * @return the CRM Outreach Log local service
	 */
	public contact.manager.service.CrmOutreachLogLocalService getCrmOutreachLogLocalService() {
		return crmOutreachLogLocalService;
	}

	/**
	 * Sets the CRM Outreach Log local service.
	 *
	 * @param crmOutreachLogLocalService the CRM Outreach Log local service
	 */
	public void setCrmOutreachLogLocalService(
		contact.manager.service.CrmOutreachLogLocalService crmOutreachLogLocalService) {
		this.crmOutreachLogLocalService = crmOutreachLogLocalService;
	}

	/**
	 * Returns the CRM Outreach Log remote service.
	 *
	 * @return the CRM Outreach Log remote service
	 */
	public contact.manager.service.CrmOutreachLogService getCrmOutreachLogService() {
		return crmOutreachLogService;
	}

	/**
	 * Sets the CRM Outreach Log remote service.
	 *
	 * @param crmOutreachLogService the CRM Outreach Log remote service
	 */
	public void setCrmOutreachLogService(
		contact.manager.service.CrmOutreachLogService crmOutreachLogService) {
		this.crmOutreachLogService = crmOutreachLogService;
	}

	/**
	 * Returns the CRM Outreach Log persistence.
	 *
	 * @return the CRM Outreach Log persistence
	 */
	public CrmOutreachLogPersistence getCrmOutreachLogPersistence() {
		return crmOutreachLogPersistence;
	}

	/**
	 * Sets the CRM Outreach Log persistence.
	 *
	 * @param crmOutreachLogPersistence the CRM Outreach Log persistence
	 */
	public void setCrmOutreachLogPersistence(
		CrmOutreachLogPersistence crmOutreachLogPersistence) {
		this.crmOutreachLogPersistence = crmOutreachLogPersistence;
	}

	/**
	 * Returns the CRM State Rep local service.
	 *
	 * @return the CRM State Rep local service
	 */
	public contact.manager.service.CrmStateRepLocalService getCrmStateRepLocalService() {
		return crmStateRepLocalService;
	}

	/**
	 * Sets the CRM State Rep local service.
	 *
	 * @param crmStateRepLocalService the CRM State Rep local service
	 */
	public void setCrmStateRepLocalService(
		contact.manager.service.CrmStateRepLocalService crmStateRepLocalService) {
		this.crmStateRepLocalService = crmStateRepLocalService;
	}

	/**
	 * Returns the CRM State Rep remote service.
	 *
	 * @return the CRM State Rep remote service
	 */
	public contact.manager.service.CrmStateRepService getCrmStateRepService() {
		return crmStateRepService;
	}

	/**
	 * Sets the CRM State Rep remote service.
	 *
	 * @param crmStateRepService the CRM State Rep remote service
	 */
	public void setCrmStateRepService(
		contact.manager.service.CrmStateRepService crmStateRepService) {
		this.crmStateRepService = crmStateRepService;
	}

	/**
	 * Returns the CRM State Rep persistence.
	 *
	 * @return the CRM State Rep persistence
	 */
	public CrmStateRepPersistence getCrmStateRepPersistence() {
		return crmStateRepPersistence;
	}

	/**
	 * Sets the CRM State Rep persistence.
	 *
	 * @param crmStateRepPersistence the CRM State Rep persistence
	 */
	public void setCrmStateRepPersistence(
		CrmStateRepPersistence crmStateRepPersistence) {
		this.crmStateRepPersistence = crmStateRepPersistence;
	}

	/**
	 * Returns the CRM State Senate local service.
	 *
	 * @return the CRM State Senate local service
	 */
	public contact.manager.service.CrmStateSenateLocalService getCrmStateSenateLocalService() {
		return crmStateSenateLocalService;
	}

	/**
	 * Sets the CRM State Senate local service.
	 *
	 * @param crmStateSenateLocalService the CRM State Senate local service
	 */
	public void setCrmStateSenateLocalService(
		contact.manager.service.CrmStateSenateLocalService crmStateSenateLocalService) {
		this.crmStateSenateLocalService = crmStateSenateLocalService;
	}

	/**
	 * Returns the CRM State Senate remote service.
	 *
	 * @return the CRM State Senate remote service
	 */
	public contact.manager.service.CrmStateSenateService getCrmStateSenateService() {
		return crmStateSenateService;
	}

	/**
	 * Sets the CRM State Senate remote service.
	 *
	 * @param crmStateSenateService the CRM State Senate remote service
	 */
	public void setCrmStateSenateService(
		contact.manager.service.CrmStateSenateService crmStateSenateService) {
		this.crmStateSenateService = crmStateSenateService;
	}

	/**
	 * Returns the CRM State Senate persistence.
	 *
	 * @return the CRM State Senate persistence
	 */
	public CrmStateSenatePersistence getCrmStateSenatePersistence() {
		return crmStateSenatePersistence;
	}

	/**
	 * Sets the CRM State Senate persistence.
	 *
	 * @param crmStateSenatePersistence the CRM State Senate persistence
	 */
	public void setCrmStateSenatePersistence(
		CrmStateSenatePersistence crmStateSenatePersistence) {
		this.crmStateSenatePersistence = crmStateSenatePersistence;
	}

	/**
	 * Returns the CRM Tag local service.
	 *
	 * @return the CRM Tag local service
	 */
	public contact.manager.service.CrmTagLocalService getCrmTagLocalService() {
		return crmTagLocalService;
	}

	/**
	 * Sets the CRM Tag local service.
	 *
	 * @param crmTagLocalService the CRM Tag local service
	 */
	public void setCrmTagLocalService(
		contact.manager.service.CrmTagLocalService crmTagLocalService) {
		this.crmTagLocalService = crmTagLocalService;
	}

	/**
	 * Returns the CRM Tag remote service.
	 *
	 * @return the CRM Tag remote service
	 */
	public contact.manager.service.CrmTagService getCrmTagService() {
		return crmTagService;
	}

	/**
	 * Sets the CRM Tag remote service.
	 *
	 * @param crmTagService the CRM Tag remote service
	 */
	public void setCrmTagService(
		contact.manager.service.CrmTagService crmTagService) {
		this.crmTagService = crmTagService;
	}

	/**
	 * Returns the CRM Tag persistence.
	 *
	 * @return the CRM Tag persistence
	 */
	public CrmTagPersistence getCrmTagPersistence() {
		return crmTagPersistence;
	}

	/**
	 * Sets the CRM Tag persistence.
	 *
	 * @param crmTagPersistence the CRM Tag persistence
	 */
	public void setCrmTagPersistence(CrmTagPersistence crmTagPersistence) {
		this.crmTagPersistence = crmTagPersistence;
	}

	/**
	 * Returns the CRM US Rep local service.
	 *
	 * @return the CRM US Rep local service
	 */
	public contact.manager.service.CrmUsRepLocalService getCrmUsRepLocalService() {
		return crmUsRepLocalService;
	}

	/**
	 * Sets the CRM US Rep local service.
	 *
	 * @param crmUsRepLocalService the CRM US Rep local service
	 */
	public void setCrmUsRepLocalService(
		contact.manager.service.CrmUsRepLocalService crmUsRepLocalService) {
		this.crmUsRepLocalService = crmUsRepLocalService;
	}

	/**
	 * Returns the CRM US Rep remote service.
	 *
	 * @return the CRM US Rep remote service
	 */
	public contact.manager.service.CrmUsRepService getCrmUsRepService() {
		return crmUsRepService;
	}

	/**
	 * Sets the CRM US Rep remote service.
	 *
	 * @param crmUsRepService the CRM US Rep remote service
	 */
	public void setCrmUsRepService(
		contact.manager.service.CrmUsRepService crmUsRepService) {
		this.crmUsRepService = crmUsRepService;
	}

	/**
	 * Returns the CRM US Rep persistence.
	 *
	 * @return the CRM US Rep persistence
	 */
	public CrmUsRepPersistence getCrmUsRepPersistence() {
		return crmUsRepPersistence;
	}

	/**
	 * Sets the CRM US Rep persistence.
	 *
	 * @param crmUsRepPersistence the CRM US Rep persistence
	 */
	public void setCrmUsRepPersistence(CrmUsRepPersistence crmUsRepPersistence) {
		this.crmUsRepPersistence = crmUsRepPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CrmCountyService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CrmCounty.class;
	}

	protected String getModelClassName() {
		return CrmCounty.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = crmCountyPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = contact.manager.service.CrmCCALocalService.class)
	protected contact.manager.service.CrmCCALocalService crmCCALocalService;
	@BeanReference(type = contact.manager.service.CrmCCAService.class)
	protected contact.manager.service.CrmCCAService crmCCAService;
	@BeanReference(type = CrmCCAPersistence.class)
	protected CrmCCAPersistence crmCCAPersistence;
	@BeanReference(type = contact.manager.service.CrmChiWardLocalService.class)
	protected contact.manager.service.CrmChiWardLocalService crmChiWardLocalService;
	@BeanReference(type = contact.manager.service.CrmChiWardService.class)
	protected contact.manager.service.CrmChiWardService crmChiWardService;
	@BeanReference(type = CrmChiWardPersistence.class)
	protected CrmChiWardPersistence crmChiWardPersistence;
	@BeanReference(type = contact.manager.service.CrmContactLocalService.class)
	protected contact.manager.service.CrmContactLocalService crmContactLocalService;
	@BeanReference(type = contact.manager.service.CrmContactService.class)
	protected contact.manager.service.CrmContactService crmContactService;
	@BeanReference(type = CrmContactPersistence.class)
	protected CrmContactPersistence crmContactPersistence;
	@BeanReference(type = contact.manager.service.CrmContactAuditLogLocalService.class)
	protected contact.manager.service.CrmContactAuditLogLocalService crmContactAuditLogLocalService;
	@BeanReference(type = contact.manager.service.CrmContactAuditLogService.class)
	protected contact.manager.service.CrmContactAuditLogService crmContactAuditLogService;
	@BeanReference(type = CrmContactAuditLogPersistence.class)
	protected CrmContactAuditLogPersistence crmContactAuditLogPersistence;
	@BeanReference(type = contact.manager.service.CrmContactAuditLogChangeLocalService.class)
	protected contact.manager.service.CrmContactAuditLogChangeLocalService crmContactAuditLogChangeLocalService;
	@BeanReference(type = contact.manager.service.CrmContactAuditLogChangeService.class)
	protected contact.manager.service.CrmContactAuditLogChangeService crmContactAuditLogChangeService;
	@BeanReference(type = CrmContactAuditLogChangePersistence.class)
	protected CrmContactAuditLogChangePersistence crmContactAuditLogChangePersistence;
	@BeanReference(type = contact.manager.service.CrmCountyLocalService.class)
	protected contact.manager.service.CrmCountyLocalService crmCountyLocalService;
	@BeanReference(type = CrmCountyService.class)
	protected CrmCountyService crmCountyService;
	@BeanReference(type = CrmCountyPersistence.class)
	protected CrmCountyPersistence crmCountyPersistence;
	@BeanReference(type = contact.manager.service.CrmCountyCommissionerLocalService.class)
	protected contact.manager.service.CrmCountyCommissionerLocalService crmCountyCommissionerLocalService;
	@BeanReference(type = contact.manager.service.CrmCountyCommissionerService.class)
	protected contact.manager.service.CrmCountyCommissionerService crmCountyCommissionerService;
	@BeanReference(type = CrmCountyCommissionerPersistence.class)
	protected CrmCountyCommissionerPersistence crmCountyCommissionerPersistence;
	@BeanReference(type = contact.manager.service.CrmGroupLocalService.class)
	protected contact.manager.service.CrmGroupLocalService crmGroupLocalService;
	@BeanReference(type = contact.manager.service.CrmGroupService.class)
	protected contact.manager.service.CrmGroupService crmGroupService;
	@BeanReference(type = CrmGroupPersistence.class)
	protected CrmGroupPersistence crmGroupPersistence;
	@BeanReference(type = contact.manager.service.CrmLTALocalService.class)
	protected contact.manager.service.CrmLTALocalService crmLTALocalService;
	@BeanReference(type = contact.manager.service.CrmLTAService.class)
	protected contact.manager.service.CrmLTAService crmLTAService;
	@BeanReference(type = CrmLTAPersistence.class)
	protected CrmLTAPersistence crmLTAPersistence;
	@BeanReference(type = contact.manager.service.CrmMuniLocalService.class)
	protected contact.manager.service.CrmMuniLocalService crmMuniLocalService;
	@BeanReference(type = contact.manager.service.CrmMuniService.class)
	protected contact.manager.service.CrmMuniService crmMuniService;
	@BeanReference(type = CrmMuniPersistence.class)
	protected CrmMuniPersistence crmMuniPersistence;
	@BeanReference(type = contact.manager.service.CrmNoteLocalService.class)
	protected contact.manager.service.CrmNoteLocalService crmNoteLocalService;
	@BeanReference(type = contact.manager.service.CrmNoteService.class)
	protected contact.manager.service.CrmNoteService crmNoteService;
	@BeanReference(type = CrmNotePersistence.class)
	protected CrmNotePersistence crmNotePersistence;
	@BeanReference(type = contact.manager.service.CrmOutreachLogLocalService.class)
	protected contact.manager.service.CrmOutreachLogLocalService crmOutreachLogLocalService;
	@BeanReference(type = contact.manager.service.CrmOutreachLogService.class)
	protected contact.manager.service.CrmOutreachLogService crmOutreachLogService;
	@BeanReference(type = CrmOutreachLogPersistence.class)
	protected CrmOutreachLogPersistence crmOutreachLogPersistence;
	@BeanReference(type = contact.manager.service.CrmStateRepLocalService.class)
	protected contact.manager.service.CrmStateRepLocalService crmStateRepLocalService;
	@BeanReference(type = contact.manager.service.CrmStateRepService.class)
	protected contact.manager.service.CrmStateRepService crmStateRepService;
	@BeanReference(type = CrmStateRepPersistence.class)
	protected CrmStateRepPersistence crmStateRepPersistence;
	@BeanReference(type = contact.manager.service.CrmStateSenateLocalService.class)
	protected contact.manager.service.CrmStateSenateLocalService crmStateSenateLocalService;
	@BeanReference(type = contact.manager.service.CrmStateSenateService.class)
	protected contact.manager.service.CrmStateSenateService crmStateSenateService;
	@BeanReference(type = CrmStateSenatePersistence.class)
	protected CrmStateSenatePersistence crmStateSenatePersistence;
	@BeanReference(type = contact.manager.service.CrmTagLocalService.class)
	protected contact.manager.service.CrmTagLocalService crmTagLocalService;
	@BeanReference(type = contact.manager.service.CrmTagService.class)
	protected contact.manager.service.CrmTagService crmTagService;
	@BeanReference(type = CrmTagPersistence.class)
	protected CrmTagPersistence crmTagPersistence;
	@BeanReference(type = contact.manager.service.CrmUsRepLocalService.class)
	protected contact.manager.service.CrmUsRepLocalService crmUsRepLocalService;
	@BeanReference(type = contact.manager.service.CrmUsRepService.class)
	protected contact.manager.service.CrmUsRepService crmUsRepService;
	@BeanReference(type = CrmUsRepPersistence.class)
	protected CrmUsRepPersistence crmUsRepPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}