public class Driver{
	public static void main(String[]args){
		RoadVehicle [] vehicles = new RoadVehicle[4];
		vehicles[0] = new HGV();
		vehicles[1] = new HGV(12, 8, 2);//	} (Cargo, wheel, passenger)
		vehicles[2] = new Car();
		vehicles[3] = new Car("Sedan", 4, 5);

		for(RoadVehicle vehicle : vehicles)
		{
			System.out.println(vehicle);
			System.out.println("--------------------------");
		}

	}//end main

}//end Driver


