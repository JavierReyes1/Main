public class Car extends RoadVehicle implements ImportDuty{
	private String carType;
 
	public Car() {
	 	this("Unknown", 0, 0);
	 	}

	//	(Car type, wheel, passenger)
	
	public Car(String c, int w, int p) { 
		super(w, p,"Car");
		setCarType(c);
	}
 
	public void setCarType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

	public double calculateDuty(){
		return (double) getPass() * getWheels() * CARTAXRATE;
	}

	@Override
	public String toString(){
		return "Car type: " + carType
			+"\n" + super.toString()
			+ "\nTotal import cost: " + String.format("%.2f", calculateDuty());
	}


}//end class


