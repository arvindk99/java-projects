public class Ship {
	
	//private bool floating;
	private float capacity, length, width, height;
	private String name, origin, floating, departingport, arrivalport, owner, departuredate, arrivaldate;
		
	//SETTERS
	public void setCapacity(float capacity) 
	{
		this.capacity = capacity;
	}
	
	public void setLength(float length)
	{
		this.length = length;
	}
	
	public void setWidth(float width)
	{
		this.width = width;
	}
	
	public void setHeight(float height)
	{
		this.height = height;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}
	
	public void setFloating(String floating)
	{
		this.floating = floating;
	}
	
	public void setDepartingPort(String departingport)
	{
		this.departingport = departingport;
	}
	
	public void setArrivalPort(String arrivalport)
	{
		this.arrivalport = arrivalport;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public void setDepartureDate(String departuredate)
	{
		this.departuredate = departuredate;
	}
	
	public void setArrivalDate(String arrivaldate)
	{
		this.arrivaldate = arrivaldate;
	}
	
	
	//GETTERs
	public float getCapacity()
	{
		return capacity;
	}
	
	public float getLength()
	{
		return length;
	}
	
	public float getWidth()
	{
		return width;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getOrigin()
	{
		return origin;
	}
	
	public String getFloating()
	{
		return floating;
	}
	
	public String getDepartingPort()
	{
		return departingport;
	}
	
	public String getArrivalPort()
	{
		return arrivalport;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public String getDepartureDate()
	{
		return departuredate;
	}
	
	public String getArrivalDate()
	{
		return arrivaldate;
	}
	
	public void printShips() {
		System.out.printf("Floating: %s\n"
				+ "Name: %s\n"
				+ "Origin: %s\n"
				+ "Departing Port: %s\n"
				+ "Arrival Port: %s\n"
				+ "Owner: %s\n"
				+ "Departure Date: %s\n"
				+ "Arrival Date: %s\n"
				+ "Capacity: %.2f\n"
				+ "Length: %.2f\n"
				+ "Width: %.2f\n"
				+ "Height: %.2f\n",floating, name, origin, departingport, arrivalport, 
				owner, departuredate, arrivaldate, capacity, length, width, height);
	}

	
	
}
