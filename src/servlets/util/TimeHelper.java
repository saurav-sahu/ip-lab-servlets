package servlets.util;

public class TimeHelper {
	public static String getMessageBasedOnHour(int hour) {
		if(hour > 5 && hour < 12) return "Good morning!";
		else if (hour < 16) return "Good afternoon!";
		else if (hour < 20) return "Good evening!";
		else return "Good night!";
	}
}