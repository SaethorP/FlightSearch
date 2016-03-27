package DataAccess;
import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;


public interface IDataBaseMFlight {
	
	public Flight getFlight(int flightId);
	public Airport getAirport(int airportId);
	public Customer getCustomer(int CostumerId);
	public Plane getPlane(int planeId);
	
	void setFlight(int flightId, Date arrive, Date departure, Plane plane, Airport[] airport, String[] ToFrom, Double price, int[] costumerId);
	void setAirport(int airportId, String city, String country, String name);
	void setCustomer(int costumerId, String name, int Age, int SSN);
	void setPlane(int planeId, String planeType, String seats);
	
}