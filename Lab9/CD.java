public class CD extends LibraryItem implements LoanItem
{
	private String band;
	private String title;
	private int numTracks;
	
	public CD(){
		//this(type, ID, numOfDays, pricePerDay, Band, title, numTracks)
		this("Unknown ID", 1, 1.5, "Unknown band", "Unknown title", 0);
	}

	public CD(String ID, int numOfDays, double pricePerDay, String band, String title, int numTracks){
		super("CD", ID, numOfDays, pricePerDay);
		this.band = band;
		this.title = title;
		this.numTracks = numTracks;
	}


	public String getTitle(){
		return title;
	}

	public int getNumOfTracks(){
		return numTracks;
	}

	public double calculatePrice(){
		return (double)getNumOfDays() * getPricePerDay();
	}

	@Override
	public String toString(){
		return super.toString()  
			+ "\nBand: " + band
			+ "\nTitle: " + title
			+ "\nNumber of Tracks: " + numTracks
			+ "\nTotal: " + calculatePrice() + "€";
	}

}


