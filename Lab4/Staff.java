public class Staff extends Employee {
	public Staff(Address address, Office office, String employeeType) {
		super(address, office, "Staff");
	}

	public String getEmployeeType() {
		return employeeType;
	}
}
