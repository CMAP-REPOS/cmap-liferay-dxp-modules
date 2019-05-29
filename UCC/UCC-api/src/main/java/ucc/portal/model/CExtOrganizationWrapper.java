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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CExtOrganization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CExtOrganization
 * @generated
 */
@ProviderType
public class CExtOrganizationWrapper implements CExtOrganization,
	ModelWrapper<CExtOrganization> {
	public CExtOrganizationWrapper(CExtOrganization cExtOrganization) {
		_cExtOrganization = cExtOrganization;
	}

	@Override
	public Class<?> getModelClass() {
		return CExtOrganization.class;
	}

	@Override
	public String getModelClassName() {
		return CExtOrganization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("diTitle", getDiTitle());
		attributes.put("diDescription", getDiDescription());
		attributes.put("diComplete", isDiComplete());
		attributes.put("rfLifeOfFaith", getRfLifeOfFaith());
		attributes.put("rfStrengthsQualities", getRfStrengthsQualities());
		attributes.put("rfWorship", getRfWorship());
		attributes.put("rfEducationFaithVision", getRfEducationFaithVision());
		attributes.put("rfMinistryMission", getRfMinistryMission());
		attributes.put("rfMeetingHoursPerMonth", getRfMeetingHoursPerMonth());
		attributes.put("rfCrisisDisasterAction", getRfCrisisDisasterAction());
		attributes.put("rfMinisterGovernanceCopy", isRfMinisterGovernanceCopy());
		attributes.put("rfComplete", isRfComplete());
		attributes.put("yrFileEntryId", getYrFileEntryId());
		attributes.put("yrChurchResponse", getYrChurchResponse());
		attributes.put("yrComplete", isYrComplete());
		attributes.put("dgActiveMembers", getDgActiveMembers());
		attributes.put("dgActiveMembersEstimate", isDgActiveMembersEstimate());
		attributes.put("dgActiveNonMembers", getDgActiveNonMembers());
		attributes.put("dgActiveNonMembersEstimate",
			isDgActiveNonMembersEstimate());
		attributes.put("dgPercentMoreThan10", getDgPercentMoreThan10());
		attributes.put("dgPercentMoreThan10Estimate",
			isDgPercentMoreThan10Estimate());
		attributes.put("dgPercent5To10", getDgPercent5To10());
		attributes.put("dgPercent5To10Estimate", isDgPercent5To10Estimate());
		attributes.put("dgPercentLessThan5", getDgPercentLessThan5());
		attributes.put("dgPercentLessThan5Estimate",
			isDgPercentLessThan5Estimate());
		attributes.put("dgAge11AndUnder", getDgAge11AndUnder());
		attributes.put("dgAge12To17", getDgAge12To17());
		attributes.put("dgAge18To24", getDgAge18To24());
		attributes.put("dgAge25To34", getDgAge25To34());
		attributes.put("dgAge35To44", getDgAge35To44());
		attributes.put("dgAge45To54", getDgAge45To54());
		attributes.put("dgAge55To64", getDgAge55To64());
		attributes.put("dgAge65To74", getDgAge65To74());
		attributes.put("dgAge75AndOver", getDgAge75AndOver());
		attributes.put("dgAllAgesEstimate", isDgAllAgesEstimate());
		attributes.put("dgPercentSingleUnder35", getDgPercentSingleUnder35());
		attributes.put("dgPercentSingleUnder35Estimate",
			isDgPercentSingleUnder35Estimate());
		attributes.put("dgPercentWithMinors", getDgPercentWithMinors());
		attributes.put("dgPercentWithMinorsEstimate",
			isDgPercentWithMinorsEstimate());
		attributes.put("dgPercentSingle35To65", getDgPercentSingle35To65());
		attributes.put("dgPercentSingle35To65Estimate",
			isDgPercentSingle35To65Estimate());
		attributes.put("dgPercentJointNoMinors", getDgPercentJointNoMinors());
		attributes.put("dgPercentJointNoMinorsEstimate",
			isDgPercentJointNoMinorsEstimate());
		attributes.put("dgPercentSingleOver65", getDgPercentSingleOver65());
		attributes.put("dgPercentSingleOver65Estimate",
			isDgPercentSingleOver65Estimate());
		attributes.put("dgPercentHighSchool", getDgPercentHighSchool());
		attributes.put("dgPercentHighSchoolEstimate",
			isDgPercentHighSchoolEstimate());
		attributes.put("dgPercentCollege", getDgPercentCollege());
		attributes.put("dgPercentCollegeEstimate", isDgPercentCollegeEstimate());
		attributes.put("dgPercentGraduateSchool", getDgPercentGraduateSchool());
		attributes.put("dgPercentGraduateSchoolEstimate",
			isDgPercentGraduateSchoolEstimate());
		attributes.put("dgPercentSpecialtyTraining",
			getDgPercentSpecialtyTraining());
		attributes.put("dgPercentSpecialtyTrainingEstimate",
			isDgPercentSpecialtyTrainingEstimate());
		attributes.put("dgPercentOtherEducation", getDgPercentOtherEducation());
		attributes.put("dgPercentOtherEducationEstimate",
			isDgPercentOtherEducationEstimate());
		attributes.put("dgPercentOtherEducationDescription",
			getDgPercentOtherEducationDescription());
		attributes.put("dgPercentEmployed", getDgPercentEmployed());
		attributes.put("dgPercentEmployedEstimate",
			isDgPercentEmployedEstimate());
		attributes.put("dgPercentNotFullyEmployed",
			getDgPercentNotFullyEmployed());
		attributes.put("dgPercentNotFullyEmployedEstimate",
			isDgPercentNotFullyEmployedEstimate());
		attributes.put("dgPercentRetired", getDgPercentRetired());
		attributes.put("dgPercentRetiredEstimate", isDgPercentRetiredEstimate());
		attributes.put("dgRangeOfOccupations", getDgRangeOfOccupations());
		attributes.put("dgComplete", isDgComplete());
		attributes.put("dvEthnicRacialMix", getDvEthnicRacialMix());
		attributes.put("dvWelcomingConversation", getDvWelcomingConversation());
		attributes.put("dvWelcomingComments", getDvWelcomingComments());
		attributes.put("dvComplete", isDvComplete());
		attributes.put("ppComments", getPpComments());
		attributes.put("ppComplete", isPpComplete());
		attributes.put("sfPreviousRoles", getSfPreviousRoles());
		attributes.put("sfComplete", isSfComplete());
		attributes.put("rvOverallMinistry", getRvOverallMinistry());
		attributes.put("rvComplete", isRvComplete());
		attributes.put("fnYear", getFnYear());
		attributes.put("fnIncomeOfferingsPledgedGivings",
			getFnIncomeOfferingsPledgedGivings());
		attributes.put("fnIncomeEndowmentProceeds",
			getFnIncomeEndowmentProceeds());
		attributes.put("fnIncomeEndowmentDraw", getFnIncomeEndowmentDraw());
		attributes.put("fnIncomeFundraising", getFnIncomeFundraising());
		attributes.put("fnIncomeDesignatedGifts", getFnIncomeDesignatedGifts());
		attributes.put("fnIncomeGrants", getFnIncomeGrants());
		attributes.put("fnIncomeRentalChurchBuilding",
			getFnIncomeRentalChurchBuilding());
		attributes.put("fnIncomeRentalChurchParsonage",
			getFnIncomeRentalChurchParsonage());
		attributes.put("fnIncomeRelatedOrganizations",
			getFnIncomeRelatedOrganizations());
		attributes.put("fnIncomeSpecialAccounts", getFnIncomeSpecialAccounts());
		attributes.put("fnExpense", getFnExpense());
		attributes.put("fnFileEntryId", getFnFileEntryId());
		attributes.put("fnExpenseMinisterialSupportPercent",
			getFnExpenseMinisterialSupportPercent());
		attributes.put("fnFailToPayMinister", isFnFailToPayMinister());
		attributes.put("fnOurChurchWiderMission", isFnOurChurchWiderMission());
		attributes.put("fnOneGreatHourOfSharing", isFnOneGreatHourOfSharing());
		attributes.put("fnStrenghtenTheChurch", isFnStrenghtenTheChurch());
		attributes.put("fnNeighborsInNeed", isFnNeighborsInNeed());
		attributes.put("fnChristmasFund", isFnChristmasFund());
		attributes.put("fnOurChurchWiderMissionHow",
			getFnOurChurchWiderMissionHow());
		attributes.put("fnDebtCurrent", getFnDebtCurrent());
		attributes.put("fnDebtCurrentLoan", getFnDebtCurrentLoan());
		attributes.put("fnDebtReasonFor", getFnDebtReasonFor());
		attributes.put("fnDebtPaymentsCurrent", isFnDebtPaymentsCurrent());
		attributes.put("fnEndowment", isFnEndowment());
		attributes.put("fnEndowmentMarketValue", getFnEndowmentMarketValue());
		attributes.put("fnEndowmentDrawWhen", getFnEndowmentDrawWhen());
		attributes.put("fnEndowmentDraw5YearPercent",
			getFnEndowmentDraw5YearPercent());
		attributes.put("fnEndowmentDraw5YearToExpense",
			getFnEndowmentDraw5YearToExpense());
		attributes.put("fnEndowmentDrawCurrentRateLast",
			getFnEndowmentDrawCurrentRateLast());
		attributes.put("fnEndowmentComment", getFnEndowmentComment());
		attributes.put("fnReserves", getFnReserves());
		attributes.put("fnInvestments", getFnInvestments());
		attributes.put("fnComplete", isFnComplete());
		attributes.put("reBuildingProgram", getReBuildingProgram());
		attributes.put("reCampaignMissionComponents",
			getReCampaignMissionComponents());
		attributes.put("reParsonage", isReParsonage());
		attributes.put("reParsonageMarketValue", getReParsonageMarketValue());
		attributes.put("reParsonageAssessedValue", getReParsonageAssessedValue());
		attributes.put("reParsonageUsage", getReParsonageUsage());
		attributes.put("reParsonageStreetAddress", getReParsonageStreetAddress());
		attributes.put("reParsonageCity", getReParsonageCity());
		attributes.put("reParsonageState", getReParsonageState());
		attributes.put("reParsonageZip", getReParsonageZip());
		attributes.put("reParsonageFootage", getReParsonageFootage());
		attributes.put("reParsonageBedrooms", getReParsonageBedrooms());
		attributes.put("reParsonageBathrooms", getReParsonageBathrooms());
		attributes.put("reParsonageAvailableMinister",
			isReParsonageAvailableMinister());
		attributes.put("reParsonageExpectedMinister",
			isReParsonageExpectedMinister());
		attributes.put("reParsonageCondition", getReParsonageCondition());
		attributes.put("reParsonageResponsibleEntity",
			getReParsonageResponsibleEntity());
		attributes.put("reOwnedBuildings", getReOwnedBuildings());
		attributes.put("reNonOwnedBuildings", getReNonOwnedBuildings());
		attributes.put("reWheelchairAccessible", getReWheelchairAccessible());
		attributes.put("reFinancesAssetsReview", getReFinancesAssetsReview());
		attributes.put("reComplete", isReComplete());
		attributes.put("hiSignificantHappenings", getHiSignificantHappenings());
		attributes.put("hiManagedChange", getHiManagedChange());
		attributes.put("hiConflictResolution", getHiConflictResolution());
		attributes.put("hiMinisterialLeadershipLearning",
			getHiMinisterialLeadershipLearning());
		attributes.put("hiPressureInvoluntaryTermination",
			getHiPressureInvoluntaryTermination());
		attributes.put("hiSituationalSupportConsultation",
			getHiSituationalSupportConsultation());
		attributes.put("hiFitnessReview", getHiFitnessReview());
		attributes.put("hiComplete", isHiComplete());
		attributes.put("cmServiceAdvocacy", getCmServiceAdvocacy());
		attributes.put("cmMeetingsRelationshipsActivities",
			getCmMeetingsRelationshipsActivities());
		attributes.put("cmAccessibleToAll", isCmAccessibleToAll());
		attributes.put("cmCreationJustice", isCmCreationJustice());
		attributes.put("cmEconomicJustice", isCmEconomicJustice());
		attributes.put("cmFaithfulAndWelcoming", isCmFaithfulAndWelcoming());
		attributes.put("cmGodIsStillSpeaking", isCmGodIsStillSpeaking());
		attributes.put("cmBorderAndImmigrantJustice",
			isCmBorderAndImmigrantJustice());
		attributes.put("cmInterCulturalMultiRacial",
			isCmInterCulturalMultiRacial());
		attributes.put("cmJustPeace", isCmJustPeace());
		attributes.put("cmGlobalMissionChurch", isCmGlobalMissionChurch());
		attributes.put("cmOpenAndAffirming", isCmOpenAndAffirming());
		attributes.put("cmWISECongregationForMentalHealth",
			isCmWISECongregationForMentalHealth());
		attributes.put("cmOtherUCCDesignations", isCmOtherUCCDesignations());
		attributes.put("cmDesignationsOtherDenominations",
			isCmDesignationsOtherDenominations());
		attributes.put("cmStatementsReflection", getCmStatementsReflection());
		attributes.put("cmWorkTowardWitnessFuture",
			getCmWorkTowardWitnessFuture());
		attributes.put("cmEcumenicalInterfaithParticipation",
			getCmEcumenicalInterfaithParticipation());
		attributes.put("cmMissionStatementComparison",
			getCmMissionStatementComparison());
		attributes.put("cmPastorTimeExpectations", getCmPastorTimeExpectations());
		attributes.put("cmComplete", isCmComplete());
		attributes.put("miMissionInSiteTrendsOpportunities",
			getMiMissionInSiteTrendsOpportunities());
		attributes.put("miCongregationDemographicsComparison",
			getMiCongregationDemographicsComparison());
		attributes.put("miCommunityDemographicsImpact",
			getMiCommunityDemographicsImpact());
		attributes.put("miKnownForInCommunity", getMiKnownForInCommunity());
		attributes.put("miWhyNewPeopleInvolved", getMiWhyNewPeopleInvolved());
		attributes.put("miComplete", isMiComplete());
		attributes.put("vsGodsCallToBecome", getVsGodsCallToBecome());
		attributes.put("vsGodsCallToReachOut", getVsGodsCallToReachOut());
		attributes.put("vsComplete", isVsComplete());
		attributes.put("pvFileEntryId", getPvFileEntryId());
		attributes.put("pvGeneratedDate", getPvGeneratedDate());
		attributes.put("pvComplete", isPvComplete());
		attributes.put("pbFileEntryId", getPbFileEntryId());
		attributes.put("pbPublishedDate", getPbPublishedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String diTitle = (String)attributes.get("diTitle");

		if (diTitle != null) {
			setDiTitle(diTitle);
		}

		String diDescription = (String)attributes.get("diDescription");

		if (diDescription != null) {
			setDiDescription(diDescription);
		}

		Boolean diComplete = (Boolean)attributes.get("diComplete");

		if (diComplete != null) {
			setDiComplete(diComplete);
		}

		String rfLifeOfFaith = (String)attributes.get("rfLifeOfFaith");

		if (rfLifeOfFaith != null) {
			setRfLifeOfFaith(rfLifeOfFaith);
		}

		String rfStrengthsQualities = (String)attributes.get(
				"rfStrengthsQualities");

		if (rfStrengthsQualities != null) {
			setRfStrengthsQualities(rfStrengthsQualities);
		}

		String rfWorship = (String)attributes.get("rfWorship");

		if (rfWorship != null) {
			setRfWorship(rfWorship);
		}

		String rfEducationFaithVision = (String)attributes.get(
				"rfEducationFaithVision");

		if (rfEducationFaithVision != null) {
			setRfEducationFaithVision(rfEducationFaithVision);
		}

		String rfMinistryMission = (String)attributes.get("rfMinistryMission");

		if (rfMinistryMission != null) {
			setRfMinistryMission(rfMinistryMission);
		}

		String rfMeetingHoursPerMonth = (String)attributes.get(
				"rfMeetingHoursPerMonth");

		if (rfMeetingHoursPerMonth != null) {
			setRfMeetingHoursPerMonth(rfMeetingHoursPerMonth);
		}

		String rfCrisisDisasterAction = (String)attributes.get(
				"rfCrisisDisasterAction");

		if (rfCrisisDisasterAction != null) {
			setRfCrisisDisasterAction(rfCrisisDisasterAction);
		}

		Boolean rfMinisterGovernanceCopy = (Boolean)attributes.get(
				"rfMinisterGovernanceCopy");

		if (rfMinisterGovernanceCopy != null) {
			setRfMinisterGovernanceCopy(rfMinisterGovernanceCopy);
		}

		Boolean rfComplete = (Boolean)attributes.get("rfComplete");

		if (rfComplete != null) {
			setRfComplete(rfComplete);
		}

		Long yrFileEntryId = (Long)attributes.get("yrFileEntryId");

		if (yrFileEntryId != null) {
			setYrFileEntryId(yrFileEntryId);
		}

		String yrChurchResponse = (String)attributes.get("yrChurchResponse");

		if (yrChurchResponse != null) {
			setYrChurchResponse(yrChurchResponse);
		}

		Boolean yrComplete = (Boolean)attributes.get("yrComplete");

		if (yrComplete != null) {
			setYrComplete(yrComplete);
		}

		Integer dgActiveMembers = (Integer)attributes.get("dgActiveMembers");

		if (dgActiveMembers != null) {
			setDgActiveMembers(dgActiveMembers);
		}

		Boolean dgActiveMembersEstimate = (Boolean)attributes.get(
				"dgActiveMembersEstimate");

		if (dgActiveMembersEstimate != null) {
			setDgActiveMembersEstimate(dgActiveMembersEstimate);
		}

		Integer dgActiveNonMembers = (Integer)attributes.get(
				"dgActiveNonMembers");

		if (dgActiveNonMembers != null) {
			setDgActiveNonMembers(dgActiveNonMembers);
		}

		Boolean dgActiveNonMembersEstimate = (Boolean)attributes.get(
				"dgActiveNonMembersEstimate");

		if (dgActiveNonMembersEstimate != null) {
			setDgActiveNonMembersEstimate(dgActiveNonMembersEstimate);
		}

		Integer dgPercentMoreThan10 = (Integer)attributes.get(
				"dgPercentMoreThan10");

		if (dgPercentMoreThan10 != null) {
			setDgPercentMoreThan10(dgPercentMoreThan10);
		}

		Boolean dgPercentMoreThan10Estimate = (Boolean)attributes.get(
				"dgPercentMoreThan10Estimate");

		if (dgPercentMoreThan10Estimate != null) {
			setDgPercentMoreThan10Estimate(dgPercentMoreThan10Estimate);
		}

		Integer dgPercent5To10 = (Integer)attributes.get("dgPercent5To10");

		if (dgPercent5To10 != null) {
			setDgPercent5To10(dgPercent5To10);
		}

		Boolean dgPercent5To10Estimate = (Boolean)attributes.get(
				"dgPercent5To10Estimate");

		if (dgPercent5To10Estimate != null) {
			setDgPercent5To10Estimate(dgPercent5To10Estimate);
		}

		Integer dgPercentLessThan5 = (Integer)attributes.get(
				"dgPercentLessThan5");

		if (dgPercentLessThan5 != null) {
			setDgPercentLessThan5(dgPercentLessThan5);
		}

		Boolean dgPercentLessThan5Estimate = (Boolean)attributes.get(
				"dgPercentLessThan5Estimate");

		if (dgPercentLessThan5Estimate != null) {
			setDgPercentLessThan5Estimate(dgPercentLessThan5Estimate);
		}

		Integer dgAge11AndUnder = (Integer)attributes.get("dgAge11AndUnder");

		if (dgAge11AndUnder != null) {
			setDgAge11AndUnder(dgAge11AndUnder);
		}

		Integer dgAge12To17 = (Integer)attributes.get("dgAge12To17");

		if (dgAge12To17 != null) {
			setDgAge12To17(dgAge12To17);
		}

		Integer dgAge18To24 = (Integer)attributes.get("dgAge18To24");

		if (dgAge18To24 != null) {
			setDgAge18To24(dgAge18To24);
		}

		Integer dgAge25To34 = (Integer)attributes.get("dgAge25To34");

		if (dgAge25To34 != null) {
			setDgAge25To34(dgAge25To34);
		}

		Integer dgAge35To44 = (Integer)attributes.get("dgAge35To44");

		if (dgAge35To44 != null) {
			setDgAge35To44(dgAge35To44);
		}

		Integer dgAge45To54 = (Integer)attributes.get("dgAge45To54");

		if (dgAge45To54 != null) {
			setDgAge45To54(dgAge45To54);
		}

		Integer dgAge55To64 = (Integer)attributes.get("dgAge55To64");

		if (dgAge55To64 != null) {
			setDgAge55To64(dgAge55To64);
		}

		Integer dgAge65To74 = (Integer)attributes.get("dgAge65To74");

		if (dgAge65To74 != null) {
			setDgAge65To74(dgAge65To74);
		}

		Integer dgAge75AndOver = (Integer)attributes.get("dgAge75AndOver");

		if (dgAge75AndOver != null) {
			setDgAge75AndOver(dgAge75AndOver);
		}

		Boolean dgAllAgesEstimate = (Boolean)attributes.get("dgAllAgesEstimate");

		if (dgAllAgesEstimate != null) {
			setDgAllAgesEstimate(dgAllAgesEstimate);
		}

		Integer dgPercentSingleUnder35 = (Integer)attributes.get(
				"dgPercentSingleUnder35");

		if (dgPercentSingleUnder35 != null) {
			setDgPercentSingleUnder35(dgPercentSingleUnder35);
		}

		Boolean dgPercentSingleUnder35Estimate = (Boolean)attributes.get(
				"dgPercentSingleUnder35Estimate");

		if (dgPercentSingleUnder35Estimate != null) {
			setDgPercentSingleUnder35Estimate(dgPercentSingleUnder35Estimate);
		}

		Integer dgPercentWithMinors = (Integer)attributes.get(
				"dgPercentWithMinors");

		if (dgPercentWithMinors != null) {
			setDgPercentWithMinors(dgPercentWithMinors);
		}

		Boolean dgPercentWithMinorsEstimate = (Boolean)attributes.get(
				"dgPercentWithMinorsEstimate");

		if (dgPercentWithMinorsEstimate != null) {
			setDgPercentWithMinorsEstimate(dgPercentWithMinorsEstimate);
		}

		Integer dgPercentSingle35To65 = (Integer)attributes.get(
				"dgPercentSingle35To65");

		if (dgPercentSingle35To65 != null) {
			setDgPercentSingle35To65(dgPercentSingle35To65);
		}

		Boolean dgPercentSingle35To65Estimate = (Boolean)attributes.get(
				"dgPercentSingle35To65Estimate");

		if (dgPercentSingle35To65Estimate != null) {
			setDgPercentSingle35To65Estimate(dgPercentSingle35To65Estimate);
		}

		Integer dgPercentJointNoMinors = (Integer)attributes.get(
				"dgPercentJointNoMinors");

		if (dgPercentJointNoMinors != null) {
			setDgPercentJointNoMinors(dgPercentJointNoMinors);
		}

		Boolean dgPercentJointNoMinorsEstimate = (Boolean)attributes.get(
				"dgPercentJointNoMinorsEstimate");

		if (dgPercentJointNoMinorsEstimate != null) {
			setDgPercentJointNoMinorsEstimate(dgPercentJointNoMinorsEstimate);
		}

		Integer dgPercentSingleOver65 = (Integer)attributes.get(
				"dgPercentSingleOver65");

		if (dgPercentSingleOver65 != null) {
			setDgPercentSingleOver65(dgPercentSingleOver65);
		}

		Boolean dgPercentSingleOver65Estimate = (Boolean)attributes.get(
				"dgPercentSingleOver65Estimate");

		if (dgPercentSingleOver65Estimate != null) {
			setDgPercentSingleOver65Estimate(dgPercentSingleOver65Estimate);
		}

		Integer dgPercentHighSchool = (Integer)attributes.get(
				"dgPercentHighSchool");

		if (dgPercentHighSchool != null) {
			setDgPercentHighSchool(dgPercentHighSchool);
		}

		Boolean dgPercentHighSchoolEstimate = (Boolean)attributes.get(
				"dgPercentHighSchoolEstimate");

		if (dgPercentHighSchoolEstimate != null) {
			setDgPercentHighSchoolEstimate(dgPercentHighSchoolEstimate);
		}

		Integer dgPercentCollege = (Integer)attributes.get("dgPercentCollege");

		if (dgPercentCollege != null) {
			setDgPercentCollege(dgPercentCollege);
		}

		Boolean dgPercentCollegeEstimate = (Boolean)attributes.get(
				"dgPercentCollegeEstimate");

		if (dgPercentCollegeEstimate != null) {
			setDgPercentCollegeEstimate(dgPercentCollegeEstimate);
		}

		Integer dgPercentGraduateSchool = (Integer)attributes.get(
				"dgPercentGraduateSchool");

		if (dgPercentGraduateSchool != null) {
			setDgPercentGraduateSchool(dgPercentGraduateSchool);
		}

		Boolean dgPercentGraduateSchoolEstimate = (Boolean)attributes.get(
				"dgPercentGraduateSchoolEstimate");

		if (dgPercentGraduateSchoolEstimate != null) {
			setDgPercentGraduateSchoolEstimate(dgPercentGraduateSchoolEstimate);
		}

		Integer dgPercentSpecialtyTraining = (Integer)attributes.get(
				"dgPercentSpecialtyTraining");

		if (dgPercentSpecialtyTraining != null) {
			setDgPercentSpecialtyTraining(dgPercentSpecialtyTraining);
		}

		Boolean dgPercentSpecialtyTrainingEstimate = (Boolean)attributes.get(
				"dgPercentSpecialtyTrainingEstimate");

		if (dgPercentSpecialtyTrainingEstimate != null) {
			setDgPercentSpecialtyTrainingEstimate(dgPercentSpecialtyTrainingEstimate);
		}

		Integer dgPercentOtherEducation = (Integer)attributes.get(
				"dgPercentOtherEducation");

		if (dgPercentOtherEducation != null) {
			setDgPercentOtherEducation(dgPercentOtherEducation);
		}

		Boolean dgPercentOtherEducationEstimate = (Boolean)attributes.get(
				"dgPercentOtherEducationEstimate");

		if (dgPercentOtherEducationEstimate != null) {
			setDgPercentOtherEducationEstimate(dgPercentOtherEducationEstimate);
		}

		String dgPercentOtherEducationDescription = (String)attributes.get(
				"dgPercentOtherEducationDescription");

		if (dgPercentOtherEducationDescription != null) {
			setDgPercentOtherEducationDescription(dgPercentOtherEducationDescription);
		}

		Integer dgPercentEmployed = (Integer)attributes.get("dgPercentEmployed");

		if (dgPercentEmployed != null) {
			setDgPercentEmployed(dgPercentEmployed);
		}

		Boolean dgPercentEmployedEstimate = (Boolean)attributes.get(
				"dgPercentEmployedEstimate");

		if (dgPercentEmployedEstimate != null) {
			setDgPercentEmployedEstimate(dgPercentEmployedEstimate);
		}

		Integer dgPercentNotFullyEmployed = (Integer)attributes.get(
				"dgPercentNotFullyEmployed");

		if (dgPercentNotFullyEmployed != null) {
			setDgPercentNotFullyEmployed(dgPercentNotFullyEmployed);
		}

		Boolean dgPercentNotFullyEmployedEstimate = (Boolean)attributes.get(
				"dgPercentNotFullyEmployedEstimate");

		if (dgPercentNotFullyEmployedEstimate != null) {
			setDgPercentNotFullyEmployedEstimate(dgPercentNotFullyEmployedEstimate);
		}

		Integer dgPercentRetired = (Integer)attributes.get("dgPercentRetired");

		if (dgPercentRetired != null) {
			setDgPercentRetired(dgPercentRetired);
		}

		Boolean dgPercentRetiredEstimate = (Boolean)attributes.get(
				"dgPercentRetiredEstimate");

		if (dgPercentRetiredEstimate != null) {
			setDgPercentRetiredEstimate(dgPercentRetiredEstimate);
		}

		String dgRangeOfOccupations = (String)attributes.get(
				"dgRangeOfOccupations");

		if (dgRangeOfOccupations != null) {
			setDgRangeOfOccupations(dgRangeOfOccupations);
		}

		Boolean dgComplete = (Boolean)attributes.get("dgComplete");

		if (dgComplete != null) {
			setDgComplete(dgComplete);
		}

		String dvEthnicRacialMix = (String)attributes.get("dvEthnicRacialMix");

		if (dvEthnicRacialMix != null) {
			setDvEthnicRacialMix(dvEthnicRacialMix);
		}

		String dvWelcomingConversation = (String)attributes.get(
				"dvWelcomingConversation");

		if (dvWelcomingConversation != null) {
			setDvWelcomingConversation(dvWelcomingConversation);
		}

		String dvWelcomingComments = (String)attributes.get(
				"dvWelcomingComments");

		if (dvWelcomingComments != null) {
			setDvWelcomingComments(dvWelcomingComments);
		}

		Boolean dvComplete = (Boolean)attributes.get("dvComplete");

		if (dvComplete != null) {
			setDvComplete(dvComplete);
		}

		String ppComments = (String)attributes.get("ppComments");

		if (ppComments != null) {
			setPpComments(ppComments);
		}

		Boolean ppComplete = (Boolean)attributes.get("ppComplete");

		if (ppComplete != null) {
			setPpComplete(ppComplete);
		}

		String sfPreviousRoles = (String)attributes.get("sfPreviousRoles");

		if (sfPreviousRoles != null) {
			setSfPreviousRoles(sfPreviousRoles);
		}

		Boolean sfComplete = (Boolean)attributes.get("sfComplete");

		if (sfComplete != null) {
			setSfComplete(sfComplete);
		}

		String rvOverallMinistry = (String)attributes.get("rvOverallMinistry");

		if (rvOverallMinistry != null) {
			setRvOverallMinistry(rvOverallMinistry);
		}

		Boolean rvComplete = (Boolean)attributes.get("rvComplete");

		if (rvComplete != null) {
			setRvComplete(rvComplete);
		}

		String fnYear = (String)attributes.get("fnYear");

		if (fnYear != null) {
			setFnYear(fnYear);
		}

		Integer fnIncomeOfferingsPledgedGivings = (Integer)attributes.get(
				"fnIncomeOfferingsPledgedGivings");

		if (fnIncomeOfferingsPledgedGivings != null) {
			setFnIncomeOfferingsPledgedGivings(fnIncomeOfferingsPledgedGivings);
		}

		Integer fnIncomeEndowmentProceeds = (Integer)attributes.get(
				"fnIncomeEndowmentProceeds");

		if (fnIncomeEndowmentProceeds != null) {
			setFnIncomeEndowmentProceeds(fnIncomeEndowmentProceeds);
		}

		Integer fnIncomeEndowmentDraw = (Integer)attributes.get(
				"fnIncomeEndowmentDraw");

		if (fnIncomeEndowmentDraw != null) {
			setFnIncomeEndowmentDraw(fnIncomeEndowmentDraw);
		}

		Integer fnIncomeFundraising = (Integer)attributes.get(
				"fnIncomeFundraising");

		if (fnIncomeFundraising != null) {
			setFnIncomeFundraising(fnIncomeFundraising);
		}

		Integer fnIncomeDesignatedGifts = (Integer)attributes.get(
				"fnIncomeDesignatedGifts");

		if (fnIncomeDesignatedGifts != null) {
			setFnIncomeDesignatedGifts(fnIncomeDesignatedGifts);
		}

		Integer fnIncomeGrants = (Integer)attributes.get("fnIncomeGrants");

		if (fnIncomeGrants != null) {
			setFnIncomeGrants(fnIncomeGrants);
		}

		Integer fnIncomeRentalChurchBuilding = (Integer)attributes.get(
				"fnIncomeRentalChurchBuilding");

		if (fnIncomeRentalChurchBuilding != null) {
			setFnIncomeRentalChurchBuilding(fnIncomeRentalChurchBuilding);
		}

		Integer fnIncomeRentalChurchParsonage = (Integer)attributes.get(
				"fnIncomeRentalChurchParsonage");

		if (fnIncomeRentalChurchParsonage != null) {
			setFnIncomeRentalChurchParsonage(fnIncomeRentalChurchParsonage);
		}

		Integer fnIncomeRelatedOrganizations = (Integer)attributes.get(
				"fnIncomeRelatedOrganizations");

		if (fnIncomeRelatedOrganizations != null) {
			setFnIncomeRelatedOrganizations(fnIncomeRelatedOrganizations);
		}

		Integer fnIncomeSpecialAccounts = (Integer)attributes.get(
				"fnIncomeSpecialAccounts");

		if (fnIncomeSpecialAccounts != null) {
			setFnIncomeSpecialAccounts(fnIncomeSpecialAccounts);
		}

		Integer fnExpense = (Integer)attributes.get("fnExpense");

		if (fnExpense != null) {
			setFnExpense(fnExpense);
		}

		Long fnFileEntryId = (Long)attributes.get("fnFileEntryId");

		if (fnFileEntryId != null) {
			setFnFileEntryId(fnFileEntryId);
		}

		Integer fnExpenseMinisterialSupportPercent = (Integer)attributes.get(
				"fnExpenseMinisterialSupportPercent");

		if (fnExpenseMinisterialSupportPercent != null) {
			setFnExpenseMinisterialSupportPercent(fnExpenseMinisterialSupportPercent);
		}

		Boolean fnFailToPayMinister = (Boolean)attributes.get(
				"fnFailToPayMinister");

		if (fnFailToPayMinister != null) {
			setFnFailToPayMinister(fnFailToPayMinister);
		}

		Boolean fnOurChurchWiderMission = (Boolean)attributes.get(
				"fnOurChurchWiderMission");

		if (fnOurChurchWiderMission != null) {
			setFnOurChurchWiderMission(fnOurChurchWiderMission);
		}

		Boolean fnOneGreatHourOfSharing = (Boolean)attributes.get(
				"fnOneGreatHourOfSharing");

		if (fnOneGreatHourOfSharing != null) {
			setFnOneGreatHourOfSharing(fnOneGreatHourOfSharing);
		}

		Boolean fnStrenghtenTheChurch = (Boolean)attributes.get(
				"fnStrenghtenTheChurch");

		if (fnStrenghtenTheChurch != null) {
			setFnStrenghtenTheChurch(fnStrenghtenTheChurch);
		}

		Boolean fnNeighborsInNeed = (Boolean)attributes.get("fnNeighborsInNeed");

		if (fnNeighborsInNeed != null) {
			setFnNeighborsInNeed(fnNeighborsInNeed);
		}

		Boolean fnChristmasFund = (Boolean)attributes.get("fnChristmasFund");

		if (fnChristmasFund != null) {
			setFnChristmasFund(fnChristmasFund);
		}

		String fnOurChurchWiderMissionHow = (String)attributes.get(
				"fnOurChurchWiderMissionHow");

		if (fnOurChurchWiderMissionHow != null) {
			setFnOurChurchWiderMissionHow(fnOurChurchWiderMissionHow);
		}

		Integer fnDebtCurrent = (Integer)attributes.get("fnDebtCurrent");

		if (fnDebtCurrent != null) {
			setFnDebtCurrent(fnDebtCurrent);
		}

		Integer fnDebtCurrentLoan = (Integer)attributes.get("fnDebtCurrentLoan");

		if (fnDebtCurrentLoan != null) {
			setFnDebtCurrentLoan(fnDebtCurrentLoan);
		}

		String fnDebtReasonFor = (String)attributes.get("fnDebtReasonFor");

		if (fnDebtReasonFor != null) {
			setFnDebtReasonFor(fnDebtReasonFor);
		}

		Boolean fnDebtPaymentsCurrent = (Boolean)attributes.get(
				"fnDebtPaymentsCurrent");

		if (fnDebtPaymentsCurrent != null) {
			setFnDebtPaymentsCurrent(fnDebtPaymentsCurrent);
		}

		Boolean fnEndowment = (Boolean)attributes.get("fnEndowment");

		if (fnEndowment != null) {
			setFnEndowment(fnEndowment);
		}

		Integer fnEndowmentMarketValue = (Integer)attributes.get(
				"fnEndowmentMarketValue");

		if (fnEndowmentMarketValue != null) {
			setFnEndowmentMarketValue(fnEndowmentMarketValue);
		}

		String fnEndowmentDrawWhen = (String)attributes.get(
				"fnEndowmentDrawWhen");

		if (fnEndowmentDrawWhen != null) {
			setFnEndowmentDrawWhen(fnEndowmentDrawWhen);
		}

		Integer fnEndowmentDraw5YearPercent = (Integer)attributes.get(
				"fnEndowmentDraw5YearPercent");

		if (fnEndowmentDraw5YearPercent != null) {
			setFnEndowmentDraw5YearPercent(fnEndowmentDraw5YearPercent);
		}

		String fnEndowmentDraw5YearToExpense = (String)attributes.get(
				"fnEndowmentDraw5YearToExpense");

		if (fnEndowmentDraw5YearToExpense != null) {
			setFnEndowmentDraw5YearToExpense(fnEndowmentDraw5YearToExpense);
		}

		String fnEndowmentDrawCurrentRateLast = (String)attributes.get(
				"fnEndowmentDrawCurrentRateLast");

		if (fnEndowmentDrawCurrentRateLast != null) {
			setFnEndowmentDrawCurrentRateLast(fnEndowmentDrawCurrentRateLast);
		}

		String fnEndowmentComment = (String)attributes.get("fnEndowmentComment");

		if (fnEndowmentComment != null) {
			setFnEndowmentComment(fnEndowmentComment);
		}

		Integer fnReserves = (Integer)attributes.get("fnReserves");

		if (fnReserves != null) {
			setFnReserves(fnReserves);
		}

		Integer fnInvestments = (Integer)attributes.get("fnInvestments");

		if (fnInvestments != null) {
			setFnInvestments(fnInvestments);
		}

		Boolean fnComplete = (Boolean)attributes.get("fnComplete");

		if (fnComplete != null) {
			setFnComplete(fnComplete);
		}

		String reBuildingProgram = (String)attributes.get("reBuildingProgram");

		if (reBuildingProgram != null) {
			setReBuildingProgram(reBuildingProgram);
		}

		String reCampaignMissionComponents = (String)attributes.get(
				"reCampaignMissionComponents");

		if (reCampaignMissionComponents != null) {
			setReCampaignMissionComponents(reCampaignMissionComponents);
		}

		Boolean reParsonage = (Boolean)attributes.get("reParsonage");

		if (reParsonage != null) {
			setReParsonage(reParsonage);
		}

		Integer reParsonageMarketValue = (Integer)attributes.get(
				"reParsonageMarketValue");

		if (reParsonageMarketValue != null) {
			setReParsonageMarketValue(reParsonageMarketValue);
		}

		Integer reParsonageAssessedValue = (Integer)attributes.get(
				"reParsonageAssessedValue");

		if (reParsonageAssessedValue != null) {
			setReParsonageAssessedValue(reParsonageAssessedValue);
		}

		String reParsonageUsage = (String)attributes.get("reParsonageUsage");

		if (reParsonageUsage != null) {
			setReParsonageUsage(reParsonageUsage);
		}

		String reParsonageStreetAddress = (String)attributes.get(
				"reParsonageStreetAddress");

		if (reParsonageStreetAddress != null) {
			setReParsonageStreetAddress(reParsonageStreetAddress);
		}

		String reParsonageCity = (String)attributes.get("reParsonageCity");

		if (reParsonageCity != null) {
			setReParsonageCity(reParsonageCity);
		}

		String reParsonageState = (String)attributes.get("reParsonageState");

		if (reParsonageState != null) {
			setReParsonageState(reParsonageState);
		}

		String reParsonageZip = (String)attributes.get("reParsonageZip");

		if (reParsonageZip != null) {
			setReParsonageZip(reParsonageZip);
		}

		Integer reParsonageFootage = (Integer)attributes.get(
				"reParsonageFootage");

		if (reParsonageFootage != null) {
			setReParsonageFootage(reParsonageFootage);
		}

		Integer reParsonageBedrooms = (Integer)attributes.get(
				"reParsonageBedrooms");

		if (reParsonageBedrooms != null) {
			setReParsonageBedrooms(reParsonageBedrooms);
		}

		Integer reParsonageBathrooms = (Integer)attributes.get(
				"reParsonageBathrooms");

		if (reParsonageBathrooms != null) {
			setReParsonageBathrooms(reParsonageBathrooms);
		}

		Boolean reParsonageAvailableMinister = (Boolean)attributes.get(
				"reParsonageAvailableMinister");

		if (reParsonageAvailableMinister != null) {
			setReParsonageAvailableMinister(reParsonageAvailableMinister);
		}

		Boolean reParsonageExpectedMinister = (Boolean)attributes.get(
				"reParsonageExpectedMinister");

		if (reParsonageExpectedMinister != null) {
			setReParsonageExpectedMinister(reParsonageExpectedMinister);
		}

		String reParsonageCondition = (String)attributes.get(
				"reParsonageCondition");

		if (reParsonageCondition != null) {
			setReParsonageCondition(reParsonageCondition);
		}

		String reParsonageResponsibleEntity = (String)attributes.get(
				"reParsonageResponsibleEntity");

		if (reParsonageResponsibleEntity != null) {
			setReParsonageResponsibleEntity(reParsonageResponsibleEntity);
		}

		String reOwnedBuildings = (String)attributes.get("reOwnedBuildings");

		if (reOwnedBuildings != null) {
			setReOwnedBuildings(reOwnedBuildings);
		}

		String reNonOwnedBuildings = (String)attributes.get(
				"reNonOwnedBuildings");

		if (reNonOwnedBuildings != null) {
			setReNonOwnedBuildings(reNonOwnedBuildings);
		}

		String reWheelchairAccessible = (String)attributes.get(
				"reWheelchairAccessible");

		if (reWheelchairAccessible != null) {
			setReWheelchairAccessible(reWheelchairAccessible);
		}

		String reFinancesAssetsReview = (String)attributes.get(
				"reFinancesAssetsReview");

		if (reFinancesAssetsReview != null) {
			setReFinancesAssetsReview(reFinancesAssetsReview);
		}

		Boolean reComplete = (Boolean)attributes.get("reComplete");

		if (reComplete != null) {
			setReComplete(reComplete);
		}

		String hiSignificantHappenings = (String)attributes.get(
				"hiSignificantHappenings");

		if (hiSignificantHappenings != null) {
			setHiSignificantHappenings(hiSignificantHappenings);
		}

		String hiManagedChange = (String)attributes.get("hiManagedChange");

		if (hiManagedChange != null) {
			setHiManagedChange(hiManagedChange);
		}

		String hiConflictResolution = (String)attributes.get(
				"hiConflictResolution");

		if (hiConflictResolution != null) {
			setHiConflictResolution(hiConflictResolution);
		}

		String hiMinisterialLeadershipLearning = (String)attributes.get(
				"hiMinisterialLeadershipLearning");

		if (hiMinisterialLeadershipLearning != null) {
			setHiMinisterialLeadershipLearning(hiMinisterialLeadershipLearning);
		}

		String hiPressureInvoluntaryTermination = (String)attributes.get(
				"hiPressureInvoluntaryTermination");

		if (hiPressureInvoluntaryTermination != null) {
			setHiPressureInvoluntaryTermination(hiPressureInvoluntaryTermination);
		}

		String hiSituationalSupportConsultation = (String)attributes.get(
				"hiSituationalSupportConsultation");

		if (hiSituationalSupportConsultation != null) {
			setHiSituationalSupportConsultation(hiSituationalSupportConsultation);
		}

		String hiFitnessReview = (String)attributes.get("hiFitnessReview");

		if (hiFitnessReview != null) {
			setHiFitnessReview(hiFitnessReview);
		}

		Boolean hiComplete = (Boolean)attributes.get("hiComplete");

		if (hiComplete != null) {
			setHiComplete(hiComplete);
		}

		String cmServiceAdvocacy = (String)attributes.get("cmServiceAdvocacy");

		if (cmServiceAdvocacy != null) {
			setCmServiceAdvocacy(cmServiceAdvocacy);
		}

		String cmMeetingsRelationshipsActivities = (String)attributes.get(
				"cmMeetingsRelationshipsActivities");

		if (cmMeetingsRelationshipsActivities != null) {
			setCmMeetingsRelationshipsActivities(cmMeetingsRelationshipsActivities);
		}

		Boolean cmAccessibleToAll = (Boolean)attributes.get("cmAccessibleToAll");

		if (cmAccessibleToAll != null) {
			setCmAccessibleToAll(cmAccessibleToAll);
		}

		Boolean cmCreationJustice = (Boolean)attributes.get("cmCreationJustice");

		if (cmCreationJustice != null) {
			setCmCreationJustice(cmCreationJustice);
		}

		Boolean cmEconomicJustice = (Boolean)attributes.get("cmEconomicJustice");

		if (cmEconomicJustice != null) {
			setCmEconomicJustice(cmEconomicJustice);
		}

		Boolean cmFaithfulAndWelcoming = (Boolean)attributes.get(
				"cmFaithfulAndWelcoming");

		if (cmFaithfulAndWelcoming != null) {
			setCmFaithfulAndWelcoming(cmFaithfulAndWelcoming);
		}

		Boolean cmGodIsStillSpeaking = (Boolean)attributes.get(
				"cmGodIsStillSpeaking");

		if (cmGodIsStillSpeaking != null) {
			setCmGodIsStillSpeaking(cmGodIsStillSpeaking);
		}

		Boolean cmBorderAndImmigrantJustice = (Boolean)attributes.get(
				"cmBorderAndImmigrantJustice");

		if (cmBorderAndImmigrantJustice != null) {
			setCmBorderAndImmigrantJustice(cmBorderAndImmigrantJustice);
		}

		Boolean cmInterCulturalMultiRacial = (Boolean)attributes.get(
				"cmInterCulturalMultiRacial");

		if (cmInterCulturalMultiRacial != null) {
			setCmInterCulturalMultiRacial(cmInterCulturalMultiRacial);
		}

		Boolean cmJustPeace = (Boolean)attributes.get("cmJustPeace");

		if (cmJustPeace != null) {
			setCmJustPeace(cmJustPeace);
		}

		Boolean cmGlobalMissionChurch = (Boolean)attributes.get(
				"cmGlobalMissionChurch");

		if (cmGlobalMissionChurch != null) {
			setCmGlobalMissionChurch(cmGlobalMissionChurch);
		}

		Boolean cmOpenAndAffirming = (Boolean)attributes.get(
				"cmOpenAndAffirming");

		if (cmOpenAndAffirming != null) {
			setCmOpenAndAffirming(cmOpenAndAffirming);
		}

		Boolean cmWISECongregationForMentalHealth = (Boolean)attributes.get(
				"cmWISECongregationForMentalHealth");

		if (cmWISECongregationForMentalHealth != null) {
			setCmWISECongregationForMentalHealth(cmWISECongregationForMentalHealth);
		}

		Boolean cmOtherUCCDesignations = (Boolean)attributes.get(
				"cmOtherUCCDesignations");

		if (cmOtherUCCDesignations != null) {
			setCmOtherUCCDesignations(cmOtherUCCDesignations);
		}

		Boolean cmDesignationsOtherDenominations = (Boolean)attributes.get(
				"cmDesignationsOtherDenominations");

		if (cmDesignationsOtherDenominations != null) {
			setCmDesignationsOtherDenominations(cmDesignationsOtherDenominations);
		}

		String cmStatementsReflection = (String)attributes.get(
				"cmStatementsReflection");

		if (cmStatementsReflection != null) {
			setCmStatementsReflection(cmStatementsReflection);
		}

		String cmWorkTowardWitnessFuture = (String)attributes.get(
				"cmWorkTowardWitnessFuture");

		if (cmWorkTowardWitnessFuture != null) {
			setCmWorkTowardWitnessFuture(cmWorkTowardWitnessFuture);
		}

		String cmEcumenicalInterfaithParticipation = (String)attributes.get(
				"cmEcumenicalInterfaithParticipation");

		if (cmEcumenicalInterfaithParticipation != null) {
			setCmEcumenicalInterfaithParticipation(cmEcumenicalInterfaithParticipation);
		}

		String cmMissionStatementComparison = (String)attributes.get(
				"cmMissionStatementComparison");

		if (cmMissionStatementComparison != null) {
			setCmMissionStatementComparison(cmMissionStatementComparison);
		}

		String cmPastorTimeExpectations = (String)attributes.get(
				"cmPastorTimeExpectations");

		if (cmPastorTimeExpectations != null) {
			setCmPastorTimeExpectations(cmPastorTimeExpectations);
		}

		Boolean cmComplete = (Boolean)attributes.get("cmComplete");

		if (cmComplete != null) {
			setCmComplete(cmComplete);
		}

		String miMissionInSiteTrendsOpportunities = (String)attributes.get(
				"miMissionInSiteTrendsOpportunities");

		if (miMissionInSiteTrendsOpportunities != null) {
			setMiMissionInSiteTrendsOpportunities(miMissionInSiteTrendsOpportunities);
		}

		String miCongregationDemographicsComparison = (String)attributes.get(
				"miCongregationDemographicsComparison");

		if (miCongregationDemographicsComparison != null) {
			setMiCongregationDemographicsComparison(miCongregationDemographicsComparison);
		}

		String miCommunityDemographicsImpact = (String)attributes.get(
				"miCommunityDemographicsImpact");

		if (miCommunityDemographicsImpact != null) {
			setMiCommunityDemographicsImpact(miCommunityDemographicsImpact);
		}

		String miKnownForInCommunity = (String)attributes.get(
				"miKnownForInCommunity");

		if (miKnownForInCommunity != null) {
			setMiKnownForInCommunity(miKnownForInCommunity);
		}

		String miWhyNewPeopleInvolved = (String)attributes.get(
				"miWhyNewPeopleInvolved");

		if (miWhyNewPeopleInvolved != null) {
			setMiWhyNewPeopleInvolved(miWhyNewPeopleInvolved);
		}

		Boolean miComplete = (Boolean)attributes.get("miComplete");

		if (miComplete != null) {
			setMiComplete(miComplete);
		}

		String vsGodsCallToBecome = (String)attributes.get("vsGodsCallToBecome");

		if (vsGodsCallToBecome != null) {
			setVsGodsCallToBecome(vsGodsCallToBecome);
		}

		String vsGodsCallToReachOut = (String)attributes.get(
				"vsGodsCallToReachOut");

		if (vsGodsCallToReachOut != null) {
			setVsGodsCallToReachOut(vsGodsCallToReachOut);
		}

		Boolean vsComplete = (Boolean)attributes.get("vsComplete");

		if (vsComplete != null) {
			setVsComplete(vsComplete);
		}

		Long pvFileEntryId = (Long)attributes.get("pvFileEntryId");

		if (pvFileEntryId != null) {
			setPvFileEntryId(pvFileEntryId);
		}

		Date pvGeneratedDate = (Date)attributes.get("pvGeneratedDate");

		if (pvGeneratedDate != null) {
			setPvGeneratedDate(pvGeneratedDate);
		}

		Boolean pvComplete = (Boolean)attributes.get("pvComplete");

		if (pvComplete != null) {
			setPvComplete(pvComplete);
		}

		Long pbFileEntryId = (Long)attributes.get("pbFileEntryId");

		if (pbFileEntryId != null) {
			setPbFileEntryId(pbFileEntryId);
		}

		Date pbPublishedDate = (Date)attributes.get("pbPublishedDate");

		if (pbPublishedDate != null) {
			setPbPublishedDate(pbPublishedDate);
		}
	}

	@Override
	public Object clone() {
		return new CExtOrganizationWrapper((CExtOrganization)_cExtOrganization.clone());
	}

	@Override
	public int compareTo(CExtOrganization cExtOrganization) {
		return _cExtOrganization.compareTo(cExtOrganization);
	}

	/**
	* Returns the cm accessible to all of this c ext organization.
	*
	* @return the cm accessible to all of this c ext organization
	*/
	@Override
	public boolean getCmAccessibleToAll() {
		return _cExtOrganization.getCmAccessibleToAll();
	}

	/**
	* Returns the cm border and immigrant justice of this c ext organization.
	*
	* @return the cm border and immigrant justice of this c ext organization
	*/
	@Override
	public boolean getCmBorderAndImmigrantJustice() {
		return _cExtOrganization.getCmBorderAndImmigrantJustice();
	}

	/**
	* Returns the cm complete of this c ext organization.
	*
	* @return the cm complete of this c ext organization
	*/
	@Override
	public boolean getCmComplete() {
		return _cExtOrganization.getCmComplete();
	}

	/**
	* Returns the cm creation justice of this c ext organization.
	*
	* @return the cm creation justice of this c ext organization
	*/
	@Override
	public boolean getCmCreationJustice() {
		return _cExtOrganization.getCmCreationJustice();
	}

	/**
	* Returns the cm designations other denominations of this c ext organization.
	*
	* @return the cm designations other denominations of this c ext organization
	*/
	@Override
	public boolean getCmDesignationsOtherDenominations() {
		return _cExtOrganization.getCmDesignationsOtherDenominations();
	}

	/**
	* Returns the cm economic justice of this c ext organization.
	*
	* @return the cm economic justice of this c ext organization
	*/
	@Override
	public boolean getCmEconomicJustice() {
		return _cExtOrganization.getCmEconomicJustice();
	}

	/**
	* Returns the cm ecumenical interfaith participation of this c ext organization.
	*
	* @return the cm ecumenical interfaith participation of this c ext organization
	*/
	@Override
	public String getCmEcumenicalInterfaithParticipation() {
		return _cExtOrganization.getCmEcumenicalInterfaithParticipation();
	}

	/**
	* Returns the cm faithful and welcoming of this c ext organization.
	*
	* @return the cm faithful and welcoming of this c ext organization
	*/
	@Override
	public boolean getCmFaithfulAndWelcoming() {
		return _cExtOrganization.getCmFaithfulAndWelcoming();
	}

	/**
	* Returns the cm global mission church of this c ext organization.
	*
	* @return the cm global mission church of this c ext organization
	*/
	@Override
	public boolean getCmGlobalMissionChurch() {
		return _cExtOrganization.getCmGlobalMissionChurch();
	}

	/**
	* Returns the cm god is still speaking of this c ext organization.
	*
	* @return the cm god is still speaking of this c ext organization
	*/
	@Override
	public boolean getCmGodIsStillSpeaking() {
		return _cExtOrganization.getCmGodIsStillSpeaking();
	}

	/**
	* Returns the cm inter cultural multi racial of this c ext organization.
	*
	* @return the cm inter cultural multi racial of this c ext organization
	*/
	@Override
	public boolean getCmInterCulturalMultiRacial() {
		return _cExtOrganization.getCmInterCulturalMultiRacial();
	}

	/**
	* Returns the cm just peace of this c ext organization.
	*
	* @return the cm just peace of this c ext organization
	*/
	@Override
	public boolean getCmJustPeace() {
		return _cExtOrganization.getCmJustPeace();
	}

	/**
	* Returns the cm meetings relationships activities of this c ext organization.
	*
	* @return the cm meetings relationships activities of this c ext organization
	*/
	@Override
	public String getCmMeetingsRelationshipsActivities() {
		return _cExtOrganization.getCmMeetingsRelationshipsActivities();
	}

	/**
	* Returns the cm mission statement comparison of this c ext organization.
	*
	* @return the cm mission statement comparison of this c ext organization
	*/
	@Override
	public String getCmMissionStatementComparison() {
		return _cExtOrganization.getCmMissionStatementComparison();
	}

	/**
	* Returns the cm open and affirming of this c ext organization.
	*
	* @return the cm open and affirming of this c ext organization
	*/
	@Override
	public boolean getCmOpenAndAffirming() {
		return _cExtOrganization.getCmOpenAndAffirming();
	}

	/**
	* Returns the cm other ucc designations of this c ext organization.
	*
	* @return the cm other ucc designations of this c ext organization
	*/
	@Override
	public boolean getCmOtherUCCDesignations() {
		return _cExtOrganization.getCmOtherUCCDesignations();
	}

	/**
	* Returns the cm pastor time expectations of this c ext organization.
	*
	* @return the cm pastor time expectations of this c ext organization
	*/
	@Override
	public String getCmPastorTimeExpectations() {
		return _cExtOrganization.getCmPastorTimeExpectations();
	}

	/**
	* Returns the cm service advocacy of this c ext organization.
	*
	* @return the cm service advocacy of this c ext organization
	*/
	@Override
	public String getCmServiceAdvocacy() {
		return _cExtOrganization.getCmServiceAdvocacy();
	}

	/**
	* Returns the cm statements reflection of this c ext organization.
	*
	* @return the cm statements reflection of this c ext organization
	*/
	@Override
	public String getCmStatementsReflection() {
		return _cExtOrganization.getCmStatementsReflection();
	}

	/**
	* Returns the cm wise congregation for mental health of this c ext organization.
	*
	* @return the cm wise congregation for mental health of this c ext organization
	*/
	@Override
	public boolean getCmWISECongregationForMentalHealth() {
		return _cExtOrganization.getCmWISECongregationForMentalHealth();
	}

	/**
	* Returns the cm work toward witness future of this c ext organization.
	*
	* @return the cm work toward witness future of this c ext organization
	*/
	@Override
	public String getCmWorkTowardWitnessFuture() {
		return _cExtOrganization.getCmWorkTowardWitnessFuture();
	}

	/**
	* Returns the company ID of this c ext organization.
	*
	* @return the company ID of this c ext organization
	*/
	@Override
	public long getCompanyId() {
		return _cExtOrganization.getCompanyId();
	}

	/**
	* Returns the create date of this c ext organization.
	*
	* @return the create date of this c ext organization
	*/
	@Override
	public Date getCreateDate() {
		return _cExtOrganization.getCreateDate();
	}

	/**
	* Returns the dg active members of this c ext organization.
	*
	* @return the dg active members of this c ext organization
	*/
	@Override
	public int getDgActiveMembers() {
		return _cExtOrganization.getDgActiveMembers();
	}

	/**
	* Returns the dg active members estimate of this c ext organization.
	*
	* @return the dg active members estimate of this c ext organization
	*/
	@Override
	public boolean getDgActiveMembersEstimate() {
		return _cExtOrganization.getDgActiveMembersEstimate();
	}

	/**
	* Returns the dg active non members of this c ext organization.
	*
	* @return the dg active non members of this c ext organization
	*/
	@Override
	public int getDgActiveNonMembers() {
		return _cExtOrganization.getDgActiveNonMembers();
	}

	/**
	* Returns the dg active non members estimate of this c ext organization.
	*
	* @return the dg active non members estimate of this c ext organization
	*/
	@Override
	public boolean getDgActiveNonMembersEstimate() {
		return _cExtOrganization.getDgActiveNonMembersEstimate();
	}

	/**
	* Returns the dg age11 and under of this c ext organization.
	*
	* @return the dg age11 and under of this c ext organization
	*/
	@Override
	public int getDgAge11AndUnder() {
		return _cExtOrganization.getDgAge11AndUnder();
	}

	/**
	* Returns the dg age12 to17 of this c ext organization.
	*
	* @return the dg age12 to17 of this c ext organization
	*/
	@Override
	public int getDgAge12To17() {
		return _cExtOrganization.getDgAge12To17();
	}

	/**
	* Returns the dg age18 to24 of this c ext organization.
	*
	* @return the dg age18 to24 of this c ext organization
	*/
	@Override
	public int getDgAge18To24() {
		return _cExtOrganization.getDgAge18To24();
	}

	/**
	* Returns the dg age25 to34 of this c ext organization.
	*
	* @return the dg age25 to34 of this c ext organization
	*/
	@Override
	public int getDgAge25To34() {
		return _cExtOrganization.getDgAge25To34();
	}

	/**
	* Returns the dg age35 to44 of this c ext organization.
	*
	* @return the dg age35 to44 of this c ext organization
	*/
	@Override
	public int getDgAge35To44() {
		return _cExtOrganization.getDgAge35To44();
	}

	/**
	* Returns the dg age45 to54 of this c ext organization.
	*
	* @return the dg age45 to54 of this c ext organization
	*/
	@Override
	public int getDgAge45To54() {
		return _cExtOrganization.getDgAge45To54();
	}

	/**
	* Returns the dg age55 to64 of this c ext organization.
	*
	* @return the dg age55 to64 of this c ext organization
	*/
	@Override
	public int getDgAge55To64() {
		return _cExtOrganization.getDgAge55To64();
	}

	/**
	* Returns the dg age65 to74 of this c ext organization.
	*
	* @return the dg age65 to74 of this c ext organization
	*/
	@Override
	public int getDgAge65To74() {
		return _cExtOrganization.getDgAge65To74();
	}

	/**
	* Returns the dg age75 and over of this c ext organization.
	*
	* @return the dg age75 and over of this c ext organization
	*/
	@Override
	public int getDgAge75AndOver() {
		return _cExtOrganization.getDgAge75AndOver();
	}

	/**
	* Returns the dg all ages estimate of this c ext organization.
	*
	* @return the dg all ages estimate of this c ext organization
	*/
	@Override
	public boolean getDgAllAgesEstimate() {
		return _cExtOrganization.getDgAllAgesEstimate();
	}

	/**
	* Returns the dg complete of this c ext organization.
	*
	* @return the dg complete of this c ext organization
	*/
	@Override
	public boolean getDgComplete() {
		return _cExtOrganization.getDgComplete();
	}

	/**
	* Returns the dg percent5 to10 of this c ext organization.
	*
	* @return the dg percent5 to10 of this c ext organization
	*/
	@Override
	public int getDgPercent5To10() {
		return _cExtOrganization.getDgPercent5To10();
	}

	/**
	* Returns the dg percent5 to10 estimate of this c ext organization.
	*
	* @return the dg percent5 to10 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercent5To10Estimate() {
		return _cExtOrganization.getDgPercent5To10Estimate();
	}

	/**
	* Returns the dg percent college of this c ext organization.
	*
	* @return the dg percent college of this c ext organization
	*/
	@Override
	public int getDgPercentCollege() {
		return _cExtOrganization.getDgPercentCollege();
	}

	/**
	* Returns the dg percent college estimate of this c ext organization.
	*
	* @return the dg percent college estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentCollegeEstimate() {
		return _cExtOrganization.getDgPercentCollegeEstimate();
	}

	/**
	* Returns the dg percent employed of this c ext organization.
	*
	* @return the dg percent employed of this c ext organization
	*/
	@Override
	public int getDgPercentEmployed() {
		return _cExtOrganization.getDgPercentEmployed();
	}

	/**
	* Returns the dg percent employed estimate of this c ext organization.
	*
	* @return the dg percent employed estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentEmployedEstimate() {
		return _cExtOrganization.getDgPercentEmployedEstimate();
	}

	/**
	* Returns the dg percent graduate school of this c ext organization.
	*
	* @return the dg percent graduate school of this c ext organization
	*/
	@Override
	public int getDgPercentGraduateSchool() {
		return _cExtOrganization.getDgPercentGraduateSchool();
	}

	/**
	* Returns the dg percent graduate school estimate of this c ext organization.
	*
	* @return the dg percent graduate school estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentGraduateSchoolEstimate() {
		return _cExtOrganization.getDgPercentGraduateSchoolEstimate();
	}

	/**
	* Returns the dg percent high school of this c ext organization.
	*
	* @return the dg percent high school of this c ext organization
	*/
	@Override
	public int getDgPercentHighSchool() {
		return _cExtOrganization.getDgPercentHighSchool();
	}

	/**
	* Returns the dg percent high school estimate of this c ext organization.
	*
	* @return the dg percent high school estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentHighSchoolEstimate() {
		return _cExtOrganization.getDgPercentHighSchoolEstimate();
	}

	/**
	* Returns the dg percent joint no minors of this c ext organization.
	*
	* @return the dg percent joint no minors of this c ext organization
	*/
	@Override
	public int getDgPercentJointNoMinors() {
		return _cExtOrganization.getDgPercentJointNoMinors();
	}

	/**
	* Returns the dg percent joint no minors estimate of this c ext organization.
	*
	* @return the dg percent joint no minors estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentJointNoMinorsEstimate() {
		return _cExtOrganization.getDgPercentJointNoMinorsEstimate();
	}

	/**
	* Returns the dg percent less than5 of this c ext organization.
	*
	* @return the dg percent less than5 of this c ext organization
	*/
	@Override
	public int getDgPercentLessThan5() {
		return _cExtOrganization.getDgPercentLessThan5();
	}

	/**
	* Returns the dg percent less than5 estimate of this c ext organization.
	*
	* @return the dg percent less than5 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentLessThan5Estimate() {
		return _cExtOrganization.getDgPercentLessThan5Estimate();
	}

	/**
	* Returns the dg percent more than10 of this c ext organization.
	*
	* @return the dg percent more than10 of this c ext organization
	*/
	@Override
	public int getDgPercentMoreThan10() {
		return _cExtOrganization.getDgPercentMoreThan10();
	}

	/**
	* Returns the dg percent more than10 estimate of this c ext organization.
	*
	* @return the dg percent more than10 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentMoreThan10Estimate() {
		return _cExtOrganization.getDgPercentMoreThan10Estimate();
	}

	/**
	* Returns the dg percent not fully employed of this c ext organization.
	*
	* @return the dg percent not fully employed of this c ext organization
	*/
	@Override
	public int getDgPercentNotFullyEmployed() {
		return _cExtOrganization.getDgPercentNotFullyEmployed();
	}

	/**
	* Returns the dg percent not fully employed estimate of this c ext organization.
	*
	* @return the dg percent not fully employed estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentNotFullyEmployedEstimate() {
		return _cExtOrganization.getDgPercentNotFullyEmployedEstimate();
	}

	/**
	* Returns the dg percent other education of this c ext organization.
	*
	* @return the dg percent other education of this c ext organization
	*/
	@Override
	public int getDgPercentOtherEducation() {
		return _cExtOrganization.getDgPercentOtherEducation();
	}

	/**
	* Returns the dg percent other education description of this c ext organization.
	*
	* @return the dg percent other education description of this c ext organization
	*/
	@Override
	public String getDgPercentOtherEducationDescription() {
		return _cExtOrganization.getDgPercentOtherEducationDescription();
	}

	/**
	* Returns the dg percent other education estimate of this c ext organization.
	*
	* @return the dg percent other education estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentOtherEducationEstimate() {
		return _cExtOrganization.getDgPercentOtherEducationEstimate();
	}

	/**
	* Returns the dg percent retired of this c ext organization.
	*
	* @return the dg percent retired of this c ext organization
	*/
	@Override
	public int getDgPercentRetired() {
		return _cExtOrganization.getDgPercentRetired();
	}

	/**
	* Returns the dg percent retired estimate of this c ext organization.
	*
	* @return the dg percent retired estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentRetiredEstimate() {
		return _cExtOrganization.getDgPercentRetiredEstimate();
	}

	/**
	* Returns the dg percent single35 to65 of this c ext organization.
	*
	* @return the dg percent single35 to65 of this c ext organization
	*/
	@Override
	public int getDgPercentSingle35To65() {
		return _cExtOrganization.getDgPercentSingle35To65();
	}

	/**
	* Returns the dg percent single35 to65 estimate of this c ext organization.
	*
	* @return the dg percent single35 to65 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentSingle35To65Estimate() {
		return _cExtOrganization.getDgPercentSingle35To65Estimate();
	}

	/**
	* Returns the dg percent single over65 of this c ext organization.
	*
	* @return the dg percent single over65 of this c ext organization
	*/
	@Override
	public int getDgPercentSingleOver65() {
		return _cExtOrganization.getDgPercentSingleOver65();
	}

	/**
	* Returns the dg percent single over65 estimate of this c ext organization.
	*
	* @return the dg percent single over65 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentSingleOver65Estimate() {
		return _cExtOrganization.getDgPercentSingleOver65Estimate();
	}

	/**
	* Returns the dg percent single under35 of this c ext organization.
	*
	* @return the dg percent single under35 of this c ext organization
	*/
	@Override
	public int getDgPercentSingleUnder35() {
		return _cExtOrganization.getDgPercentSingleUnder35();
	}

	/**
	* Returns the dg percent single under35 estimate of this c ext organization.
	*
	* @return the dg percent single under35 estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentSingleUnder35Estimate() {
		return _cExtOrganization.getDgPercentSingleUnder35Estimate();
	}

	/**
	* Returns the dg percent specialty training of this c ext organization.
	*
	* @return the dg percent specialty training of this c ext organization
	*/
	@Override
	public int getDgPercentSpecialtyTraining() {
		return _cExtOrganization.getDgPercentSpecialtyTraining();
	}

	/**
	* Returns the dg percent specialty training estimate of this c ext organization.
	*
	* @return the dg percent specialty training estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentSpecialtyTrainingEstimate() {
		return _cExtOrganization.getDgPercentSpecialtyTrainingEstimate();
	}

	/**
	* Returns the dg percent with minors of this c ext organization.
	*
	* @return the dg percent with minors of this c ext organization
	*/
	@Override
	public int getDgPercentWithMinors() {
		return _cExtOrganization.getDgPercentWithMinors();
	}

	/**
	* Returns the dg percent with minors estimate of this c ext organization.
	*
	* @return the dg percent with minors estimate of this c ext organization
	*/
	@Override
	public boolean getDgPercentWithMinorsEstimate() {
		return _cExtOrganization.getDgPercentWithMinorsEstimate();
	}

	/**
	* Returns the dg range of occupations of this c ext organization.
	*
	* @return the dg range of occupations of this c ext organization
	*/
	@Override
	public String getDgRangeOfOccupations() {
		return _cExtOrganization.getDgRangeOfOccupations();
	}

	/**
	* Returns the di complete of this c ext organization.
	*
	* @return the di complete of this c ext organization
	*/
	@Override
	public boolean getDiComplete() {
		return _cExtOrganization.getDiComplete();
	}

	/**
	* Returns the di description of this c ext organization.
	*
	* @return the di description of this c ext organization
	*/
	@Override
	public String getDiDescription() {
		return _cExtOrganization.getDiDescription();
	}

	/**
	* Returns the di title of this c ext organization.
	*
	* @return the di title of this c ext organization
	*/
	@Override
	public String getDiTitle() {
		return _cExtOrganization.getDiTitle();
	}

	/**
	* Returns the dv complete of this c ext organization.
	*
	* @return the dv complete of this c ext organization
	*/
	@Override
	public boolean getDvComplete() {
		return _cExtOrganization.getDvComplete();
	}

	/**
	* Returns the dv ethnic racial mix of this c ext organization.
	*
	* @return the dv ethnic racial mix of this c ext organization
	*/
	@Override
	public String getDvEthnicRacialMix() {
		return _cExtOrganization.getDvEthnicRacialMix();
	}

	/**
	* Returns the dv welcoming comments of this c ext organization.
	*
	* @return the dv welcoming comments of this c ext organization
	*/
	@Override
	public String getDvWelcomingComments() {
		return _cExtOrganization.getDvWelcomingComments();
	}

	/**
	* Returns the dv welcoming conversation of this c ext organization.
	*
	* @return the dv welcoming conversation of this c ext organization
	*/
	@Override
	public String getDvWelcomingConversation() {
		return _cExtOrganization.getDvWelcomingConversation();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cExtOrganization.getExpandoBridge();
	}

	/**
	* Returns the fn christmas fund of this c ext organization.
	*
	* @return the fn christmas fund of this c ext organization
	*/
	@Override
	public boolean getFnChristmasFund() {
		return _cExtOrganization.getFnChristmasFund();
	}

	/**
	* Returns the fn complete of this c ext organization.
	*
	* @return the fn complete of this c ext organization
	*/
	@Override
	public boolean getFnComplete() {
		return _cExtOrganization.getFnComplete();
	}

	/**
	* Returns the fn debt current of this c ext organization.
	*
	* @return the fn debt current of this c ext organization
	*/
	@Override
	public int getFnDebtCurrent() {
		return _cExtOrganization.getFnDebtCurrent();
	}

	/**
	* Returns the fn debt current loan of this c ext organization.
	*
	* @return the fn debt current loan of this c ext organization
	*/
	@Override
	public int getFnDebtCurrentLoan() {
		return _cExtOrganization.getFnDebtCurrentLoan();
	}

	/**
	* Returns the fn debt payments current of this c ext organization.
	*
	* @return the fn debt payments current of this c ext organization
	*/
	@Override
	public boolean getFnDebtPaymentsCurrent() {
		return _cExtOrganization.getFnDebtPaymentsCurrent();
	}

	/**
	* Returns the fn debt reason for of this c ext organization.
	*
	* @return the fn debt reason for of this c ext organization
	*/
	@Override
	public String getFnDebtReasonFor() {
		return _cExtOrganization.getFnDebtReasonFor();
	}

	/**
	* Returns the fn endowment of this c ext organization.
	*
	* @return the fn endowment of this c ext organization
	*/
	@Override
	public boolean getFnEndowment() {
		return _cExtOrganization.getFnEndowment();
	}

	/**
	* Returns the fn endowment comment of this c ext organization.
	*
	* @return the fn endowment comment of this c ext organization
	*/
	@Override
	public String getFnEndowmentComment() {
		return _cExtOrganization.getFnEndowmentComment();
	}

	/**
	* Returns the fn endowment draw5 year percent of this c ext organization.
	*
	* @return the fn endowment draw5 year percent of this c ext organization
	*/
	@Override
	public int getFnEndowmentDraw5YearPercent() {
		return _cExtOrganization.getFnEndowmentDraw5YearPercent();
	}

	/**
	* Returns the fn endowment draw5 year to expense of this c ext organization.
	*
	* @return the fn endowment draw5 year to expense of this c ext organization
	*/
	@Override
	public String getFnEndowmentDraw5YearToExpense() {
		return _cExtOrganization.getFnEndowmentDraw5YearToExpense();
	}

	/**
	* Returns the fn endowment draw current rate last of this c ext organization.
	*
	* @return the fn endowment draw current rate last of this c ext organization
	*/
	@Override
	public String getFnEndowmentDrawCurrentRateLast() {
		return _cExtOrganization.getFnEndowmentDrawCurrentRateLast();
	}

	/**
	* Returns the fn endowment draw when of this c ext organization.
	*
	* @return the fn endowment draw when of this c ext organization
	*/
	@Override
	public String getFnEndowmentDrawWhen() {
		return _cExtOrganization.getFnEndowmentDrawWhen();
	}

	/**
	* Returns the fn endowment market value of this c ext organization.
	*
	* @return the fn endowment market value of this c ext organization
	*/
	@Override
	public int getFnEndowmentMarketValue() {
		return _cExtOrganization.getFnEndowmentMarketValue();
	}

	/**
	* Returns the fn expense of this c ext organization.
	*
	* @return the fn expense of this c ext organization
	*/
	@Override
	public int getFnExpense() {
		return _cExtOrganization.getFnExpense();
	}

	/**
	* Returns the fn expense ministerial support percent of this c ext organization.
	*
	* @return the fn expense ministerial support percent of this c ext organization
	*/
	@Override
	public int getFnExpenseMinisterialSupportPercent() {
		return _cExtOrganization.getFnExpenseMinisterialSupportPercent();
	}

	/**
	* Returns the fn fail to pay minister of this c ext organization.
	*
	* @return the fn fail to pay minister of this c ext organization
	*/
	@Override
	public boolean getFnFailToPayMinister() {
		return _cExtOrganization.getFnFailToPayMinister();
	}

	/**
	* Returns the fn file entry ID of this c ext organization.
	*
	* @return the fn file entry ID of this c ext organization
	*/
	@Override
	public long getFnFileEntryId() {
		return _cExtOrganization.getFnFileEntryId();
	}

	/**
	* Returns the fn income designated gifts of this c ext organization.
	*
	* @return the fn income designated gifts of this c ext organization
	*/
	@Override
	public int getFnIncomeDesignatedGifts() {
		return _cExtOrganization.getFnIncomeDesignatedGifts();
	}

	/**
	* Returns the fn income endowment draw of this c ext organization.
	*
	* @return the fn income endowment draw of this c ext organization
	*/
	@Override
	public int getFnIncomeEndowmentDraw() {
		return _cExtOrganization.getFnIncomeEndowmentDraw();
	}

	/**
	* Returns the fn income endowment proceeds of this c ext organization.
	*
	* @return the fn income endowment proceeds of this c ext organization
	*/
	@Override
	public int getFnIncomeEndowmentProceeds() {
		return _cExtOrganization.getFnIncomeEndowmentProceeds();
	}

	/**
	* Returns the fn income fundraising of this c ext organization.
	*
	* @return the fn income fundraising of this c ext organization
	*/
	@Override
	public int getFnIncomeFundraising() {
		return _cExtOrganization.getFnIncomeFundraising();
	}

	/**
	* Returns the fn income grants of this c ext organization.
	*
	* @return the fn income grants of this c ext organization
	*/
	@Override
	public int getFnIncomeGrants() {
		return _cExtOrganization.getFnIncomeGrants();
	}

	/**
	* Returns the fn income offerings pledged givings of this c ext organization.
	*
	* @return the fn income offerings pledged givings of this c ext organization
	*/
	@Override
	public int getFnIncomeOfferingsPledgedGivings() {
		return _cExtOrganization.getFnIncomeOfferingsPledgedGivings();
	}

	/**
	* Returns the fn income related organizations of this c ext organization.
	*
	* @return the fn income related organizations of this c ext organization
	*/
	@Override
	public int getFnIncomeRelatedOrganizations() {
		return _cExtOrganization.getFnIncomeRelatedOrganizations();
	}

	/**
	* Returns the fn income rental church building of this c ext organization.
	*
	* @return the fn income rental church building of this c ext organization
	*/
	@Override
	public int getFnIncomeRentalChurchBuilding() {
		return _cExtOrganization.getFnIncomeRentalChurchBuilding();
	}

	/**
	* Returns the fn income rental church parsonage of this c ext organization.
	*
	* @return the fn income rental church parsonage of this c ext organization
	*/
	@Override
	public int getFnIncomeRentalChurchParsonage() {
		return _cExtOrganization.getFnIncomeRentalChurchParsonage();
	}

	/**
	* Returns the fn income special accounts of this c ext organization.
	*
	* @return the fn income special accounts of this c ext organization
	*/
	@Override
	public int getFnIncomeSpecialAccounts() {
		return _cExtOrganization.getFnIncomeSpecialAccounts();
	}

	/**
	* Returns the fn investments of this c ext organization.
	*
	* @return the fn investments of this c ext organization
	*/
	@Override
	public int getFnInvestments() {
		return _cExtOrganization.getFnInvestments();
	}

	/**
	* Returns the fn neighbors in need of this c ext organization.
	*
	* @return the fn neighbors in need of this c ext organization
	*/
	@Override
	public boolean getFnNeighborsInNeed() {
		return _cExtOrganization.getFnNeighborsInNeed();
	}

	/**
	* Returns the fn one great hour of sharing of this c ext organization.
	*
	* @return the fn one great hour of sharing of this c ext organization
	*/
	@Override
	public boolean getFnOneGreatHourOfSharing() {
		return _cExtOrganization.getFnOneGreatHourOfSharing();
	}

	/**
	* Returns the fn our church wider mission of this c ext organization.
	*
	* @return the fn our church wider mission of this c ext organization
	*/
	@Override
	public boolean getFnOurChurchWiderMission() {
		return _cExtOrganization.getFnOurChurchWiderMission();
	}

	/**
	* Returns the fn our church wider mission how of this c ext organization.
	*
	* @return the fn our church wider mission how of this c ext organization
	*/
	@Override
	public String getFnOurChurchWiderMissionHow() {
		return _cExtOrganization.getFnOurChurchWiderMissionHow();
	}

	/**
	* Returns the fn reserves of this c ext organization.
	*
	* @return the fn reserves of this c ext organization
	*/
	@Override
	public int getFnReserves() {
		return _cExtOrganization.getFnReserves();
	}

	/**
	* Returns the fn strenghten the church of this c ext organization.
	*
	* @return the fn strenghten the church of this c ext organization
	*/
	@Override
	public boolean getFnStrenghtenTheChurch() {
		return _cExtOrganization.getFnStrenghtenTheChurch();
	}

	/**
	* Returns the fn year of this c ext organization.
	*
	* @return the fn year of this c ext organization
	*/
	@Override
	public String getFnYear() {
		return _cExtOrganization.getFnYear();
	}

	/**
	* Returns the hi complete of this c ext organization.
	*
	* @return the hi complete of this c ext organization
	*/
	@Override
	public boolean getHiComplete() {
		return _cExtOrganization.getHiComplete();
	}

	/**
	* Returns the hi conflict resolution of this c ext organization.
	*
	* @return the hi conflict resolution of this c ext organization
	*/
	@Override
	public String getHiConflictResolution() {
		return _cExtOrganization.getHiConflictResolution();
	}

	/**
	* Returns the hi fitness review of this c ext organization.
	*
	* @return the hi fitness review of this c ext organization
	*/
	@Override
	public String getHiFitnessReview() {
		return _cExtOrganization.getHiFitnessReview();
	}

	/**
	* Returns the hi managed change of this c ext organization.
	*
	* @return the hi managed change of this c ext organization
	*/
	@Override
	public String getHiManagedChange() {
		return _cExtOrganization.getHiManagedChange();
	}

	/**
	* Returns the hi ministerial leadership learning of this c ext organization.
	*
	* @return the hi ministerial leadership learning of this c ext organization
	*/
	@Override
	public String getHiMinisterialLeadershipLearning() {
		return _cExtOrganization.getHiMinisterialLeadershipLearning();
	}

	/**
	* Returns the hi pressure involuntary termination of this c ext organization.
	*
	* @return the hi pressure involuntary termination of this c ext organization
	*/
	@Override
	public String getHiPressureInvoluntaryTermination() {
		return _cExtOrganization.getHiPressureInvoluntaryTermination();
	}

	/**
	* Returns the hi significant happenings of this c ext organization.
	*
	* @return the hi significant happenings of this c ext organization
	*/
	@Override
	public String getHiSignificantHappenings() {
		return _cExtOrganization.getHiSignificantHappenings();
	}

	/**
	* Returns the hi situational support consultation of this c ext organization.
	*
	* @return the hi situational support consultation of this c ext organization
	*/
	@Override
	public String getHiSituationalSupportConsultation() {
		return _cExtOrganization.getHiSituationalSupportConsultation();
	}

	/**
	* Returns the mi community demographics impact of this c ext organization.
	*
	* @return the mi community demographics impact of this c ext organization
	*/
	@Override
	public String getMiCommunityDemographicsImpact() {
		return _cExtOrganization.getMiCommunityDemographicsImpact();
	}

	/**
	* Returns the mi complete of this c ext organization.
	*
	* @return the mi complete of this c ext organization
	*/
	@Override
	public boolean getMiComplete() {
		return _cExtOrganization.getMiComplete();
	}

	/**
	* Returns the mi congregation demographics comparison of this c ext organization.
	*
	* @return the mi congregation demographics comparison of this c ext organization
	*/
	@Override
	public String getMiCongregationDemographicsComparison() {
		return _cExtOrganization.getMiCongregationDemographicsComparison();
	}

	/**
	* Returns the mi known for in community of this c ext organization.
	*
	* @return the mi known for in community of this c ext organization
	*/
	@Override
	public String getMiKnownForInCommunity() {
		return _cExtOrganization.getMiKnownForInCommunity();
	}

	/**
	* Returns the mi mission in site trends opportunities of this c ext organization.
	*
	* @return the mi mission in site trends opportunities of this c ext organization
	*/
	@Override
	public String getMiMissionInSiteTrendsOpportunities() {
		return _cExtOrganization.getMiMissionInSiteTrendsOpportunities();
	}

	/**
	* Returns the mi why new people involved of this c ext organization.
	*
	* @return the mi why new people involved of this c ext organization
	*/
	@Override
	public String getMiWhyNewPeopleInvolved() {
		return _cExtOrganization.getMiWhyNewPeopleInvolved();
	}

	/**
	* Returns the modified date of this c ext organization.
	*
	* @return the modified date of this c ext organization
	*/
	@Override
	public Date getModifiedDate() {
		return _cExtOrganization.getModifiedDate();
	}

	/**
	* Returns the organization ID of this c ext organization.
	*
	* @return the organization ID of this c ext organization
	*/
	@Override
	public long getOrganizationId() {
		return _cExtOrganization.getOrganizationId();
	}

	/**
	* Returns the pb file entry ID of this c ext organization.
	*
	* @return the pb file entry ID of this c ext organization
	*/
	@Override
	public long getPbFileEntryId() {
		return _cExtOrganization.getPbFileEntryId();
	}

	/**
	* Returns the pb published date of this c ext organization.
	*
	* @return the pb published date of this c ext organization
	*/
	@Override
	public Date getPbPublishedDate() {
		return _cExtOrganization.getPbPublishedDate();
	}

	/**
	* Returns the pp comments of this c ext organization.
	*
	* @return the pp comments of this c ext organization
	*/
	@Override
	public String getPpComments() {
		return _cExtOrganization.getPpComments();
	}

	/**
	* Returns the pp complete of this c ext organization.
	*
	* @return the pp complete of this c ext organization
	*/
	@Override
	public boolean getPpComplete() {
		return _cExtOrganization.getPpComplete();
	}

	/**
	* Returns the primary key of this c ext organization.
	*
	* @return the primary key of this c ext organization
	*/
	@Override
	public long getPrimaryKey() {
		return _cExtOrganization.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cExtOrganization.getPrimaryKeyObj();
	}

	/**
	* Returns the pv complete of this c ext organization.
	*
	* @return the pv complete of this c ext organization
	*/
	@Override
	public boolean getPvComplete() {
		return _cExtOrganization.getPvComplete();
	}

	/**
	* Returns the pv file entry ID of this c ext organization.
	*
	* @return the pv file entry ID of this c ext organization
	*/
	@Override
	public long getPvFileEntryId() {
		return _cExtOrganization.getPvFileEntryId();
	}

	/**
	* Returns the pv generated date of this c ext organization.
	*
	* @return the pv generated date of this c ext organization
	*/
	@Override
	public Date getPvGeneratedDate() {
		return _cExtOrganization.getPvGeneratedDate();
	}

	/**
	* Returns the re building program of this c ext organization.
	*
	* @return the re building program of this c ext organization
	*/
	@Override
	public String getReBuildingProgram() {
		return _cExtOrganization.getReBuildingProgram();
	}

	/**
	* Returns the re campaign mission components of this c ext organization.
	*
	* @return the re campaign mission components of this c ext organization
	*/
	@Override
	public String getReCampaignMissionComponents() {
		return _cExtOrganization.getReCampaignMissionComponents();
	}

	/**
	* Returns the re complete of this c ext organization.
	*
	* @return the re complete of this c ext organization
	*/
	@Override
	public boolean getReComplete() {
		return _cExtOrganization.getReComplete();
	}

	/**
	* Returns the re finances assets review of this c ext organization.
	*
	* @return the re finances assets review of this c ext organization
	*/
	@Override
	public String getReFinancesAssetsReview() {
		return _cExtOrganization.getReFinancesAssetsReview();
	}

	/**
	* Returns the re non owned buildings of this c ext organization.
	*
	* @return the re non owned buildings of this c ext organization
	*/
	@Override
	public String getReNonOwnedBuildings() {
		return _cExtOrganization.getReNonOwnedBuildings();
	}

	/**
	* Returns the re owned buildings of this c ext organization.
	*
	* @return the re owned buildings of this c ext organization
	*/
	@Override
	public String getReOwnedBuildings() {
		return _cExtOrganization.getReOwnedBuildings();
	}

	/**
	* Returns the re parsonage of this c ext organization.
	*
	* @return the re parsonage of this c ext organization
	*/
	@Override
	public boolean getReParsonage() {
		return _cExtOrganization.getReParsonage();
	}

	/**
	* Returns the re parsonage assessed value of this c ext organization.
	*
	* @return the re parsonage assessed value of this c ext organization
	*/
	@Override
	public int getReParsonageAssessedValue() {
		return _cExtOrganization.getReParsonageAssessedValue();
	}

	/**
	* Returns the re parsonage available minister of this c ext organization.
	*
	* @return the re parsonage available minister of this c ext organization
	*/
	@Override
	public boolean getReParsonageAvailableMinister() {
		return _cExtOrganization.getReParsonageAvailableMinister();
	}

	/**
	* Returns the re parsonage bathrooms of this c ext organization.
	*
	* @return the re parsonage bathrooms of this c ext organization
	*/
	@Override
	public int getReParsonageBathrooms() {
		return _cExtOrganization.getReParsonageBathrooms();
	}

	/**
	* Returns the re parsonage bedrooms of this c ext organization.
	*
	* @return the re parsonage bedrooms of this c ext organization
	*/
	@Override
	public int getReParsonageBedrooms() {
		return _cExtOrganization.getReParsonageBedrooms();
	}

	/**
	* Returns the re parsonage city of this c ext organization.
	*
	* @return the re parsonage city of this c ext organization
	*/
	@Override
	public String getReParsonageCity() {
		return _cExtOrganization.getReParsonageCity();
	}

	/**
	* Returns the re parsonage condition of this c ext organization.
	*
	* @return the re parsonage condition of this c ext organization
	*/
	@Override
	public String getReParsonageCondition() {
		return _cExtOrganization.getReParsonageCondition();
	}

	/**
	* Returns the re parsonage expected minister of this c ext organization.
	*
	* @return the re parsonage expected minister of this c ext organization
	*/
	@Override
	public boolean getReParsonageExpectedMinister() {
		return _cExtOrganization.getReParsonageExpectedMinister();
	}

	/**
	* Returns the re parsonage footage of this c ext organization.
	*
	* @return the re parsonage footage of this c ext organization
	*/
	@Override
	public int getReParsonageFootage() {
		return _cExtOrganization.getReParsonageFootage();
	}

	/**
	* Returns the re parsonage market value of this c ext organization.
	*
	* @return the re parsonage market value of this c ext organization
	*/
	@Override
	public int getReParsonageMarketValue() {
		return _cExtOrganization.getReParsonageMarketValue();
	}

	/**
	* Returns the re parsonage responsible entity of this c ext organization.
	*
	* @return the re parsonage responsible entity of this c ext organization
	*/
	@Override
	public String getReParsonageResponsibleEntity() {
		return _cExtOrganization.getReParsonageResponsibleEntity();
	}

	/**
	* Returns the re parsonage state of this c ext organization.
	*
	* @return the re parsonage state of this c ext organization
	*/
	@Override
	public String getReParsonageState() {
		return _cExtOrganization.getReParsonageState();
	}

	/**
	* Returns the re parsonage street address of this c ext organization.
	*
	* @return the re parsonage street address of this c ext organization
	*/
	@Override
	public String getReParsonageStreetAddress() {
		return _cExtOrganization.getReParsonageStreetAddress();
	}

	/**
	* Returns the re parsonage usage of this c ext organization.
	*
	* @return the re parsonage usage of this c ext organization
	*/
	@Override
	public String getReParsonageUsage() {
		return _cExtOrganization.getReParsonageUsage();
	}

	/**
	* Returns the re parsonage zip of this c ext organization.
	*
	* @return the re parsonage zip of this c ext organization
	*/
	@Override
	public String getReParsonageZip() {
		return _cExtOrganization.getReParsonageZip();
	}

	/**
	* Returns the re wheelchair accessible of this c ext organization.
	*
	* @return the re wheelchair accessible of this c ext organization
	*/
	@Override
	public String getReWheelchairAccessible() {
		return _cExtOrganization.getReWheelchairAccessible();
	}

	/**
	* Returns the rf complete of this c ext organization.
	*
	* @return the rf complete of this c ext organization
	*/
	@Override
	public boolean getRfComplete() {
		return _cExtOrganization.getRfComplete();
	}

	/**
	* Returns the rf crisis disaster action of this c ext organization.
	*
	* @return the rf crisis disaster action of this c ext organization
	*/
	@Override
	public String getRfCrisisDisasterAction() {
		return _cExtOrganization.getRfCrisisDisasterAction();
	}

	/**
	* Returns the rf education faith vision of this c ext organization.
	*
	* @return the rf education faith vision of this c ext organization
	*/
	@Override
	public String getRfEducationFaithVision() {
		return _cExtOrganization.getRfEducationFaithVision();
	}

	/**
	* Returns the rf life of faith of this c ext organization.
	*
	* @return the rf life of faith of this c ext organization
	*/
	@Override
	public String getRfLifeOfFaith() {
		return _cExtOrganization.getRfLifeOfFaith();
	}

	/**
	* Returns the rf meeting hours per month of this c ext organization.
	*
	* @return the rf meeting hours per month of this c ext organization
	*/
	@Override
	public String getRfMeetingHoursPerMonth() {
		return _cExtOrganization.getRfMeetingHoursPerMonth();
	}

	/**
	* Returns the rf minister governance copy of this c ext organization.
	*
	* @return the rf minister governance copy of this c ext organization
	*/
	@Override
	public boolean getRfMinisterGovernanceCopy() {
		return _cExtOrganization.getRfMinisterGovernanceCopy();
	}

	/**
	* Returns the rf ministry mission of this c ext organization.
	*
	* @return the rf ministry mission of this c ext organization
	*/
	@Override
	public String getRfMinistryMission() {
		return _cExtOrganization.getRfMinistryMission();
	}

	/**
	* Returns the rf strengths qualities of this c ext organization.
	*
	* @return the rf strengths qualities of this c ext organization
	*/
	@Override
	public String getRfStrengthsQualities() {
		return _cExtOrganization.getRfStrengthsQualities();
	}

	/**
	* Returns the rf worship of this c ext organization.
	*
	* @return the rf worship of this c ext organization
	*/
	@Override
	public String getRfWorship() {
		return _cExtOrganization.getRfWorship();
	}

	/**
	* Returns the rv complete of this c ext organization.
	*
	* @return the rv complete of this c ext organization
	*/
	@Override
	public boolean getRvComplete() {
		return _cExtOrganization.getRvComplete();
	}

	/**
	* Returns the rv overall ministry of this c ext organization.
	*
	* @return the rv overall ministry of this c ext organization
	*/
	@Override
	public String getRvOverallMinistry() {
		return _cExtOrganization.getRvOverallMinistry();
	}

	/**
	* Returns the sf complete of this c ext organization.
	*
	* @return the sf complete of this c ext organization
	*/
	@Override
	public boolean getSfComplete() {
		return _cExtOrganization.getSfComplete();
	}

	/**
	* Returns the sf previous roles of this c ext organization.
	*
	* @return the sf previous roles of this c ext organization
	*/
	@Override
	public String getSfPreviousRoles() {
		return _cExtOrganization.getSfPreviousRoles();
	}

	/**
	* Returns the user ID of this c ext organization.
	*
	* @return the user ID of this c ext organization
	*/
	@Override
	public long getUserId() {
		return _cExtOrganization.getUserId();
	}

	/**
	* Returns the user uuid of this c ext organization.
	*
	* @return the user uuid of this c ext organization
	*/
	@Override
	public String getUserUuid() {
		return _cExtOrganization.getUserUuid();
	}

	/**
	* Returns the vs complete of this c ext organization.
	*
	* @return the vs complete of this c ext organization
	*/
	@Override
	public boolean getVsComplete() {
		return _cExtOrganization.getVsComplete();
	}

	/**
	* Returns the vs gods call to become of this c ext organization.
	*
	* @return the vs gods call to become of this c ext organization
	*/
	@Override
	public String getVsGodsCallToBecome() {
		return _cExtOrganization.getVsGodsCallToBecome();
	}

	/**
	* Returns the vs gods call to reach out of this c ext organization.
	*
	* @return the vs gods call to reach out of this c ext organization
	*/
	@Override
	public String getVsGodsCallToReachOut() {
		return _cExtOrganization.getVsGodsCallToReachOut();
	}

	/**
	* Returns the yr church response of this c ext organization.
	*
	* @return the yr church response of this c ext organization
	*/
	@Override
	public String getYrChurchResponse() {
		return _cExtOrganization.getYrChurchResponse();
	}

	/**
	* Returns the yr complete of this c ext organization.
	*
	* @return the yr complete of this c ext organization
	*/
	@Override
	public boolean getYrComplete() {
		return _cExtOrganization.getYrComplete();
	}

	/**
	* Returns the yr file entry ID of this c ext organization.
	*
	* @return the yr file entry ID of this c ext organization
	*/
	@Override
	public long getYrFileEntryId() {
		return _cExtOrganization.getYrFileEntryId();
	}

	@Override
	public int hashCode() {
		return _cExtOrganization.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cExtOrganization.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm accessible to all.
	*
	* @return <code>true</code> if this c ext organization is cm accessible to all; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmAccessibleToAll() {
		return _cExtOrganization.isCmAccessibleToAll();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm border and immigrant justice.
	*
	* @return <code>true</code> if this c ext organization is cm border and immigrant justice; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmBorderAndImmigrantJustice() {
		return _cExtOrganization.isCmBorderAndImmigrantJustice();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm complete.
	*
	* @return <code>true</code> if this c ext organization is cm complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmComplete() {
		return _cExtOrganization.isCmComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm creation justice.
	*
	* @return <code>true</code> if this c ext organization is cm creation justice; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmCreationJustice() {
		return _cExtOrganization.isCmCreationJustice();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm designations other denominations.
	*
	* @return <code>true</code> if this c ext organization is cm designations other denominations; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmDesignationsOtherDenominations() {
		return _cExtOrganization.isCmDesignationsOtherDenominations();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm economic justice.
	*
	* @return <code>true</code> if this c ext organization is cm economic justice; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmEconomicJustice() {
		return _cExtOrganization.isCmEconomicJustice();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm faithful and welcoming.
	*
	* @return <code>true</code> if this c ext organization is cm faithful and welcoming; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmFaithfulAndWelcoming() {
		return _cExtOrganization.isCmFaithfulAndWelcoming();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm global mission church.
	*
	* @return <code>true</code> if this c ext organization is cm global mission church; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmGlobalMissionChurch() {
		return _cExtOrganization.isCmGlobalMissionChurch();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm god is still speaking.
	*
	* @return <code>true</code> if this c ext organization is cm god is still speaking; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmGodIsStillSpeaking() {
		return _cExtOrganization.isCmGodIsStillSpeaking();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm inter cultural multi racial.
	*
	* @return <code>true</code> if this c ext organization is cm inter cultural multi racial; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmInterCulturalMultiRacial() {
		return _cExtOrganization.isCmInterCulturalMultiRacial();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm just peace.
	*
	* @return <code>true</code> if this c ext organization is cm just peace; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmJustPeace() {
		return _cExtOrganization.isCmJustPeace();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm open and affirming.
	*
	* @return <code>true</code> if this c ext organization is cm open and affirming; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmOpenAndAffirming() {
		return _cExtOrganization.isCmOpenAndAffirming();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm other ucc designations.
	*
	* @return <code>true</code> if this c ext organization is cm other ucc designations; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmOtherUCCDesignations() {
		return _cExtOrganization.isCmOtherUCCDesignations();
	}

	/**
	* Returns <code>true</code> if this c ext organization is cm wise congregation for mental health.
	*
	* @return <code>true</code> if this c ext organization is cm wise congregation for mental health; <code>false</code> otherwise
	*/
	@Override
	public boolean isCmWISECongregationForMentalHealth() {
		return _cExtOrganization.isCmWISECongregationForMentalHealth();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg active members estimate.
	*
	* @return <code>true</code> if this c ext organization is dg active members estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgActiveMembersEstimate() {
		return _cExtOrganization.isDgActiveMembersEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg active non members estimate.
	*
	* @return <code>true</code> if this c ext organization is dg active non members estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgActiveNonMembersEstimate() {
		return _cExtOrganization.isDgActiveNonMembersEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg all ages estimate.
	*
	* @return <code>true</code> if this c ext organization is dg all ages estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgAllAgesEstimate() {
		return _cExtOrganization.isDgAllAgesEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg complete.
	*
	* @return <code>true</code> if this c ext organization is dg complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgComplete() {
		return _cExtOrganization.isDgComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent5 to10 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent5 to10 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercent5To10Estimate() {
		return _cExtOrganization.isDgPercent5To10Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent college estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent college estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentCollegeEstimate() {
		return _cExtOrganization.isDgPercentCollegeEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent employed estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent employed estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentEmployedEstimate() {
		return _cExtOrganization.isDgPercentEmployedEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent graduate school estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent graduate school estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentGraduateSchoolEstimate() {
		return _cExtOrganization.isDgPercentGraduateSchoolEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent high school estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent high school estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentHighSchoolEstimate() {
		return _cExtOrganization.isDgPercentHighSchoolEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent joint no minors estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent joint no minors estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentJointNoMinorsEstimate() {
		return _cExtOrganization.isDgPercentJointNoMinorsEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent less than5 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent less than5 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentLessThan5Estimate() {
		return _cExtOrganization.isDgPercentLessThan5Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent more than10 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent more than10 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentMoreThan10Estimate() {
		return _cExtOrganization.isDgPercentMoreThan10Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent not fully employed estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent not fully employed estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentNotFullyEmployedEstimate() {
		return _cExtOrganization.isDgPercentNotFullyEmployedEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent other education estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent other education estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentOtherEducationEstimate() {
		return _cExtOrganization.isDgPercentOtherEducationEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent retired estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent retired estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentRetiredEstimate() {
		return _cExtOrganization.isDgPercentRetiredEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent single35 to65 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent single35 to65 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentSingle35To65Estimate() {
		return _cExtOrganization.isDgPercentSingle35To65Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent single over65 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent single over65 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentSingleOver65Estimate() {
		return _cExtOrganization.isDgPercentSingleOver65Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent single under35 estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent single under35 estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentSingleUnder35Estimate() {
		return _cExtOrganization.isDgPercentSingleUnder35Estimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent specialty training estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent specialty training estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentSpecialtyTrainingEstimate() {
		return _cExtOrganization.isDgPercentSpecialtyTrainingEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dg percent with minors estimate.
	*
	* @return <code>true</code> if this c ext organization is dg percent with minors estimate; <code>false</code> otherwise
	*/
	@Override
	public boolean isDgPercentWithMinorsEstimate() {
		return _cExtOrganization.isDgPercentWithMinorsEstimate();
	}

	/**
	* Returns <code>true</code> if this c ext organization is di complete.
	*
	* @return <code>true</code> if this c ext organization is di complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isDiComplete() {
		return _cExtOrganization.isDiComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is dv complete.
	*
	* @return <code>true</code> if this c ext organization is dv complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isDvComplete() {
		return _cExtOrganization.isDvComplete();
	}

	@Override
	public boolean isEscapedModel() {
		return _cExtOrganization.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn christmas fund.
	*
	* @return <code>true</code> if this c ext organization is fn christmas fund; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnChristmasFund() {
		return _cExtOrganization.isFnChristmasFund();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn complete.
	*
	* @return <code>true</code> if this c ext organization is fn complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnComplete() {
		return _cExtOrganization.isFnComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn debt payments current.
	*
	* @return <code>true</code> if this c ext organization is fn debt payments current; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnDebtPaymentsCurrent() {
		return _cExtOrganization.isFnDebtPaymentsCurrent();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn endowment.
	*
	* @return <code>true</code> if this c ext organization is fn endowment; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnEndowment() {
		return _cExtOrganization.isFnEndowment();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn fail to pay minister.
	*
	* @return <code>true</code> if this c ext organization is fn fail to pay minister; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnFailToPayMinister() {
		return _cExtOrganization.isFnFailToPayMinister();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn neighbors in need.
	*
	* @return <code>true</code> if this c ext organization is fn neighbors in need; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnNeighborsInNeed() {
		return _cExtOrganization.isFnNeighborsInNeed();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn one great hour of sharing.
	*
	* @return <code>true</code> if this c ext organization is fn one great hour of sharing; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnOneGreatHourOfSharing() {
		return _cExtOrganization.isFnOneGreatHourOfSharing();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn our church wider mission.
	*
	* @return <code>true</code> if this c ext organization is fn our church wider mission; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnOurChurchWiderMission() {
		return _cExtOrganization.isFnOurChurchWiderMission();
	}

	/**
	* Returns <code>true</code> if this c ext organization is fn strenghten the church.
	*
	* @return <code>true</code> if this c ext organization is fn strenghten the church; <code>false</code> otherwise
	*/
	@Override
	public boolean isFnStrenghtenTheChurch() {
		return _cExtOrganization.isFnStrenghtenTheChurch();
	}

	/**
	* Returns <code>true</code> if this c ext organization is hi complete.
	*
	* @return <code>true</code> if this c ext organization is hi complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isHiComplete() {
		return _cExtOrganization.isHiComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is mi complete.
	*
	* @return <code>true</code> if this c ext organization is mi complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isMiComplete() {
		return _cExtOrganization.isMiComplete();
	}

	@Override
	public boolean isNew() {
		return _cExtOrganization.isNew();
	}

	/**
	* Returns <code>true</code> if this c ext organization is pp complete.
	*
	* @return <code>true</code> if this c ext organization is pp complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isPpComplete() {
		return _cExtOrganization.isPpComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is pv complete.
	*
	* @return <code>true</code> if this c ext organization is pv complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isPvComplete() {
		return _cExtOrganization.isPvComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is re complete.
	*
	* @return <code>true</code> if this c ext organization is re complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isReComplete() {
		return _cExtOrganization.isReComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is re parsonage.
	*
	* @return <code>true</code> if this c ext organization is re parsonage; <code>false</code> otherwise
	*/
	@Override
	public boolean isReParsonage() {
		return _cExtOrganization.isReParsonage();
	}

	/**
	* Returns <code>true</code> if this c ext organization is re parsonage available minister.
	*
	* @return <code>true</code> if this c ext organization is re parsonage available minister; <code>false</code> otherwise
	*/
	@Override
	public boolean isReParsonageAvailableMinister() {
		return _cExtOrganization.isReParsonageAvailableMinister();
	}

	/**
	* Returns <code>true</code> if this c ext organization is re parsonage expected minister.
	*
	* @return <code>true</code> if this c ext organization is re parsonage expected minister; <code>false</code> otherwise
	*/
	@Override
	public boolean isReParsonageExpectedMinister() {
		return _cExtOrganization.isReParsonageExpectedMinister();
	}

	/**
	* Returns <code>true</code> if this c ext organization is rf complete.
	*
	* @return <code>true</code> if this c ext organization is rf complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isRfComplete() {
		return _cExtOrganization.isRfComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is rf minister governance copy.
	*
	* @return <code>true</code> if this c ext organization is rf minister governance copy; <code>false</code> otherwise
	*/
	@Override
	public boolean isRfMinisterGovernanceCopy() {
		return _cExtOrganization.isRfMinisterGovernanceCopy();
	}

	/**
	* Returns <code>true</code> if this c ext organization is rv complete.
	*
	* @return <code>true</code> if this c ext organization is rv complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isRvComplete() {
		return _cExtOrganization.isRvComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is sf complete.
	*
	* @return <code>true</code> if this c ext organization is sf complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isSfComplete() {
		return _cExtOrganization.isSfComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is vs complete.
	*
	* @return <code>true</code> if this c ext organization is vs complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isVsComplete() {
		return _cExtOrganization.isVsComplete();
	}

	/**
	* Returns <code>true</code> if this c ext organization is yr complete.
	*
	* @return <code>true</code> if this c ext organization is yr complete; <code>false</code> otherwise
	*/
	@Override
	public boolean isYrComplete() {
		return _cExtOrganization.isYrComplete();
	}

	@Override
	public void persist() {
		_cExtOrganization.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cExtOrganization.setCachedModel(cachedModel);
	}

	/**
	* Sets whether this c ext organization is cm accessible to all.
	*
	* @param cmAccessibleToAll the cm accessible to all of this c ext organization
	*/
	@Override
	public void setCmAccessibleToAll(boolean cmAccessibleToAll) {
		_cExtOrganization.setCmAccessibleToAll(cmAccessibleToAll);
	}

	/**
	* Sets whether this c ext organization is cm border and immigrant justice.
	*
	* @param cmBorderAndImmigrantJustice the cm border and immigrant justice of this c ext organization
	*/
	@Override
	public void setCmBorderAndImmigrantJustice(
		boolean cmBorderAndImmigrantJustice) {
		_cExtOrganization.setCmBorderAndImmigrantJustice(cmBorderAndImmigrantJustice);
	}

	/**
	* Sets whether this c ext organization is cm complete.
	*
	* @param cmComplete the cm complete of this c ext organization
	*/
	@Override
	public void setCmComplete(boolean cmComplete) {
		_cExtOrganization.setCmComplete(cmComplete);
	}

	/**
	* Sets whether this c ext organization is cm creation justice.
	*
	* @param cmCreationJustice the cm creation justice of this c ext organization
	*/
	@Override
	public void setCmCreationJustice(boolean cmCreationJustice) {
		_cExtOrganization.setCmCreationJustice(cmCreationJustice);
	}

	/**
	* Sets whether this c ext organization is cm designations other denominations.
	*
	* @param cmDesignationsOtherDenominations the cm designations other denominations of this c ext organization
	*/
	@Override
	public void setCmDesignationsOtherDenominations(
		boolean cmDesignationsOtherDenominations) {
		_cExtOrganization.setCmDesignationsOtherDenominations(cmDesignationsOtherDenominations);
	}

	/**
	* Sets whether this c ext organization is cm economic justice.
	*
	* @param cmEconomicJustice the cm economic justice of this c ext organization
	*/
	@Override
	public void setCmEconomicJustice(boolean cmEconomicJustice) {
		_cExtOrganization.setCmEconomicJustice(cmEconomicJustice);
	}

	/**
	* Sets the cm ecumenical interfaith participation of this c ext organization.
	*
	* @param cmEcumenicalInterfaithParticipation the cm ecumenical interfaith participation of this c ext organization
	*/
	@Override
	public void setCmEcumenicalInterfaithParticipation(
		String cmEcumenicalInterfaithParticipation) {
		_cExtOrganization.setCmEcumenicalInterfaithParticipation(cmEcumenicalInterfaithParticipation);
	}

	/**
	* Sets whether this c ext organization is cm faithful and welcoming.
	*
	* @param cmFaithfulAndWelcoming the cm faithful and welcoming of this c ext organization
	*/
	@Override
	public void setCmFaithfulAndWelcoming(boolean cmFaithfulAndWelcoming) {
		_cExtOrganization.setCmFaithfulAndWelcoming(cmFaithfulAndWelcoming);
	}

	/**
	* Sets whether this c ext organization is cm global mission church.
	*
	* @param cmGlobalMissionChurch the cm global mission church of this c ext organization
	*/
	@Override
	public void setCmGlobalMissionChurch(boolean cmGlobalMissionChurch) {
		_cExtOrganization.setCmGlobalMissionChurch(cmGlobalMissionChurch);
	}

	/**
	* Sets whether this c ext organization is cm god is still speaking.
	*
	* @param cmGodIsStillSpeaking the cm god is still speaking of this c ext organization
	*/
	@Override
	public void setCmGodIsStillSpeaking(boolean cmGodIsStillSpeaking) {
		_cExtOrganization.setCmGodIsStillSpeaking(cmGodIsStillSpeaking);
	}

	/**
	* Sets whether this c ext organization is cm inter cultural multi racial.
	*
	* @param cmInterCulturalMultiRacial the cm inter cultural multi racial of this c ext organization
	*/
	@Override
	public void setCmInterCulturalMultiRacial(
		boolean cmInterCulturalMultiRacial) {
		_cExtOrganization.setCmInterCulturalMultiRacial(cmInterCulturalMultiRacial);
	}

	/**
	* Sets whether this c ext organization is cm just peace.
	*
	* @param cmJustPeace the cm just peace of this c ext organization
	*/
	@Override
	public void setCmJustPeace(boolean cmJustPeace) {
		_cExtOrganization.setCmJustPeace(cmJustPeace);
	}

	/**
	* Sets the cm meetings relationships activities of this c ext organization.
	*
	* @param cmMeetingsRelationshipsActivities the cm meetings relationships activities of this c ext organization
	*/
	@Override
	public void setCmMeetingsRelationshipsActivities(
		String cmMeetingsRelationshipsActivities) {
		_cExtOrganization.setCmMeetingsRelationshipsActivities(cmMeetingsRelationshipsActivities);
	}

	/**
	* Sets the cm mission statement comparison of this c ext organization.
	*
	* @param cmMissionStatementComparison the cm mission statement comparison of this c ext organization
	*/
	@Override
	public void setCmMissionStatementComparison(
		String cmMissionStatementComparison) {
		_cExtOrganization.setCmMissionStatementComparison(cmMissionStatementComparison);
	}

	/**
	* Sets whether this c ext organization is cm open and affirming.
	*
	* @param cmOpenAndAffirming the cm open and affirming of this c ext organization
	*/
	@Override
	public void setCmOpenAndAffirming(boolean cmOpenAndAffirming) {
		_cExtOrganization.setCmOpenAndAffirming(cmOpenAndAffirming);
	}

	/**
	* Sets whether this c ext organization is cm other ucc designations.
	*
	* @param cmOtherUCCDesignations the cm other ucc designations of this c ext organization
	*/
	@Override
	public void setCmOtherUCCDesignations(boolean cmOtherUCCDesignations) {
		_cExtOrganization.setCmOtherUCCDesignations(cmOtherUCCDesignations);
	}

	/**
	* Sets the cm pastor time expectations of this c ext organization.
	*
	* @param cmPastorTimeExpectations the cm pastor time expectations of this c ext organization
	*/
	@Override
	public void setCmPastorTimeExpectations(String cmPastorTimeExpectations) {
		_cExtOrganization.setCmPastorTimeExpectations(cmPastorTimeExpectations);
	}

	/**
	* Sets the cm service advocacy of this c ext organization.
	*
	* @param cmServiceAdvocacy the cm service advocacy of this c ext organization
	*/
	@Override
	public void setCmServiceAdvocacy(String cmServiceAdvocacy) {
		_cExtOrganization.setCmServiceAdvocacy(cmServiceAdvocacy);
	}

	/**
	* Sets the cm statements reflection of this c ext organization.
	*
	* @param cmStatementsReflection the cm statements reflection of this c ext organization
	*/
	@Override
	public void setCmStatementsReflection(String cmStatementsReflection) {
		_cExtOrganization.setCmStatementsReflection(cmStatementsReflection);
	}

	/**
	* Sets whether this c ext organization is cm wise congregation for mental health.
	*
	* @param cmWISECongregationForMentalHealth the cm wise congregation for mental health of this c ext organization
	*/
	@Override
	public void setCmWISECongregationForMentalHealth(
		boolean cmWISECongregationForMentalHealth) {
		_cExtOrganization.setCmWISECongregationForMentalHealth(cmWISECongregationForMentalHealth);
	}

	/**
	* Sets the cm work toward witness future of this c ext organization.
	*
	* @param cmWorkTowardWitnessFuture the cm work toward witness future of this c ext organization
	*/
	@Override
	public void setCmWorkTowardWitnessFuture(String cmWorkTowardWitnessFuture) {
		_cExtOrganization.setCmWorkTowardWitnessFuture(cmWorkTowardWitnessFuture);
	}

	/**
	* Sets the company ID of this c ext organization.
	*
	* @param companyId the company ID of this c ext organization
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cExtOrganization.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this c ext organization.
	*
	* @param createDate the create date of this c ext organization
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cExtOrganization.setCreateDate(createDate);
	}

	/**
	* Sets the dg active members of this c ext organization.
	*
	* @param dgActiveMembers the dg active members of this c ext organization
	*/
	@Override
	public void setDgActiveMembers(int dgActiveMembers) {
		_cExtOrganization.setDgActiveMembers(dgActiveMembers);
	}

	/**
	* Sets whether this c ext organization is dg active members estimate.
	*
	* @param dgActiveMembersEstimate the dg active members estimate of this c ext organization
	*/
	@Override
	public void setDgActiveMembersEstimate(boolean dgActiveMembersEstimate) {
		_cExtOrganization.setDgActiveMembersEstimate(dgActiveMembersEstimate);
	}

	/**
	* Sets the dg active non members of this c ext organization.
	*
	* @param dgActiveNonMembers the dg active non members of this c ext organization
	*/
	@Override
	public void setDgActiveNonMembers(int dgActiveNonMembers) {
		_cExtOrganization.setDgActiveNonMembers(dgActiveNonMembers);
	}

	/**
	* Sets whether this c ext organization is dg active non members estimate.
	*
	* @param dgActiveNonMembersEstimate the dg active non members estimate of this c ext organization
	*/
	@Override
	public void setDgActiveNonMembersEstimate(
		boolean dgActiveNonMembersEstimate) {
		_cExtOrganization.setDgActiveNonMembersEstimate(dgActiveNonMembersEstimate);
	}

	/**
	* Sets the dg age11 and under of this c ext organization.
	*
	* @param dgAge11AndUnder the dg age11 and under of this c ext organization
	*/
	@Override
	public void setDgAge11AndUnder(int dgAge11AndUnder) {
		_cExtOrganization.setDgAge11AndUnder(dgAge11AndUnder);
	}

	/**
	* Sets the dg age12 to17 of this c ext organization.
	*
	* @param dgAge12To17 the dg age12 to17 of this c ext organization
	*/
	@Override
	public void setDgAge12To17(int dgAge12To17) {
		_cExtOrganization.setDgAge12To17(dgAge12To17);
	}

	/**
	* Sets the dg age18 to24 of this c ext organization.
	*
	* @param dgAge18To24 the dg age18 to24 of this c ext organization
	*/
	@Override
	public void setDgAge18To24(int dgAge18To24) {
		_cExtOrganization.setDgAge18To24(dgAge18To24);
	}

	/**
	* Sets the dg age25 to34 of this c ext organization.
	*
	* @param dgAge25To34 the dg age25 to34 of this c ext organization
	*/
	@Override
	public void setDgAge25To34(int dgAge25To34) {
		_cExtOrganization.setDgAge25To34(dgAge25To34);
	}

	/**
	* Sets the dg age35 to44 of this c ext organization.
	*
	* @param dgAge35To44 the dg age35 to44 of this c ext organization
	*/
	@Override
	public void setDgAge35To44(int dgAge35To44) {
		_cExtOrganization.setDgAge35To44(dgAge35To44);
	}

	/**
	* Sets the dg age45 to54 of this c ext organization.
	*
	* @param dgAge45To54 the dg age45 to54 of this c ext organization
	*/
	@Override
	public void setDgAge45To54(int dgAge45To54) {
		_cExtOrganization.setDgAge45To54(dgAge45To54);
	}

	/**
	* Sets the dg age55 to64 of this c ext organization.
	*
	* @param dgAge55To64 the dg age55 to64 of this c ext organization
	*/
	@Override
	public void setDgAge55To64(int dgAge55To64) {
		_cExtOrganization.setDgAge55To64(dgAge55To64);
	}

	/**
	* Sets the dg age65 to74 of this c ext organization.
	*
	* @param dgAge65To74 the dg age65 to74 of this c ext organization
	*/
	@Override
	public void setDgAge65To74(int dgAge65To74) {
		_cExtOrganization.setDgAge65To74(dgAge65To74);
	}

	/**
	* Sets the dg age75 and over of this c ext organization.
	*
	* @param dgAge75AndOver the dg age75 and over of this c ext organization
	*/
	@Override
	public void setDgAge75AndOver(int dgAge75AndOver) {
		_cExtOrganization.setDgAge75AndOver(dgAge75AndOver);
	}

	/**
	* Sets whether this c ext organization is dg all ages estimate.
	*
	* @param dgAllAgesEstimate the dg all ages estimate of this c ext organization
	*/
	@Override
	public void setDgAllAgesEstimate(boolean dgAllAgesEstimate) {
		_cExtOrganization.setDgAllAgesEstimate(dgAllAgesEstimate);
	}

	/**
	* Sets whether this c ext organization is dg complete.
	*
	* @param dgComplete the dg complete of this c ext organization
	*/
	@Override
	public void setDgComplete(boolean dgComplete) {
		_cExtOrganization.setDgComplete(dgComplete);
	}

	/**
	* Sets the dg percent5 to10 of this c ext organization.
	*
	* @param dgPercent5To10 the dg percent5 to10 of this c ext organization
	*/
	@Override
	public void setDgPercent5To10(int dgPercent5To10) {
		_cExtOrganization.setDgPercent5To10(dgPercent5To10);
	}

	/**
	* Sets whether this c ext organization is dg percent5 to10 estimate.
	*
	* @param dgPercent5To10Estimate the dg percent5 to10 estimate of this c ext organization
	*/
	@Override
	public void setDgPercent5To10Estimate(boolean dgPercent5To10Estimate) {
		_cExtOrganization.setDgPercent5To10Estimate(dgPercent5To10Estimate);
	}

	/**
	* Sets the dg percent college of this c ext organization.
	*
	* @param dgPercentCollege the dg percent college of this c ext organization
	*/
	@Override
	public void setDgPercentCollege(int dgPercentCollege) {
		_cExtOrganization.setDgPercentCollege(dgPercentCollege);
	}

	/**
	* Sets whether this c ext organization is dg percent college estimate.
	*
	* @param dgPercentCollegeEstimate the dg percent college estimate of this c ext organization
	*/
	@Override
	public void setDgPercentCollegeEstimate(boolean dgPercentCollegeEstimate) {
		_cExtOrganization.setDgPercentCollegeEstimate(dgPercentCollegeEstimate);
	}

	/**
	* Sets the dg percent employed of this c ext organization.
	*
	* @param dgPercentEmployed the dg percent employed of this c ext organization
	*/
	@Override
	public void setDgPercentEmployed(int dgPercentEmployed) {
		_cExtOrganization.setDgPercentEmployed(dgPercentEmployed);
	}

	/**
	* Sets whether this c ext organization is dg percent employed estimate.
	*
	* @param dgPercentEmployedEstimate the dg percent employed estimate of this c ext organization
	*/
	@Override
	public void setDgPercentEmployedEstimate(boolean dgPercentEmployedEstimate) {
		_cExtOrganization.setDgPercentEmployedEstimate(dgPercentEmployedEstimate);
	}

	/**
	* Sets the dg percent graduate school of this c ext organization.
	*
	* @param dgPercentGraduateSchool the dg percent graduate school of this c ext organization
	*/
	@Override
	public void setDgPercentGraduateSchool(int dgPercentGraduateSchool) {
		_cExtOrganization.setDgPercentGraduateSchool(dgPercentGraduateSchool);
	}

	/**
	* Sets whether this c ext organization is dg percent graduate school estimate.
	*
	* @param dgPercentGraduateSchoolEstimate the dg percent graduate school estimate of this c ext organization
	*/
	@Override
	public void setDgPercentGraduateSchoolEstimate(
		boolean dgPercentGraduateSchoolEstimate) {
		_cExtOrganization.setDgPercentGraduateSchoolEstimate(dgPercentGraduateSchoolEstimate);
	}

	/**
	* Sets the dg percent high school of this c ext organization.
	*
	* @param dgPercentHighSchool the dg percent high school of this c ext organization
	*/
	@Override
	public void setDgPercentHighSchool(int dgPercentHighSchool) {
		_cExtOrganization.setDgPercentHighSchool(dgPercentHighSchool);
	}

	/**
	* Sets whether this c ext organization is dg percent high school estimate.
	*
	* @param dgPercentHighSchoolEstimate the dg percent high school estimate of this c ext organization
	*/
	@Override
	public void setDgPercentHighSchoolEstimate(
		boolean dgPercentHighSchoolEstimate) {
		_cExtOrganization.setDgPercentHighSchoolEstimate(dgPercentHighSchoolEstimate);
	}

	/**
	* Sets the dg percent joint no minors of this c ext organization.
	*
	* @param dgPercentJointNoMinors the dg percent joint no minors of this c ext organization
	*/
	@Override
	public void setDgPercentJointNoMinors(int dgPercentJointNoMinors) {
		_cExtOrganization.setDgPercentJointNoMinors(dgPercentJointNoMinors);
	}

	/**
	* Sets whether this c ext organization is dg percent joint no minors estimate.
	*
	* @param dgPercentJointNoMinorsEstimate the dg percent joint no minors estimate of this c ext organization
	*/
	@Override
	public void setDgPercentJointNoMinorsEstimate(
		boolean dgPercentJointNoMinorsEstimate) {
		_cExtOrganization.setDgPercentJointNoMinorsEstimate(dgPercentJointNoMinorsEstimate);
	}

	/**
	* Sets the dg percent less than5 of this c ext organization.
	*
	* @param dgPercentLessThan5 the dg percent less than5 of this c ext organization
	*/
	@Override
	public void setDgPercentLessThan5(int dgPercentLessThan5) {
		_cExtOrganization.setDgPercentLessThan5(dgPercentLessThan5);
	}

	/**
	* Sets whether this c ext organization is dg percent less than5 estimate.
	*
	* @param dgPercentLessThan5Estimate the dg percent less than5 estimate of this c ext organization
	*/
	@Override
	public void setDgPercentLessThan5Estimate(
		boolean dgPercentLessThan5Estimate) {
		_cExtOrganization.setDgPercentLessThan5Estimate(dgPercentLessThan5Estimate);
	}

	/**
	* Sets the dg percent more than10 of this c ext organization.
	*
	* @param dgPercentMoreThan10 the dg percent more than10 of this c ext organization
	*/
	@Override
	public void setDgPercentMoreThan10(int dgPercentMoreThan10) {
		_cExtOrganization.setDgPercentMoreThan10(dgPercentMoreThan10);
	}

	/**
	* Sets whether this c ext organization is dg percent more than10 estimate.
	*
	* @param dgPercentMoreThan10Estimate the dg percent more than10 estimate of this c ext organization
	*/
	@Override
	public void setDgPercentMoreThan10Estimate(
		boolean dgPercentMoreThan10Estimate) {
		_cExtOrganization.setDgPercentMoreThan10Estimate(dgPercentMoreThan10Estimate);
	}

	/**
	* Sets the dg percent not fully employed of this c ext organization.
	*
	* @param dgPercentNotFullyEmployed the dg percent not fully employed of this c ext organization
	*/
	@Override
	public void setDgPercentNotFullyEmployed(int dgPercentNotFullyEmployed) {
		_cExtOrganization.setDgPercentNotFullyEmployed(dgPercentNotFullyEmployed);
	}

	/**
	* Sets whether this c ext organization is dg percent not fully employed estimate.
	*
	* @param dgPercentNotFullyEmployedEstimate the dg percent not fully employed estimate of this c ext organization
	*/
	@Override
	public void setDgPercentNotFullyEmployedEstimate(
		boolean dgPercentNotFullyEmployedEstimate) {
		_cExtOrganization.setDgPercentNotFullyEmployedEstimate(dgPercentNotFullyEmployedEstimate);
	}

	/**
	* Sets the dg percent other education of this c ext organization.
	*
	* @param dgPercentOtherEducation the dg percent other education of this c ext organization
	*/
	@Override
	public void setDgPercentOtherEducation(int dgPercentOtherEducation) {
		_cExtOrganization.setDgPercentOtherEducation(dgPercentOtherEducation);
	}

	/**
	* Sets the dg percent other education description of this c ext organization.
	*
	* @param dgPercentOtherEducationDescription the dg percent other education description of this c ext organization
	*/
	@Override
	public void setDgPercentOtherEducationDescription(
		String dgPercentOtherEducationDescription) {
		_cExtOrganization.setDgPercentOtherEducationDescription(dgPercentOtherEducationDescription);
	}

	/**
	* Sets whether this c ext organization is dg percent other education estimate.
	*
	* @param dgPercentOtherEducationEstimate the dg percent other education estimate of this c ext organization
	*/
	@Override
	public void setDgPercentOtherEducationEstimate(
		boolean dgPercentOtherEducationEstimate) {
		_cExtOrganization.setDgPercentOtherEducationEstimate(dgPercentOtherEducationEstimate);
	}

	/**
	* Sets the dg percent retired of this c ext organization.
	*
	* @param dgPercentRetired the dg percent retired of this c ext organization
	*/
	@Override
	public void setDgPercentRetired(int dgPercentRetired) {
		_cExtOrganization.setDgPercentRetired(dgPercentRetired);
	}

	/**
	* Sets whether this c ext organization is dg percent retired estimate.
	*
	* @param dgPercentRetiredEstimate the dg percent retired estimate of this c ext organization
	*/
	@Override
	public void setDgPercentRetiredEstimate(boolean dgPercentRetiredEstimate) {
		_cExtOrganization.setDgPercentRetiredEstimate(dgPercentRetiredEstimate);
	}

	/**
	* Sets the dg percent single35 to65 of this c ext organization.
	*
	* @param dgPercentSingle35To65 the dg percent single35 to65 of this c ext organization
	*/
	@Override
	public void setDgPercentSingle35To65(int dgPercentSingle35To65) {
		_cExtOrganization.setDgPercentSingle35To65(dgPercentSingle35To65);
	}

	/**
	* Sets whether this c ext organization is dg percent single35 to65 estimate.
	*
	* @param dgPercentSingle35To65Estimate the dg percent single35 to65 estimate of this c ext organization
	*/
	@Override
	public void setDgPercentSingle35To65Estimate(
		boolean dgPercentSingle35To65Estimate) {
		_cExtOrganization.setDgPercentSingle35To65Estimate(dgPercentSingle35To65Estimate);
	}

	/**
	* Sets the dg percent single over65 of this c ext organization.
	*
	* @param dgPercentSingleOver65 the dg percent single over65 of this c ext organization
	*/
	@Override
	public void setDgPercentSingleOver65(int dgPercentSingleOver65) {
		_cExtOrganization.setDgPercentSingleOver65(dgPercentSingleOver65);
	}

	/**
	* Sets whether this c ext organization is dg percent single over65 estimate.
	*
	* @param dgPercentSingleOver65Estimate the dg percent single over65 estimate of this c ext organization
	*/
	@Override
	public void setDgPercentSingleOver65Estimate(
		boolean dgPercentSingleOver65Estimate) {
		_cExtOrganization.setDgPercentSingleOver65Estimate(dgPercentSingleOver65Estimate);
	}

	/**
	* Sets the dg percent single under35 of this c ext organization.
	*
	* @param dgPercentSingleUnder35 the dg percent single under35 of this c ext organization
	*/
	@Override
	public void setDgPercentSingleUnder35(int dgPercentSingleUnder35) {
		_cExtOrganization.setDgPercentSingleUnder35(dgPercentSingleUnder35);
	}

	/**
	* Sets whether this c ext organization is dg percent single under35 estimate.
	*
	* @param dgPercentSingleUnder35Estimate the dg percent single under35 estimate of this c ext organization
	*/
	@Override
	public void setDgPercentSingleUnder35Estimate(
		boolean dgPercentSingleUnder35Estimate) {
		_cExtOrganization.setDgPercentSingleUnder35Estimate(dgPercentSingleUnder35Estimate);
	}

	/**
	* Sets the dg percent specialty training of this c ext organization.
	*
	* @param dgPercentSpecialtyTraining the dg percent specialty training of this c ext organization
	*/
	@Override
	public void setDgPercentSpecialtyTraining(int dgPercentSpecialtyTraining) {
		_cExtOrganization.setDgPercentSpecialtyTraining(dgPercentSpecialtyTraining);
	}

	/**
	* Sets whether this c ext organization is dg percent specialty training estimate.
	*
	* @param dgPercentSpecialtyTrainingEstimate the dg percent specialty training estimate of this c ext organization
	*/
	@Override
	public void setDgPercentSpecialtyTrainingEstimate(
		boolean dgPercentSpecialtyTrainingEstimate) {
		_cExtOrganization.setDgPercentSpecialtyTrainingEstimate(dgPercentSpecialtyTrainingEstimate);
	}

	/**
	* Sets the dg percent with minors of this c ext organization.
	*
	* @param dgPercentWithMinors the dg percent with minors of this c ext organization
	*/
	@Override
	public void setDgPercentWithMinors(int dgPercentWithMinors) {
		_cExtOrganization.setDgPercentWithMinors(dgPercentWithMinors);
	}

	/**
	* Sets whether this c ext organization is dg percent with minors estimate.
	*
	* @param dgPercentWithMinorsEstimate the dg percent with minors estimate of this c ext organization
	*/
	@Override
	public void setDgPercentWithMinorsEstimate(
		boolean dgPercentWithMinorsEstimate) {
		_cExtOrganization.setDgPercentWithMinorsEstimate(dgPercentWithMinorsEstimate);
	}

	/**
	* Sets the dg range of occupations of this c ext organization.
	*
	* @param dgRangeOfOccupations the dg range of occupations of this c ext organization
	*/
	@Override
	public void setDgRangeOfOccupations(String dgRangeOfOccupations) {
		_cExtOrganization.setDgRangeOfOccupations(dgRangeOfOccupations);
	}

	/**
	* Sets whether this c ext organization is di complete.
	*
	* @param diComplete the di complete of this c ext organization
	*/
	@Override
	public void setDiComplete(boolean diComplete) {
		_cExtOrganization.setDiComplete(diComplete);
	}

	/**
	* Sets the di description of this c ext organization.
	*
	* @param diDescription the di description of this c ext organization
	*/
	@Override
	public void setDiDescription(String diDescription) {
		_cExtOrganization.setDiDescription(diDescription);
	}

	/**
	* Sets the di title of this c ext organization.
	*
	* @param diTitle the di title of this c ext organization
	*/
	@Override
	public void setDiTitle(String diTitle) {
		_cExtOrganization.setDiTitle(diTitle);
	}

	/**
	* Sets whether this c ext organization is dv complete.
	*
	* @param dvComplete the dv complete of this c ext organization
	*/
	@Override
	public void setDvComplete(boolean dvComplete) {
		_cExtOrganization.setDvComplete(dvComplete);
	}

	/**
	* Sets the dv ethnic racial mix of this c ext organization.
	*
	* @param dvEthnicRacialMix the dv ethnic racial mix of this c ext organization
	*/
	@Override
	public void setDvEthnicRacialMix(String dvEthnicRacialMix) {
		_cExtOrganization.setDvEthnicRacialMix(dvEthnicRacialMix);
	}

	/**
	* Sets the dv welcoming comments of this c ext organization.
	*
	* @param dvWelcomingComments the dv welcoming comments of this c ext organization
	*/
	@Override
	public void setDvWelcomingComments(String dvWelcomingComments) {
		_cExtOrganization.setDvWelcomingComments(dvWelcomingComments);
	}

	/**
	* Sets the dv welcoming conversation of this c ext organization.
	*
	* @param dvWelcomingConversation the dv welcoming conversation of this c ext organization
	*/
	@Override
	public void setDvWelcomingConversation(String dvWelcomingConversation) {
		_cExtOrganization.setDvWelcomingConversation(dvWelcomingConversation);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cExtOrganization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cExtOrganization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cExtOrganization.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this c ext organization is fn christmas fund.
	*
	* @param fnChristmasFund the fn christmas fund of this c ext organization
	*/
	@Override
	public void setFnChristmasFund(boolean fnChristmasFund) {
		_cExtOrganization.setFnChristmasFund(fnChristmasFund);
	}

	/**
	* Sets whether this c ext organization is fn complete.
	*
	* @param fnComplete the fn complete of this c ext organization
	*/
	@Override
	public void setFnComplete(boolean fnComplete) {
		_cExtOrganization.setFnComplete(fnComplete);
	}

	/**
	* Sets the fn debt current of this c ext organization.
	*
	* @param fnDebtCurrent the fn debt current of this c ext organization
	*/
	@Override
	public void setFnDebtCurrent(int fnDebtCurrent) {
		_cExtOrganization.setFnDebtCurrent(fnDebtCurrent);
	}

	/**
	* Sets the fn debt current loan of this c ext organization.
	*
	* @param fnDebtCurrentLoan the fn debt current loan of this c ext organization
	*/
	@Override
	public void setFnDebtCurrentLoan(int fnDebtCurrentLoan) {
		_cExtOrganization.setFnDebtCurrentLoan(fnDebtCurrentLoan);
	}

	/**
	* Sets whether this c ext organization is fn debt payments current.
	*
	* @param fnDebtPaymentsCurrent the fn debt payments current of this c ext organization
	*/
	@Override
	public void setFnDebtPaymentsCurrent(boolean fnDebtPaymentsCurrent) {
		_cExtOrganization.setFnDebtPaymentsCurrent(fnDebtPaymentsCurrent);
	}

	/**
	* Sets the fn debt reason for of this c ext organization.
	*
	* @param fnDebtReasonFor the fn debt reason for of this c ext organization
	*/
	@Override
	public void setFnDebtReasonFor(String fnDebtReasonFor) {
		_cExtOrganization.setFnDebtReasonFor(fnDebtReasonFor);
	}

	/**
	* Sets whether this c ext organization is fn endowment.
	*
	* @param fnEndowment the fn endowment of this c ext organization
	*/
	@Override
	public void setFnEndowment(boolean fnEndowment) {
		_cExtOrganization.setFnEndowment(fnEndowment);
	}

	/**
	* Sets the fn endowment comment of this c ext organization.
	*
	* @param fnEndowmentComment the fn endowment comment of this c ext organization
	*/
	@Override
	public void setFnEndowmentComment(String fnEndowmentComment) {
		_cExtOrganization.setFnEndowmentComment(fnEndowmentComment);
	}

	/**
	* Sets the fn endowment draw5 year percent of this c ext organization.
	*
	* @param fnEndowmentDraw5YearPercent the fn endowment draw5 year percent of this c ext organization
	*/
	@Override
	public void setFnEndowmentDraw5YearPercent(int fnEndowmentDraw5YearPercent) {
		_cExtOrganization.setFnEndowmentDraw5YearPercent(fnEndowmentDraw5YearPercent);
	}

	/**
	* Sets the fn endowment draw5 year to expense of this c ext organization.
	*
	* @param fnEndowmentDraw5YearToExpense the fn endowment draw5 year to expense of this c ext organization
	*/
	@Override
	public void setFnEndowmentDraw5YearToExpense(
		String fnEndowmentDraw5YearToExpense) {
		_cExtOrganization.setFnEndowmentDraw5YearToExpense(fnEndowmentDraw5YearToExpense);
	}

	/**
	* Sets the fn endowment draw current rate last of this c ext organization.
	*
	* @param fnEndowmentDrawCurrentRateLast the fn endowment draw current rate last of this c ext organization
	*/
	@Override
	public void setFnEndowmentDrawCurrentRateLast(
		String fnEndowmentDrawCurrentRateLast) {
		_cExtOrganization.setFnEndowmentDrawCurrentRateLast(fnEndowmentDrawCurrentRateLast);
	}

	/**
	* Sets the fn endowment draw when of this c ext organization.
	*
	* @param fnEndowmentDrawWhen the fn endowment draw when of this c ext organization
	*/
	@Override
	public void setFnEndowmentDrawWhen(String fnEndowmentDrawWhen) {
		_cExtOrganization.setFnEndowmentDrawWhen(fnEndowmentDrawWhen);
	}

	/**
	* Sets the fn endowment market value of this c ext organization.
	*
	* @param fnEndowmentMarketValue the fn endowment market value of this c ext organization
	*/
	@Override
	public void setFnEndowmentMarketValue(int fnEndowmentMarketValue) {
		_cExtOrganization.setFnEndowmentMarketValue(fnEndowmentMarketValue);
	}

	/**
	* Sets the fn expense of this c ext organization.
	*
	* @param fnExpense the fn expense of this c ext organization
	*/
	@Override
	public void setFnExpense(int fnExpense) {
		_cExtOrganization.setFnExpense(fnExpense);
	}

	/**
	* Sets the fn expense ministerial support percent of this c ext organization.
	*
	* @param fnExpenseMinisterialSupportPercent the fn expense ministerial support percent of this c ext organization
	*/
	@Override
	public void setFnExpenseMinisterialSupportPercent(
		int fnExpenseMinisterialSupportPercent) {
		_cExtOrganization.setFnExpenseMinisterialSupportPercent(fnExpenseMinisterialSupportPercent);
	}

	/**
	* Sets whether this c ext organization is fn fail to pay minister.
	*
	* @param fnFailToPayMinister the fn fail to pay minister of this c ext organization
	*/
	@Override
	public void setFnFailToPayMinister(boolean fnFailToPayMinister) {
		_cExtOrganization.setFnFailToPayMinister(fnFailToPayMinister);
	}

	/**
	* Sets the fn file entry ID of this c ext organization.
	*
	* @param fnFileEntryId the fn file entry ID of this c ext organization
	*/
	@Override
	public void setFnFileEntryId(long fnFileEntryId) {
		_cExtOrganization.setFnFileEntryId(fnFileEntryId);
	}

	/**
	* Sets the fn income designated gifts of this c ext organization.
	*
	* @param fnIncomeDesignatedGifts the fn income designated gifts of this c ext organization
	*/
	@Override
	public void setFnIncomeDesignatedGifts(int fnIncomeDesignatedGifts) {
		_cExtOrganization.setFnIncomeDesignatedGifts(fnIncomeDesignatedGifts);
	}

	/**
	* Sets the fn income endowment draw of this c ext organization.
	*
	* @param fnIncomeEndowmentDraw the fn income endowment draw of this c ext organization
	*/
	@Override
	public void setFnIncomeEndowmentDraw(int fnIncomeEndowmentDraw) {
		_cExtOrganization.setFnIncomeEndowmentDraw(fnIncomeEndowmentDraw);
	}

	/**
	* Sets the fn income endowment proceeds of this c ext organization.
	*
	* @param fnIncomeEndowmentProceeds the fn income endowment proceeds of this c ext organization
	*/
	@Override
	public void setFnIncomeEndowmentProceeds(int fnIncomeEndowmentProceeds) {
		_cExtOrganization.setFnIncomeEndowmentProceeds(fnIncomeEndowmentProceeds);
	}

	/**
	* Sets the fn income fundraising of this c ext organization.
	*
	* @param fnIncomeFundraising the fn income fundraising of this c ext organization
	*/
	@Override
	public void setFnIncomeFundraising(int fnIncomeFundraising) {
		_cExtOrganization.setFnIncomeFundraising(fnIncomeFundraising);
	}

	/**
	* Sets the fn income grants of this c ext organization.
	*
	* @param fnIncomeGrants the fn income grants of this c ext organization
	*/
	@Override
	public void setFnIncomeGrants(int fnIncomeGrants) {
		_cExtOrganization.setFnIncomeGrants(fnIncomeGrants);
	}

	/**
	* Sets the fn income offerings pledged givings of this c ext organization.
	*
	* @param fnIncomeOfferingsPledgedGivings the fn income offerings pledged givings of this c ext organization
	*/
	@Override
	public void setFnIncomeOfferingsPledgedGivings(
		int fnIncomeOfferingsPledgedGivings) {
		_cExtOrganization.setFnIncomeOfferingsPledgedGivings(fnIncomeOfferingsPledgedGivings);
	}

	/**
	* Sets the fn income related organizations of this c ext organization.
	*
	* @param fnIncomeRelatedOrganizations the fn income related organizations of this c ext organization
	*/
	@Override
	public void setFnIncomeRelatedOrganizations(
		int fnIncomeRelatedOrganizations) {
		_cExtOrganization.setFnIncomeRelatedOrganizations(fnIncomeRelatedOrganizations);
	}

	/**
	* Sets the fn income rental church building of this c ext organization.
	*
	* @param fnIncomeRentalChurchBuilding the fn income rental church building of this c ext organization
	*/
	@Override
	public void setFnIncomeRentalChurchBuilding(
		int fnIncomeRentalChurchBuilding) {
		_cExtOrganization.setFnIncomeRentalChurchBuilding(fnIncomeRentalChurchBuilding);
	}

	/**
	* Sets the fn income rental church parsonage of this c ext organization.
	*
	* @param fnIncomeRentalChurchParsonage the fn income rental church parsonage of this c ext organization
	*/
	@Override
	public void setFnIncomeRentalChurchParsonage(
		int fnIncomeRentalChurchParsonage) {
		_cExtOrganization.setFnIncomeRentalChurchParsonage(fnIncomeRentalChurchParsonage);
	}

	/**
	* Sets the fn income special accounts of this c ext organization.
	*
	* @param fnIncomeSpecialAccounts the fn income special accounts of this c ext organization
	*/
	@Override
	public void setFnIncomeSpecialAccounts(int fnIncomeSpecialAccounts) {
		_cExtOrganization.setFnIncomeSpecialAccounts(fnIncomeSpecialAccounts);
	}

	/**
	* Sets the fn investments of this c ext organization.
	*
	* @param fnInvestments the fn investments of this c ext organization
	*/
	@Override
	public void setFnInvestments(int fnInvestments) {
		_cExtOrganization.setFnInvestments(fnInvestments);
	}

	/**
	* Sets whether this c ext organization is fn neighbors in need.
	*
	* @param fnNeighborsInNeed the fn neighbors in need of this c ext organization
	*/
	@Override
	public void setFnNeighborsInNeed(boolean fnNeighborsInNeed) {
		_cExtOrganization.setFnNeighborsInNeed(fnNeighborsInNeed);
	}

	/**
	* Sets whether this c ext organization is fn one great hour of sharing.
	*
	* @param fnOneGreatHourOfSharing the fn one great hour of sharing of this c ext organization
	*/
	@Override
	public void setFnOneGreatHourOfSharing(boolean fnOneGreatHourOfSharing) {
		_cExtOrganization.setFnOneGreatHourOfSharing(fnOneGreatHourOfSharing);
	}

	/**
	* Sets whether this c ext organization is fn our church wider mission.
	*
	* @param fnOurChurchWiderMission the fn our church wider mission of this c ext organization
	*/
	@Override
	public void setFnOurChurchWiderMission(boolean fnOurChurchWiderMission) {
		_cExtOrganization.setFnOurChurchWiderMission(fnOurChurchWiderMission);
	}

	/**
	* Sets the fn our church wider mission how of this c ext organization.
	*
	* @param fnOurChurchWiderMissionHow the fn our church wider mission how of this c ext organization
	*/
	@Override
	public void setFnOurChurchWiderMissionHow(String fnOurChurchWiderMissionHow) {
		_cExtOrganization.setFnOurChurchWiderMissionHow(fnOurChurchWiderMissionHow);
	}

	/**
	* Sets the fn reserves of this c ext organization.
	*
	* @param fnReserves the fn reserves of this c ext organization
	*/
	@Override
	public void setFnReserves(int fnReserves) {
		_cExtOrganization.setFnReserves(fnReserves);
	}

	/**
	* Sets whether this c ext organization is fn strenghten the church.
	*
	* @param fnStrenghtenTheChurch the fn strenghten the church of this c ext organization
	*/
	@Override
	public void setFnStrenghtenTheChurch(boolean fnStrenghtenTheChurch) {
		_cExtOrganization.setFnStrenghtenTheChurch(fnStrenghtenTheChurch);
	}

	/**
	* Sets the fn year of this c ext organization.
	*
	* @param fnYear the fn year of this c ext organization
	*/
	@Override
	public void setFnYear(String fnYear) {
		_cExtOrganization.setFnYear(fnYear);
	}

	/**
	* Sets whether this c ext organization is hi complete.
	*
	* @param hiComplete the hi complete of this c ext organization
	*/
	@Override
	public void setHiComplete(boolean hiComplete) {
		_cExtOrganization.setHiComplete(hiComplete);
	}

	/**
	* Sets the hi conflict resolution of this c ext organization.
	*
	* @param hiConflictResolution the hi conflict resolution of this c ext organization
	*/
	@Override
	public void setHiConflictResolution(String hiConflictResolution) {
		_cExtOrganization.setHiConflictResolution(hiConflictResolution);
	}

	/**
	* Sets the hi fitness review of this c ext organization.
	*
	* @param hiFitnessReview the hi fitness review of this c ext organization
	*/
	@Override
	public void setHiFitnessReview(String hiFitnessReview) {
		_cExtOrganization.setHiFitnessReview(hiFitnessReview);
	}

	/**
	* Sets the hi managed change of this c ext organization.
	*
	* @param hiManagedChange the hi managed change of this c ext organization
	*/
	@Override
	public void setHiManagedChange(String hiManagedChange) {
		_cExtOrganization.setHiManagedChange(hiManagedChange);
	}

	/**
	* Sets the hi ministerial leadership learning of this c ext organization.
	*
	* @param hiMinisterialLeadershipLearning the hi ministerial leadership learning of this c ext organization
	*/
	@Override
	public void setHiMinisterialLeadershipLearning(
		String hiMinisterialLeadershipLearning) {
		_cExtOrganization.setHiMinisterialLeadershipLearning(hiMinisterialLeadershipLearning);
	}

	/**
	* Sets the hi pressure involuntary termination of this c ext organization.
	*
	* @param hiPressureInvoluntaryTermination the hi pressure involuntary termination of this c ext organization
	*/
	@Override
	public void setHiPressureInvoluntaryTermination(
		String hiPressureInvoluntaryTermination) {
		_cExtOrganization.setHiPressureInvoluntaryTermination(hiPressureInvoluntaryTermination);
	}

	/**
	* Sets the hi significant happenings of this c ext organization.
	*
	* @param hiSignificantHappenings the hi significant happenings of this c ext organization
	*/
	@Override
	public void setHiSignificantHappenings(String hiSignificantHappenings) {
		_cExtOrganization.setHiSignificantHappenings(hiSignificantHappenings);
	}

	/**
	* Sets the hi situational support consultation of this c ext organization.
	*
	* @param hiSituationalSupportConsultation the hi situational support consultation of this c ext organization
	*/
	@Override
	public void setHiSituationalSupportConsultation(
		String hiSituationalSupportConsultation) {
		_cExtOrganization.setHiSituationalSupportConsultation(hiSituationalSupportConsultation);
	}

	/**
	* Sets the mi community demographics impact of this c ext organization.
	*
	* @param miCommunityDemographicsImpact the mi community demographics impact of this c ext organization
	*/
	@Override
	public void setMiCommunityDemographicsImpact(
		String miCommunityDemographicsImpact) {
		_cExtOrganization.setMiCommunityDemographicsImpact(miCommunityDemographicsImpact);
	}

	/**
	* Sets whether this c ext organization is mi complete.
	*
	* @param miComplete the mi complete of this c ext organization
	*/
	@Override
	public void setMiComplete(boolean miComplete) {
		_cExtOrganization.setMiComplete(miComplete);
	}

	/**
	* Sets the mi congregation demographics comparison of this c ext organization.
	*
	* @param miCongregationDemographicsComparison the mi congregation demographics comparison of this c ext organization
	*/
	@Override
	public void setMiCongregationDemographicsComparison(
		String miCongregationDemographicsComparison) {
		_cExtOrganization.setMiCongregationDemographicsComparison(miCongregationDemographicsComparison);
	}

	/**
	* Sets the mi known for in community of this c ext organization.
	*
	* @param miKnownForInCommunity the mi known for in community of this c ext organization
	*/
	@Override
	public void setMiKnownForInCommunity(String miKnownForInCommunity) {
		_cExtOrganization.setMiKnownForInCommunity(miKnownForInCommunity);
	}

	/**
	* Sets the mi mission in site trends opportunities of this c ext organization.
	*
	* @param miMissionInSiteTrendsOpportunities the mi mission in site trends opportunities of this c ext organization
	*/
	@Override
	public void setMiMissionInSiteTrendsOpportunities(
		String miMissionInSiteTrendsOpportunities) {
		_cExtOrganization.setMiMissionInSiteTrendsOpportunities(miMissionInSiteTrendsOpportunities);
	}

	/**
	* Sets the mi why new people involved of this c ext organization.
	*
	* @param miWhyNewPeopleInvolved the mi why new people involved of this c ext organization
	*/
	@Override
	public void setMiWhyNewPeopleInvolved(String miWhyNewPeopleInvolved) {
		_cExtOrganization.setMiWhyNewPeopleInvolved(miWhyNewPeopleInvolved);
	}

	/**
	* Sets the modified date of this c ext organization.
	*
	* @param modifiedDate the modified date of this c ext organization
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_cExtOrganization.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_cExtOrganization.setNew(n);
	}

	/**
	* Sets the organization ID of this c ext organization.
	*
	* @param organizationId the organization ID of this c ext organization
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_cExtOrganization.setOrganizationId(organizationId);
	}

	/**
	* Sets the pb file entry ID of this c ext organization.
	*
	* @param pbFileEntryId the pb file entry ID of this c ext organization
	*/
	@Override
	public void setPbFileEntryId(long pbFileEntryId) {
		_cExtOrganization.setPbFileEntryId(pbFileEntryId);
	}

	/**
	* Sets the pb published date of this c ext organization.
	*
	* @param pbPublishedDate the pb published date of this c ext organization
	*/
	@Override
	public void setPbPublishedDate(Date pbPublishedDate) {
		_cExtOrganization.setPbPublishedDate(pbPublishedDate);
	}

	/**
	* Sets the pp comments of this c ext organization.
	*
	* @param ppComments the pp comments of this c ext organization
	*/
	@Override
	public void setPpComments(String ppComments) {
		_cExtOrganization.setPpComments(ppComments);
	}

	/**
	* Sets whether this c ext organization is pp complete.
	*
	* @param ppComplete the pp complete of this c ext organization
	*/
	@Override
	public void setPpComplete(boolean ppComplete) {
		_cExtOrganization.setPpComplete(ppComplete);
	}

	/**
	* Sets the primary key of this c ext organization.
	*
	* @param primaryKey the primary key of this c ext organization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cExtOrganization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cExtOrganization.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this c ext organization is pv complete.
	*
	* @param pvComplete the pv complete of this c ext organization
	*/
	@Override
	public void setPvComplete(boolean pvComplete) {
		_cExtOrganization.setPvComplete(pvComplete);
	}

	/**
	* Sets the pv file entry ID of this c ext organization.
	*
	* @param pvFileEntryId the pv file entry ID of this c ext organization
	*/
	@Override
	public void setPvFileEntryId(long pvFileEntryId) {
		_cExtOrganization.setPvFileEntryId(pvFileEntryId);
	}

	/**
	* Sets the pv generated date of this c ext organization.
	*
	* @param pvGeneratedDate the pv generated date of this c ext organization
	*/
	@Override
	public void setPvGeneratedDate(Date pvGeneratedDate) {
		_cExtOrganization.setPvGeneratedDate(pvGeneratedDate);
	}

	/**
	* Sets the re building program of this c ext organization.
	*
	* @param reBuildingProgram the re building program of this c ext organization
	*/
	@Override
	public void setReBuildingProgram(String reBuildingProgram) {
		_cExtOrganization.setReBuildingProgram(reBuildingProgram);
	}

	/**
	* Sets the re campaign mission components of this c ext organization.
	*
	* @param reCampaignMissionComponents the re campaign mission components of this c ext organization
	*/
	@Override
	public void setReCampaignMissionComponents(
		String reCampaignMissionComponents) {
		_cExtOrganization.setReCampaignMissionComponents(reCampaignMissionComponents);
	}

	/**
	* Sets whether this c ext organization is re complete.
	*
	* @param reComplete the re complete of this c ext organization
	*/
	@Override
	public void setReComplete(boolean reComplete) {
		_cExtOrganization.setReComplete(reComplete);
	}

	/**
	* Sets the re finances assets review of this c ext organization.
	*
	* @param reFinancesAssetsReview the re finances assets review of this c ext organization
	*/
	@Override
	public void setReFinancesAssetsReview(String reFinancesAssetsReview) {
		_cExtOrganization.setReFinancesAssetsReview(reFinancesAssetsReview);
	}

	/**
	* Sets the re non owned buildings of this c ext organization.
	*
	* @param reNonOwnedBuildings the re non owned buildings of this c ext organization
	*/
	@Override
	public void setReNonOwnedBuildings(String reNonOwnedBuildings) {
		_cExtOrganization.setReNonOwnedBuildings(reNonOwnedBuildings);
	}

	/**
	* Sets the re owned buildings of this c ext organization.
	*
	* @param reOwnedBuildings the re owned buildings of this c ext organization
	*/
	@Override
	public void setReOwnedBuildings(String reOwnedBuildings) {
		_cExtOrganization.setReOwnedBuildings(reOwnedBuildings);
	}

	/**
	* Sets whether this c ext organization is re parsonage.
	*
	* @param reParsonage the re parsonage of this c ext organization
	*/
	@Override
	public void setReParsonage(boolean reParsonage) {
		_cExtOrganization.setReParsonage(reParsonage);
	}

	/**
	* Sets the re parsonage assessed value of this c ext organization.
	*
	* @param reParsonageAssessedValue the re parsonage assessed value of this c ext organization
	*/
	@Override
	public void setReParsonageAssessedValue(int reParsonageAssessedValue) {
		_cExtOrganization.setReParsonageAssessedValue(reParsonageAssessedValue);
	}

	/**
	* Sets whether this c ext organization is re parsonage available minister.
	*
	* @param reParsonageAvailableMinister the re parsonage available minister of this c ext organization
	*/
	@Override
	public void setReParsonageAvailableMinister(
		boolean reParsonageAvailableMinister) {
		_cExtOrganization.setReParsonageAvailableMinister(reParsonageAvailableMinister);
	}

	/**
	* Sets the re parsonage bathrooms of this c ext organization.
	*
	* @param reParsonageBathrooms the re parsonage bathrooms of this c ext organization
	*/
	@Override
	public void setReParsonageBathrooms(int reParsonageBathrooms) {
		_cExtOrganization.setReParsonageBathrooms(reParsonageBathrooms);
	}

	/**
	* Sets the re parsonage bedrooms of this c ext organization.
	*
	* @param reParsonageBedrooms the re parsonage bedrooms of this c ext organization
	*/
	@Override
	public void setReParsonageBedrooms(int reParsonageBedrooms) {
		_cExtOrganization.setReParsonageBedrooms(reParsonageBedrooms);
	}

	/**
	* Sets the re parsonage city of this c ext organization.
	*
	* @param reParsonageCity the re parsonage city of this c ext organization
	*/
	@Override
	public void setReParsonageCity(String reParsonageCity) {
		_cExtOrganization.setReParsonageCity(reParsonageCity);
	}

	/**
	* Sets the re parsonage condition of this c ext organization.
	*
	* @param reParsonageCondition the re parsonage condition of this c ext organization
	*/
	@Override
	public void setReParsonageCondition(String reParsonageCondition) {
		_cExtOrganization.setReParsonageCondition(reParsonageCondition);
	}

	/**
	* Sets whether this c ext organization is re parsonage expected minister.
	*
	* @param reParsonageExpectedMinister the re parsonage expected minister of this c ext organization
	*/
	@Override
	public void setReParsonageExpectedMinister(
		boolean reParsonageExpectedMinister) {
		_cExtOrganization.setReParsonageExpectedMinister(reParsonageExpectedMinister);
	}

	/**
	* Sets the re parsonage footage of this c ext organization.
	*
	* @param reParsonageFootage the re parsonage footage of this c ext organization
	*/
	@Override
	public void setReParsonageFootage(int reParsonageFootage) {
		_cExtOrganization.setReParsonageFootage(reParsonageFootage);
	}

	/**
	* Sets the re parsonage market value of this c ext organization.
	*
	* @param reParsonageMarketValue the re parsonage market value of this c ext organization
	*/
	@Override
	public void setReParsonageMarketValue(int reParsonageMarketValue) {
		_cExtOrganization.setReParsonageMarketValue(reParsonageMarketValue);
	}

	/**
	* Sets the re parsonage responsible entity of this c ext organization.
	*
	* @param reParsonageResponsibleEntity the re parsonage responsible entity of this c ext organization
	*/
	@Override
	public void setReParsonageResponsibleEntity(
		String reParsonageResponsibleEntity) {
		_cExtOrganization.setReParsonageResponsibleEntity(reParsonageResponsibleEntity);
	}

	/**
	* Sets the re parsonage state of this c ext organization.
	*
	* @param reParsonageState the re parsonage state of this c ext organization
	*/
	@Override
	public void setReParsonageState(String reParsonageState) {
		_cExtOrganization.setReParsonageState(reParsonageState);
	}

	/**
	* Sets the re parsonage street address of this c ext organization.
	*
	* @param reParsonageStreetAddress the re parsonage street address of this c ext organization
	*/
	@Override
	public void setReParsonageStreetAddress(String reParsonageStreetAddress) {
		_cExtOrganization.setReParsonageStreetAddress(reParsonageStreetAddress);
	}

	/**
	* Sets the re parsonage usage of this c ext organization.
	*
	* @param reParsonageUsage the re parsonage usage of this c ext organization
	*/
	@Override
	public void setReParsonageUsage(String reParsonageUsage) {
		_cExtOrganization.setReParsonageUsage(reParsonageUsage);
	}

	/**
	* Sets the re parsonage zip of this c ext organization.
	*
	* @param reParsonageZip the re parsonage zip of this c ext organization
	*/
	@Override
	public void setReParsonageZip(String reParsonageZip) {
		_cExtOrganization.setReParsonageZip(reParsonageZip);
	}

	/**
	* Sets the re wheelchair accessible of this c ext organization.
	*
	* @param reWheelchairAccessible the re wheelchair accessible of this c ext organization
	*/
	@Override
	public void setReWheelchairAccessible(String reWheelchairAccessible) {
		_cExtOrganization.setReWheelchairAccessible(reWheelchairAccessible);
	}

	/**
	* Sets whether this c ext organization is rf complete.
	*
	* @param rfComplete the rf complete of this c ext organization
	*/
	@Override
	public void setRfComplete(boolean rfComplete) {
		_cExtOrganization.setRfComplete(rfComplete);
	}

	/**
	* Sets the rf crisis disaster action of this c ext organization.
	*
	* @param rfCrisisDisasterAction the rf crisis disaster action of this c ext organization
	*/
	@Override
	public void setRfCrisisDisasterAction(String rfCrisisDisasterAction) {
		_cExtOrganization.setRfCrisisDisasterAction(rfCrisisDisasterAction);
	}

	/**
	* Sets the rf education faith vision of this c ext organization.
	*
	* @param rfEducationFaithVision the rf education faith vision of this c ext organization
	*/
	@Override
	public void setRfEducationFaithVision(String rfEducationFaithVision) {
		_cExtOrganization.setRfEducationFaithVision(rfEducationFaithVision);
	}

	/**
	* Sets the rf life of faith of this c ext organization.
	*
	* @param rfLifeOfFaith the rf life of faith of this c ext organization
	*/
	@Override
	public void setRfLifeOfFaith(String rfLifeOfFaith) {
		_cExtOrganization.setRfLifeOfFaith(rfLifeOfFaith);
	}

	/**
	* Sets the rf meeting hours per month of this c ext organization.
	*
	* @param rfMeetingHoursPerMonth the rf meeting hours per month of this c ext organization
	*/
	@Override
	public void setRfMeetingHoursPerMonth(String rfMeetingHoursPerMonth) {
		_cExtOrganization.setRfMeetingHoursPerMonth(rfMeetingHoursPerMonth);
	}

	/**
	* Sets whether this c ext organization is rf minister governance copy.
	*
	* @param rfMinisterGovernanceCopy the rf minister governance copy of this c ext organization
	*/
	@Override
	public void setRfMinisterGovernanceCopy(boolean rfMinisterGovernanceCopy) {
		_cExtOrganization.setRfMinisterGovernanceCopy(rfMinisterGovernanceCopy);
	}

	/**
	* Sets the rf ministry mission of this c ext organization.
	*
	* @param rfMinistryMission the rf ministry mission of this c ext organization
	*/
	@Override
	public void setRfMinistryMission(String rfMinistryMission) {
		_cExtOrganization.setRfMinistryMission(rfMinistryMission);
	}

	/**
	* Sets the rf strengths qualities of this c ext organization.
	*
	* @param rfStrengthsQualities the rf strengths qualities of this c ext organization
	*/
	@Override
	public void setRfStrengthsQualities(String rfStrengthsQualities) {
		_cExtOrganization.setRfStrengthsQualities(rfStrengthsQualities);
	}

	/**
	* Sets the rf worship of this c ext organization.
	*
	* @param rfWorship the rf worship of this c ext organization
	*/
	@Override
	public void setRfWorship(String rfWorship) {
		_cExtOrganization.setRfWorship(rfWorship);
	}

	/**
	* Sets whether this c ext organization is rv complete.
	*
	* @param rvComplete the rv complete of this c ext organization
	*/
	@Override
	public void setRvComplete(boolean rvComplete) {
		_cExtOrganization.setRvComplete(rvComplete);
	}

	/**
	* Sets the rv overall ministry of this c ext organization.
	*
	* @param rvOverallMinistry the rv overall ministry of this c ext organization
	*/
	@Override
	public void setRvOverallMinistry(String rvOverallMinistry) {
		_cExtOrganization.setRvOverallMinistry(rvOverallMinistry);
	}

	/**
	* Sets whether this c ext organization is sf complete.
	*
	* @param sfComplete the sf complete of this c ext organization
	*/
	@Override
	public void setSfComplete(boolean sfComplete) {
		_cExtOrganization.setSfComplete(sfComplete);
	}

	/**
	* Sets the sf previous roles of this c ext organization.
	*
	* @param sfPreviousRoles the sf previous roles of this c ext organization
	*/
	@Override
	public void setSfPreviousRoles(String sfPreviousRoles) {
		_cExtOrganization.setSfPreviousRoles(sfPreviousRoles);
	}

	/**
	* Sets the user ID of this c ext organization.
	*
	* @param userId the user ID of this c ext organization
	*/
	@Override
	public void setUserId(long userId) {
		_cExtOrganization.setUserId(userId);
	}

	/**
	* Sets the user uuid of this c ext organization.
	*
	* @param userUuid the user uuid of this c ext organization
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_cExtOrganization.setUserUuid(userUuid);
	}

	/**
	* Sets whether this c ext organization is vs complete.
	*
	* @param vsComplete the vs complete of this c ext organization
	*/
	@Override
	public void setVsComplete(boolean vsComplete) {
		_cExtOrganization.setVsComplete(vsComplete);
	}

	/**
	* Sets the vs gods call to become of this c ext organization.
	*
	* @param vsGodsCallToBecome the vs gods call to become of this c ext organization
	*/
	@Override
	public void setVsGodsCallToBecome(String vsGodsCallToBecome) {
		_cExtOrganization.setVsGodsCallToBecome(vsGodsCallToBecome);
	}

	/**
	* Sets the vs gods call to reach out of this c ext organization.
	*
	* @param vsGodsCallToReachOut the vs gods call to reach out of this c ext organization
	*/
	@Override
	public void setVsGodsCallToReachOut(String vsGodsCallToReachOut) {
		_cExtOrganization.setVsGodsCallToReachOut(vsGodsCallToReachOut);
	}

	/**
	* Sets the yr church response of this c ext organization.
	*
	* @param yrChurchResponse the yr church response of this c ext organization
	*/
	@Override
	public void setYrChurchResponse(String yrChurchResponse) {
		_cExtOrganization.setYrChurchResponse(yrChurchResponse);
	}

	/**
	* Sets whether this c ext organization is yr complete.
	*
	* @param yrComplete the yr complete of this c ext organization
	*/
	@Override
	public void setYrComplete(boolean yrComplete) {
		_cExtOrganization.setYrComplete(yrComplete);
	}

	/**
	* Sets the yr file entry ID of this c ext organization.
	*
	* @param yrFileEntryId the yr file entry ID of this c ext organization
	*/
	@Override
	public void setYrFileEntryId(long yrFileEntryId) {
		_cExtOrganization.setYrFileEntryId(yrFileEntryId);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CExtOrganization> toCacheModel() {
		return _cExtOrganization.toCacheModel();
	}

	@Override
	public CExtOrganization toEscapedModel() {
		return new CExtOrganizationWrapper(_cExtOrganization.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cExtOrganization.toString();
	}

	@Override
	public CExtOrganization toUnescapedModel() {
		return new CExtOrganizationWrapper(_cExtOrganization.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cExtOrganization.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtOrganizationWrapper)) {
			return false;
		}

		CExtOrganizationWrapper cExtOrganizationWrapper = (CExtOrganizationWrapper)obj;

		if (Objects.equals(_cExtOrganization,
					cExtOrganizationWrapper._cExtOrganization)) {
			return true;
		}

		return false;
	}

	@Override
	public CExtOrganization getWrappedModel() {
		return _cExtOrganization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cExtOrganization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cExtOrganization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cExtOrganization.resetOriginalValues();
	}

	private final CExtOrganization _cExtOrganization;
}