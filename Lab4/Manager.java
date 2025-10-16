public class Manager extends Employee {
	private Car companyCar;

	public Manager(String name, Address address, Office office) {
		super(name, address, office, "Manager");
		companyCar = new Car();
	}

	public String getEmployeeType() {
		return "Manager";
	}

	public String toString() {
		return super.toString() + "\nEmployee Type: " + getEmployeeType() + "\nCar Details: "
				+ companyCar.toString();
	}
}
