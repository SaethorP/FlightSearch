package Model;
import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;

public class FlightSearch {
	public void GetFlightById(int flightId) {}
	public void GetFlightsById(int[] flightIds) {}
	public void GetFlightsByCostumerId(int costumerId) {}
	
	public int[] GetFlightsIds(Date time ) { return new int[0]; }
	public int[] GetFlightsIds(int price ) { return new int[0];}
	public int[] GetFlightsIds(String destination ) { return new int[0]; }
	
	public int[] GetFlightsIds(Date time, int price ) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport) { return new int[0]; }

	void OrderFlight(Customer costumer, Flight flight)
	{
		
	}
	
	void SeeMyFlights(Customer costumer)
	{
		
	}
	
	void CancelFlight(Customer costumer, Flight flight)
	{
		
	}
	
	void EditFlight(Customer costumer, Flight flight, boolean extraLuggage )
	{
		
	}
	
	//Testing area for the class. 
	public static void main(String[] args)
	{
		
	}
	
}
