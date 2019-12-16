
public class CargoShip extends Ship {
	
	private String cargotype, loadingmethod, contraband;
	private int numberofcranes;
	private float cargovalue;
	
	
	
	public CargoShip(String cargotype, int numberofcranes, 
			String loadingmethod, float cargovalue, String contraband)
	{
		//super();
		this.cargotype = cargotype;
		this.loadingmethod = loadingmethod;
		this.contraband = contraband;
		this.numberofcranes = numberofcranes;
		this.cargovalue = cargovalue;
	}
	
	public void printShips()
	{
		System.out.printf("Name: %s\n"
				+ "Cargo Type: %s\n"
				+ "Loading Method: %s\n"
				+ "Contraband: %s\n"
				+ "Number of Cranes: %d\n"
				+ "Cargo Value: %.2f", cargotype, loadingmethod, contraband, numberofcranes, cargovalue);
		
	}
	
}
