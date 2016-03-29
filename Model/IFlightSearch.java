package Model;

import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;

public interface IFlightSearch {
	public Flight GetFlightById(int flightId);
	public Flight[] GetFlightsById(int[] flightIds);
	public Flight[] GetFlightsByCostumerId(int costumerId);
	
	public int[] GetFlightsIds(Date time );
	public int[] GetFlightsIds(int price );
	public int[] GetFlightsIds(String destination );
	
	public int[] GetFlightsIds(Date time, int price );
	public int[] GetFlightsIds(Date time, int price, String destination);
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport);

	void OrderFlight(Customer costumer, Flight flight);
	void SeeMyFlights(Customer costumer);
	void CancelFlight(Customer costumer, Flight flight);
	void EditFlight(Customer costumer, Flight flight, boolean extraLuggage );
}
