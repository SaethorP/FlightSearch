package DataAccess;

import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class MockDatabaseMFlight implements IDataBaseMFlight {
	
	private Flight mock = new Flight();
	
	@Override
	public Flight getFlight(int flightId) {
		// TODO Auto-generated method stub
		return null;
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

}
