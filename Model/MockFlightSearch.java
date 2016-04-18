package Model;

import java.util.List;

import Entities.Customer;
import Entities.Flight;

public class MockFlightSearch implements IFlightSearch {

	Flight mockFlight = null; 
	
	@Override
	public Flight getFlightById(String flightId) {
		
		if (flightId.length() != 6){ return null; };
		
		if (flightId.length() == 6 && flightId == "123456")
		{
//			Date departure = new Date();
//			Date arrive = new Date();
//			Plane plane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
//			Airport toAirport = new Airport(101, "Reykjavíkur Flugvöllur", "Iceland", "Reykjavík");
//			Airport fromAirport = new Airport(900, "Flugvöllur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
//			Airport[] airports = {fromAirport, toAirport};
//			int[] customers = {1,2,3,4,5,6,7,8,9,10}; 
//			double price = 1000.00;
			
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
	public Flight[] getFlightsById(String[] flightIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] getFlightsByCostumerId(int costumerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlightsBy(String from) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlightsBy(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlightsBy(String from, String to, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String orderFlight(Customer costumer, int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seeMyFlights(Customer costumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelFlight(Customer costumer, Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editFlight(Customer costumer, Flight flight, boolean extraLuggage) {
		// TODO Auto-generated method stub
		
	}


	

}
