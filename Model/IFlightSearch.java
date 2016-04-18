package Model;

import java.util.Date;
import java.util.List;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;

public interface IFlightSearch {
	public Flight 	getFlightById(String flightId);
	public Flight[] getFlightsById(String[] flightIds);
	public Flight[] getFlightsByCostumerId(int costumerId);
	
	public List<Flight> getFlightsBy(String from);
	public List<Flight> getFlightsBy(String from, String to);
	public List<Flight> getFlightsBy(String from, String to, String date);
	
	String orderFlight(Customer costumer, int flightId);
	
//	public int[] GetFlightsIds(Date time );
//	public int[] GetFlightsIds(int price );
//	public int[] GetFlightsIds(String destination );
//	
//	public int[] GetFlightsIds(Date time, int price );
//	public int[] GetFlightsIds(Date time, int price, String destination);
//	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport);

	void seeMyFlights(Customer costumer);
	void cancelFlight(Customer costumer, Flight flight);
	void editFlight(Customer costumer, Flight flight, boolean extraLuggage );
}
