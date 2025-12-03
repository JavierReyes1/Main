public class RoadVehicle{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
	private String type;		//Vehicle type (Car or HGV)
 
	public RoadVehicle() {
 		this(0,0,"Uknown");	
	}
 
	public RoadVehicle(int w, int p, String t) { 
		setWheels(w);//wheels
		setPass(p);//passenger
		setType(t);//type
	}
 
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}

	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}

	@Override
	public String toString(){
		return 
			"Type: " + type
		+ "\nWheels: " + wheels
		+ "\nPassenger(s): " + passengers;
	}


}
