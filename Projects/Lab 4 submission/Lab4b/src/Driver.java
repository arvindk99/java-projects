
public class Driver {
	
	public static void main(String[] args) {
		
	private String[] services = new String[3];
	services[0] = "tennis";
	services[1] = "gym";
	services[2] = "rock climbing";
	
	
	Ship[] ships = new Ship[5];
	ships[0] = new Ship("Titanic", "New York", "London", "White Star Line", "2/1/1912", "3/1/1912", 145.78, 567.2, 312.90, 50.10);
	ships[1] = new CruiseShip(312.67, "Salad", "4 days", 500, services);
	ships[2] = new CargoShip("Computers", "Craines", "Humvees", 20, 4500.78);
	
	
	System.out.printf("::All ships::");
	for(int i= 0; i<ships.length; i++)
	{
		ships[i].printShips();
	}

}
}

