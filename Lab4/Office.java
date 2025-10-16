public class Office {
	private int officeNumber;
	static int officeNumberGenerator = 100;
	private Employee[] employees = new Employee[2];
	private int numOfEmployee = 0;

	public Office() {
		this.officeNumber = officeNumberGenerator;
		officeNumberGenerator++;
	}

	public int getOfficeNumber() {
		return officeNumber;
	}

	public void addEmployee(Employee employee) {
		if (numOfEmployee >= 2) {
			throw new IllegalArgumentException("Too many people in this room");
		} else {
			employees[numOfEmployee] = employee;
			this.numOfEmployee++;
		}
	}

	public int getNumOfEmployee() {
		return numOfEmployee;
	}

	public void display() {
		for (int i = 0; i < numOfEmployee; i++) {
			System.out.println("\n" + employees[i].toString());
		}
	}

	@Override
	public String toString() {
		return "Office number: " + officeNumber
				+ ", Number of Employees: " + numOfEmployee;
	}
}
