public class Tester{
	
	/*	private int roomNumber;
		private String roomType;
		public HotelRoom(int roomNumber, String roomType, boolean isOccupied, double rate)*/

	public static void main(String[] args) {
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);

		roomA.setRoomType("Single");
		roomA.setRoomNumber(200);
		roomA.setRate(100);
		roomA.setIsOccupied(1); //Change 0 for vacant, 1 for not vacant 

		roomB.setRoomType("Double");
		roomB.setRoomNumber(201);
		roomB.setRate(80);
		roomB.setIsOccupied(0);	//Change 0 for vacant, 1 for not vacant 

		System.out.println("Room number is " + roomA.getRoomNumber() + ", type is " + roomA.getRoomType() + ", the room is " + roomA.getIsOccupied() + ", and the rate is " + roomA.getRate());
		System.out.println("Room number is " + roomB.getRoomNumber() + ", type is " + roomB.getRoomType() + ", the room is " + roomB.getIsOccupied() + ", and the rate is " + roomB.getRate());
		System.out.println("Room number is " + roomC.getRoomNumber() + ", type is " + roomC.getRoomType() + ", the room is " + roomC.getIsOccupied() + ", and the rate is " + roomC.getRate());
		
		if (!roomB.isOccupied()) {
			roomB.setIsOccupied(1);
			System.out.println("Room B Vacant status has been changed to 'Occupied'");
		}else{
			System.out.println("Room B is Occupied");
		}
	}
}