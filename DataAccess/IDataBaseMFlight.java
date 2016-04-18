package DataAccess;
import java.util.Date;
import java.util.List;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;


public interface IDataBaseMFlight {
	
	public Flight getFlight(String flightId);
	public Airport getAirport(int airportId);
	public Customer getCustomer(int CostumerId);
	public Plane getPlane(int planeId);
	
	public List<Flight> getFlights(String from);
	public List<Flight> getFlights(String from, String to);
	public List<Flight> getFlights(String from, String to, String date);
	
	
//	void setFlight(int flightId, Date arrive, Date departure, Plane plane, Airport[] airport, String[] ToFrom, Double price, int[] costumerId);
//	void setAirport(int airportId, String city, String country, String name);
//	void setCustomer(int costumerId, String name, int Age, int SSN);
//	void setPlane(int planeId, String planeType, String seats);
	
	String orderFlight(Customer customer, int FlightId);
	
}
