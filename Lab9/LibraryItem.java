public class LibraryItem //SuperClass
{
	private String type;
	private static String ID;
	//added these two variables so i can implement the abstract method from LoanItem interface
	private int numOfDays;
	private double pricePerDay;

	//Using the keyword this(), I know it's not necessary but I want to practice this implementation

//	public LibraryItem(){//Constructor with no args
//		this("Unknown type", "Unknown ID", 0, 0);
//	}
//
//	public LibraryItem(String type){//Constructor num 4
//		this(type, "Unknown ID", 0, 0);
//	}
//
//	public LibraryItem(String type, String ID){//Constructor num 3
//		this(type, ID, 0, 0);
//	}
//	
//	public LibraryItem(String type, String ID, int numOfDays){//Constructor num 2
//		this(type, ID, numOfDays, 0);
//	}

	public LibraryItem(String type, String ID, int numOfDays, double pricePerDay){//Constructor num 1
		this.type = type;
		this.ID = ID;
		this.numOfDays = numOfDays;
		this.pricePerDay = pricePerDay;
	}

	public String getType(){
		return type;
	}

	public String getID(){
		return ID;
	}

	public int getNumOfDays(){
		return numOfDays;
	}
	public double getPricePerDay(){
		return pricePerDay;
	}

	@Override
	public String toString(){
		return 
			"Type: " + type 
			+ "\nID: " + ID;
	}


}//End LibraryItem




