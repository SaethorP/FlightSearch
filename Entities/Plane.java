package Entities;

public class Plane {
	
	private int _planeId; 
	private String _planeType; 
	private String _seats; 
	
	// Default Constructor
	public Plane()
	{
		_planeId = 999;
		_planeType = "HITLER";
		_seats = "";  		
	}
	
	// Custom Constructor. 
	public Plane(int id, String type, String saets)
	{
		_planeId = id;
		_planeType = type;
		_seats = saets; //Default er 50 raðir og 6 sæti í röð. 	
	}
	
	
	// Methods for Plane class
	
	// Getters for Planes
	public int GetPlaneId()
	{
		return _planeId;
	}
	
	public String GetPlaneType()
	{
		return _planeType;
	}
	
	public String GetPlaneSeats()
	{
		return _seats;
	}
	
	public void SetPlaneId(int id)
	{
		_planeId = id;
	}
	
	public void SetPlaneType(String type)
	{
		_planeType = type;
	}
	
	public void SetPlaneSeats(int seatNr, int seatRow, boolean occupied)
	{
		
	}
	
	public int GetSeatCount()
	{
		int count = 0; 
		
		return count;
		
	}
	
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}

}
