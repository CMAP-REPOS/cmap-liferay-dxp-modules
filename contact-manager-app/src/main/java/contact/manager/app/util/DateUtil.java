package contact.manager.app.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	public static String Format(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("MMMM dd, yyyy k:m:s a", Locale.US);
		return df.format(date);
//		return date.getTime() + "";
	}
}
