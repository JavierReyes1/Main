import java.text.DecimalFormat;

public class SavingsAccount {
	final DecimalFormat decimal = new DecimalFormat("#.00");
	static int uniqueNumber = 0;
	private double savingBalance;
	static double annualInterestRate = 0.04;

	public SavingsAccount() {
		uniqueNumber++;
	}

	public SavingsAccount(double savingBalance) {
		if (savingBalance < 0) {
			throw new IllegalArgumentException("Enter a valid number");
		}
		this.savingBalance = savingBalance;
		uniqueNumber++;
	}

	public void calculateMonthlyInterest() {
		double total = savingBalance * annualInterestRate / 12;
		System.out.println("Interest is: " + decimal.format(total));
		savingBalance += total;
	}

	public double getSavingsBalance() {
		return savingBalance;
	}

	static void setAnnualInterest() {
		annualInterestRate = 0.05;
	}

}
