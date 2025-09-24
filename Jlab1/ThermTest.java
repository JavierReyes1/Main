// Student Name 	: Javier Reyes	
// Student Id Number: 
// Date 			: Sep-2025
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);	//Create a second instance of thermeter class, use the overloaded constructor with a double
		double tempB = thermB.getCelsius();	//create a variable with double data type called tempB. use the object tempB getter method to fetch the value of celsius

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius()) ;
		System.out.println("Temp. of Thermometer B is: " + tempB); //print out the temperature

		
	} // end main
} // end class ThermTest