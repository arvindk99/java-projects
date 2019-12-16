
public class CruiseShip extends Ship{

	
	private float ticketprice;
	private String buffetmenu, cruisetype;
	private int numberofrooms;
	private String services[];
	
	
	public CruiseShip(float ticketprice, 
			String buffetmenu, String cruisetype, 
			int numberofrooms, String services[])
	{
		this.ticketprice = ticketprice;
		this.buffetmenu = buffetmenu;
		this.cruisetype = cruisetype;
		this.numberofrooms = numberofrooms;
		this.services = services;
		
	}
	
	public void printShips()
	{
		System.out.printf("Name: %s\n"
				+ "Ticket Price: %.2f\n"
				+ "Buffet Menu: %s\n"
				+ "Cruise Type: %s\n"
				+ "Number of Rooms: %d\n"
				+ "Services: %s", ticketprice, buffetmenu, cruisetype, numberofrooms, services);
	}
}
