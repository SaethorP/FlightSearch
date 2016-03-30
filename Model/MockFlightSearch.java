package Model;

import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;

public class MockFlightSearch implements IFlightSearch {

	private Flight mock = new Flight();
	
	@Override
	public Flight GetFlightById(int flightId) {
		// TODO Auto-generated method stub
		return mock;
	}

	@Override
	public Flight[] GetFlightsById(int[] flightIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] GetFlightsByCostumerId(int costumerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(Date time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(Date time, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(Date time, int price, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void OrderFlight(Customer costumer, Flight flight) {
		// TODO Auto-generated method stub
		
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

}
