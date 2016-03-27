package DataAccess;
import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class DatabaseMFlight implements IDataBaseMFlight {
	
	IDataBaseMFlight manager; 

	public IDataBaseMFlight getManager() {
		return manager;
	}

	public void setManager(IDataBaseMFlight manager) {
		this.manager = manager;
	}
	
	@Override
	public Flight getFlight(int flightId) {
		// TODO Auto-generated method stub
		return manager.getFlight(flightId);
	}

	@Override
	public Airport getAirport(int airportId) {
		// TODO Auto-generated method stub
		return manager.getAirport(airportId);
	}

	@Override
	public Customer getCustomer(int CostumerId) {
		// TODO Auto-generated method stub
		return manager.getCustomer(CostumerId);
	}

	@Override
	public Plane getPlane(int planeId) {
		// TODO Auto-generated method stub
		return manager.getPlane(planeId);
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
