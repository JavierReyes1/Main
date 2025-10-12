import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestTest {
	public static void main(String[] args) {
		final DecimalFormat decimal = new DecimalFormat("#.00");
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		System.out.println("\nAnnual Interest is set to 4%");
		System.out.println("\nSaver 1 current balance: " + decimal.format(saver1.getSavingsBalance()));
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1 balance after interest " + decimal.format(saver1.getSavingsBalance()));

		System.out.println();

		System.out.println("\nSaver 2 current balance: " + saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 balance after interest " + decimal.format(saver2.getSavingsBalance()));

		System.out.println("\nAnnual Interest is set to 5%\n");
		SavingsAccount.setAnnualInterest();

		System.out.println("\nSaver 1 current balance: " + decimal.format(saver1.getSavingsBalance()));
		System.out.print("Saver 1 ");
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1 balance after interest " + decimal.format(saver1.getSavingsBalance()));

		System.out.println("\nSaver 2 current balance: " + decimal.format(saver2.getSavingsBalance()));
		System.out.print("Saver 2 ");
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2 balance after interest " + decimal.format(saver2.getSavingsBalance()));

	}
}
