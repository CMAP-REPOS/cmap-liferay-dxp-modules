package contact.constantcontact.util;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import contact.constantcontact.model.Activity;
import contact.constantcontact.model.enums.ActivityTypes;
import contact.constantcontact.model.enums.BounceDescriptions;

public class ConstantContactUtil {

	private static Log LOGGER = LogFactoryUtil.getLog(ConstantContactUtil.class);

	public static Date getActivityDate(Activity activity) {

		Date activityDate = null;

		ActivityTypes activityType = ActivityTypes.valueOf(activity.getActivityType());

		switch (activityType) {
		case EMAIL_BOUNCE:
			activityDate = parseIsoDate(activity.getBounceDate());
			break;
		case EMAIL_CLICK:
			activityDate = parseIsoDate(activity.getClickDate());
			break;
		case EMAIL_FORWARD:
			activityDate = parseIsoDate(activity.getForwardDate());
			break;
		case EMAIL_OPEN:
			activityDate = parseIsoDate(activity.getOpenDate());
			break;
		case EMAIL_SEND:
			activityDate = parseIsoDate(activity.getSendDate());
			break;
		case EMAIL_UNSUBSCRIBE:
			activityDate = parseIsoDate(activity.getUnsubscribeDate());
			break;
		default:
			break;
		}

		return activityDate;
	}

	public static String getActivityNote(Activity activity) {
		String note = "campaignId: " + activity.getCampaignId() + "\n";

		ActivityTypes activityType = ActivityTypes.valueOf(activity.getActivityType());

		switch (activityType) {
		case EMAIL_BOUNCE:
			BounceDescriptions bounceDescriptions = BounceDescriptions.valueOf(activity
					.getBounceCode());

			note += bounceDescriptions.getDescription();

			break;
		case EMAIL_CLICK:
			break;
		case EMAIL_FORWARD:
			break;
		case EMAIL_OPEN:
			break;
		case EMAIL_SEND:
			break;
		case EMAIL_UNSUBSCRIBE:
			note += "Reason: " + activity.getUnsubscribeReason();
			break;
		default:
			break;
		}

		return note;
	}

	public static Date parseIsoDate(String dateInIso8601Format) {
		StdDateFormat df = new StdDateFormat();
		//ISO8601DateFormat df = new ISO8601DateFormat();
		Date d = null;
		if (dateInIso8601Format != null) {
			try {
				d = df.parse(dateInIso8601Format);
			} catch (ParseException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return d;
	}

	@SuppressWarnings("deprecation")
	public static String getPreviousDaysDateInIso8601(int days) {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		cal.add(Calendar.DATE, days*-1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);

		return com.fasterxml.jackson.databind.util.ISO8601Utils.format(cal.getTime());
	}

}
