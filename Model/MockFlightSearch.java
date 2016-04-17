package Model;

import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class MockFlightSearch implements IFlightSearch {

	Flight mockFlight = null; 
	
	@Override
	public Flight GetFlightById(String flightId) {
		
		if (flightId.length() != 6){ return null; };
		
		if (flightId.length() == 6 && flightId == "123456")
		{
			Date departure = new Date();
			Date arrive = new Date();
			Plane plane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
			Airport toAirport = new Airport(101, "Reykjavíkur Flugvöllur", "Iceland", "Reykjavík");
			Airport fromAirport = new Airport(900, "Flugvöllur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
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
	public Flight[] GetFlightsBy(String from) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] GetFlightsBy(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] GetFlightsBy(String from, String to, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Flight[] GetFlightsById(String[] flightIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] GetFlightsByCostumerId(int costumerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void SeeMyFlights(Customer costumer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CancelFlight(Customer costumer, Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EditFlight(Customer costumer, Flight flight, boolean extraLuggage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String OrderFlight(String costumer, String flight) {
		// TODO Auto-generated method stub
		return null;
	}

}
