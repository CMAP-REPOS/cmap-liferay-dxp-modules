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

import contact.manager.service.CrmCCALocalServiceUtil;
import contact.manager.service.CrmChiWardLocalServiceUtil;
import contact.manager.service.CrmCountyCommissionerLocalServiceUtil;
import contact.manager.service.CrmCountyLocalServiceUtil;
import contact.manager.service.CrmLTALocalServiceUtil;
import contact.manager.service.CrmMuniLocalServiceUtil;
import contact.manager.service.CrmStateRepLocalServiceUtil;
import contact.manager.service.CrmStateSenateLocalServiceUtil;
import contact.manager.service.CrmUsRepLocalServiceUtil;

public class ZipCodeUtil {

	public static List<CrmCCA> getCrmCCAByZipCode(String zipCode) {
		return CrmCCALocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmChiWard> getCrmChiWardByZipCode(String zipCode) {
		return CrmChiWardLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmCounty> getCrmCountyByZipCode(String zipCode) {
		return CrmCountyLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmCountyCommissioner> getCrmCountyCommissionerByZipCode(String zipCode) {
		return CrmCountyCommissionerLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmLTA> getCrmLTAByZipCode(String zipCode) {
		return CrmLTALocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmMuni> getCrmMuniByZipCode(String zipCode) {
		return CrmMuniLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmStateRep> getCrmStateRepByZipCode(String zipCode) {
		return CrmStateRepLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmStateSenate> getCrmStateSenateByZipCode(String zipCode) {
		return CrmStateSenateLocalServiceUtil.findByZipCode(zipCode);
	}

	public static List<CrmUsRep> getCrmUsRepByZipCode(String zipCode) {
		return CrmUsRepLocalServiceUtil.findByZipCode(zipCode);
	}
}
