import java.util.Scanner;

public class HashMap{

	private Scanner sc = new Scanner(System.in);
	int[]hashTable = new int[20];

	public HashMap(){
		
	}//end constructor 1
	
	public void start()
	{
		System.out.println("Welcome to the hash table program");
		int choice = 0;
		do{
				System.out.println(); 
				System.out.println(); 
				System.out.println(); 
				System.out.print("Enter an option: "); 				
				choice = sc.nextInt();
				switch(choice)
						{
//							case 1 -> hashFunction();
						}
				sc.nextLine();
		}while(choice != 0);

	}//end Start
	
	private void fooHashTable()//Insert names, turn them into ascii and put them into an array
			{
				for(int i = 0; i < 20; i++)
						{
							System.out.println("Enter a name");
							String name = sc.nextLine();
							this.hashTable[hashFunction(getAsciiValue(name))] = getAsciiValue(name);
						}
			}

	private int getAsciiValue(String name)//Get ascii value 
		{
			int asciiName = 0;
			for(int i = 0; i < name.length(); i++)
				{
					asciiName += name.charAt(i);
				}
			return asciiName;
		}

	private int hashFunction(int asciiName)//Calculate index number
		{
			return asciiName % 20; 
		}


}//end HashMap class 
