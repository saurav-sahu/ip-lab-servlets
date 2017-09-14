package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Hour {
	public static int getHour()
	{
		String hour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
		return Integer.parseInt(hour);
	}
}
