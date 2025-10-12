public class BankCustomer {
	private String name;
	private String address;
	private SavingsAccount[] accounts = new SavingsAccount[3];
	private int accountNumber = 0;

	public BankCustomer(String name, String address) {
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Enter a valid name");
		}
		this.name = name;
		if (address.isEmpty() || address == null) {
			throw new IllegalArgumentException("Enter a valid address");
		}
		this.address = address;
	}

	public void addAccount(SavingsAccount s) {
		if (accountNumber > 3) {
			throw new IllegalArgumentException("You have too many accounts");
		}
		accounts[accountNumber] = s;
		accountNumber++;
	}

	public double getBalance() {
		int total = 0;
		for (int i = 0; i < accountNumber; i++) {
			total += accounts[i].getSavingsBalance();
		}
		return total;
	}

	public int getNumberOfAccounts() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return "[Name: " + getName() + ", Address: " + getAddress() + ", \nAccount 1: " + accounts[0].toString()
				+ "\nAccount 2: " + accounts[1].toString()
				+ "\nAccount 3: " + accounts[2].toString() + "\nTotal: " + getBalance();

	}

}// end class
