package Entities;
import java.util.Date;


public class Flight {
	
	//Variables that start with _varible are private variables. 
	private Date _departure;
	private String _to; 
	private String _from;
	private double _price;
	private int _emptyseats;
	
	//Default constructor
	public Flight(){
 
		_departure = new Date();   
		_to = "Akureyri";
		_from = "Reykjavik";
		_price = 100;
		_emptyseats = 10;
		
	}
	
	
	public Flight(Date departure, String to, String from, int emptyseats, double price)
	{
		_departure = departure;  
		_to = to;
		_from = from;
		_emptyseats = emptyseats;
		_price = price;
	}
	
	// Getters and setters for flight.
	
	public Date getDepartureDate(){ return _departure; }
	public String getWhereTo(){ return _to; }
	public String getWhereFrom(){ return _from; }
	public double GetPrice(){ return _price; }
	public int getemptyseats(){return _emptyseats;}
	
	public void setDepartureDate(Date departure){ _departure = departure; }
	public void setWhereTo(String to){ _to = to; }
	public void setWhereFrom(String from){ _from = from;}
	public void setPrice(double price){ _price = price;}
	public void setEmptyseats(int emptyseats){ _emptyseats = emptyseats;}
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
		
	}
	
}
