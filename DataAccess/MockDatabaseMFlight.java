package DataAccess;

import java.util.Date;
import java.util.List;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class MockDatabaseMFlight implements IDataBaseMFlight {
	
	
	@Override
	public List<Flight> getFlights(String from) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlights(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlights(String from, String to, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlight(String flightId) {
		// TODO Auto-generated method stub
		
		if (flightId == "123456")
		{
			Date departure = new Date();
			Date arrive = new Date();
			Plane plane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
			Airport toAirport = new Airport(101, "Reykjavíkur Flugvöllur", "Iceland", "Reykjavík");
			Airport fromAirport = new Airport(900, "Flugvöllur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
			Airport[] airports = {fromAirport, toAirport};
			int[] customers = {1,2,3,4,5,6,7,8,9,10}; 
			double price = 1000.00;
			
			
			// String departure, String to, String from, int emptyseats, double price
			Flight mockFlight = new Flight();
			
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
	public String orderFlight(String FlightId, String CustomerId) {
		// TODO Auto-generated method stub
		return "Success";
	}	
}
