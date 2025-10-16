import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address[] addresses = new Address[5];
		Employee[] employees = new Employee[5];
		Office[] offices = new Office[3];
		int addressCount = 0;
		int employeeCount = 0;
		// create 3 offices
		offices[0] = new Office();
		offices[1] = new Office();
		offices[2] = new Office();
		// user can create up to 5 employee records
		System.out.println("\nWelcome to MyHr");
		boolean menu = false;
		while (!menu) {
			System.out.println("----------------------------------------------------------");
			System.out.println("\n1.Create an Employee");
			System.out.println("2.Display the record of a single employee");
			System.out.println("3.Display the record of all employees");
			System.out.println("4.Display the records of employees of an office");
			System.out.println("5.Exit");
			System.out.println("----------------------------------------------------------");
			System.out.print("\nEnter an option: ");
			int caseValue = sc.nextInt();
			boolean officeMenu = false;
			sc.nextLine();
			switch (caseValue) {

				case 1:
					if (employeeCount >= 5) {
						System.out.println("You have reached the employee limit");
						break;
					}
					System.out.print("Enter the name of the Employee:");
					String name = sc.nextLine();
					System.out.println("Enter the employee's address");
					System.out.print("Street: ");
					String street = sc.nextLine();
					System.out.print("City/town: ");
					String city = sc.nextLine();
					System.out.print("County: ");
					String county = sc.nextLine();
					addresses[addressCount] = new Address(street, city, county);
					// make sure to add choose an office
					int officeOption = 0;
					while (!officeMenu) {
						System.out.println("\nAssign employee to an office: ");
						System.out.println("\n1. Office 100 \n2. Office 101 \n3. Office 102");
						System.out.print("Enter option: ");
						officeOption = sc.nextInt() - 1;
						sc.nextLine();
						if (officeOption >= 0 || officeOption < 2) {
							if (offices[officeOption].getNumOfEmployee() >= 2) {
								System.out.println(
										"Too many employees are assigned to this office, choose a different office.");
							} else {
								officeMenu = true;
							}
						} else {
							System.out.println("Enter a number from 1 to 3");
						}
					}
					officeMenu = false;
					int staffOrManagerNum = 0;
					while (!officeMenu) {
						System.out.println(
								"\nChoose the type of Employee\nEnter 1 for Staff\nEnter 2 for Manager ");
						System.out.print("--> ");
						staffOrManagerNum = sc.nextInt();
						sc.nextLine();
						if (staffOrManagerNum == 1) {
							employees[employeeCount] = new Staff(name,
									addresses[addressCount],
									offices[officeOption]);
							offices[officeOption].addEmployee(employees[employeeCount]);
							officeMenu = true;
						} else if (staffOrManagerNum == 2) {
							employees[employeeCount] = new Manager(name,
									addresses[addressCount],
									offices[officeOption]);
							offices[officeOption].addEmployee(employees[employeeCount]);
							officeMenu = true;
						} else {
							System.out.println("Enter either 1 or 2");
						}
					}
					employeeCount++;
					addressCount++;
					break;
				case 2:
					officeMenu = false;
					while (!officeMenu) {
						System.out.println("\nChoose who's information to display: ");
						for (int i = 0; i < employeeCount; i++) {
							System.out.println((i + 1) + ". " + employees[i].getName());
						}
						System.out.print("Enter a number: ");
						int numberOption = sc.nextInt() - 1;
						sc.nextLine();
						if (numberOption >= 0 && numberOption < employeeCount) {
							System.out.println(employees[numberOption].toString());
							officeMenu = true;
						} else {
							System.out.println("Wrong number");
						}
					}
					break;
				case 3:
					for (int i = 0; i < employeeCount; i++) {
						System.out.println("\n" + employees[i].toString());
					}
					break;
				case 4:
					officeMenu = false;
					while (!officeMenu) {
						System.out.println(
								"Enter the office who's employees records you want to see");
						System.out.println("\n1. Office 100 \n2. Office 101 \n3. Office 102");
						System.out.print("Enter an option: ");
						officeOption = sc.nextInt() - 1;
						sc.nextLine();
						if (officeOption >= 0 && officeOption < 3) {
							System.out.println(offices[officeOption].toString());
							offices[officeOption].display();
							officeMenu = true;
						} else {
							System.out.println("Enter a number from 1 to 3");
						}
					}
					break;
				case 5:
					System.out.println("Good bye!\n\n");
					menu = true;
					break;
				default:
					System.out.println("Enter a number from 1 to 5");
			}
		}

	}
}
