public class HGV extends RoadVehicle implements ImportDuty{
	private int cargo;

	public HGV(){ 	
		this(0,0,0);	
	}

//	} (Cargo, wheel, passenger)
	public HGV(int c, int w, int p){ 
		super(w, p,"HGV");
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	
	public double calculateDuty(){
		return (double)cargo * getWheels() * getPass() * HGVTAXRATE; 
	}

	@Override
	public String toString(){
		return super.toString()
			+ "\nCargo: " + cargo
			+ "\nTotal import cost: " + String.format("%.2f", calculateDuty());
	}


} 
