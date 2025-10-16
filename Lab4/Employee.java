abstract public class Employee {
	static int employeeNumberGenerator = 1000;
	private String name;
	private int employeeNumber;
	private Address address;
	private String employeeType;
	private Office[] offices = new Office[3];
	private String officeNumberCombined;
	private int officeCount = 0;
	// private Car companyCar;

	public Employee(String name, Address address, Office office, String employeeType) {
		if (address == null || office == null) {
			throw new IllegalArgumentException("Enter a valid address and office");
		}
		if (name == null || employeeType == null || name.isEmpty() || employeeType.isEmpty()) {
			throw new IllegalArgumentException("Enter a valid name or employee type");
		}
		this.name = name;
		this.address = address;
		this.employeeType = employeeType;
		this.employeeNumber = employeeNumberGenerator;
		this.offices[officeCount] = office;
		officeCount++;
		employeeNumberGenerator++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Enter a valid name");
		}
		this.name = name;
	}

	public String getAddress() {
		return address.toString();
	}

	public void setOfficeNumberCombined() {
		this.officeNumberCombined = " ";
		for (int i = 0; i < officeCount; i++) {
			System.out.println(this.officeNumberCombined += String.valueOf(offices[i].getOfficeNumber())
					+ " ");
		}
	}

	public int getOfficeNumber() {
		return offices[0].getOfficeNumber();
	}

	public String getOfficeNumberCombined() {
		return officeNumberCombined;
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
		if (officeCount >= 3) {
			throw new IllegalArgumentException("Offices for this employee has reached it's limit");
		} else {
			this.offices[officeCount] = office;
		}
	}

	public String toString() {
		return "Employee number: " + employeeNumber
				+ "\nEmployee Name: " + name
				+ "\nEmployee Address: " + getAddress()
				+ "\nEmployee Office(s): " + getOfficeNumber();

	}
}// end employee class
