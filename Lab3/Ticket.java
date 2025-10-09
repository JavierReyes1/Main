package lab3;

public class Ticket {
	
	//Variables
	private static int noticketssold =0; //shared among instances
	private int ticketno; //individual to each object

	//Constructors
	public Ticket() {
		noticketssold++;
		setTicketNo(noticketssold);
	}
	
	//Getters & Setters
	public static int getNoTicketsSold() {
		return noticketssold;
	}
	public static void setNoTicketsSold(int noticketssold) {
		Ticket.noticketssold = noticketssold;
	}
	public int getTicketNo() {
		return ticketno;
	}
	public void setTicketNo(int ticketno) {
		this.ticketno = ticketno;
	}
	
	//Print Object
	public String getInfo() {
		return "ticket # " + ticketno  + ";" + noticketssold + " ticket(s) sold.";
	}

}//end class

