public class Driver
{
	public static void main(String[]args)
	{
//public CD(String ID, int numOfDays, double pricePerDay, String band, String title, int numTracks)
//public Book(String ID, int numOfDays, double pricePerDay, String author, String title, int numPages){//Constructor num 1ibraryItem [] items = new LibraryItem[4];
		LibraryItem [] items = new LibraryItem[4];
		items[0] = new CD();
		items[1] = new CD("X213", 2, 2.4, "Guns & Roses", "Welcome to the jungle", 8);
		items[2] = new Book();
		items[3] = new Book("X342", 4, 1.7, "O'Riely", "Head First Java", 670);

		for(LibraryItem item : items){//This is an advance loop called for each loop. I create a reference variable item, "item" then is assigned to EACH item in the array
			System.out.println(item);
			System.out.println("-----------------------------------");
		}

	}//end main
}
