public class Car {
	private String brand;
	private String type;
	private double engineSize;
	private int milage;

	// for the sake of this Lab, we just assume these are the car's properties
	public Car() {
		this.brand = "Ford";
		this.type = "SUV";
		this.engineSize = 2.2;
		this.milage = 65043;
	}

	// getters and setters
	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public int getMilage() {
		return milage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public void getMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "[Brand: " + brand + " | Type: " + type + " | Engine Size: " + engineSize + " | Milage: "
				+ milage
				+ "]";
	}

}
