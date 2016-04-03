package DataAccess;

import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class MockDatabaseMFlight implements IDataBaseMFlight {
	
	
	@Override
	public Flight getFlight(String flightId) {
		// TODO Auto-generated method stub
		
		if (flightId == "123456")
		{
			Date departure = new Date();
			Date arrive = new Date();
			Plane plane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
			Airport toAirport = new Airport(101, "Reykjav�kur Flugv�llur", "Iceland", "Reykjav�k");
			Airport fromAirport = new Airport(900, "Flugv�llur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
			Airport[] airports = {fromAirport, toAirport};
			int[] customers = {1,2,3,4,5,6,7,8,9,10}; 
			double price = 1000.00;
			
			Flight mockFlight = new Flight(flightId, departure, arrive, plane, airports, customers, price);
			
			return mockFlight;
		}
		else 
		{
			return null;
		}
		
	}

	@Override
	public Airport getAirport(int airportId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(int CostumerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plane getPlane(int planeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFlight(int flightId, Date arrive, Date departure, Plane plane, Airport[] airport, String[] ToFrom,
			Double price, int[] costumerId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setAirport(int airportId, String city, String country, String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setCustomer(int costumerId, String name, int Age, int SSN) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPlane(int planeId, String planeType, String seats) {
		// TODO Auto-generated method stub
	}

	@Override
	public String orderFlight(String FlightId, String CustomerId) {
		// TODO Auto-generated method stub
		return "Success";
	}	
}