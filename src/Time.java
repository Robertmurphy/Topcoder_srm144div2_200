
public class Time {

	public String whatTime(int seconds) {
		int hours = 0;
		int minutes = 0;
		int secs = 0;
		hours = seconds / 3600;
		minutes = (seconds % 3600) / 60;
		secs = (seconds % 3600) % 60;
		return String.valueOf(hours + ":" + minutes + ":" + secs);
	}
	
	public static void main(String[] args) {
		System.out.println(new Time().whatTime(86399));
		System.out.println(new Time().whatTime(3661));
	}

}
