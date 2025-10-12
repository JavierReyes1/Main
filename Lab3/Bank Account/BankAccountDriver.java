public class BankAccountDriver {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer("Javier Reyes", "Carlow 12");
		SavingsAccount customer1Savings1 = new SavingsAccount(2000);
		customer1.addAccount(customer1Savings1);
		System.out.println("Number of Accounts: " + customer1.getNumberOfAccounts());
		System.out.println(customer1.getBalance());

		SavingsAccount customer1Savings2 = new SavingsAccount(5000);
		customer1.addAccount(customer1Savings2);
		System.out.println("Number of Accounts: " + customer1.getNumberOfAccounts());
		System.out.println(customer1.getBalance());

		SavingsAccount customer1Savings3 = new SavingsAccount(5000);
		customer1.addAccount(customer1Savings3);
		System.out.println("Number of Accounts: " + customer1.getNumberOfAccounts());
		System.out.println(customer1.getBalance());

		System.out.println(customer1.toString());
	}// end main

}// end BankAccountDriver
