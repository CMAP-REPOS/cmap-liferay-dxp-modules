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

package ucc.portal.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CExtOrganizationSoap implements Serializable {
	public static CExtOrganizationSoap toSoapModel(CExtOrganization model) {
		CExtOrganizationSoap soapModel = new CExtOrganizationSoap();

		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDiTitle(model.getDiTitle());
		soapModel.setDiDescription(model.getDiDescription());
		soapModel.setDiComplete(model.isDiComplete());
		soapModel.setRfLifeOfFaith(model.getRfLifeOfFaith());
		soapModel.setRfStrengthsQualities(model.getRfStrengthsQualities());
		soapModel.setRfWorship(model.getRfWorship());
		soapModel.setRfEducationFaithVision(model.getRfEducationFaithVision());
		soapModel.setRfMinistryMission(model.getRfMinistryMission());
		soapModel.setRfMeetingHoursPerMonth(model.getRfMeetingHoursPerMonth());
		soapModel.setRfCrisisDisasterAction(model.getRfCrisisDisasterAction());
		soapModel.setRfMinisterGovernanceCopy(model.isRfMinisterGovernanceCopy());
		soapModel.setRfComplete(model.isRfComplete());
		soapModel.setYrFileEntryId(model.getYrFileEntryId());
		soapModel.setYrChurchResponse(model.getYrChurchResponse());
		soapModel.setYrComplete(model.isYrComplete());
		soapModel.setDgActiveMembers(model.getDgActiveMembers());
		soapModel.setDgActiveMembersEstimate(model.isDgActiveMembersEstimate());
		soapModel.setDgActiveNonMembers(model.getDgActiveNonMembers());
		soapModel.setDgActiveNonMembersEstimate(model.isDgActiveNonMembersEstimate());
		soapModel.setDgPercentMoreThan10(model.getDgPercentMoreThan10());
		soapModel.setDgPercentMoreThan10Estimate(model.isDgPercentMoreThan10Estimate());
		soapModel.setDgPercent5To10(model.getDgPercent5To10());
		soapModel.setDgPercent5To10Estimate(model.isDgPercent5To10Estimate());
		soapModel.setDgPercentLessThan5(model.getDgPercentLessThan5());
		soapModel.setDgPercentLessThan5Estimate(model.isDgPercentLessThan5Estimate());
		soapModel.setDgAge11AndUnder(model.getDgAge11AndUnder());
		soapModel.setDgAge12To17(model.getDgAge12To17());
		soapModel.setDgAge18To24(model.getDgAge18To24());
		soapModel.setDgAge25To34(model.getDgAge25To34());
		soapModel.setDgAge35To44(model.getDgAge35To44());
		soapModel.setDgAge45To54(model.getDgAge45To54());
		soapModel.setDgAge55To64(model.getDgAge55To64());
		soapModel.setDgAge65To74(model.getDgAge65To74());
		soapModel.setDgAge75AndOver(model.getDgAge75AndOver());
		soapModel.setDgAllAgesEstimate(model.isDgAllAgesEstimate());
		soapModel.setDgPercentSingleUnder35(model.getDgPercentSingleUnder35());
		soapModel.setDgPercentSingleUnder35Estimate(model.isDgPercentSingleUnder35Estimate());
		soapModel.setDgPercentWithMinors(model.getDgPercentWithMinors());
		soapModel.setDgPercentWithMinorsEstimate(model.isDgPercentWithMinorsEstimate());
		soapModel.setDgPercentSingle35To65(model.getDgPercentSingle35To65());
		soapModel.setDgPercentSingle35To65Estimate(model.isDgPercentSingle35To65Estimate());
		soapModel.setDgPercentJointNoMinors(model.getDgPercentJointNoMinors());
		soapModel.setDgPercentJointNoMinorsEstimate(model.isDgPercentJointNoMinorsEstimate());
		soapModel.setDgPercentSingleOver65(model.getDgPercentSingleOver65());
		soapModel.setDgPercentSingleOver65Estimate(model.isDgPercentSingleOver65Estimate());
		soapModel.setDgPercentHighSchool(model.getDgPercentHighSchool());
		soapModel.setDgPercentHighSchoolEstimate(model.isDgPercentHighSchoolEstimate());
		soapModel.setDgPercentCollege(model.getDgPercentCollege());
		soapModel.setDgPercentCollegeEstimate(model.isDgPercentCollegeEstimate());
		soapModel.setDgPercentGraduateSchool(model.getDgPercentGraduateSchool());
		soapModel.setDgPercentGraduateSchoolEstimate(model.isDgPercentGraduateSchoolEstimate());
		soapModel.setDgPercentSpecialtyTraining(model.getDgPercentSpecialtyTraining());
		soapModel.setDgPercentSpecialtyTrainingEstimate(model.isDgPercentSpecialtyTrainingEstimate());
		soapModel.setDgPercentOtherEducation(model.getDgPercentOtherEducation());
		soapModel.setDgPercentOtherEducationEstimate(model.isDgPercentOtherEducationEstimate());
		soapModel.setDgPercentOtherEducationDescription(model.getDgPercentOtherEducationDescription());
		soapModel.setDgPercentEmployed(model.getDgPercentEmployed());
		soapModel.setDgPercentEmployedEstimate(model.isDgPercentEmployedEstimate());
		soapModel.setDgPercentNotFullyEmployed(model.getDgPercentNotFullyEmployed());
		soapModel.setDgPercentNotFullyEmployedEstimate(model.isDgPercentNotFullyEmployedEstimate());
		soapModel.setDgPercentRetired(model.getDgPercentRetired());
		soapModel.setDgPercentRetiredEstimate(model.isDgPercentRetiredEstimate());
		soapModel.setDgRangeOfOccupations(model.getDgRangeOfOccupations());
		soapModel.setDgComplete(model.isDgComplete());
		soapModel.setDvEthnicRacialMix(model.getDvEthnicRacialMix());
		soapModel.setDvWelcomingConversation(model.getDvWelcomingConversation());
		soapModel.setDvWelcomingComments(model.getDvWelcomingComments());
		soapModel.setDvComplete(model.isDvComplete());
		soapModel.setPpComments(model.getPpComments());
		soapModel.setPpComplete(model.isPpComplete());
		soapModel.setSfPreviousRoles(model.getSfPreviousRoles());
		soapModel.setSfComplete(model.isSfComplete());
		soapModel.setRvOverallMinistry(model.getRvOverallMinistry());
		soapModel.setRvComplete(model.isRvComplete());
		soapModel.setFnYear(model.getFnYear());
		soapModel.setFnIncomeOfferingsPledgedGivings(model.getFnIncomeOfferingsPledgedGivings());
		soapModel.setFnIncomeEndowmentProceeds(model.getFnIncomeEndowmentProceeds());
		soapModel.setFnIncomeEndowmentDraw(model.getFnIncomeEndowmentDraw());
		soapModel.setFnIncomeFundraising(model.getFnIncomeFundraising());
		soapModel.setFnIncomeDesignatedGifts(model.getFnIncomeDesignatedGifts());
		soapModel.setFnIncomeGrants(model.getFnIncomeGrants());
		soapModel.setFnIncomeRentalChurchBuilding(model.getFnIncomeRentalChurchBuilding());
		soapModel.setFnIncomeRentalChurchParsonage(model.getFnIncomeRentalChurchParsonage());
		soapModel.setFnIncomeRelatedOrganizations(model.getFnIncomeRelatedOrganizations());
		soapModel.setFnIncomeSpecialAccounts(model.getFnIncomeSpecialAccounts());
		soapModel.setFnExpense(model.getFnExpense());
		soapModel.setFnFileEntryId(model.getFnFileEntryId());
		soapModel.setFnExpenseMinisterialSupportPercent(model.getFnExpenseMinisterialSupportPercent());
		soapModel.setFnFailToPayMinister(model.isFnFailToPayMinister());
		soapModel.setFnOurChurchWiderMission(model.isFnOurChurchWiderMission());
		soapModel.setFnOneGreatHourOfSharing(model.isFnOneGreatHourOfSharing());
		soapModel.setFnStrenghtenTheChurch(model.isFnStrenghtenTheChurch());
		soapModel.setFnNeighborsInNeed(model.isFnNeighborsInNeed());
		soapModel.setFnChristmasFund(model.isFnChristmasFund());
		soapModel.setFnOurChurchWiderMissionHow(model.getFnOurChurchWiderMissionHow());
		soapModel.setFnDebtCurrent(model.getFnDebtCurrent());
		soapModel.setFnDebtCurrentLoan(model.getFnDebtCurrentLoan());
		soapModel.setFnDebtReasonFor(model.getFnDebtReasonFor());
		soapModel.setFnDebtPaymentsCurrent(model.isFnDebtPaymentsCurrent());
		soapModel.setFnEndowment(model.isFnEndowment());
		soapModel.setFnEndowmentMarketValue(model.getFnEndowmentMarketValue());
		soapModel.setFnEndowmentDrawWhen(model.getFnEndowmentDrawWhen());
		soapModel.setFnEndowmentDraw5YearPercent(model.getFnEndowmentDraw5YearPercent());
		soapModel.setFnEndowmentDraw5YearToExpense(model.getFnEndowmentDraw5YearToExpense());
		soapModel.setFnEndowmentDrawCurrentRateLast(model.getFnEndowmentDrawCurrentRateLast());
		soapModel.setFnEndowmentComment(model.getFnEndowmentComment());
		soapModel.setFnReserves(model.getFnReserves());
		soapModel.setFnInvestments(model.getFnInvestments());
		soapModel.setFnComplete(model.isFnComplete());
		soapModel.setReBuildingProgram(model.getReBuildingProgram());
		soapModel.setReCampaignMissionComponents(model.getReCampaignMissionComponents());
		soapModel.setReParsonage(model.isReParsonage());
		soapModel.setReParsonageMarketValue(model.getReParsonageMarketValue());
		soapModel.setReParsonageAssessedValue(model.getReParsonageAssessedValue());
		soapModel.setReParsonageUsage(model.getReParsonageUsage());
		soapModel.setReParsonageStreetAddress(model.getReParsonageStreetAddress());
		soapModel.setReParsonageCity(model.getReParsonageCity());
		soapModel.setReParsonageState(model.getReParsonageState());
		soapModel.setReParsonageZip(model.getReParsonageZip());
		soapModel.setReParsonageFootage(model.getReParsonageFootage());
		soapModel.setReParsonageBedrooms(model.getReParsonageBedrooms());
		soapModel.setReParsonageBathrooms(model.getReParsonageBathrooms());
		soapModel.setReParsonageAvailableMinister(model.isReParsonageAvailableMinister());
		soapModel.setReParsonageExpectedMinister(model.isReParsonageExpectedMinister());
		soapModel.setReParsonageCondition(model.getReParsonageCondition());
		soapModel.setReParsonageResponsibleEntity(model.getReParsonageResponsibleEntity());
		soapModel.setReOwnedBuildings(model.getReOwnedBuildings());
		soapModel.setReNonOwnedBuildings(model.getReNonOwnedBuildings());
		soapModel.setReWheelchairAccessible(model.getReWheelchairAccessible());
		soapModel.setReFinancesAssetsReview(model.getReFinancesAssetsReview());
		soapModel.setReComplete(model.isReComplete());
		soapModel.setHiSignificantHappenings(model.getHiSignificantHappenings());
		soapModel.setHiManagedChange(model.getHiManagedChange());
		soapModel.setHiConflictResolution(model.getHiConflictResolution());
		soapModel.setHiMinisterialLeadershipLearning(model.getHiMinisterialLeadershipLearning());
		soapModel.setHiPressureInvoluntaryTermination(model.getHiPressureInvoluntaryTermination());
		soapModel.setHiSituationalSupportConsultation(model.getHiSituationalSupportConsultation());
		soapModel.setHiFitnessReview(model.getHiFitnessReview());
		soapModel.setHiComplete(model.isHiComplete());
		soapModel.setCmServiceAdvocacy(model.getCmServiceAdvocacy());
		soapModel.setCmMeetingsRelationshipsActivities(model.getCmMeetingsRelationshipsActivities());
		soapModel.setCmAccessibleToAll(model.isCmAccessibleToAll());
		soapModel.setCmCreationJustice(model.isCmCreationJustice());
		soapModel.setCmEconomicJustice(model.isCmEconomicJustice());
		soapModel.setCmFaithfulAndWelcoming(model.isCmFaithfulAndWelcoming());
		soapModel.setCmGodIsStillSpeaking(model.isCmGodIsStillSpeaking());
		soapModel.setCmBorderAndImmigrantJustice(model.isCmBorderAndImmigrantJustice());
		soapModel.setCmInterCulturalMultiRacial(model.isCmInterCulturalMultiRacial());
		soapModel.setCmJustPeace(model.isCmJustPeace());
		soapModel.setCmGlobalMissionChurch(model.isCmGlobalMissionChurch());
		soapModel.setCmOpenAndAffirming(model.isCmOpenAndAffirming());
		soapModel.setCmWISECongregationForMentalHealth(model.isCmWISECongregationForMentalHealth());
		soapModel.setCmOtherUCCDesignations(model.isCmOtherUCCDesignations());
		soapModel.setCmDesignationsOtherDenominations(model.isCmDesignationsOtherDenominations());
		soapModel.setCmStatementsReflection(model.getCmStatementsReflection());
		soapModel.setCmWorkTowardWitnessFuture(model.getCmWorkTowardWitnessFuture());
		soapModel.setCmEcumenicalInterfaithParticipation(model.getCmEcumenicalInterfaithParticipation());
		soapModel.setCmMissionStatementComparison(model.getCmMissionStatementComparison());
		soapModel.setCmPastorTimeExpectations(model.getCmPastorTimeExpectations());
		soapModel.setCmComplete(model.isCmComplete());
		soapModel.setMiMissionInSiteTrendsOpportunities(model.getMiMissionInSiteTrendsOpportunities());
		soapModel.setMiCongregationDemographicsComparison(model.getMiCongregationDemographicsComparison());
		soapModel.setMiCommunityDemographicsImpact(model.getMiCommunityDemographicsImpact());
		soapModel.setMiKnownForInCommunity(model.getMiKnownForInCommunity());
		soapModel.setMiWhyNewPeopleInvolved(model.getMiWhyNewPeopleInvolved());
		soapModel.setMiComplete(model.isMiComplete());
		soapModel.setVsGodsCallToBecome(model.getVsGodsCallToBecome());
		soapModel.setVsGodsCallToReachOut(model.getVsGodsCallToReachOut());
		soapModel.setVsComplete(model.isVsComplete());
		soapModel.setPvFileEntryId(model.getPvFileEntryId());
		soapModel.setPvGeneratedDate(model.getPvGeneratedDate());
		soapModel.setPvComplete(model.isPvComplete());
		soapModel.setPbFileEntryId(model.getPbFileEntryId());
		soapModel.setPbPublishedDate(model.getPbPublishedDate());

		return soapModel;
	}

	public static CExtOrganizationSoap[] toSoapModels(CExtOrganization[] models) {
		CExtOrganizationSoap[] soapModels = new CExtOrganizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CExtOrganizationSoap[][] toSoapModels(
		CExtOrganization[][] models) {
		CExtOrganizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CExtOrganizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CExtOrganizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CExtOrganizationSoap[] toSoapModels(
		List<CExtOrganization> models) {
		List<CExtOrganizationSoap> soapModels = new ArrayList<CExtOrganizationSoap>(models.size());

		for (CExtOrganization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CExtOrganizationSoap[soapModels.size()]);
	}

	public CExtOrganizationSoap() {
	}

	public long getPrimaryKey() {
		return _organizationId;
	}

	public void setPrimaryKey(long pk) {
		setOrganizationId(pk);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDiTitle() {
		return _diTitle;
	}

	public void setDiTitle(String diTitle) {
		_diTitle = diTitle;
	}

	public String getDiDescription() {
		return _diDescription;
	}

	public void setDiDescription(String diDescription) {
		_diDescription = diDescription;
	}

	public boolean getDiComplete() {
		return _diComplete;
	}

	public boolean isDiComplete() {
		return _diComplete;
	}

	public void setDiComplete(boolean diComplete) {
		_diComplete = diComplete;
	}

	public String getRfLifeOfFaith() {
		return _rfLifeOfFaith;
	}

	public void setRfLifeOfFaith(String rfLifeOfFaith) {
		_rfLifeOfFaith = rfLifeOfFaith;
	}

	public String getRfStrengthsQualities() {
		return _rfStrengthsQualities;
	}

	public void setRfStrengthsQualities(String rfStrengthsQualities) {
		_rfStrengthsQualities = rfStrengthsQualities;
	}

	public String getRfWorship() {
		return _rfWorship;
	}

	public void setRfWorship(String rfWorship) {
		_rfWorship = rfWorship;
	}

	public String getRfEducationFaithVision() {
		return _rfEducationFaithVision;
	}

	public void setRfEducationFaithVision(String rfEducationFaithVision) {
		_rfEducationFaithVision = rfEducationFaithVision;
	}

	public String getRfMinistryMission() {
		return _rfMinistryMission;
	}

	public void setRfMinistryMission(String rfMinistryMission) {
		_rfMinistryMission = rfMinistryMission;
	}

	public String getRfMeetingHoursPerMonth() {
		return _rfMeetingHoursPerMonth;
	}

	public void setRfMeetingHoursPerMonth(String rfMeetingHoursPerMonth) {
		_rfMeetingHoursPerMonth = rfMeetingHoursPerMonth;
	}

	public String getRfCrisisDisasterAction() {
		return _rfCrisisDisasterAction;
	}

	public void setRfCrisisDisasterAction(String rfCrisisDisasterAction) {
		_rfCrisisDisasterAction = rfCrisisDisasterAction;
	}

	public boolean getRfMinisterGovernanceCopy() {
		return _rfMinisterGovernanceCopy;
	}

	public boolean isRfMinisterGovernanceCopy() {
		return _rfMinisterGovernanceCopy;
	}

	public void setRfMinisterGovernanceCopy(boolean rfMinisterGovernanceCopy) {
		_rfMinisterGovernanceCopy = rfMinisterGovernanceCopy;
	}

	public boolean getRfComplete() {
		return _rfComplete;
	}

	public boolean isRfComplete() {
		return _rfComplete;
	}

	public void setRfComplete(boolean rfComplete) {
		_rfComplete = rfComplete;
	}

	public long getYrFileEntryId() {
		return _yrFileEntryId;
	}

	public void setYrFileEntryId(long yrFileEntryId) {
		_yrFileEntryId = yrFileEntryId;
	}

	public String getYrChurchResponse() {
		return _yrChurchResponse;
	}

	public void setYrChurchResponse(String yrChurchResponse) {
		_yrChurchResponse = yrChurchResponse;
	}

	public boolean getYrComplete() {
		return _yrComplete;
	}

	public boolean isYrComplete() {
		return _yrComplete;
	}

	public void setYrComplete(boolean yrComplete) {
		_yrComplete = yrComplete;
	}

	public int getDgActiveMembers() {
		return _dgActiveMembers;
	}

	public void setDgActiveMembers(int dgActiveMembers) {
		_dgActiveMembers = dgActiveMembers;
	}

	public boolean getDgActiveMembersEstimate() {
		return _dgActiveMembersEstimate;
	}

	public boolean isDgActiveMembersEstimate() {
		return _dgActiveMembersEstimate;
	}

	public void setDgActiveMembersEstimate(boolean dgActiveMembersEstimate) {
		_dgActiveMembersEstimate = dgActiveMembersEstimate;
	}

	public int getDgActiveNonMembers() {
		return _dgActiveNonMembers;
	}

	public void setDgActiveNonMembers(int dgActiveNonMembers) {
		_dgActiveNonMembers = dgActiveNonMembers;
	}

	public boolean getDgActiveNonMembersEstimate() {
		return _dgActiveNonMembersEstimate;
	}

	public boolean isDgActiveNonMembersEstimate() {
		return _dgActiveNonMembersEstimate;
	}

	public void setDgActiveNonMembersEstimate(
		boolean dgActiveNonMembersEstimate) {
		_dgActiveNonMembersEstimate = dgActiveNonMembersEstimate;
	}

	public int getDgPercentMoreThan10() {
		return _dgPercentMoreThan10;
	}

	public void setDgPercentMoreThan10(int dgPercentMoreThan10) {
		_dgPercentMoreThan10 = dgPercentMoreThan10;
	}

	public boolean getDgPercentMoreThan10Estimate() {
		return _dgPercentMoreThan10Estimate;
	}

	public boolean isDgPercentMoreThan10Estimate() {
		return _dgPercentMoreThan10Estimate;
	}

	public void setDgPercentMoreThan10Estimate(
		boolean dgPercentMoreThan10Estimate) {
		_dgPercentMoreThan10Estimate = dgPercentMoreThan10Estimate;
	}

	public int getDgPercent5To10() {
		return _dgPercent5To10;
	}

	public void setDgPercent5To10(int dgPercent5To10) {
		_dgPercent5To10 = dgPercent5To10;
	}

	public boolean getDgPercent5To10Estimate() {
		return _dgPercent5To10Estimate;
	}

	public boolean isDgPercent5To10Estimate() {
		return _dgPercent5To10Estimate;
	}

	public void setDgPercent5To10Estimate(boolean dgPercent5To10Estimate) {
		_dgPercent5To10Estimate = dgPercent5To10Estimate;
	}

	public int getDgPercentLessThan5() {
		return _dgPercentLessThan5;
	}

	public void setDgPercentLessThan5(int dgPercentLessThan5) {
		_dgPercentLessThan5 = dgPercentLessThan5;
	}

	public boolean getDgPercentLessThan5Estimate() {
		return _dgPercentLessThan5Estimate;
	}

	public boolean isDgPercentLessThan5Estimate() {
		return _dgPercentLessThan5Estimate;
	}

	public void setDgPercentLessThan5Estimate(
		boolean dgPercentLessThan5Estimate) {
		_dgPercentLessThan5Estimate = dgPercentLessThan5Estimate;
	}

	public int getDgAge11AndUnder() {
		return _dgAge11AndUnder;
	}

	public void setDgAge11AndUnder(int dgAge11AndUnder) {
		_dgAge11AndUnder = dgAge11AndUnder;
	}

	public int getDgAge12To17() {
		return _dgAge12To17;
	}

	public void setDgAge12To17(int dgAge12To17) {
		_dgAge12To17 = dgAge12To17;
	}

	public int getDgAge18To24() {
		return _dgAge18To24;
	}

	public void setDgAge18To24(int dgAge18To24) {
		_dgAge18To24 = dgAge18To24;
	}

	public int getDgAge25To34() {
		return _dgAge25To34;
	}

	public void setDgAge25To34(int dgAge25To34) {
		_dgAge25To34 = dgAge25To34;
	}

	public int getDgAge35To44() {
		return _dgAge35To44;
	}

	public void setDgAge35To44(int dgAge35To44) {
		_dgAge35To44 = dgAge35To44;
	}

	public int getDgAge45To54() {
		return _dgAge45To54;
	}

	public void setDgAge45To54(int dgAge45To54) {
		_dgAge45To54 = dgAge45To54;
	}

	public int getDgAge55To64() {
		return _dgAge55To64;
	}

	public void setDgAge55To64(int dgAge55To64) {
		_dgAge55To64 = dgAge55To64;
	}

	public int getDgAge65To74() {
		return _dgAge65To74;
	}

	public void setDgAge65To74(int dgAge65To74) {
		_dgAge65To74 = dgAge65To74;
	}

	public int getDgAge75AndOver() {
		return _dgAge75AndOver;
	}

	public void setDgAge75AndOver(int dgAge75AndOver) {
		_dgAge75AndOver = dgAge75AndOver;
	}

	public boolean getDgAllAgesEstimate() {
		return _dgAllAgesEstimate;
	}

	public boolean isDgAllAgesEstimate() {
		return _dgAllAgesEstimate;
	}

	public void setDgAllAgesEstimate(boolean dgAllAgesEstimate) {
		_dgAllAgesEstimate = dgAllAgesEstimate;
	}

	public int getDgPercentSingleUnder35() {
		return _dgPercentSingleUnder35;
	}

	public void setDgPercentSingleUnder35(int dgPercentSingleUnder35) {
		_dgPercentSingleUnder35 = dgPercentSingleUnder35;
	}

	public boolean getDgPercentSingleUnder35Estimate() {
		return _dgPercentSingleUnder35Estimate;
	}

	public boolean isDgPercentSingleUnder35Estimate() {
		return _dgPercentSingleUnder35Estimate;
	}

	public void setDgPercentSingleUnder35Estimate(
		boolean dgPercentSingleUnder35Estimate) {
		_dgPercentSingleUnder35Estimate = dgPercentSingleUnder35Estimate;
	}

	public int getDgPercentWithMinors() {
		return _dgPercentWithMinors;
	}

	public void setDgPercentWithMinors(int dgPercentWithMinors) {
		_dgPercentWithMinors = dgPercentWithMinors;
	}

	public boolean getDgPercentWithMinorsEstimate() {
		return _dgPercentWithMinorsEstimate;
	}

	public boolean isDgPercentWithMinorsEstimate() {
		return _dgPercentWithMinorsEstimate;
	}

	public void setDgPercentWithMinorsEstimate(
		boolean dgPercentWithMinorsEstimate) {
		_dgPercentWithMinorsEstimate = dgPercentWithMinorsEstimate;
	}

	public int getDgPercentSingle35To65() {
		return _dgPercentSingle35To65;
	}

	public void setDgPercentSingle35To65(int dgPercentSingle35To65) {
		_dgPercentSingle35To65 = dgPercentSingle35To65;
	}

	public boolean getDgPercentSingle35To65Estimate() {
		return _dgPercentSingle35To65Estimate;
	}

	public boolean isDgPercentSingle35To65Estimate() {
		return _dgPercentSingle35To65Estimate;
	}

	public void setDgPercentSingle35To65Estimate(
		boolean dgPercentSingle35To65Estimate) {
		_dgPercentSingle35To65Estimate = dgPercentSingle35To65Estimate;
	}

	public int getDgPercentJointNoMinors() {
		return _dgPercentJointNoMinors;
	}

	public void setDgPercentJointNoMinors(int dgPercentJointNoMinors) {
		_dgPercentJointNoMinors = dgPercentJointNoMinors;
	}

	public boolean getDgPercentJointNoMinorsEstimate() {
		return _dgPercentJointNoMinorsEstimate;
	}

	public boolean isDgPercentJointNoMinorsEstimate() {
		return _dgPercentJointNoMinorsEstimate;
	}

	public void setDgPercentJointNoMinorsEstimate(
		boolean dgPercentJointNoMinorsEstimate) {
		_dgPercentJointNoMinorsEstimate = dgPercentJointNoMinorsEstimate;
	}

	public int getDgPercentSingleOver65() {
		return _dgPercentSingleOver65;
	}

	public void setDgPercentSingleOver65(int dgPercentSingleOver65) {
		_dgPercentSingleOver65 = dgPercentSingleOver65;
	}

	public boolean getDgPercentSingleOver65Estimate() {
		return _dgPercentSingleOver65Estimate;
	}

	public boolean isDgPercentSingleOver65Estimate() {
		return _dgPercentSingleOver65Estimate;
	}

	public void setDgPercentSingleOver65Estimate(
		boolean dgPercentSingleOver65Estimate) {
		_dgPercentSingleOver65Estimate = dgPercentSingleOver65Estimate;
	}

	public int getDgPercentHighSchool() {
		return _dgPercentHighSchool;
	}

	public void setDgPercentHighSchool(int dgPercentHighSchool) {
		_dgPercentHighSchool = dgPercentHighSchool;
	}

	public boolean getDgPercentHighSchoolEstimate() {
		return _dgPercentHighSchoolEstimate;
	}

	public boolean isDgPercentHighSchoolEstimate() {
		return _dgPercentHighSchoolEstimate;
	}

	public void setDgPercentHighSchoolEstimate(
		boolean dgPercentHighSchoolEstimate) {
		_dgPercentHighSchoolEstimate = dgPercentHighSchoolEstimate;
	}

	public int getDgPercentCollege() {
		return _dgPercentCollege;
	}

	public void setDgPercentCollege(int dgPercentCollege) {
		_dgPercentCollege = dgPercentCollege;
	}

	public boolean getDgPercentCollegeEstimate() {
		return _dgPercentCollegeEstimate;
	}

	public boolean isDgPercentCollegeEstimate() {
		return _dgPercentCollegeEstimate;
	}

	public void setDgPercentCollegeEstimate(boolean dgPercentCollegeEstimate) {
		_dgPercentCollegeEstimate = dgPercentCollegeEstimate;
	}

	public int getDgPercentGraduateSchool() {
		return _dgPercentGraduateSchool;
	}

	public void setDgPercentGraduateSchool(int dgPercentGraduateSchool) {
		_dgPercentGraduateSchool = dgPercentGraduateSchool;
	}

	public boolean getDgPercentGraduateSchoolEstimate() {
		return _dgPercentGraduateSchoolEstimate;
	}

	public boolean isDgPercentGraduateSchoolEstimate() {
		return _dgPercentGraduateSchoolEstimate;
	}

	public void setDgPercentGraduateSchoolEstimate(
		boolean dgPercentGraduateSchoolEstimate) {
		_dgPercentGraduateSchoolEstimate = dgPercentGraduateSchoolEstimate;
	}

	public int getDgPercentSpecialtyTraining() {
		return _dgPercentSpecialtyTraining;
	}

	public void setDgPercentSpecialtyTraining(int dgPercentSpecialtyTraining) {
		_dgPercentSpecialtyTraining = dgPercentSpecialtyTraining;
	}

	public boolean getDgPercentSpecialtyTrainingEstimate() {
		return _dgPercentSpecialtyTrainingEstimate;
	}

	public boolean isDgPercentSpecialtyTrainingEstimate() {
		return _dgPercentSpecialtyTrainingEstimate;
	}

	public void setDgPercentSpecialtyTrainingEstimate(
		boolean dgPercentSpecialtyTrainingEstimate) {
		_dgPercentSpecialtyTrainingEstimate = dgPercentSpecialtyTrainingEstimate;
	}

	public int getDgPercentOtherEducation() {
		return _dgPercentOtherEducation;
	}

	public void setDgPercentOtherEducation(int dgPercentOtherEducation) {
		_dgPercentOtherEducation = dgPercentOtherEducation;
	}

	public boolean getDgPercentOtherEducationEstimate() {
		return _dgPercentOtherEducationEstimate;
	}

	public boolean isDgPercentOtherEducationEstimate() {
		return _dgPercentOtherEducationEstimate;
	}

	public void setDgPercentOtherEducationEstimate(
		boolean dgPercentOtherEducationEstimate) {
		_dgPercentOtherEducationEstimate = dgPercentOtherEducationEstimate;
	}

	public String getDgPercentOtherEducationDescription() {
		return _dgPercentOtherEducationDescription;
	}

	public void setDgPercentOtherEducationDescription(
		String dgPercentOtherEducationDescription) {
		_dgPercentOtherEducationDescription = dgPercentOtherEducationDescription;
	}

	public int getDgPercentEmployed() {
		return _dgPercentEmployed;
	}

	public void setDgPercentEmployed(int dgPercentEmployed) {
		_dgPercentEmployed = dgPercentEmployed;
	}

	public boolean getDgPercentEmployedEstimate() {
		return _dgPercentEmployedEstimate;
	}

	public boolean isDgPercentEmployedEstimate() {
		return _dgPercentEmployedEstimate;
	}

	public void setDgPercentEmployedEstimate(boolean dgPercentEmployedEstimate) {
		_dgPercentEmployedEstimate = dgPercentEmployedEstimate;
	}

	public int getDgPercentNotFullyEmployed() {
		return _dgPercentNotFullyEmployed;
	}

	public void setDgPercentNotFullyEmployed(int dgPercentNotFullyEmployed) {
		_dgPercentNotFullyEmployed = dgPercentNotFullyEmployed;
	}

	public boolean getDgPercentNotFullyEmployedEstimate() {
		return _dgPercentNotFullyEmployedEstimate;
	}

	public boolean isDgPercentNotFullyEmployedEstimate() {
		return _dgPercentNotFullyEmployedEstimate;
	}

	public void setDgPercentNotFullyEmployedEstimate(
		boolean dgPercentNotFullyEmployedEstimate) {
		_dgPercentNotFullyEmployedEstimate = dgPercentNotFullyEmployedEstimate;
	}

	public int getDgPercentRetired() {
		return _dgPercentRetired;
	}

	public void setDgPercentRetired(int dgPercentRetired) {
		_dgPercentRetired = dgPercentRetired;
	}

	public boolean getDgPercentRetiredEstimate() {
		return _dgPercentRetiredEstimate;
	}

	public boolean isDgPercentRetiredEstimate() {
		return _dgPercentRetiredEstimate;
	}

	public void setDgPercentRetiredEstimate(boolean dgPercentRetiredEstimate) {
		_dgPercentRetiredEstimate = dgPercentRetiredEstimate;
	}

	public String getDgRangeOfOccupations() {
		return _dgRangeOfOccupations;
	}

	public void setDgRangeOfOccupations(String dgRangeOfOccupations) {
		_dgRangeOfOccupations = dgRangeOfOccupations;
	}

	public boolean getDgComplete() {
		return _dgComplete;
	}

	public boolean isDgComplete() {
		return _dgComplete;
	}

	public void setDgComplete(boolean dgComplete) {
		_dgComplete = dgComplete;
	}

	public String getDvEthnicRacialMix() {
		return _dvEthnicRacialMix;
	}

	public void setDvEthnicRacialMix(String dvEthnicRacialMix) {
		_dvEthnicRacialMix = dvEthnicRacialMix;
	}

	public String getDvWelcomingConversation() {
		return _dvWelcomingConversation;
	}

	public void setDvWelcomingConversation(String dvWelcomingConversation) {
		_dvWelcomingConversation = dvWelcomingConversation;
	}

	public String getDvWelcomingComments() {
		return _dvWelcomingComments;
	}

	public void setDvWelcomingComments(String dvWelcomingComments) {
		_dvWelcomingComments = dvWelcomingComments;
	}

	public boolean getDvComplete() {
		return _dvComplete;
	}

	public boolean isDvComplete() {
		return _dvComplete;
	}

	public void setDvComplete(boolean dvComplete) {
		_dvComplete = dvComplete;
	}

	public String getPpComments() {
		return _ppComments;
	}

	public void setPpComments(String ppComments) {
		_ppComments = ppComments;
	}

	public boolean getPpComplete() {
		return _ppComplete;
	}

	public boolean isPpComplete() {
		return _ppComplete;
	}

	public void setPpComplete(boolean ppComplete) {
		_ppComplete = ppComplete;
	}

	public String getSfPreviousRoles() {
		return _sfPreviousRoles;
	}

	public void setSfPreviousRoles(String sfPreviousRoles) {
		_sfPreviousRoles = sfPreviousRoles;
	}

	public boolean getSfComplete() {
		return _sfComplete;
	}

	public boolean isSfComplete() {
		return _sfComplete;
	}

	public void setSfComplete(boolean sfComplete) {
		_sfComplete = sfComplete;
	}

	public String getRvOverallMinistry() {
		return _rvOverallMinistry;
	}

	public void setRvOverallMinistry(String rvOverallMinistry) {
		_rvOverallMinistry = rvOverallMinistry;
	}

	public boolean getRvComplete() {
		return _rvComplete;
	}

	public boolean isRvComplete() {
		return _rvComplete;
	}

	public void setRvComplete(boolean rvComplete) {
		_rvComplete = rvComplete;
	}

	public String getFnYear() {
		return _fnYear;
	}

	public void setFnYear(String fnYear) {
		_fnYear = fnYear;
	}

	public int getFnIncomeOfferingsPledgedGivings() {
		return _fnIncomeOfferingsPledgedGivings;
	}

	public void setFnIncomeOfferingsPledgedGivings(
		int fnIncomeOfferingsPledgedGivings) {
		_fnIncomeOfferingsPledgedGivings = fnIncomeOfferingsPledgedGivings;
	}

	public int getFnIncomeEndowmentProceeds() {
		return _fnIncomeEndowmentProceeds;
	}

	public void setFnIncomeEndowmentProceeds(int fnIncomeEndowmentProceeds) {
		_fnIncomeEndowmentProceeds = fnIncomeEndowmentProceeds;
	}

	public int getFnIncomeEndowmentDraw() {
		return _fnIncomeEndowmentDraw;
	}

	public void setFnIncomeEndowmentDraw(int fnIncomeEndowmentDraw) {
		_fnIncomeEndowmentDraw = fnIncomeEndowmentDraw;
	}

	public int getFnIncomeFundraising() {
		return _fnIncomeFundraising;
	}

	public void setFnIncomeFundraising(int fnIncomeFundraising) {
		_fnIncomeFundraising = fnIncomeFundraising;
	}

	public int getFnIncomeDesignatedGifts() {
		return _fnIncomeDesignatedGifts;
	}

	public void setFnIncomeDesignatedGifts(int fnIncomeDesignatedGifts) {
		_fnIncomeDesignatedGifts = fnIncomeDesignatedGifts;
	}

	public int getFnIncomeGrants() {
		return _fnIncomeGrants;
	}

	public void setFnIncomeGrants(int fnIncomeGrants) {
		_fnIncomeGrants = fnIncomeGrants;
	}

	public int getFnIncomeRentalChurchBuilding() {
		return _fnIncomeRentalChurchBuilding;
	}

	public void setFnIncomeRentalChurchBuilding(
		int fnIncomeRentalChurchBuilding) {
		_fnIncomeRentalChurchBuilding = fnIncomeRentalChurchBuilding;
	}

	public int getFnIncomeRentalChurchParsonage() {
		return _fnIncomeRentalChurchParsonage;
	}

	public void setFnIncomeRentalChurchParsonage(
		int fnIncomeRentalChurchParsonage) {
		_fnIncomeRentalChurchParsonage = fnIncomeRentalChurchParsonage;
	}

	public int getFnIncomeRelatedOrganizations() {
		return _fnIncomeRelatedOrganizations;
	}

	public void setFnIncomeRelatedOrganizations(
		int fnIncomeRelatedOrganizations) {
		_fnIncomeRelatedOrganizations = fnIncomeRelatedOrganizations;
	}

	public int getFnIncomeSpecialAccounts() {
		return _fnIncomeSpecialAccounts;
	}

	public void setFnIncomeSpecialAccounts(int fnIncomeSpecialAccounts) {
		_fnIncomeSpecialAccounts = fnIncomeSpecialAccounts;
	}

	public int getFnExpense() {
		return _fnExpense;
	}

	public void setFnExpense(int fnExpense) {
		_fnExpense = fnExpense;
	}

	public long getFnFileEntryId() {
		return _fnFileEntryId;
	}

	public void setFnFileEntryId(long fnFileEntryId) {
		_fnFileEntryId = fnFileEntryId;
	}

	public int getFnExpenseMinisterialSupportPercent() {
		return _fnExpenseMinisterialSupportPercent;
	}

	public void setFnExpenseMinisterialSupportPercent(
		int fnExpenseMinisterialSupportPercent) {
		_fnExpenseMinisterialSupportPercent = fnExpenseMinisterialSupportPercent;
	}

	public boolean getFnFailToPayMinister() {
		return _fnFailToPayMinister;
	}

	public boolean isFnFailToPayMinister() {
		return _fnFailToPayMinister;
	}

	public void setFnFailToPayMinister(boolean fnFailToPayMinister) {
		_fnFailToPayMinister = fnFailToPayMinister;
	}

	public boolean getFnOurChurchWiderMission() {
		return _fnOurChurchWiderMission;
	}

	public boolean isFnOurChurchWiderMission() {
		return _fnOurChurchWiderMission;
	}

	public void setFnOurChurchWiderMission(boolean fnOurChurchWiderMission) {
		_fnOurChurchWiderMission = fnOurChurchWiderMission;
	}

	public boolean getFnOneGreatHourOfSharing() {
		return _fnOneGreatHourOfSharing;
	}

	public boolean isFnOneGreatHourOfSharing() {
		return _fnOneGreatHourOfSharing;
	}

	public void setFnOneGreatHourOfSharing(boolean fnOneGreatHourOfSharing) {
		_fnOneGreatHourOfSharing = fnOneGreatHourOfSharing;
	}

	public boolean getFnStrenghtenTheChurch() {
		return _fnStrenghtenTheChurch;
	}

	public boolean isFnStrenghtenTheChurch() {
		return _fnStrenghtenTheChurch;
	}

	public void setFnStrenghtenTheChurch(boolean fnStrenghtenTheChurch) {
		_fnStrenghtenTheChurch = fnStrenghtenTheChurch;
	}

	public boolean getFnNeighborsInNeed() {
		return _fnNeighborsInNeed;
	}

	public boolean isFnNeighborsInNeed() {
		return _fnNeighborsInNeed;
	}

	public void setFnNeighborsInNeed(boolean fnNeighborsInNeed) {
		_fnNeighborsInNeed = fnNeighborsInNeed;
	}

	public boolean getFnChristmasFund() {
		return _fnChristmasFund;
	}

	public boolean isFnChristmasFund() {
		return _fnChristmasFund;
	}

	public void setFnChristmasFund(boolean fnChristmasFund) {
		_fnChristmasFund = fnChristmasFund;
	}

	public String getFnOurChurchWiderMissionHow() {
		return _fnOurChurchWiderMissionHow;
	}

	public void setFnOurChurchWiderMissionHow(String fnOurChurchWiderMissionHow) {
		_fnOurChurchWiderMissionHow = fnOurChurchWiderMissionHow;
	}

	public int getFnDebtCurrent() {
		return _fnDebtCurrent;
	}

	public void setFnDebtCurrent(int fnDebtCurrent) {
		_fnDebtCurrent = fnDebtCurrent;
	}

	public int getFnDebtCurrentLoan() {
		return _fnDebtCurrentLoan;
	}

	public void setFnDebtCurrentLoan(int fnDebtCurrentLoan) {
		_fnDebtCurrentLoan = fnDebtCurrentLoan;
	}

	public String getFnDebtReasonFor() {
		return _fnDebtReasonFor;
	}

	public void setFnDebtReasonFor(String fnDebtReasonFor) {
		_fnDebtReasonFor = fnDebtReasonFor;
	}

	public boolean getFnDebtPaymentsCurrent() {
		return _fnDebtPaymentsCurrent;
	}

	public boolean isFnDebtPaymentsCurrent() {
		return _fnDebtPaymentsCurrent;
	}

	public void setFnDebtPaymentsCurrent(boolean fnDebtPaymentsCurrent) {
		_fnDebtPaymentsCurrent = fnDebtPaymentsCurrent;
	}

	public boolean getFnEndowment() {
		return _fnEndowment;
	}

	public boolean isFnEndowment() {
		return _fnEndowment;
	}

	public void setFnEndowment(boolean fnEndowment) {
		_fnEndowment = fnEndowment;
	}

	public int getFnEndowmentMarketValue() {
		return _fnEndowmentMarketValue;
	}

	public void setFnEndowmentMarketValue(int fnEndowmentMarketValue) {
		_fnEndowmentMarketValue = fnEndowmentMarketValue;
	}

	public String getFnEndowmentDrawWhen() {
		return _fnEndowmentDrawWhen;
	}

	public void setFnEndowmentDrawWhen(String fnEndowmentDrawWhen) {
		_fnEndowmentDrawWhen = fnEndowmentDrawWhen;
	}

	public int getFnEndowmentDraw5YearPercent() {
		return _fnEndowmentDraw5YearPercent;
	}

	public void setFnEndowmentDraw5YearPercent(int fnEndowmentDraw5YearPercent) {
		_fnEndowmentDraw5YearPercent = fnEndowmentDraw5YearPercent;
	}

	public String getFnEndowmentDraw5YearToExpense() {
		return _fnEndowmentDraw5YearToExpense;
	}

	public void setFnEndowmentDraw5YearToExpense(
		String fnEndowmentDraw5YearToExpense) {
		_fnEndowmentDraw5YearToExpense = fnEndowmentDraw5YearToExpense;
	}

	public String getFnEndowmentDrawCurrentRateLast() {
		return _fnEndowmentDrawCurrentRateLast;
	}

	public void setFnEndowmentDrawCurrentRateLast(
		String fnEndowmentDrawCurrentRateLast) {
		_fnEndowmentDrawCurrentRateLast = fnEndowmentDrawCurrentRateLast;
	}

	public String getFnEndowmentComment() {
		return _fnEndowmentComment;
	}

	public void setFnEndowmentComment(String fnEndowmentComment) {
		_fnEndowmentComment = fnEndowmentComment;
	}

	public int getFnReserves() {
		return _fnReserves;
	}

	public void setFnReserves(int fnReserves) {
		_fnReserves = fnReserves;
	}

	public int getFnInvestments() {
		return _fnInvestments;
	}

	public void setFnInvestments(int fnInvestments) {
		_fnInvestments = fnInvestments;
	}

	public boolean getFnComplete() {
		return _fnComplete;
	}

	public boolean isFnComplete() {
		return _fnComplete;
	}

	public void setFnComplete(boolean fnComplete) {
		_fnComplete = fnComplete;
	}

	public String getReBuildingProgram() {
		return _reBuildingProgram;
	}

	public void setReBuildingProgram(String reBuildingProgram) {
		_reBuildingProgram = reBuildingProgram;
	}

	public String getReCampaignMissionComponents() {
		return _reCampaignMissionComponents;
	}

	public void setReCampaignMissionComponents(
		String reCampaignMissionComponents) {
		_reCampaignMissionComponents = reCampaignMissionComponents;
	}

	public boolean getReParsonage() {
		return _reParsonage;
	}

	public boolean isReParsonage() {
		return _reParsonage;
	}

	public void setReParsonage(boolean reParsonage) {
		_reParsonage = reParsonage;
	}

	public int getReParsonageMarketValue() {
		return _reParsonageMarketValue;
	}

	public void setReParsonageMarketValue(int reParsonageMarketValue) {
		_reParsonageMarketValue = reParsonageMarketValue;
	}

	public int getReParsonageAssessedValue() {
		return _reParsonageAssessedValue;
	}

	public void setReParsonageAssessedValue(int reParsonageAssessedValue) {
		_reParsonageAssessedValue = reParsonageAssessedValue;
	}

	public String getReParsonageUsage() {
		return _reParsonageUsage;
	}

	public void setReParsonageUsage(String reParsonageUsage) {
		_reParsonageUsage = reParsonageUsage;
	}

	public String getReParsonageStreetAddress() {
		return _reParsonageStreetAddress;
	}

	public void setReParsonageStreetAddress(String reParsonageStreetAddress) {
		_reParsonageStreetAddress = reParsonageStreetAddress;
	}

	public String getReParsonageCity() {
		return _reParsonageCity;
	}

	public void setReParsonageCity(String reParsonageCity) {
		_reParsonageCity = reParsonageCity;
	}

	public String getReParsonageState() {
		return _reParsonageState;
	}

	public void setReParsonageState(String reParsonageState) {
		_reParsonageState = reParsonageState;
	}

	public String getReParsonageZip() {
		return _reParsonageZip;
	}

	public void setReParsonageZip(String reParsonageZip) {
		_reParsonageZip = reParsonageZip;
	}

	public int getReParsonageFootage() {
		return _reParsonageFootage;
	}

	public void setReParsonageFootage(int reParsonageFootage) {
		_reParsonageFootage = reParsonageFootage;
	}

	public int getReParsonageBedrooms() {
		return _reParsonageBedrooms;
	}

	public void setReParsonageBedrooms(int reParsonageBedrooms) {
		_reParsonageBedrooms = reParsonageBedrooms;
	}

	public int getReParsonageBathrooms() {
		return _reParsonageBathrooms;
	}

	public void setReParsonageBathrooms(int reParsonageBathrooms) {
		_reParsonageBathrooms = reParsonageBathrooms;
	}

	public boolean getReParsonageAvailableMinister() {
		return _reParsonageAvailableMinister;
	}

	public boolean isReParsonageAvailableMinister() {
		return _reParsonageAvailableMinister;
	}

	public void setReParsonageAvailableMinister(
		boolean reParsonageAvailableMinister) {
		_reParsonageAvailableMinister = reParsonageAvailableMinister;
	}

	public boolean getReParsonageExpectedMinister() {
		return _reParsonageExpectedMinister;
	}

	public boolean isReParsonageExpectedMinister() {
		return _reParsonageExpectedMinister;
	}

	public void setReParsonageExpectedMinister(
		boolean reParsonageExpectedMinister) {
		_reParsonageExpectedMinister = reParsonageExpectedMinister;
	}

	public String getReParsonageCondition() {
		return _reParsonageCondition;
	}

	public void setReParsonageCondition(String reParsonageCondition) {
		_reParsonageCondition = reParsonageCondition;
	}

	public String getReParsonageResponsibleEntity() {
		return _reParsonageResponsibleEntity;
	}

	public void setReParsonageResponsibleEntity(
		String reParsonageResponsibleEntity) {
		_reParsonageResponsibleEntity = reParsonageResponsibleEntity;
	}

	public String getReOwnedBuildings() {
		return _reOwnedBuildings;
	}

	public void setReOwnedBuildings(String reOwnedBuildings) {
		_reOwnedBuildings = reOwnedBuildings;
	}

	public String getReNonOwnedBuildings() {
		return _reNonOwnedBuildings;
	}

	public void setReNonOwnedBuildings(String reNonOwnedBuildings) {
		_reNonOwnedBuildings = reNonOwnedBuildings;
	}

	public String getReWheelchairAccessible() {
		return _reWheelchairAccessible;
	}

	public void setReWheelchairAccessible(String reWheelchairAccessible) {
		_reWheelchairAccessible = reWheelchairAccessible;
	}

	public String getReFinancesAssetsReview() {
		return _reFinancesAssetsReview;
	}

	public void setReFinancesAssetsReview(String reFinancesAssetsReview) {
		_reFinancesAssetsReview = reFinancesAssetsReview;
	}

	public boolean getReComplete() {
		return _reComplete;
	}

	public boolean isReComplete() {
		return _reComplete;
	}

	public void setReComplete(boolean reComplete) {
		_reComplete = reComplete;
	}

	public String getHiSignificantHappenings() {
		return _hiSignificantHappenings;
	}

	public void setHiSignificantHappenings(String hiSignificantHappenings) {
		_hiSignificantHappenings = hiSignificantHappenings;
	}

	public String getHiManagedChange() {
		return _hiManagedChange;
	}

	public void setHiManagedChange(String hiManagedChange) {
		_hiManagedChange = hiManagedChange;
	}

	public String getHiConflictResolution() {
		return _hiConflictResolution;
	}

	public void setHiConflictResolution(String hiConflictResolution) {
		_hiConflictResolution = hiConflictResolution;
	}

	public String getHiMinisterialLeadershipLearning() {
		return _hiMinisterialLeadershipLearning;
	}

	public void setHiMinisterialLeadershipLearning(
		String hiMinisterialLeadershipLearning) {
		_hiMinisterialLeadershipLearning = hiMinisterialLeadershipLearning;
	}

	public String getHiPressureInvoluntaryTermination() {
		return _hiPressureInvoluntaryTermination;
	}

	public void setHiPressureInvoluntaryTermination(
		String hiPressureInvoluntaryTermination) {
		_hiPressureInvoluntaryTermination = hiPressureInvoluntaryTermination;
	}

	public String getHiSituationalSupportConsultation() {
		return _hiSituationalSupportConsultation;
	}

	public void setHiSituationalSupportConsultation(
		String hiSituationalSupportConsultation) {
		_hiSituationalSupportConsultation = hiSituationalSupportConsultation;
	}

	public String getHiFitnessReview() {
		return _hiFitnessReview;
	}

	public void setHiFitnessReview(String hiFitnessReview) {
		_hiFitnessReview = hiFitnessReview;
	}

	public boolean getHiComplete() {
		return _hiComplete;
	}

	public boolean isHiComplete() {
		return _hiComplete;
	}

	public void setHiComplete(boolean hiComplete) {
		_hiComplete = hiComplete;
	}

	public String getCmServiceAdvocacy() {
		return _cmServiceAdvocacy;
	}

	public void setCmServiceAdvocacy(String cmServiceAdvocacy) {
		_cmServiceAdvocacy = cmServiceAdvocacy;
	}

	public String getCmMeetingsRelationshipsActivities() {
		return _cmMeetingsRelationshipsActivities;
	}

	public void setCmMeetingsRelationshipsActivities(
		String cmMeetingsRelationshipsActivities) {
		_cmMeetingsRelationshipsActivities = cmMeetingsRelationshipsActivities;
	}

	public boolean getCmAccessibleToAll() {
		return _cmAccessibleToAll;
	}

	public boolean isCmAccessibleToAll() {
		return _cmAccessibleToAll;
	}

	public void setCmAccessibleToAll(boolean cmAccessibleToAll) {
		_cmAccessibleToAll = cmAccessibleToAll;
	}

	public boolean getCmCreationJustice() {
		return _cmCreationJustice;
	}

	public boolean isCmCreationJustice() {
		return _cmCreationJustice;
	}

	public void setCmCreationJustice(boolean cmCreationJustice) {
		_cmCreationJustice = cmCreationJustice;
	}

	public boolean getCmEconomicJustice() {
		return _cmEconomicJustice;
	}

	public boolean isCmEconomicJustice() {
		return _cmEconomicJustice;
	}

	public void setCmEconomicJustice(boolean cmEconomicJustice) {
		_cmEconomicJustice = cmEconomicJustice;
	}

	public boolean getCmFaithfulAndWelcoming() {
		return _cmFaithfulAndWelcoming;
	}

	public boolean isCmFaithfulAndWelcoming() {
		return _cmFaithfulAndWelcoming;
	}

	public void setCmFaithfulAndWelcoming(boolean cmFaithfulAndWelcoming) {
		_cmFaithfulAndWelcoming = cmFaithfulAndWelcoming;
	}

	public boolean getCmGodIsStillSpeaking() {
		return _cmGodIsStillSpeaking;
	}

	public boolean isCmGodIsStillSpeaking() {
		return _cmGodIsStillSpeaking;
	}

	public void setCmGodIsStillSpeaking(boolean cmGodIsStillSpeaking) {
		_cmGodIsStillSpeaking = cmGodIsStillSpeaking;
	}

	public boolean getCmBorderAndImmigrantJustice() {
		return _cmBorderAndImmigrantJustice;
	}

	public boolean isCmBorderAndImmigrantJustice() {
		return _cmBorderAndImmigrantJustice;
	}

	public void setCmBorderAndImmigrantJustice(
		boolean cmBorderAndImmigrantJustice) {
		_cmBorderAndImmigrantJustice = cmBorderAndImmigrantJustice;
	}

	public boolean getCmInterCulturalMultiRacial() {
		return _cmInterCulturalMultiRacial;
	}

	public boolean isCmInterCulturalMultiRacial() {
		return _cmInterCulturalMultiRacial;
	}

	public void setCmInterCulturalMultiRacial(
		boolean cmInterCulturalMultiRacial) {
		_cmInterCulturalMultiRacial = cmInterCulturalMultiRacial;
	}

	public boolean getCmJustPeace() {
		return _cmJustPeace;
	}

	public boolean isCmJustPeace() {
		return _cmJustPeace;
	}

	public void setCmJustPeace(boolean cmJustPeace) {
		_cmJustPeace = cmJustPeace;
	}

	public boolean getCmGlobalMissionChurch() {
		return _cmGlobalMissionChurch;
	}

	public boolean isCmGlobalMissionChurch() {
		return _cmGlobalMissionChurch;
	}

	public void setCmGlobalMissionChurch(boolean cmGlobalMissionChurch) {
		_cmGlobalMissionChurch = cmGlobalMissionChurch;
	}

	public boolean getCmOpenAndAffirming() {
		return _cmOpenAndAffirming;
	}

	public boolean isCmOpenAndAffirming() {
		return _cmOpenAndAffirming;
	}

	public void setCmOpenAndAffirming(boolean cmOpenAndAffirming) {
		_cmOpenAndAffirming = cmOpenAndAffirming;
	}

	public boolean getCmWISECongregationForMentalHealth() {
		return _cmWISECongregationForMentalHealth;
	}

	public boolean isCmWISECongregationForMentalHealth() {
		return _cmWISECongregationForMentalHealth;
	}

	public void setCmWISECongregationForMentalHealth(
		boolean cmWISECongregationForMentalHealth) {
		_cmWISECongregationForMentalHealth = cmWISECongregationForMentalHealth;
	}

	public boolean getCmOtherUCCDesignations() {
		return _cmOtherUCCDesignations;
	}

	public boolean isCmOtherUCCDesignations() {
		return _cmOtherUCCDesignations;
	}

	public void setCmOtherUCCDesignations(boolean cmOtherUCCDesignations) {
		_cmOtherUCCDesignations = cmOtherUCCDesignations;
	}

	public boolean getCmDesignationsOtherDenominations() {
		return _cmDesignationsOtherDenominations;
	}

	public boolean isCmDesignationsOtherDenominations() {
		return _cmDesignationsOtherDenominations;
	}

	public void setCmDesignationsOtherDenominations(
		boolean cmDesignationsOtherDenominations) {
		_cmDesignationsOtherDenominations = cmDesignationsOtherDenominations;
	}

	public String getCmStatementsReflection() {
		return _cmStatementsReflection;
	}

	public void setCmStatementsReflection(String cmStatementsReflection) {
		_cmStatementsReflection = cmStatementsReflection;
	}

	public String getCmWorkTowardWitnessFuture() {
		return _cmWorkTowardWitnessFuture;
	}

	public void setCmWorkTowardWitnessFuture(String cmWorkTowardWitnessFuture) {
		_cmWorkTowardWitnessFuture = cmWorkTowardWitnessFuture;
	}

	public String getCmEcumenicalInterfaithParticipation() {
		return _cmEcumenicalInterfaithParticipation;
	}

	public void setCmEcumenicalInterfaithParticipation(
		String cmEcumenicalInterfaithParticipation) {
		_cmEcumenicalInterfaithParticipation = cmEcumenicalInterfaithParticipation;
	}

	public String getCmMissionStatementComparison() {
		return _cmMissionStatementComparison;
	}

	public void setCmMissionStatementComparison(
		String cmMissionStatementComparison) {
		_cmMissionStatementComparison = cmMissionStatementComparison;
	}

	public String getCmPastorTimeExpectations() {
		return _cmPastorTimeExpectations;
	}

	public void setCmPastorTimeExpectations(String cmPastorTimeExpectations) {
		_cmPastorTimeExpectations = cmPastorTimeExpectations;
	}

	public boolean getCmComplete() {
		return _cmComplete;
	}

	public boolean isCmComplete() {
		return _cmComplete;
	}

	public void setCmComplete(boolean cmComplete) {
		_cmComplete = cmComplete;
	}

	public String getMiMissionInSiteTrendsOpportunities() {
		return _miMissionInSiteTrendsOpportunities;
	}

	public void setMiMissionInSiteTrendsOpportunities(
		String miMissionInSiteTrendsOpportunities) {
		_miMissionInSiteTrendsOpportunities = miMissionInSiteTrendsOpportunities;
	}

	public String getMiCongregationDemographicsComparison() {
		return _miCongregationDemographicsComparison;
	}

	public void setMiCongregationDemographicsComparison(
		String miCongregationDemographicsComparison) {
		_miCongregationDemographicsComparison = miCongregationDemographicsComparison;
	}

	public String getMiCommunityDemographicsImpact() {
		return _miCommunityDemographicsImpact;
	}

	public void setMiCommunityDemographicsImpact(
		String miCommunityDemographicsImpact) {
		_miCommunityDemographicsImpact = miCommunityDemographicsImpact;
	}

	public String getMiKnownForInCommunity() {
		return _miKnownForInCommunity;
	}

	public void setMiKnownForInCommunity(String miKnownForInCommunity) {
		_miKnownForInCommunity = miKnownForInCommunity;
	}

	public String getMiWhyNewPeopleInvolved() {
		return _miWhyNewPeopleInvolved;
	}

	public void setMiWhyNewPeopleInvolved(String miWhyNewPeopleInvolved) {
		_miWhyNewPeopleInvolved = miWhyNewPeopleInvolved;
	}

	public boolean getMiComplete() {
		return _miComplete;
	}

	public boolean isMiComplete() {
		return _miComplete;
	}

	public void setMiComplete(boolean miComplete) {
		_miComplete = miComplete;
	}

	public String getVsGodsCallToBecome() {
		return _vsGodsCallToBecome;
	}

	public void setVsGodsCallToBecome(String vsGodsCallToBecome) {
		_vsGodsCallToBecome = vsGodsCallToBecome;
	}

	public String getVsGodsCallToReachOut() {
		return _vsGodsCallToReachOut;
	}

	public void setVsGodsCallToReachOut(String vsGodsCallToReachOut) {
		_vsGodsCallToReachOut = vsGodsCallToReachOut;
	}

	public boolean getVsComplete() {
		return _vsComplete;
	}

	public boolean isVsComplete() {
		return _vsComplete;
	}

	public void setVsComplete(boolean vsComplete) {
		_vsComplete = vsComplete;
	}

	public long getPvFileEntryId() {
		return _pvFileEntryId;
	}

	public void setPvFileEntryId(long pvFileEntryId) {
		_pvFileEntryId = pvFileEntryId;
	}

	public Date getPvGeneratedDate() {
		return _pvGeneratedDate;
	}

	public void setPvGeneratedDate(Date pvGeneratedDate) {
		_pvGeneratedDate = pvGeneratedDate;
	}

	public boolean getPvComplete() {
		return _pvComplete;
	}

	public boolean isPvComplete() {
		return _pvComplete;
	}

	public void setPvComplete(boolean pvComplete) {
		_pvComplete = pvComplete;
	}

	public long getPbFileEntryId() {
		return _pbFileEntryId;
	}

	public void setPbFileEntryId(long pbFileEntryId) {
		_pbFileEntryId = pbFileEntryId;
	}

	public Date getPbPublishedDate() {
		return _pbPublishedDate;
	}

	public void setPbPublishedDate(Date pbPublishedDate) {
		_pbPublishedDate = pbPublishedDate;
	}

	private long _organizationId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _diTitle;
	private String _diDescription;
	private boolean _diComplete;
	private String _rfLifeOfFaith;
	private String _rfStrengthsQualities;
	private String _rfWorship;
	private String _rfEducationFaithVision;
	private String _rfMinistryMission;
	private String _rfMeetingHoursPerMonth;
	private String _rfCrisisDisasterAction;
	private boolean _rfMinisterGovernanceCopy;
	private boolean _rfComplete;
	private long _yrFileEntryId;
	private String _yrChurchResponse;
	private boolean _yrComplete;
	private int _dgActiveMembers;
	private boolean _dgActiveMembersEstimate;
	private int _dgActiveNonMembers;
	private boolean _dgActiveNonMembersEstimate;
	private int _dgPercentMoreThan10;
	private boolean _dgPercentMoreThan10Estimate;
	private int _dgPercent5To10;
	private boolean _dgPercent5To10Estimate;
	private int _dgPercentLessThan5;
	private boolean _dgPercentLessThan5Estimate;
	private int _dgAge11AndUnder;
	private int _dgAge12To17;
	private int _dgAge18To24;
	private int _dgAge25To34;
	private int _dgAge35To44;
	private int _dgAge45To54;
	private int _dgAge55To64;
	private int _dgAge65To74;
	private int _dgAge75AndOver;
	private boolean _dgAllAgesEstimate;
	private int _dgPercentSingleUnder35;
	private boolean _dgPercentSingleUnder35Estimate;
	private int _dgPercentWithMinors;
	private boolean _dgPercentWithMinorsEstimate;
	private int _dgPercentSingle35To65;
	private boolean _dgPercentSingle35To65Estimate;
	private int _dgPercentJointNoMinors;
	private boolean _dgPercentJointNoMinorsEstimate;
	private int _dgPercentSingleOver65;
	private boolean _dgPercentSingleOver65Estimate;
	private int _dgPercentHighSchool;
	private boolean _dgPercentHighSchoolEstimate;
	private int _dgPercentCollege;
	private boolean _dgPercentCollegeEstimate;
	private int _dgPercentGraduateSchool;
	private boolean _dgPercentGraduateSchoolEstimate;
	private int _dgPercentSpecialtyTraining;
	private boolean _dgPercentSpecialtyTrainingEstimate;
	private int _dgPercentOtherEducation;
	private boolean _dgPercentOtherEducationEstimate;
	private String _dgPercentOtherEducationDescription;
	private int _dgPercentEmployed;
	private boolean _dgPercentEmployedEstimate;
	private int _dgPercentNotFullyEmployed;
	private boolean _dgPercentNotFullyEmployedEstimate;
	private int _dgPercentRetired;
	private boolean _dgPercentRetiredEstimate;
	private String _dgRangeOfOccupations;
	private boolean _dgComplete;
	private String _dvEthnicRacialMix;
	private String _dvWelcomingConversation;
	private String _dvWelcomingComments;
	private boolean _dvComplete;
	private String _ppComments;
	private boolean _ppComplete;
	private String _sfPreviousRoles;
	private boolean _sfComplete;
	private String _rvOverallMinistry;
	private boolean _rvComplete;
	private String _fnYear;
	private int _fnIncomeOfferingsPledgedGivings;
	private int _fnIncomeEndowmentProceeds;
	private int _fnIncomeEndowmentDraw;
	private int _fnIncomeFundraising;
	private int _fnIncomeDesignatedGifts;
	private int _fnIncomeGrants;
	private int _fnIncomeRentalChurchBuilding;
	private int _fnIncomeRentalChurchParsonage;
	private int _fnIncomeRelatedOrganizations;
	private int _fnIncomeSpecialAccounts;
	private int _fnExpense;
	private long _fnFileEntryId;
	private int _fnExpenseMinisterialSupportPercent;
	private boolean _fnFailToPayMinister;
	private boolean _fnOurChurchWiderMission;
	private boolean _fnOneGreatHourOfSharing;
	private boolean _fnStrenghtenTheChurch;
	private boolean _fnNeighborsInNeed;
	private boolean _fnChristmasFund;
	private String _fnOurChurchWiderMissionHow;
	private int _fnDebtCurrent;
	private int _fnDebtCurrentLoan;
	private String _fnDebtReasonFor;
	private boolean _fnDebtPaymentsCurrent;
	private boolean _fnEndowment;
	private int _fnEndowmentMarketValue;
	private String _fnEndowmentDrawWhen;
	private int _fnEndowmentDraw5YearPercent;
	private String _fnEndowmentDraw5YearToExpense;
	private String _fnEndowmentDrawCurrentRateLast;
	private String _fnEndowmentComment;
	private int _fnReserves;
	private int _fnInvestments;
	private boolean _fnComplete;
	private String _reBuildingProgram;
	private String _reCampaignMissionComponents;
	private boolean _reParsonage;
	private int _reParsonageMarketValue;
	private int _reParsonageAssessedValue;
	private String _reParsonageUsage;
	private String _reParsonageStreetAddress;
	private String _reParsonageCity;
	private String _reParsonageState;
	private String _reParsonageZip;
	private int _reParsonageFootage;
	private int _reParsonageBedrooms;
	private int _reParsonageBathrooms;
	private boolean _reParsonageAvailableMinister;
	private boolean _reParsonageExpectedMinister;
	private String _reParsonageCondition;
	private String _reParsonageResponsibleEntity;
	private String _reOwnedBuildings;
	private String _reNonOwnedBuildings;
	private String _reWheelchairAccessible;
	private String _reFinancesAssetsReview;
	private boolean _reComplete;
	private String _hiSignificantHappenings;
	private String _hiManagedChange;
	private String _hiConflictResolution;
	private String _hiMinisterialLeadershipLearning;
	private String _hiPressureInvoluntaryTermination;
	private String _hiSituationalSupportConsultation;
	private String _hiFitnessReview;
	private boolean _hiComplete;
	private String _cmServiceAdvocacy;
	private String _cmMeetingsRelationshipsActivities;
	private boolean _cmAccessibleToAll;
	private boolean _cmCreationJustice;
	private boolean _cmEconomicJustice;
	private boolean _cmFaithfulAndWelcoming;
	private boolean _cmGodIsStillSpeaking;
	private boolean _cmBorderAndImmigrantJustice;
	private boolean _cmInterCulturalMultiRacial;
	private boolean _cmJustPeace;
	private boolean _cmGlobalMissionChurch;
	private boolean _cmOpenAndAffirming;
	private boolean _cmWISECongregationForMentalHealth;
	private boolean _cmOtherUCCDesignations;
	private boolean _cmDesignationsOtherDenominations;
	private String _cmStatementsReflection;
	private String _cmWorkTowardWitnessFuture;
	private String _cmEcumenicalInterfaithParticipation;
	private String _cmMissionStatementComparison;
	private String _cmPastorTimeExpectations;
	private boolean _cmComplete;
	private String _miMissionInSiteTrendsOpportunities;
	private String _miCongregationDemographicsComparison;
	private String _miCommunityDemographicsImpact;
	private String _miKnownForInCommunity;
	private String _miWhyNewPeopleInvolved;
	private boolean _miComplete;
	private String _vsGodsCallToBecome;
	private String _vsGodsCallToReachOut;
	private boolean _vsComplete;
	private long _pvFileEntryId;
	private Date _pvGeneratedDate;
	private boolean _pvComplete;
	private long _pbFileEntryId;
	private Date _pbPublishedDate;
}