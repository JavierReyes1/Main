public class HotelRoom{

	//--------------------Private Variables----------------------//

	private int roomNumber;
	private String roomType;
	private double rate;
	private int isOccupied;
	private boolean vacancy;
	//-------------------Constructors-----------------------//

	public HotelRoom(){}

	public HotelRoom(int roomNumber, String roomType, int isOccupied, double rate){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.isOccupied = isOccupied;
		this.rate = rate;
	}
	
	//---------------- Room Number --------------------//

	public int getRoomNumber(){
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	//------------------Room Type------------------------//
	
	public String getRoomType(){
		return roomType;
	}
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}

	//------------------- Rate -----------------------//

	public double getRate(){return rate;}
	public void setRate(double rate){
		this.rate = rate;
	}

	//--------------------Is Occupied----------------------//

	public String getIsOccupied(){
		if(isOccupied == 1){
			return "Occupied"; 
		}
		return "Not Occupied";
		
	}
	public void setIsOccupied(int isOccupied){
		this.isOccupied = isOccupied;
	}

	public boolean isOccupied(){
		if(isOccupied == 1){
			return true; 
		}
		return false;
	}

}
