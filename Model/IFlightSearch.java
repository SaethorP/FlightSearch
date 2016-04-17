package Model;

import java.util.Date;
import java.util.List;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;

public interface IFlightSearch {
	public Flight 	GetFlightById(String flightId);
	public Flight[] GetFlightsById(String[] flightIds);
	public Flight[] GetFlightsByCostumerId(int costumerId);
	
	public List<Flight> GetFlightsBy(String from);
	public List<Flight> GetFlightsBy(String from, String to);
	public List<Flight> GetFlightsBy(String from, String to, String date);
	
	
//	public int[] GetFlightsIds(Date time );
//	public int[] GetFlightsIds(int price );
//	public int[] GetFlightsIds(String destination );
//	
//	public int[] GetFlightsIds(Date time, int price );
//	public int[] GetFlightsIds(Date time, int price, String destination);
//	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport);

	String OrderFlight(String costumerId, String flightId);
	void SeeMyFlights(Customer costumer);
	void CancelFlight(Customer costumer, Flight flight);
	void EditFlight(Customer costumer, Flight flight, boolean extraLuggage );
}
