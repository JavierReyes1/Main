public class Staff extends Employee {
	public Staff(String name, Address address, Office office) {
		super(name, address, office, "Staff");
	}

	public String getEmployeeType() {
		return "Staff";
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee Type: " + getEmployeeType();
	}
}
