import java.util.Scanner;
public class Tester2b{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length: ");
		int length = sc.nextInt();
		System.out.print("Enter the width: ");
		int width = sc.nextInt();

		Rectangle myRectangle = new Rectangle(length, width);
		System.out.println(myRectangle);
		myRectangle.printRectangle(length, width);
	}
}