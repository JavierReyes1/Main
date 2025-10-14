abstract public class Employee {
	static int employeeNumberGenerator = 1000;
	private int employeeNumber;
	private Address address;
	private String employeeType;
	private Office[] offices = new Office[3];
	private int officeNumber = 0;
	// private Car companyCar;

	public Employee(Address address, Office office, String employeeType) {
		if (address == null || office == null) {
			throw new IllegalArgumentException("Enter a valid address and office");
		}
		this.address = address;
		this.employeeType = employeeType;
		this.employeeNumber = employeeNumberGenerator;
		this.offices[officeNumber] = office;
		officeNumber++;
		employeeNumberGenerator++;
	}

	public String getAddress() {
		return address.toString();
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	abstract public String getEmployeeType();

	public void setAddress(String street, String city, String county) {
		this.address = new Address(street, city, county);
	}

	public void setOffice(Office office) {
		if (office == null) {
			throw new IllegalArgumentException("Enter a valid office");
		}
		if (officeNumber >= 3) {
			throw new IllegalArgumentException("Offices for this employee has reached it's limit");
		} else {
			this.offices[officeNumber] = office;
		}
	}

	public String toString() {
		return "[Employee number: " + employeeNumber
				+ "\nEmployee Address: " + getAddress()
				+ "\nEmployee Office(s): ";

	}
}// end employee class
