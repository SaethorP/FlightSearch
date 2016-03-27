package Entities;
import java.util.Date;


public class Flight {
	
	//Variables that start with _varible are private variables. 
	private int _flightId;
	private Date _arrive;
	private Date _departure;
	private Plane _plane;
	private Airport[] _airports;
	private String _to; 
	private String _from;
	private double _price;
	private int[] _customers;
	
	
	
	Flight(int flightId, Date arrive, Date departure, Plane plane, Airport[] airports, int[] customers)
	{
		_flightId = flightId; 
		_arrive = arrive; 
		_departure = departure; 
		_plane = plane; 
		_airports = airports; 
		_to = airports[1].GetAirportCountry();
		_from = airports[0].GetAirportCountry();
		_customers = customers;
		_price = 0;
	}
	
	// Getters and setters for flight.
	
	public int getFlightId(){	return _flightId; }
	public Date getArriveDate(){	return _arrive; }
	public Date getDepartureDate(){ return _departure; }
	public Plane getPlane(){ return _plane; }
	public Airport[] getAirports(){ return _airports; }
	public String getWhereTo(){ return _to; }
	public String getWhereFrom(){ return _from; }
	public int[] GetCustomers(){ return _customers; }
	public double GetPrice(){ return _price; }
	
	public void setFlightId(int flightId){ _flightId = flightId; }
	public void setArriveDate(Date arrive){_arrive = arrive;}
	public void setDepartureDate(Date departure){ _departure = departure; }
	public void setPlane(Plane plane){ _plane = plane; }
	public void setAirports(Airport[] airports){ _airports = airports; }
	public void setWhereTo(String to){ _to = to; }
	public void setWhereFrom(String from){ _from = from;}
	public void setCostumers(int[] customers){ _customers = customers;}
	public void setPrice(double price){ _price = price;}
	
	public void EditPrice(int price)
	{
		
	}
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
		
	}
	

}
