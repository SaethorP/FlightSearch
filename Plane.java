
public class Plane {
	
	private int planeId; 
	private String planeType; 
	private boolean[][] seats; 
	
	// Default Constructor
	Plane()
	{
		planeId = 999;
		planeType = "HITLER";
		seats = new boolean[50][6]; //Default er 50 raðir og 6 sæti í röð. 		
	}
	
	// Custom Constructor. 
	Plane(int id, String type, boolean[][] saets)
	{
		planeId = id;
		planeType = type;
		seats = saets; //Default er 50 raðir og 6 sæti í röð. 	
	}
	
	
	// Methods for Plane class
	
	// Getters for Planes
	int GetPlaneId()
	{
		return planeId;
	}
	
	String GetPlaneType()
	{
		return planeType;
	}
	
	boolean[][] GetPlaneSeats()
	{
		return seats;
	}
	
	void SetPlaneId(int id)
	{
		planeId = id;
	}
	
	void SetPlaneType(String type)
	{
		planeType = type;
	}
	
	void SetPlaneSeats(int seatNr, int seatRow, boolean occupied)
	{
		
	}
	
	int GetSeatCount()
	{
		int count = 0; 
		
		return count;
		
	}
	
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}

}
