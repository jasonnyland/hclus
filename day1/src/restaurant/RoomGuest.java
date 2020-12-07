package restaurant;

public class RoomGuest {
	
	
	public static void main(String[] args) {
		
		RoomService roomService=new RoomService(new IndianKitchen());
		
		System.out.println(roomService.takeOrder("Dosa"));
		
		RoomService roomService2=new RoomService(new AmericanKitchen());
		System.out.println(roomService2.takeOrder("Fries"));
	}

}
