
//Author: Javier Reyes
//Date: 09/Oct/2025
//Purpuse: Create a program that loops for 60 seconds and prints out the current time
import java.util.Calendar;

public class Clock {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();										//create a calendar instance
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE)); //create a new time instance
		long startTime = System.currentTimeMillis();								//declare a variable called long datatype to keep track of the current time 
		long endTime = System.currentTimeMillis();									//declare a variable called endTime to be able to calculate the time difference 
		int count = 0;																//declare a count variable, this variable is way to important
		for (int i = 0; i <= 60; i++) {												//i is 0 ; i is less or equals than 60; increment i
			if (endTime - startTime == 1000) {										//if the difference between endTime minus startTime is equals to 1000ms or 1second, then
				System.out.println("The current time is: ");	
				System.out.println(t.toString());									//output the actual time 
				t.tick();															//then "tick" or count another second
				startTime = System.currentTimeMillis();								//UPDATE the start time
				count++;															//increment count
			} else {																//otherwise
				i = count;															//i is equals to 0
			}
			endTime = System.currentTimeMillis();									//update endTime regardless
		} // end for loop
		t = null;																	//terminate the time object
		System.gc();																//free memory in the heap
	}
}
