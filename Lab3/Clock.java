
//Author: Javier Reyes
//Date: 09/Oct/2025
//Purpuse: Create a program that loops for 60 seconds and prints out the current time
import java.util.Calendar;

public class Clock {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i <= 60; i++) {
			if (endTime - startTime == 1000) {
				System.out.println("The current time is: ");
				System.out.println(t.toString());
				t.tick();
				startTime = System.currentTimeMillis();
				count++;
			} else {
				i = count;
			}
			endTime = System.currentTimeMillis();
		} // end for loop
		t = null;
		System.gc();
	}
}
