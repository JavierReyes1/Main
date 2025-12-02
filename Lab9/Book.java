public class Book extends LibraryItem implements LoanItem
{
	private String author;
	private String title;
	private int numPages;

	public Book()
	{
		this("Unknown ID", 1, 1.5, "Unknown author", "Unknown title", 50);
	}

	public Book(String ID, int numOfDays, double pricePerDay, String author, String title, int numPages){//Constructor num 1
		super("Book", ID, numOfDays, pricePerDay);
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}
	
	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	public int getNumPages(){
		return numPages;
	}
	public double calculatePrice(){
		return (double)getPricePerDay() * getNumOfDays();
	}

	@Override
	public String toString(){
		return super.toString()
			+"\nTitle: " + title
			+"\nAuthor: " + author
			+"\nNumber of pages: " + numPages
			+"\nTotal : " + calculatePrice() + "€";
	}

}//end class


