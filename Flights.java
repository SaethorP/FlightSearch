import java.util.Date;
import java.sql.*;

public class Flights {
	
	private int _flightId;
	private Date _arrave;
	private Date _departure;
	private Plane[] _planes;
	private Airport[] _airports;
	private String _to; 
	private String _from;
	private double _price;
	
	public void GetFlightById(int flightId) {}
	public void GetFlightsById(int[] flightIds) {}
	public void GetFlightsByCostumerId(int costumerId) {}
	
	public int[] GetFlightsIds(Date time ) { return new int[0]; }
	public int[] GetFlightsIds(int price ) { return new int[0];}
	public int[] GetFlightsIds(String destination ) { return new int[0]; }
	
	public int[] GetFlightsIds(Date time, int price ) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport) { return new int[0]; }
	
	
	public void EditPrice(int price)
	{
		
	}
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}
	

}
