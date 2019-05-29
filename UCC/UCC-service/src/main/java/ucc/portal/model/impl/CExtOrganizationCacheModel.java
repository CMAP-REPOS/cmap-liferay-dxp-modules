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

package ucc.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import ucc.portal.model.CExtOrganization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CExtOrganization in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CExtOrganization
 * @generated
 */
@ProviderType
public class CExtOrganizationCacheModel implements CacheModel<CExtOrganization>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CExtOrganizationCacheModel)) {
			return false;
		}

		CExtOrganizationCacheModel cExtOrganizationCacheModel = (CExtOrganizationCacheModel)obj;

		if (organizationId == cExtOrganizationCacheModel.organizationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, organizationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(359);

		sb.append("{organizationId=");
		sb.append(organizationId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", diTitle=");
		sb.append(diTitle);
		sb.append(", diDescription=");
		sb.append(diDescription);
		sb.append(", diComplete=");
		sb.append(diComplete);
		sb.append(", rfLifeOfFaith=");
		sb.append(rfLifeOfFaith);
		sb.append(", rfStrengthsQualities=");
		sb.append(rfStrengthsQualities);
		sb.append(", rfWorship=");
		sb.append(rfWorship);
		sb.append(", rfEducationFaithVision=");
		sb.append(rfEducationFaithVision);
		sb.append(", rfMinistryMission=");
		sb.append(rfMinistryMission);
		sb.append(", rfMeetingHoursPerMonth=");
		sb.append(rfMeetingHoursPerMonth);
		sb.append(", rfCrisisDisasterAction=");
		sb.append(rfCrisisDisasterAction);
		sb.append(", rfMinisterGovernanceCopy=");
		sb.append(rfMinisterGovernanceCopy);
		sb.append(", rfComplete=");
		sb.append(rfComplete);
		sb.append(", yrFileEntryId=");
		sb.append(yrFileEntryId);
		sb.append(", yrChurchResponse=");
		sb.append(yrChurchResponse);
		sb.append(", yrComplete=");
		sb.append(yrComplete);
		sb.append(", dgActiveMembers=");
		sb.append(dgActiveMembers);
		sb.append(", dgActiveMembersEstimate=");
		sb.append(dgActiveMembersEstimate);
		sb.append(", dgActiveNonMembers=");
		sb.append(dgActiveNonMembers);
		sb.append(", dgActiveNonMembersEstimate=");
		sb.append(dgActiveNonMembersEstimate);
		sb.append(", dgPercentMoreThan10=");
		sb.append(dgPercentMoreThan10);
		sb.append(", dgPercentMoreThan10Estimate=");
		sb.append(dgPercentMoreThan10Estimate);
		sb.append(", dgPercent5To10=");
		sb.append(dgPercent5To10);
		sb.append(", dgPercent5To10Estimate=");
		sb.append(dgPercent5To10Estimate);
		sb.append(", dgPercentLessThan5=");
		sb.append(dgPercentLessThan5);
		sb.append(", dgPercentLessThan5Estimate=");
		sb.append(dgPercentLessThan5Estimate);
		sb.append(", dgAge11AndUnder=");
		sb.append(dgAge11AndUnder);
		sb.append(", dgAge12To17=");
		sb.append(dgAge12To17);
		sb.append(", dgAge18To24=");
		sb.append(dgAge18To24);
		sb.append(", dgAge25To34=");
		sb.append(dgAge25To34);
		sb.append(", dgAge35To44=");
		sb.append(dgAge35To44);
		sb.append(", dgAge45To54=");
		sb.append(dgAge45To54);
		sb.append(", dgAge55To64=");
		sb.append(dgAge55To64);
		sb.append(", dgAge65To74=");
		sb.append(dgAge65To74);
		sb.append(", dgAge75AndOver=");
		sb.append(dgAge75AndOver);
		sb.append(", dgAllAgesEstimate=");
		sb.append(dgAllAgesEstimate);
		sb.append(", dgPercentSingleUnder35=");
		sb.append(dgPercentSingleUnder35);
		sb.append(", dgPercentSingleUnder35Estimate=");
		sb.append(dgPercentSingleUnder35Estimate);
		sb.append(", dgPercentWithMinors=");
		sb.append(dgPercentWithMinors);
		sb.append(", dgPercentWithMinorsEstimate=");
		sb.append(dgPercentWithMinorsEstimate);
		sb.append(", dgPercentSingle35To65=");
		sb.append(dgPercentSingle35To65);
		sb.append(", dgPercentSingle35To65Estimate=");
		sb.append(dgPercentSingle35To65Estimate);
		sb.append(", dgPercentJointNoMinors=");
		sb.append(dgPercentJointNoMinors);
		sb.append(", dgPercentJointNoMinorsEstimate=");
		sb.append(dgPercentJointNoMinorsEstimate);
		sb.append(", dgPercentSingleOver65=");
		sb.append(dgPercentSingleOver65);
		sb.append(", dgPercentSingleOver65Estimate=");
		sb.append(dgPercentSingleOver65Estimate);
		sb.append(", dgPercentHighSchool=");
		sb.append(dgPercentHighSchool);
		sb.append(", dgPercentHighSchoolEstimate=");
		sb.append(dgPercentHighSchoolEstimate);
		sb.append(", dgPercentCollege=");
		sb.append(dgPercentCollege);
		sb.append(", dgPercentCollegeEstimate=");
		sb.append(dgPercentCollegeEstimate);
		sb.append(", dgPercentGraduateSchool=");
		sb.append(dgPercentGraduateSchool);
		sb.append(", dgPercentGraduateSchoolEstimate=");
		sb.append(dgPercentGraduateSchoolEstimate);
		sb.append(", dgPercentSpecialtyTraining=");
		sb.append(dgPercentSpecialtyTraining);
		sb.append(", dgPercentSpecialtyTrainingEstimate=");
		sb.append(dgPercentSpecialtyTrainingEstimate);
		sb.append(", dgPercentOtherEducation=");
		sb.append(dgPercentOtherEducation);
		sb.append(", dgPercentOtherEducationEstimate=");
		sb.append(dgPercentOtherEducationEstimate);
		sb.append(", dgPercentOtherEducationDescription=");
		sb.append(dgPercentOtherEducationDescription);
		sb.append(", dgPercentEmployed=");
		sb.append(dgPercentEmployed);
		sb.append(", dgPercentEmployedEstimate=");
		sb.append(dgPercentEmployedEstimate);
		sb.append(", dgPercentNotFullyEmployed=");
		sb.append(dgPercentNotFullyEmployed);
		sb.append(", dgPercentNotFullyEmployedEstimate=");
		sb.append(dgPercentNotFullyEmployedEstimate);
		sb.append(", dgPercentRetired=");
		sb.append(dgPercentRetired);
		sb.append(", dgPercentRetiredEstimate=");
		sb.append(dgPercentRetiredEstimate);
		sb.append(", dgRangeOfOccupations=");
		sb.append(dgRangeOfOccupations);
		sb.append(", dgComplete=");
		sb.append(dgComplete);
		sb.append(", dvEthnicRacialMix=");
		sb.append(dvEthnicRacialMix);
		sb.append(", dvWelcomingConversation=");
		sb.append(dvWelcomingConversation);
		sb.append(", dvWelcomingComments=");
		sb.append(dvWelcomingComments);
		sb.append(", dvComplete=");
		sb.append(dvComplete);
		sb.append(", ppComments=");
		sb.append(ppComments);
		sb.append(", ppComplete=");
		sb.append(ppComplete);
		sb.append(", sfPreviousRoles=");
		sb.append(sfPreviousRoles);
		sb.append(", sfComplete=");
		sb.append(sfComplete);
		sb.append(", rvOverallMinistry=");
		sb.append(rvOverallMinistry);
		sb.append(", rvComplete=");
		sb.append(rvComplete);
		sb.append(", fnYear=");
		sb.append(fnYear);
		sb.append(", fnIncomeOfferingsPledgedGivings=");
		sb.append(fnIncomeOfferingsPledgedGivings);
		sb.append(", fnIncomeEndowmentProceeds=");
		sb.append(fnIncomeEndowmentProceeds);
		sb.append(", fnIncomeEndowmentDraw=");
		sb.append(fnIncomeEndowmentDraw);
		sb.append(", fnIncomeFundraising=");
		sb.append(fnIncomeFundraising);
		sb.append(", fnIncomeDesignatedGifts=");
		sb.append(fnIncomeDesignatedGifts);
		sb.append(", fnIncomeGrants=");
		sb.append(fnIncomeGrants);
		sb.append(", fnIncomeRentalChurchBuilding=");
		sb.append(fnIncomeRentalChurchBuilding);
		sb.append(", fnIncomeRentalChurchParsonage=");
		sb.append(fnIncomeRentalChurchParsonage);
		sb.append(", fnIncomeRelatedOrganizations=");
		sb.append(fnIncomeRelatedOrganizations);
		sb.append(", fnIncomeSpecialAccounts=");
		sb.append(fnIncomeSpecialAccounts);
		sb.append(", fnExpense=");
		sb.append(fnExpense);
		sb.append(", fnFileEntryId=");
		sb.append(fnFileEntryId);
		sb.append(", fnExpenseMinisterialSupportPercent=");
		sb.append(fnExpenseMinisterialSupportPercent);
		sb.append(", fnFailToPayMinister=");
		sb.append(fnFailToPayMinister);
		sb.append(", fnOurChurchWiderMission=");
		sb.append(fnOurChurchWiderMission);
		sb.append(", fnOneGreatHourOfSharing=");
		sb.append(fnOneGreatHourOfSharing);
		sb.append(", fnStrenghtenTheChurch=");
		sb.append(fnStrenghtenTheChurch);
		sb.append(", fnNeighborsInNeed=");
		sb.append(fnNeighborsInNeed);
		sb.append(", fnChristmasFund=");
		sb.append(fnChristmasFund);
		sb.append(", fnOurChurchWiderMissionHow=");
		sb.append(fnOurChurchWiderMissionHow);
		sb.append(", fnDebtCurrent=");
		sb.append(fnDebtCurrent);
		sb.append(", fnDebtCurrentLoan=");
		sb.append(fnDebtCurrentLoan);
		sb.append(", fnDebtReasonFor=");
		sb.append(fnDebtReasonFor);
		sb.append(", fnDebtPaymentsCurrent=");
		sb.append(fnDebtPaymentsCurrent);
		sb.append(", fnEndowment=");
		sb.append(fnEndowment);
		sb.append(", fnEndowmentMarketValue=");
		sb.append(fnEndowmentMarketValue);
		sb.append(", fnEndowmentDrawWhen=");
		sb.append(fnEndowmentDrawWhen);
		sb.append(", fnEndowmentDraw5YearPercent=");
		sb.append(fnEndowmentDraw5YearPercent);
		sb.append(", fnEndowmentDraw5YearToExpense=");
		sb.append(fnEndowmentDraw5YearToExpense);
		sb.append(", fnEndowmentDrawCurrentRateLast=");
		sb.append(fnEndowmentDrawCurrentRateLast);
		sb.append(", fnEndowmentComment=");
		sb.append(fnEndowmentComment);
		sb.append(", fnReserves=");
		sb.append(fnReserves);
		sb.append(", fnInvestments=");
		sb.append(fnInvestments);
		sb.append(", fnComplete=");
		sb.append(fnComplete);
		sb.append(", reBuildingProgram=");
		sb.append(reBuildingProgram);
		sb.append(", reCampaignMissionComponents=");
		sb.append(reCampaignMissionComponents);
		sb.append(", reParsonage=");
		sb.append(reParsonage);
		sb.append(", reParsonageMarketValue=");
		sb.append(reParsonageMarketValue);
		sb.append(", reParsonageAssessedValue=");
		sb.append(reParsonageAssessedValue);
		sb.append(", reParsonageUsage=");
		sb.append(reParsonageUsage);
		sb.append(", reParsonageStreetAddress=");
		sb.append(reParsonageStreetAddress);
		sb.append(", reParsonageCity=");
		sb.append(reParsonageCity);
		sb.append(", reParsonageState=");
		sb.append(reParsonageState);
		sb.append(", reParsonageZip=");
		sb.append(reParsonageZip);
		sb.append(", reParsonageFootage=");
		sb.append(reParsonageFootage);
		sb.append(", reParsonageBedrooms=");
		sb.append(reParsonageBedrooms);
		sb.append(", reParsonageBathrooms=");
		sb.append(reParsonageBathrooms);
		sb.append(", reParsonageAvailableMinister=");
		sb.append(reParsonageAvailableMinister);
		sb.append(", reParsonageExpectedMinister=");
		sb.append(reParsonageExpectedMinister);
		sb.append(", reParsonageCondition=");
		sb.append(reParsonageCondition);
		sb.append(", reParsonageResponsibleEntity=");
		sb.append(reParsonageResponsibleEntity);
		sb.append(", reOwnedBuildings=");
		sb.append(reOwnedBuildings);
		sb.append(", reNonOwnedBuildings=");
		sb.append(reNonOwnedBuildings);
		sb.append(", reWheelchairAccessible=");
		sb.append(reWheelchairAccessible);
		sb.append(", reFinancesAssetsReview=");
		sb.append(reFinancesAssetsReview);
		sb.append(", reComplete=");
		sb.append(reComplete);
		sb.append(", hiSignificantHappenings=");
		sb.append(hiSignificantHappenings);
		sb.append(", hiManagedChange=");
		sb.append(hiManagedChange);
		sb.append(", hiConflictResolution=");
		sb.append(hiConflictResolution);
		sb.append(", hiMinisterialLeadershipLearning=");
		sb.append(hiMinisterialLeadershipLearning);
		sb.append(", hiPressureInvoluntaryTermination=");
		sb.append(hiPressureInvoluntaryTermination);
		sb.append(", hiSituationalSupportConsultation=");
		sb.append(hiSituationalSupportConsultation);
		sb.append(", hiFitnessReview=");
		sb.append(hiFitnessReview);
		sb.append(", hiComplete=");
		sb.append(hiComplete);
		sb.append(", cmServiceAdvocacy=");
		sb.append(cmServiceAdvocacy);
		sb.append(", cmMeetingsRelationshipsActivities=");
		sb.append(cmMeetingsRelationshipsActivities);
		sb.append(", cmAccessibleToAll=");
		sb.append(cmAccessibleToAll);
		sb.append(", cmCreationJustice=");
		sb.append(cmCreationJustice);
		sb.append(", cmEconomicJustice=");
		sb.append(cmEconomicJustice);
		sb.append(", cmFaithfulAndWelcoming=");
		sb.append(cmFaithfulAndWelcoming);
		sb.append(", cmGodIsStillSpeaking=");
		sb.append(cmGodIsStillSpeaking);
		sb.append(", cmBorderAndImmigrantJustice=");
		sb.append(cmBorderAndImmigrantJustice);
		sb.append(", cmInterCulturalMultiRacial=");
		sb.append(cmInterCulturalMultiRacial);
		sb.append(", cmJustPeace=");
		sb.append(cmJustPeace);
		sb.append(", cmGlobalMissionChurch=");
		sb.append(cmGlobalMissionChurch);
		sb.append(", cmOpenAndAffirming=");
		sb.append(cmOpenAndAffirming);
		sb.append(", cmWISECongregationForMentalHealth=");
		sb.append(cmWISECongregationForMentalHealth);
		sb.append(", cmOtherUCCDesignations=");
		sb.append(cmOtherUCCDesignations);
		sb.append(", cmDesignationsOtherDenominations=");
		sb.append(cmDesignationsOtherDenominations);
		sb.append(", cmStatementsReflection=");
		sb.append(cmStatementsReflection);
		sb.append(", cmWorkTowardWitnessFuture=");
		sb.append(cmWorkTowardWitnessFuture);
		sb.append(", cmEcumenicalInterfaithParticipation=");
		sb.append(cmEcumenicalInterfaithParticipation);
		sb.append(", cmMissionStatementComparison=");
		sb.append(cmMissionStatementComparison);
		sb.append(", cmPastorTimeExpectations=");
		sb.append(cmPastorTimeExpectations);
		sb.append(", cmComplete=");
		sb.append(cmComplete);
		sb.append(", miMissionInSiteTrendsOpportunities=");
		sb.append(miMissionInSiteTrendsOpportunities);
		sb.append(", miCongregationDemographicsComparison=");
		sb.append(miCongregationDemographicsComparison);
		sb.append(", miCommunityDemographicsImpact=");
		sb.append(miCommunityDemographicsImpact);
		sb.append(", miKnownForInCommunity=");
		sb.append(miKnownForInCommunity);
		sb.append(", miWhyNewPeopleInvolved=");
		sb.append(miWhyNewPeopleInvolved);
		sb.append(", miComplete=");
		sb.append(miComplete);
		sb.append(", vsGodsCallToBecome=");
		sb.append(vsGodsCallToBecome);
		sb.append(", vsGodsCallToReachOut=");
		sb.append(vsGodsCallToReachOut);
		sb.append(", vsComplete=");
		sb.append(vsComplete);
		sb.append(", pvFileEntryId=");
		sb.append(pvFileEntryId);
		sb.append(", pvGeneratedDate=");
		sb.append(pvGeneratedDate);
		sb.append(", pvComplete=");
		sb.append(pvComplete);
		sb.append(", pbFileEntryId=");
		sb.append(pbFileEntryId);
		sb.append(", pbPublishedDate=");
		sb.append(pbPublishedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CExtOrganization toEntityModel() {
		CExtOrganizationImpl cExtOrganizationImpl = new CExtOrganizationImpl();

		cExtOrganizationImpl.setOrganizationId(organizationId);
		cExtOrganizationImpl.setCompanyId(companyId);
		cExtOrganizationImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			cExtOrganizationImpl.setCreateDate(null);
		}
		else {
			cExtOrganizationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cExtOrganizationImpl.setModifiedDate(null);
		}
		else {
			cExtOrganizationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (diTitle == null) {
			cExtOrganizationImpl.setDiTitle("");
		}
		else {
			cExtOrganizationImpl.setDiTitle(diTitle);
		}

		if (diDescription == null) {
			cExtOrganizationImpl.setDiDescription("");
		}
		else {
			cExtOrganizationImpl.setDiDescription(diDescription);
		}

		cExtOrganizationImpl.setDiComplete(diComplete);

		if (rfLifeOfFaith == null) {
			cExtOrganizationImpl.setRfLifeOfFaith("");
		}
		else {
			cExtOrganizationImpl.setRfLifeOfFaith(rfLifeOfFaith);
		}

		if (rfStrengthsQualities == null) {
			cExtOrganizationImpl.setRfStrengthsQualities("");
		}
		else {
			cExtOrganizationImpl.setRfStrengthsQualities(rfStrengthsQualities);
		}

		if (rfWorship == null) {
			cExtOrganizationImpl.setRfWorship("");
		}
		else {
			cExtOrganizationImpl.setRfWorship(rfWorship);
		}

		if (rfEducationFaithVision == null) {
			cExtOrganizationImpl.setRfEducationFaithVision("");
		}
		else {
			cExtOrganizationImpl.setRfEducationFaithVision(rfEducationFaithVision);
		}

		if (rfMinistryMission == null) {
			cExtOrganizationImpl.setRfMinistryMission("");
		}
		else {
			cExtOrganizationImpl.setRfMinistryMission(rfMinistryMission);
		}

		if (rfMeetingHoursPerMonth == null) {
			cExtOrganizationImpl.setRfMeetingHoursPerMonth("");
		}
		else {
			cExtOrganizationImpl.setRfMeetingHoursPerMonth(rfMeetingHoursPerMonth);
		}

		if (rfCrisisDisasterAction == null) {
			cExtOrganizationImpl.setRfCrisisDisasterAction("");
		}
		else {
			cExtOrganizationImpl.setRfCrisisDisasterAction(rfCrisisDisasterAction);
		}

		cExtOrganizationImpl.setRfMinisterGovernanceCopy(rfMinisterGovernanceCopy);
		cExtOrganizationImpl.setRfComplete(rfComplete);
		cExtOrganizationImpl.setYrFileEntryId(yrFileEntryId);

		if (yrChurchResponse == null) {
			cExtOrganizationImpl.setYrChurchResponse("");
		}
		else {
			cExtOrganizationImpl.setYrChurchResponse(yrChurchResponse);
		}

		cExtOrganizationImpl.setYrComplete(yrComplete);
		cExtOrganizationImpl.setDgActiveMembers(dgActiveMembers);
		cExtOrganizationImpl.setDgActiveMembersEstimate(dgActiveMembersEstimate);
		cExtOrganizationImpl.setDgActiveNonMembers(dgActiveNonMembers);
		cExtOrganizationImpl.setDgActiveNonMembersEstimate(dgActiveNonMembersEstimate);
		cExtOrganizationImpl.setDgPercentMoreThan10(dgPercentMoreThan10);
		cExtOrganizationImpl.setDgPercentMoreThan10Estimate(dgPercentMoreThan10Estimate);
		cExtOrganizationImpl.setDgPercent5To10(dgPercent5To10);
		cExtOrganizationImpl.setDgPercent5To10Estimate(dgPercent5To10Estimate);
		cExtOrganizationImpl.setDgPercentLessThan5(dgPercentLessThan5);
		cExtOrganizationImpl.setDgPercentLessThan5Estimate(dgPercentLessThan5Estimate);
		cExtOrganizationImpl.setDgAge11AndUnder(dgAge11AndUnder);
		cExtOrganizationImpl.setDgAge12To17(dgAge12To17);
		cExtOrganizationImpl.setDgAge18To24(dgAge18To24);
		cExtOrganizationImpl.setDgAge25To34(dgAge25To34);
		cExtOrganizationImpl.setDgAge35To44(dgAge35To44);
		cExtOrganizationImpl.setDgAge45To54(dgAge45To54);
		cExtOrganizationImpl.setDgAge55To64(dgAge55To64);
		cExtOrganizationImpl.setDgAge65To74(dgAge65To74);
		cExtOrganizationImpl.setDgAge75AndOver(dgAge75AndOver);
		cExtOrganizationImpl.setDgAllAgesEstimate(dgAllAgesEstimate);
		cExtOrganizationImpl.setDgPercentSingleUnder35(dgPercentSingleUnder35);
		cExtOrganizationImpl.setDgPercentSingleUnder35Estimate(dgPercentSingleUnder35Estimate);
		cExtOrganizationImpl.setDgPercentWithMinors(dgPercentWithMinors);
		cExtOrganizationImpl.setDgPercentWithMinorsEstimate(dgPercentWithMinorsEstimate);
		cExtOrganizationImpl.setDgPercentSingle35To65(dgPercentSingle35To65);
		cExtOrganizationImpl.setDgPercentSingle35To65Estimate(dgPercentSingle35To65Estimate);
		cExtOrganizationImpl.setDgPercentJointNoMinors(dgPercentJointNoMinors);
		cExtOrganizationImpl.setDgPercentJointNoMinorsEstimate(dgPercentJointNoMinorsEstimate);
		cExtOrganizationImpl.setDgPercentSingleOver65(dgPercentSingleOver65);
		cExtOrganizationImpl.setDgPercentSingleOver65Estimate(dgPercentSingleOver65Estimate);
		cExtOrganizationImpl.setDgPercentHighSchool(dgPercentHighSchool);
		cExtOrganizationImpl.setDgPercentHighSchoolEstimate(dgPercentHighSchoolEstimate);
		cExtOrganizationImpl.setDgPercentCollege(dgPercentCollege);
		cExtOrganizationImpl.setDgPercentCollegeEstimate(dgPercentCollegeEstimate);
		cExtOrganizationImpl.setDgPercentGraduateSchool(dgPercentGraduateSchool);
		cExtOrganizationImpl.setDgPercentGraduateSchoolEstimate(dgPercentGraduateSchoolEstimate);
		cExtOrganizationImpl.setDgPercentSpecialtyTraining(dgPercentSpecialtyTraining);
		cExtOrganizationImpl.setDgPercentSpecialtyTrainingEstimate(dgPercentSpecialtyTrainingEstimate);
		cExtOrganizationImpl.setDgPercentOtherEducation(dgPercentOtherEducation);
		cExtOrganizationImpl.setDgPercentOtherEducationEstimate(dgPercentOtherEducationEstimate);

		if (dgPercentOtherEducationDescription == null) {
			cExtOrganizationImpl.setDgPercentOtherEducationDescription("");
		}
		else {
			cExtOrganizationImpl.setDgPercentOtherEducationDescription(dgPercentOtherEducationDescription);
		}

		cExtOrganizationImpl.setDgPercentEmployed(dgPercentEmployed);
		cExtOrganizationImpl.setDgPercentEmployedEstimate(dgPercentEmployedEstimate);
		cExtOrganizationImpl.setDgPercentNotFullyEmployed(dgPercentNotFullyEmployed);
		cExtOrganizationImpl.setDgPercentNotFullyEmployedEstimate(dgPercentNotFullyEmployedEstimate);
		cExtOrganizationImpl.setDgPercentRetired(dgPercentRetired);
		cExtOrganizationImpl.setDgPercentRetiredEstimate(dgPercentRetiredEstimate);

		if (dgRangeOfOccupations == null) {
			cExtOrganizationImpl.setDgRangeOfOccupations("");
		}
		else {
			cExtOrganizationImpl.setDgRangeOfOccupations(dgRangeOfOccupations);
		}

		cExtOrganizationImpl.setDgComplete(dgComplete);

		if (dvEthnicRacialMix == null) {
			cExtOrganizationImpl.setDvEthnicRacialMix("");
		}
		else {
			cExtOrganizationImpl.setDvEthnicRacialMix(dvEthnicRacialMix);
		}

		if (dvWelcomingConversation == null) {
			cExtOrganizationImpl.setDvWelcomingConversation("");
		}
		else {
			cExtOrganizationImpl.setDvWelcomingConversation(dvWelcomingConversation);
		}

		if (dvWelcomingComments == null) {
			cExtOrganizationImpl.setDvWelcomingComments("");
		}
		else {
			cExtOrganizationImpl.setDvWelcomingComments(dvWelcomingComments);
		}

		cExtOrganizationImpl.setDvComplete(dvComplete);

		if (ppComments == null) {
			cExtOrganizationImpl.setPpComments("");
		}
		else {
			cExtOrganizationImpl.setPpComments(ppComments);
		}

		cExtOrganizationImpl.setPpComplete(ppComplete);

		if (sfPreviousRoles == null) {
			cExtOrganizationImpl.setSfPreviousRoles("");
		}
		else {
			cExtOrganizationImpl.setSfPreviousRoles(sfPreviousRoles);
		}

		cExtOrganizationImpl.setSfComplete(sfComplete);

		if (rvOverallMinistry == null) {
			cExtOrganizationImpl.setRvOverallMinistry("");
		}
		else {
			cExtOrganizationImpl.setRvOverallMinistry(rvOverallMinistry);
		}

		cExtOrganizationImpl.setRvComplete(rvComplete);

		if (fnYear == null) {
			cExtOrganizationImpl.setFnYear("");
		}
		else {
			cExtOrganizationImpl.setFnYear(fnYear);
		}

		cExtOrganizationImpl.setFnIncomeOfferingsPledgedGivings(fnIncomeOfferingsPledgedGivings);
		cExtOrganizationImpl.setFnIncomeEndowmentProceeds(fnIncomeEndowmentProceeds);
		cExtOrganizationImpl.setFnIncomeEndowmentDraw(fnIncomeEndowmentDraw);
		cExtOrganizationImpl.setFnIncomeFundraising(fnIncomeFundraising);
		cExtOrganizationImpl.setFnIncomeDesignatedGifts(fnIncomeDesignatedGifts);
		cExtOrganizationImpl.setFnIncomeGrants(fnIncomeGrants);
		cExtOrganizationImpl.setFnIncomeRentalChurchBuilding(fnIncomeRentalChurchBuilding);
		cExtOrganizationImpl.setFnIncomeRentalChurchParsonage(fnIncomeRentalChurchParsonage);
		cExtOrganizationImpl.setFnIncomeRelatedOrganizations(fnIncomeRelatedOrganizations);
		cExtOrganizationImpl.setFnIncomeSpecialAccounts(fnIncomeSpecialAccounts);
		cExtOrganizationImpl.setFnExpense(fnExpense);
		cExtOrganizationImpl.setFnFileEntryId(fnFileEntryId);
		cExtOrganizationImpl.setFnExpenseMinisterialSupportPercent(fnExpenseMinisterialSupportPercent);
		cExtOrganizationImpl.setFnFailToPayMinister(fnFailToPayMinister);
		cExtOrganizationImpl.setFnOurChurchWiderMission(fnOurChurchWiderMission);
		cExtOrganizationImpl.setFnOneGreatHourOfSharing(fnOneGreatHourOfSharing);
		cExtOrganizationImpl.setFnStrenghtenTheChurch(fnStrenghtenTheChurch);
		cExtOrganizationImpl.setFnNeighborsInNeed(fnNeighborsInNeed);
		cExtOrganizationImpl.setFnChristmasFund(fnChristmasFund);

		if (fnOurChurchWiderMissionHow == null) {
			cExtOrganizationImpl.setFnOurChurchWiderMissionHow("");
		}
		else {
			cExtOrganizationImpl.setFnOurChurchWiderMissionHow(fnOurChurchWiderMissionHow);
		}

		cExtOrganizationImpl.setFnDebtCurrent(fnDebtCurrent);
		cExtOrganizationImpl.setFnDebtCurrentLoan(fnDebtCurrentLoan);

		if (fnDebtReasonFor == null) {
			cExtOrganizationImpl.setFnDebtReasonFor("");
		}
		else {
			cExtOrganizationImpl.setFnDebtReasonFor(fnDebtReasonFor);
		}

		cExtOrganizationImpl.setFnDebtPaymentsCurrent(fnDebtPaymentsCurrent);
		cExtOrganizationImpl.setFnEndowment(fnEndowment);
		cExtOrganizationImpl.setFnEndowmentMarketValue(fnEndowmentMarketValue);

		if (fnEndowmentDrawWhen == null) {
			cExtOrganizationImpl.setFnEndowmentDrawWhen("");
		}
		else {
			cExtOrganizationImpl.setFnEndowmentDrawWhen(fnEndowmentDrawWhen);
		}

		cExtOrganizationImpl.setFnEndowmentDraw5YearPercent(fnEndowmentDraw5YearPercent);

		if (fnEndowmentDraw5YearToExpense == null) {
			cExtOrganizationImpl.setFnEndowmentDraw5YearToExpense("");
		}
		else {
			cExtOrganizationImpl.setFnEndowmentDraw5YearToExpense(fnEndowmentDraw5YearToExpense);
		}

		if (fnEndowmentDrawCurrentRateLast == null) {
			cExtOrganizationImpl.setFnEndowmentDrawCurrentRateLast("");
		}
		else {
			cExtOrganizationImpl.setFnEndowmentDrawCurrentRateLast(fnEndowmentDrawCurrentRateLast);
		}

		if (fnEndowmentComment == null) {
			cExtOrganizationImpl.setFnEndowmentComment("");
		}
		else {
			cExtOrganizationImpl.setFnEndowmentComment(fnEndowmentComment);
		}

		cExtOrganizationImpl.setFnReserves(fnReserves);
		cExtOrganizationImpl.setFnInvestments(fnInvestments);
		cExtOrganizationImpl.setFnComplete(fnComplete);

		if (reBuildingProgram == null) {
			cExtOrganizationImpl.setReBuildingProgram("");
		}
		else {
			cExtOrganizationImpl.setReBuildingProgram(reBuildingProgram);
		}

		if (reCampaignMissionComponents == null) {
			cExtOrganizationImpl.setReCampaignMissionComponents("");
		}
		else {
			cExtOrganizationImpl.setReCampaignMissionComponents(reCampaignMissionComponents);
		}

		cExtOrganizationImpl.setReParsonage(reParsonage);
		cExtOrganizationImpl.setReParsonageMarketValue(reParsonageMarketValue);
		cExtOrganizationImpl.setReParsonageAssessedValue(reParsonageAssessedValue);

		if (reParsonageUsage == null) {
			cExtOrganizationImpl.setReParsonageUsage("");
		}
		else {
			cExtOrganizationImpl.setReParsonageUsage(reParsonageUsage);
		}

		if (reParsonageStreetAddress == null) {
			cExtOrganizationImpl.setReParsonageStreetAddress("");
		}
		else {
			cExtOrganizationImpl.setReParsonageStreetAddress(reParsonageStreetAddress);
		}

		if (reParsonageCity == null) {
			cExtOrganizationImpl.setReParsonageCity("");
		}
		else {
			cExtOrganizationImpl.setReParsonageCity(reParsonageCity);
		}

		if (reParsonageState == null) {
			cExtOrganizationImpl.setReParsonageState("");
		}
		else {
			cExtOrganizationImpl.setReParsonageState(reParsonageState);
		}

		if (reParsonageZip == null) {
			cExtOrganizationImpl.setReParsonageZip("");
		}
		else {
			cExtOrganizationImpl.setReParsonageZip(reParsonageZip);
		}

		cExtOrganizationImpl.setReParsonageFootage(reParsonageFootage);
		cExtOrganizationImpl.setReParsonageBedrooms(reParsonageBedrooms);
		cExtOrganizationImpl.setReParsonageBathrooms(reParsonageBathrooms);
		cExtOrganizationImpl.setReParsonageAvailableMinister(reParsonageAvailableMinister);
		cExtOrganizationImpl.setReParsonageExpectedMinister(reParsonageExpectedMinister);

		if (reParsonageCondition == null) {
			cExtOrganizationImpl.setReParsonageCondition("");
		}
		else {
			cExtOrganizationImpl.setReParsonageCondition(reParsonageCondition);
		}

		if (reParsonageResponsibleEntity == null) {
			cExtOrganizationImpl.setReParsonageResponsibleEntity("");
		}
		else {
			cExtOrganizationImpl.setReParsonageResponsibleEntity(reParsonageResponsibleEntity);
		}

		if (reOwnedBuildings == null) {
			cExtOrganizationImpl.setReOwnedBuildings("");
		}
		else {
			cExtOrganizationImpl.setReOwnedBuildings(reOwnedBuildings);
		}

		if (reNonOwnedBuildings == null) {
			cExtOrganizationImpl.setReNonOwnedBuildings("");
		}
		else {
			cExtOrganizationImpl.setReNonOwnedBuildings(reNonOwnedBuildings);
		}

		if (reWheelchairAccessible == null) {
			cExtOrganizationImpl.setReWheelchairAccessible("");
		}
		else {
			cExtOrganizationImpl.setReWheelchairAccessible(reWheelchairAccessible);
		}

		if (reFinancesAssetsReview == null) {
			cExtOrganizationImpl.setReFinancesAssetsReview("");
		}
		else {
			cExtOrganizationImpl.setReFinancesAssetsReview(reFinancesAssetsReview);
		}

		cExtOrganizationImpl.setReComplete(reComplete);

		if (hiSignificantHappenings == null) {
			cExtOrganizationImpl.setHiSignificantHappenings("");
		}
		else {
			cExtOrganizationImpl.setHiSignificantHappenings(hiSignificantHappenings);
		}

		if (hiManagedChange == null) {
			cExtOrganizationImpl.setHiManagedChange("");
		}
		else {
			cExtOrganizationImpl.setHiManagedChange(hiManagedChange);
		}

		if (hiConflictResolution == null) {
			cExtOrganizationImpl.setHiConflictResolution("");
		}
		else {
			cExtOrganizationImpl.setHiConflictResolution(hiConflictResolution);
		}

		if (hiMinisterialLeadershipLearning == null) {
			cExtOrganizationImpl.setHiMinisterialLeadershipLearning("");
		}
		else {
			cExtOrganizationImpl.setHiMinisterialLeadershipLearning(hiMinisterialLeadershipLearning);
		}

		if (hiPressureInvoluntaryTermination == null) {
			cExtOrganizationImpl.setHiPressureInvoluntaryTermination("");
		}
		else {
			cExtOrganizationImpl.setHiPressureInvoluntaryTermination(hiPressureInvoluntaryTermination);
		}

		if (hiSituationalSupportConsultation == null) {
			cExtOrganizationImpl.setHiSituationalSupportConsultation("");
		}
		else {
			cExtOrganizationImpl.setHiSituationalSupportConsultation(hiSituationalSupportConsultation);
		}

		if (hiFitnessReview == null) {
			cExtOrganizationImpl.setHiFitnessReview("");
		}
		else {
			cExtOrganizationImpl.setHiFitnessReview(hiFitnessReview);
		}

		cExtOrganizationImpl.setHiComplete(hiComplete);

		if (cmServiceAdvocacy == null) {
			cExtOrganizationImpl.setCmServiceAdvocacy("");
		}
		else {
			cExtOrganizationImpl.setCmServiceAdvocacy(cmServiceAdvocacy);
		}

		if (cmMeetingsRelationshipsActivities == null) {
			cExtOrganizationImpl.setCmMeetingsRelationshipsActivities("");
		}
		else {
			cExtOrganizationImpl.setCmMeetingsRelationshipsActivities(cmMeetingsRelationshipsActivities);
		}

		cExtOrganizationImpl.setCmAccessibleToAll(cmAccessibleToAll);
		cExtOrganizationImpl.setCmCreationJustice(cmCreationJustice);
		cExtOrganizationImpl.setCmEconomicJustice(cmEconomicJustice);
		cExtOrganizationImpl.setCmFaithfulAndWelcoming(cmFaithfulAndWelcoming);
		cExtOrganizationImpl.setCmGodIsStillSpeaking(cmGodIsStillSpeaking);
		cExtOrganizationImpl.setCmBorderAndImmigrantJustice(cmBorderAndImmigrantJustice);
		cExtOrganizationImpl.setCmInterCulturalMultiRacial(cmInterCulturalMultiRacial);
		cExtOrganizationImpl.setCmJustPeace(cmJustPeace);
		cExtOrganizationImpl.setCmGlobalMissionChurch(cmGlobalMissionChurch);
		cExtOrganizationImpl.setCmOpenAndAffirming(cmOpenAndAffirming);
		cExtOrganizationImpl.setCmWISECongregationForMentalHealth(cmWISECongregationForMentalHealth);
		cExtOrganizationImpl.setCmOtherUCCDesignations(cmOtherUCCDesignations);
		cExtOrganizationImpl.setCmDesignationsOtherDenominations(cmDesignationsOtherDenominations);

		if (cmStatementsReflection == null) {
			cExtOrganizationImpl.setCmStatementsReflection("");
		}
		else {
			cExtOrganizationImpl.setCmStatementsReflection(cmStatementsReflection);
		}

		if (cmWorkTowardWitnessFuture == null) {
			cExtOrganizationImpl.setCmWorkTowardWitnessFuture("");
		}
		else {
			cExtOrganizationImpl.setCmWorkTowardWitnessFuture(cmWorkTowardWitnessFuture);
		}

		if (cmEcumenicalInterfaithParticipation == null) {
			cExtOrganizationImpl.setCmEcumenicalInterfaithParticipation("");
		}
		else {
			cExtOrganizationImpl.setCmEcumenicalInterfaithParticipation(cmEcumenicalInterfaithParticipation);
		}

		if (cmMissionStatementComparison == null) {
			cExtOrganizationImpl.setCmMissionStatementComparison("");
		}
		else {
			cExtOrganizationImpl.setCmMissionStatementComparison(cmMissionStatementComparison);
		}

		if (cmPastorTimeExpectations == null) {
			cExtOrganizationImpl.setCmPastorTimeExpectations("");
		}
		else {
			cExtOrganizationImpl.setCmPastorTimeExpectations(cmPastorTimeExpectations);
		}

		cExtOrganizationImpl.setCmComplete(cmComplete);

		if (miMissionInSiteTrendsOpportunities == null) {
			cExtOrganizationImpl.setMiMissionInSiteTrendsOpportunities("");
		}
		else {
			cExtOrganizationImpl.setMiMissionInSiteTrendsOpportunities(miMissionInSiteTrendsOpportunities);
		}

		if (miCongregationDemographicsComparison == null) {
			cExtOrganizationImpl.setMiCongregationDemographicsComparison("");
		}
		else {
			cExtOrganizationImpl.setMiCongregationDemographicsComparison(miCongregationDemographicsComparison);
		}

		if (miCommunityDemographicsImpact == null) {
			cExtOrganizationImpl.setMiCommunityDemographicsImpact("");
		}
		else {
			cExtOrganizationImpl.setMiCommunityDemographicsImpact(miCommunityDemographicsImpact);
		}

		if (miKnownForInCommunity == null) {
			cExtOrganizationImpl.setMiKnownForInCommunity("");
		}
		else {
			cExtOrganizationImpl.setMiKnownForInCommunity(miKnownForInCommunity);
		}

		if (miWhyNewPeopleInvolved == null) {
			cExtOrganizationImpl.setMiWhyNewPeopleInvolved("");
		}
		else {
			cExtOrganizationImpl.setMiWhyNewPeopleInvolved(miWhyNewPeopleInvolved);
		}

		cExtOrganizationImpl.setMiComplete(miComplete);

		if (vsGodsCallToBecome == null) {
			cExtOrganizationImpl.setVsGodsCallToBecome("");
		}
		else {
			cExtOrganizationImpl.setVsGodsCallToBecome(vsGodsCallToBecome);
		}

		if (vsGodsCallToReachOut == null) {
			cExtOrganizationImpl.setVsGodsCallToReachOut("");
		}
		else {
			cExtOrganizationImpl.setVsGodsCallToReachOut(vsGodsCallToReachOut);
		}

		cExtOrganizationImpl.setVsComplete(vsComplete);
		cExtOrganizationImpl.setPvFileEntryId(pvFileEntryId);

		if (pvGeneratedDate == Long.MIN_VALUE) {
			cExtOrganizationImpl.setPvGeneratedDate(null);
		}
		else {
			cExtOrganizationImpl.setPvGeneratedDate(new Date(pvGeneratedDate));
		}

		cExtOrganizationImpl.setPvComplete(pvComplete);
		cExtOrganizationImpl.setPbFileEntryId(pbFileEntryId);

		if (pbPublishedDate == Long.MIN_VALUE) {
			cExtOrganizationImpl.setPbPublishedDate(null);
		}
		else {
			cExtOrganizationImpl.setPbPublishedDate(new Date(pbPublishedDate));
		}

		cExtOrganizationImpl.resetOriginalValues();

		return cExtOrganizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		organizationId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		diTitle = objectInput.readUTF();
		diDescription = objectInput.readUTF();

		diComplete = objectInput.readBoolean();
		rfLifeOfFaith = objectInput.readUTF();
		rfStrengthsQualities = objectInput.readUTF();
		rfWorship = objectInput.readUTF();
		rfEducationFaithVision = objectInput.readUTF();
		rfMinistryMission = objectInput.readUTF();
		rfMeetingHoursPerMonth = objectInput.readUTF();
		rfCrisisDisasterAction = objectInput.readUTF();

		rfMinisterGovernanceCopy = objectInput.readBoolean();

		rfComplete = objectInput.readBoolean();

		yrFileEntryId = objectInput.readLong();
		yrChurchResponse = objectInput.readUTF();

		yrComplete = objectInput.readBoolean();

		dgActiveMembers = objectInput.readInt();

		dgActiveMembersEstimate = objectInput.readBoolean();

		dgActiveNonMembers = objectInput.readInt();

		dgActiveNonMembersEstimate = objectInput.readBoolean();

		dgPercentMoreThan10 = objectInput.readInt();

		dgPercentMoreThan10Estimate = objectInput.readBoolean();

		dgPercent5To10 = objectInput.readInt();

		dgPercent5To10Estimate = objectInput.readBoolean();

		dgPercentLessThan5 = objectInput.readInt();

		dgPercentLessThan5Estimate = objectInput.readBoolean();

		dgAge11AndUnder = objectInput.readInt();

		dgAge12To17 = objectInput.readInt();

		dgAge18To24 = objectInput.readInt();

		dgAge25To34 = objectInput.readInt();

		dgAge35To44 = objectInput.readInt();

		dgAge45To54 = objectInput.readInt();

		dgAge55To64 = objectInput.readInt();

		dgAge65To74 = objectInput.readInt();

		dgAge75AndOver = objectInput.readInt();

		dgAllAgesEstimate = objectInput.readBoolean();

		dgPercentSingleUnder35 = objectInput.readInt();

		dgPercentSingleUnder35Estimate = objectInput.readBoolean();

		dgPercentWithMinors = objectInput.readInt();

		dgPercentWithMinorsEstimate = objectInput.readBoolean();

		dgPercentSingle35To65 = objectInput.readInt();

		dgPercentSingle35To65Estimate = objectInput.readBoolean();

		dgPercentJointNoMinors = objectInput.readInt();

		dgPercentJointNoMinorsEstimate = objectInput.readBoolean();

		dgPercentSingleOver65 = objectInput.readInt();

		dgPercentSingleOver65Estimate = objectInput.readBoolean();

		dgPercentHighSchool = objectInput.readInt();

		dgPercentHighSchoolEstimate = objectInput.readBoolean();

		dgPercentCollege = objectInput.readInt();

		dgPercentCollegeEstimate = objectInput.readBoolean();

		dgPercentGraduateSchool = objectInput.readInt();

		dgPercentGraduateSchoolEstimate = objectInput.readBoolean();

		dgPercentSpecialtyTraining = objectInput.readInt();

		dgPercentSpecialtyTrainingEstimate = objectInput.readBoolean();

		dgPercentOtherEducation = objectInput.readInt();

		dgPercentOtherEducationEstimate = objectInput.readBoolean();
		dgPercentOtherEducationDescription = objectInput.readUTF();

		dgPercentEmployed = objectInput.readInt();

		dgPercentEmployedEstimate = objectInput.readBoolean();

		dgPercentNotFullyEmployed = objectInput.readInt();

		dgPercentNotFullyEmployedEstimate = objectInput.readBoolean();

		dgPercentRetired = objectInput.readInt();

		dgPercentRetiredEstimate = objectInput.readBoolean();
		dgRangeOfOccupations = objectInput.readUTF();

		dgComplete = objectInput.readBoolean();
		dvEthnicRacialMix = objectInput.readUTF();
		dvWelcomingConversation = objectInput.readUTF();
		dvWelcomingComments = objectInput.readUTF();

		dvComplete = objectInput.readBoolean();
		ppComments = objectInput.readUTF();

		ppComplete = objectInput.readBoolean();
		sfPreviousRoles = objectInput.readUTF();

		sfComplete = objectInput.readBoolean();
		rvOverallMinistry = objectInput.readUTF();

		rvComplete = objectInput.readBoolean();
		fnYear = objectInput.readUTF();

		fnIncomeOfferingsPledgedGivings = objectInput.readInt();

		fnIncomeEndowmentProceeds = objectInput.readInt();

		fnIncomeEndowmentDraw = objectInput.readInt();

		fnIncomeFundraising = objectInput.readInt();

		fnIncomeDesignatedGifts = objectInput.readInt();

		fnIncomeGrants = objectInput.readInt();

		fnIncomeRentalChurchBuilding = objectInput.readInt();

		fnIncomeRentalChurchParsonage = objectInput.readInt();

		fnIncomeRelatedOrganizations = objectInput.readInt();

		fnIncomeSpecialAccounts = objectInput.readInt();

		fnExpense = objectInput.readInt();

		fnFileEntryId = objectInput.readLong();

		fnExpenseMinisterialSupportPercent = objectInput.readInt();

		fnFailToPayMinister = objectInput.readBoolean();

		fnOurChurchWiderMission = objectInput.readBoolean();

		fnOneGreatHourOfSharing = objectInput.readBoolean();

		fnStrenghtenTheChurch = objectInput.readBoolean();

		fnNeighborsInNeed = objectInput.readBoolean();

		fnChristmasFund = objectInput.readBoolean();
		fnOurChurchWiderMissionHow = objectInput.readUTF();

		fnDebtCurrent = objectInput.readInt();

		fnDebtCurrentLoan = objectInput.readInt();
		fnDebtReasonFor = objectInput.readUTF();

		fnDebtPaymentsCurrent = objectInput.readBoolean();

		fnEndowment = objectInput.readBoolean();

		fnEndowmentMarketValue = objectInput.readInt();
		fnEndowmentDrawWhen = objectInput.readUTF();

		fnEndowmentDraw5YearPercent = objectInput.readInt();
		fnEndowmentDraw5YearToExpense = objectInput.readUTF();
		fnEndowmentDrawCurrentRateLast = objectInput.readUTF();
		fnEndowmentComment = objectInput.readUTF();

		fnReserves = objectInput.readInt();

		fnInvestments = objectInput.readInt();

		fnComplete = objectInput.readBoolean();
		reBuildingProgram = objectInput.readUTF();
		reCampaignMissionComponents = objectInput.readUTF();

		reParsonage = objectInput.readBoolean();

		reParsonageMarketValue = objectInput.readInt();

		reParsonageAssessedValue = objectInput.readInt();
		reParsonageUsage = objectInput.readUTF();
		reParsonageStreetAddress = objectInput.readUTF();
		reParsonageCity = objectInput.readUTF();
		reParsonageState = objectInput.readUTF();
		reParsonageZip = objectInput.readUTF();

		reParsonageFootage = objectInput.readInt();

		reParsonageBedrooms = objectInput.readInt();

		reParsonageBathrooms = objectInput.readInt();

		reParsonageAvailableMinister = objectInput.readBoolean();

		reParsonageExpectedMinister = objectInput.readBoolean();
		reParsonageCondition = objectInput.readUTF();
		reParsonageResponsibleEntity = objectInput.readUTF();
		reOwnedBuildings = objectInput.readUTF();
		reNonOwnedBuildings = objectInput.readUTF();
		reWheelchairAccessible = objectInput.readUTF();
		reFinancesAssetsReview = objectInput.readUTF();

		reComplete = objectInput.readBoolean();
		hiSignificantHappenings = objectInput.readUTF();
		hiManagedChange = objectInput.readUTF();
		hiConflictResolution = objectInput.readUTF();
		hiMinisterialLeadershipLearning = objectInput.readUTF();
		hiPressureInvoluntaryTermination = objectInput.readUTF();
		hiSituationalSupportConsultation = objectInput.readUTF();
		hiFitnessReview = objectInput.readUTF();

		hiComplete = objectInput.readBoolean();
		cmServiceAdvocacy = objectInput.readUTF();
		cmMeetingsRelationshipsActivities = objectInput.readUTF();

		cmAccessibleToAll = objectInput.readBoolean();

		cmCreationJustice = objectInput.readBoolean();

		cmEconomicJustice = objectInput.readBoolean();

		cmFaithfulAndWelcoming = objectInput.readBoolean();

		cmGodIsStillSpeaking = objectInput.readBoolean();

		cmBorderAndImmigrantJustice = objectInput.readBoolean();

		cmInterCulturalMultiRacial = objectInput.readBoolean();

		cmJustPeace = objectInput.readBoolean();

		cmGlobalMissionChurch = objectInput.readBoolean();

		cmOpenAndAffirming = objectInput.readBoolean();

		cmWISECongregationForMentalHealth = objectInput.readBoolean();

		cmOtherUCCDesignations = objectInput.readBoolean();

		cmDesignationsOtherDenominations = objectInput.readBoolean();
		cmStatementsReflection = objectInput.readUTF();
		cmWorkTowardWitnessFuture = objectInput.readUTF();
		cmEcumenicalInterfaithParticipation = objectInput.readUTF();
		cmMissionStatementComparison = objectInput.readUTF();
		cmPastorTimeExpectations = objectInput.readUTF();

		cmComplete = objectInput.readBoolean();
		miMissionInSiteTrendsOpportunities = objectInput.readUTF();
		miCongregationDemographicsComparison = objectInput.readUTF();
		miCommunityDemographicsImpact = objectInput.readUTF();
		miKnownForInCommunity = objectInput.readUTF();
		miWhyNewPeopleInvolved = objectInput.readUTF();

		miComplete = objectInput.readBoolean();
		vsGodsCallToBecome = objectInput.readUTF();
		vsGodsCallToReachOut = objectInput.readUTF();

		vsComplete = objectInput.readBoolean();

		pvFileEntryId = objectInput.readLong();
		pvGeneratedDate = objectInput.readLong();

		pvComplete = objectInput.readBoolean();

		pbFileEntryId = objectInput.readLong();
		pbPublishedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (diTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(diTitle);
		}

		if (diDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(diDescription);
		}

		objectOutput.writeBoolean(diComplete);

		if (rfLifeOfFaith == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfLifeOfFaith);
		}

		if (rfStrengthsQualities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfStrengthsQualities);
		}

		if (rfWorship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfWorship);
		}

		if (rfEducationFaithVision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfEducationFaithVision);
		}

		if (rfMinistryMission == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfMinistryMission);
		}

		if (rfMeetingHoursPerMonth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfMeetingHoursPerMonth);
		}

		if (rfCrisisDisasterAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rfCrisisDisasterAction);
		}

		objectOutput.writeBoolean(rfMinisterGovernanceCopy);

		objectOutput.writeBoolean(rfComplete);

		objectOutput.writeLong(yrFileEntryId);

		if (yrChurchResponse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(yrChurchResponse);
		}

		objectOutput.writeBoolean(yrComplete);

		objectOutput.writeInt(dgActiveMembers);

		objectOutput.writeBoolean(dgActiveMembersEstimate);

		objectOutput.writeInt(dgActiveNonMembers);

		objectOutput.writeBoolean(dgActiveNonMembersEstimate);

		objectOutput.writeInt(dgPercentMoreThan10);

		objectOutput.writeBoolean(dgPercentMoreThan10Estimate);

		objectOutput.writeInt(dgPercent5To10);

		objectOutput.writeBoolean(dgPercent5To10Estimate);

		objectOutput.writeInt(dgPercentLessThan5);

		objectOutput.writeBoolean(dgPercentLessThan5Estimate);

		objectOutput.writeInt(dgAge11AndUnder);

		objectOutput.writeInt(dgAge12To17);

		objectOutput.writeInt(dgAge18To24);

		objectOutput.writeInt(dgAge25To34);

		objectOutput.writeInt(dgAge35To44);

		objectOutput.writeInt(dgAge45To54);

		objectOutput.writeInt(dgAge55To64);

		objectOutput.writeInt(dgAge65To74);

		objectOutput.writeInt(dgAge75AndOver);

		objectOutput.writeBoolean(dgAllAgesEstimate);

		objectOutput.writeInt(dgPercentSingleUnder35);

		objectOutput.writeBoolean(dgPercentSingleUnder35Estimate);

		objectOutput.writeInt(dgPercentWithMinors);

		objectOutput.writeBoolean(dgPercentWithMinorsEstimate);

		objectOutput.writeInt(dgPercentSingle35To65);

		objectOutput.writeBoolean(dgPercentSingle35To65Estimate);

		objectOutput.writeInt(dgPercentJointNoMinors);

		objectOutput.writeBoolean(dgPercentJointNoMinorsEstimate);

		objectOutput.writeInt(dgPercentSingleOver65);

		objectOutput.writeBoolean(dgPercentSingleOver65Estimate);

		objectOutput.writeInt(dgPercentHighSchool);

		objectOutput.writeBoolean(dgPercentHighSchoolEstimate);

		objectOutput.writeInt(dgPercentCollege);

		objectOutput.writeBoolean(dgPercentCollegeEstimate);

		objectOutput.writeInt(dgPercentGraduateSchool);

		objectOutput.writeBoolean(dgPercentGraduateSchoolEstimate);

		objectOutput.writeInt(dgPercentSpecialtyTraining);

		objectOutput.writeBoolean(dgPercentSpecialtyTrainingEstimate);

		objectOutput.writeInt(dgPercentOtherEducation);

		objectOutput.writeBoolean(dgPercentOtherEducationEstimate);

		if (dgPercentOtherEducationDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dgPercentOtherEducationDescription);
		}

		objectOutput.writeInt(dgPercentEmployed);

		objectOutput.writeBoolean(dgPercentEmployedEstimate);

		objectOutput.writeInt(dgPercentNotFullyEmployed);

		objectOutput.writeBoolean(dgPercentNotFullyEmployedEstimate);

		objectOutput.writeInt(dgPercentRetired);

		objectOutput.writeBoolean(dgPercentRetiredEstimate);

		if (dgRangeOfOccupations == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dgRangeOfOccupations);
		}

		objectOutput.writeBoolean(dgComplete);

		if (dvEthnicRacialMix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dvEthnicRacialMix);
		}

		if (dvWelcomingConversation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dvWelcomingConversation);
		}

		if (dvWelcomingComments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dvWelcomingComments);
		}

		objectOutput.writeBoolean(dvComplete);

		if (ppComments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ppComments);
		}

		objectOutput.writeBoolean(ppComplete);

		if (sfPreviousRoles == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sfPreviousRoles);
		}

		objectOutput.writeBoolean(sfComplete);

		if (rvOverallMinistry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rvOverallMinistry);
		}

		objectOutput.writeBoolean(rvComplete);

		if (fnYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnYear);
		}

		objectOutput.writeInt(fnIncomeOfferingsPledgedGivings);

		objectOutput.writeInt(fnIncomeEndowmentProceeds);

		objectOutput.writeInt(fnIncomeEndowmentDraw);

		objectOutput.writeInt(fnIncomeFundraising);

		objectOutput.writeInt(fnIncomeDesignatedGifts);

		objectOutput.writeInt(fnIncomeGrants);

		objectOutput.writeInt(fnIncomeRentalChurchBuilding);

		objectOutput.writeInt(fnIncomeRentalChurchParsonage);

		objectOutput.writeInt(fnIncomeRelatedOrganizations);

		objectOutput.writeInt(fnIncomeSpecialAccounts);

		objectOutput.writeInt(fnExpense);

		objectOutput.writeLong(fnFileEntryId);

		objectOutput.writeInt(fnExpenseMinisterialSupportPercent);

		objectOutput.writeBoolean(fnFailToPayMinister);

		objectOutput.writeBoolean(fnOurChurchWiderMission);

		objectOutput.writeBoolean(fnOneGreatHourOfSharing);

		objectOutput.writeBoolean(fnStrenghtenTheChurch);

		objectOutput.writeBoolean(fnNeighborsInNeed);

		objectOutput.writeBoolean(fnChristmasFund);

		if (fnOurChurchWiderMissionHow == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnOurChurchWiderMissionHow);
		}

		objectOutput.writeInt(fnDebtCurrent);

		objectOutput.writeInt(fnDebtCurrentLoan);

		if (fnDebtReasonFor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnDebtReasonFor);
		}

		objectOutput.writeBoolean(fnDebtPaymentsCurrent);

		objectOutput.writeBoolean(fnEndowment);

		objectOutput.writeInt(fnEndowmentMarketValue);

		if (fnEndowmentDrawWhen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnEndowmentDrawWhen);
		}

		objectOutput.writeInt(fnEndowmentDraw5YearPercent);

		if (fnEndowmentDraw5YearToExpense == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnEndowmentDraw5YearToExpense);
		}

		if (fnEndowmentDrawCurrentRateLast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnEndowmentDrawCurrentRateLast);
		}

		if (fnEndowmentComment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fnEndowmentComment);
		}

		objectOutput.writeInt(fnReserves);

		objectOutput.writeInt(fnInvestments);

		objectOutput.writeBoolean(fnComplete);

		if (reBuildingProgram == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reBuildingProgram);
		}

		if (reCampaignMissionComponents == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reCampaignMissionComponents);
		}

		objectOutput.writeBoolean(reParsonage);

		objectOutput.writeInt(reParsonageMarketValue);

		objectOutput.writeInt(reParsonageAssessedValue);

		if (reParsonageUsage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageUsage);
		}

		if (reParsonageStreetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageStreetAddress);
		}

		if (reParsonageCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageCity);
		}

		if (reParsonageState == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageState);
		}

		if (reParsonageZip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageZip);
		}

		objectOutput.writeInt(reParsonageFootage);

		objectOutput.writeInt(reParsonageBedrooms);

		objectOutput.writeInt(reParsonageBathrooms);

		objectOutput.writeBoolean(reParsonageAvailableMinister);

		objectOutput.writeBoolean(reParsonageExpectedMinister);

		if (reParsonageCondition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageCondition);
		}

		if (reParsonageResponsibleEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reParsonageResponsibleEntity);
		}

		if (reOwnedBuildings == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reOwnedBuildings);
		}

		if (reNonOwnedBuildings == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reNonOwnedBuildings);
		}

		if (reWheelchairAccessible == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reWheelchairAccessible);
		}

		if (reFinancesAssetsReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reFinancesAssetsReview);
		}

		objectOutput.writeBoolean(reComplete);

		if (hiSignificantHappenings == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiSignificantHappenings);
		}

		if (hiManagedChange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiManagedChange);
		}

		if (hiConflictResolution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiConflictResolution);
		}

		if (hiMinisterialLeadershipLearning == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiMinisterialLeadershipLearning);
		}

		if (hiPressureInvoluntaryTermination == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiPressureInvoluntaryTermination);
		}

		if (hiSituationalSupportConsultation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiSituationalSupportConsultation);
		}

		if (hiFitnessReview == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hiFitnessReview);
		}

		objectOutput.writeBoolean(hiComplete);

		if (cmServiceAdvocacy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmServiceAdvocacy);
		}

		if (cmMeetingsRelationshipsActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmMeetingsRelationshipsActivities);
		}

		objectOutput.writeBoolean(cmAccessibleToAll);

		objectOutput.writeBoolean(cmCreationJustice);

		objectOutput.writeBoolean(cmEconomicJustice);

		objectOutput.writeBoolean(cmFaithfulAndWelcoming);

		objectOutput.writeBoolean(cmGodIsStillSpeaking);

		objectOutput.writeBoolean(cmBorderAndImmigrantJustice);

		objectOutput.writeBoolean(cmInterCulturalMultiRacial);

		objectOutput.writeBoolean(cmJustPeace);

		objectOutput.writeBoolean(cmGlobalMissionChurch);

		objectOutput.writeBoolean(cmOpenAndAffirming);

		objectOutput.writeBoolean(cmWISECongregationForMentalHealth);

		objectOutput.writeBoolean(cmOtherUCCDesignations);

		objectOutput.writeBoolean(cmDesignationsOtherDenominations);

		if (cmStatementsReflection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmStatementsReflection);
		}

		if (cmWorkTowardWitnessFuture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmWorkTowardWitnessFuture);
		}

		if (cmEcumenicalInterfaithParticipation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmEcumenicalInterfaithParticipation);
		}

		if (cmMissionStatementComparison == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmMissionStatementComparison);
		}

		if (cmPastorTimeExpectations == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmPastorTimeExpectations);
		}

		objectOutput.writeBoolean(cmComplete);

		if (miMissionInSiteTrendsOpportunities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miMissionInSiteTrendsOpportunities);
		}

		if (miCongregationDemographicsComparison == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miCongregationDemographicsComparison);
		}

		if (miCommunityDemographicsImpact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miCommunityDemographicsImpact);
		}

		if (miKnownForInCommunity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miKnownForInCommunity);
		}

		if (miWhyNewPeopleInvolved == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miWhyNewPeopleInvolved);
		}

		objectOutput.writeBoolean(miComplete);

		if (vsGodsCallToBecome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vsGodsCallToBecome);
		}

		if (vsGodsCallToReachOut == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vsGodsCallToReachOut);
		}

		objectOutput.writeBoolean(vsComplete);

		objectOutput.writeLong(pvFileEntryId);
		objectOutput.writeLong(pvGeneratedDate);

		objectOutput.writeBoolean(pvComplete);

		objectOutput.writeLong(pbFileEntryId);
		objectOutput.writeLong(pbPublishedDate);
	}

	public long organizationId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String diTitle;
	public String diDescription;
	public boolean diComplete;
	public String rfLifeOfFaith;
	public String rfStrengthsQualities;
	public String rfWorship;
	public String rfEducationFaithVision;
	public String rfMinistryMission;
	public String rfMeetingHoursPerMonth;
	public String rfCrisisDisasterAction;
	public boolean rfMinisterGovernanceCopy;
	public boolean rfComplete;
	public long yrFileEntryId;
	public String yrChurchResponse;
	public boolean yrComplete;
	public int dgActiveMembers;
	public boolean dgActiveMembersEstimate;
	public int dgActiveNonMembers;
	public boolean dgActiveNonMembersEstimate;
	public int dgPercentMoreThan10;
	public boolean dgPercentMoreThan10Estimate;
	public int dgPercent5To10;
	public boolean dgPercent5To10Estimate;
	public int dgPercentLessThan5;
	public boolean dgPercentLessThan5Estimate;
	public int dgAge11AndUnder;
	public int dgAge12To17;
	public int dgAge18To24;
	public int dgAge25To34;
	public int dgAge35To44;
	public int dgAge45To54;
	public int dgAge55To64;
	public int dgAge65To74;
	public int dgAge75AndOver;
	public boolean dgAllAgesEstimate;
	public int dgPercentSingleUnder35;
	public boolean dgPercentSingleUnder35Estimate;
	public int dgPercentWithMinors;
	public boolean dgPercentWithMinorsEstimate;
	public int dgPercentSingle35To65;
	public boolean dgPercentSingle35To65Estimate;
	public int dgPercentJointNoMinors;
	public boolean dgPercentJointNoMinorsEstimate;
	public int dgPercentSingleOver65;
	public boolean dgPercentSingleOver65Estimate;
	public int dgPercentHighSchool;
	public boolean dgPercentHighSchoolEstimate;
	public int dgPercentCollege;
	public boolean dgPercentCollegeEstimate;
	public int dgPercentGraduateSchool;
	public boolean dgPercentGraduateSchoolEstimate;
	public int dgPercentSpecialtyTraining;
	public boolean dgPercentSpecialtyTrainingEstimate;
	public int dgPercentOtherEducation;
	public boolean dgPercentOtherEducationEstimate;
	public String dgPercentOtherEducationDescription;
	public int dgPercentEmployed;
	public boolean dgPercentEmployedEstimate;
	public int dgPercentNotFullyEmployed;
	public boolean dgPercentNotFullyEmployedEstimate;
	public int dgPercentRetired;
	public boolean dgPercentRetiredEstimate;
	public String dgRangeOfOccupations;
	public boolean dgComplete;
	public String dvEthnicRacialMix;
	public String dvWelcomingConversation;
	public String dvWelcomingComments;
	public boolean dvComplete;
	public String ppComments;
	public boolean ppComplete;
	public String sfPreviousRoles;
	public boolean sfComplete;
	public String rvOverallMinistry;
	public boolean rvComplete;
	public String fnYear;
	public int fnIncomeOfferingsPledgedGivings;
	public int fnIncomeEndowmentProceeds;
	public int fnIncomeEndowmentDraw;
	public int fnIncomeFundraising;
	public int fnIncomeDesignatedGifts;
	public int fnIncomeGrants;
	public int fnIncomeRentalChurchBuilding;
	public int fnIncomeRentalChurchParsonage;
	public int fnIncomeRelatedOrganizations;
	public int fnIncomeSpecialAccounts;
	public int fnExpense;
	public long fnFileEntryId;
	public int fnExpenseMinisterialSupportPercent;
	public boolean fnFailToPayMinister;
	public boolean fnOurChurchWiderMission;
	public boolean fnOneGreatHourOfSharing;
	public boolean fnStrenghtenTheChurch;
	public boolean fnNeighborsInNeed;
	public boolean fnChristmasFund;
	public String fnOurChurchWiderMissionHow;
	public int fnDebtCurrent;
	public int fnDebtCurrentLoan;
	public String fnDebtReasonFor;
	public boolean fnDebtPaymentsCurrent;
	public boolean fnEndowment;
	public int fnEndowmentMarketValue;
	public String fnEndowmentDrawWhen;
	public int fnEndowmentDraw5YearPercent;
	public String fnEndowmentDraw5YearToExpense;
	public String fnEndowmentDrawCurrentRateLast;
	public String fnEndowmentComment;
	public int fnReserves;
	public int fnInvestments;
	public boolean fnComplete;
	public String reBuildingProgram;
	public String reCampaignMissionComponents;
	public boolean reParsonage;
	public int reParsonageMarketValue;
	public int reParsonageAssessedValue;
	public String reParsonageUsage;
	public String reParsonageStreetAddress;
	public String reParsonageCity;
	public String reParsonageState;
	public String reParsonageZip;
	public int reParsonageFootage;
	public int reParsonageBedrooms;
	public int reParsonageBathrooms;
	public boolean reParsonageAvailableMinister;
	public boolean reParsonageExpectedMinister;
	public String reParsonageCondition;
	public String reParsonageResponsibleEntity;
	public String reOwnedBuildings;
	public String reNonOwnedBuildings;
	public String reWheelchairAccessible;
	public String reFinancesAssetsReview;
	public boolean reComplete;
	public String hiSignificantHappenings;
	public String hiManagedChange;
	public String hiConflictResolution;
	public String hiMinisterialLeadershipLearning;
	public String hiPressureInvoluntaryTermination;
	public String hiSituationalSupportConsultation;
	public String hiFitnessReview;
	public boolean hiComplete;
	public String cmServiceAdvocacy;
	public String cmMeetingsRelationshipsActivities;
	public boolean cmAccessibleToAll;
	public boolean cmCreationJustice;
	public boolean cmEconomicJustice;
	public boolean cmFaithfulAndWelcoming;
	public boolean cmGodIsStillSpeaking;
	public boolean cmBorderAndImmigrantJustice;
	public boolean cmInterCulturalMultiRacial;
	public boolean cmJustPeace;
	public boolean cmGlobalMissionChurch;
	public boolean cmOpenAndAffirming;
	public boolean cmWISECongregationForMentalHealth;
	public boolean cmOtherUCCDesignations;
	public boolean cmDesignationsOtherDenominations;
	public String cmStatementsReflection;
	public String cmWorkTowardWitnessFuture;
	public String cmEcumenicalInterfaithParticipation;
	public String cmMissionStatementComparison;
	public String cmPastorTimeExpectations;
	public boolean cmComplete;
	public String miMissionInSiteTrendsOpportunities;
	public String miCongregationDemographicsComparison;
	public String miCommunityDemographicsImpact;
	public String miKnownForInCommunity;
	public String miWhyNewPeopleInvolved;
	public boolean miComplete;
	public String vsGodsCallToBecome;
	public String vsGodsCallToReachOut;
	public boolean vsComplete;
	public long pvFileEntryId;
	public long pvGeneratedDate;
	public boolean pvComplete;
	public long pbFileEntryId;
	public long pbPublishedDate;
}