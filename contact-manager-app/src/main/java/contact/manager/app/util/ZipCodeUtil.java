package contact.manager.app.util;

import java.util.List;

import contact.manager.model.CrmCCA;
import contact.manager.model.CrmChiWard;
import contact.manager.model.CrmCounty;
import contact.manager.model.CrmCountyCommissioner;
import contact.manager.model.CrmLTA;
import contact.manager.model.CrmMuni;
import contact.manager.model.CrmStateRep;
import contact.manager.model.CrmStateSenate;
import contact.manager.model.CrmUsRep;

import contact.manager.service.CrmCCAServiceUtil;
import contact.manager.service.CrmChiWardServiceUtil;
import contact.manager.service.CrmCountyCommissionerServiceUtil;
import contact.manager.service.CrmCountyServiceUtil;
import contact.manager.service.CrmLTAServiceUtil;
import contact.manager.service.CrmMuniServiceUtil;
import contact.manager.service.CrmStateRepServiceUtil;
import contact.manager.service.CrmStateSenateServiceUtil;
import contact.manager.service.CrmUsRepServiceUtil;

public class ZipCodeUtil {

	public static List<CrmCCA> getCrmCCAByZipCode(String zipCode) {
		return CrmCCAServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmChiWard> getCrmChiWardByZipCode(String zipCode) {
		return CrmChiWardServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmCounty> getCrmCountyByZipCode(String zipCode) {
		return CrmCountyServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmCountyCommissioner> getCrmCountyCommissionerByZipCode(String zipCode) {
		return CrmCountyCommissionerServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmLTA> getCrmLTAByZipCode(String zipCode) {
		return CrmLTAServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmMuni> getCrmMuniByZipCode(String zipCode) {
		return CrmMuniServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmStateRep> getCrmStateRepByZipCode(String zipCode) {
		return CrmStateRepServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmStateSenate> getCrmStateSenateByZipCode(String zipCode) {
		return CrmStateSenateServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmUsRep> getCrmUsRepByZipCode(String zipCode) {
		return CrmUsRepServiceUtil.findByZipCode(zipCode);
	}
}
