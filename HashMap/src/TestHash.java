import java.util.Scanner;
public class TestHash
{
	public static int getAscii(String name)
			{
				int hash = 0;
				for(int i = 0; i < name.length(); i++)
						{
							hash += name.charAt(i);
						}
				return hash;
			}

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		for(int i = 0; i < name.length(); i++)
				{
					char character = name.charAt(i);
					int hash = character;
					System.out.println("Ascii letter '" + character + "' is: " + hash);
				}
		System.out.println(getAscii(name));
	}

}

