public class Office {
	private int officeNumber;
	static int officeNumberGenerator = 100;
	private Employee[] employees = new Employee[2];
	private int numOfEmployee = 0;

	public Office() {
		this.officeNumber = officeNumberGenerator;
		officeNumber++;
	}

	public int getOfficeNumber() {
		return officeNumber;
	}

	public void addEmployee(Employee employee) {
		if (numOfEmployee >= 2) {
			throw new IllegalArgumentException("Too many people in this room");
		} else {
			employees[numOfEmployee] = employee;
			numOfEmployee++;
		}
	}

	@Override
	public String toString() {
		return "[ Office number: " + officeNumber + ", Number of Employees: " + numOfEmployee;
	}
}
