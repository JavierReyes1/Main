import java.text.DecimalFormat;

public class SavingsAccount {
	final DecimalFormat decimal = new DecimalFormat("#.00");
	private int uniqueNumber;
	private double savingBalance;
	static double annualInterestRate = 0.04;
	static int uniqueNumberCount = 1;

	public SavingsAccount() {
		this.uniqueNumber = uniqueNumberCount;
		uniqueNumberCount++;
	}

	public SavingsAccount(double savingBalance) {
		if (savingBalance < 0) {
			throw new IllegalArgumentException("Enter a valid number");
		}
		this.savingBalance = savingBalance;
		this.uniqueNumber = uniqueNumberCount;
		uniqueNumberCount++;
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

	@Override
	public String toString() {
		return "[Account number: " + uniqueNumber
				+ ", Balance: " + getSavingsBalance() + "]";
	}
}
