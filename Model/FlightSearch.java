package Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccess.IDataBaseMFlight;
import Entities.Airport;
import Entities.Customer;	
import Entities.Flight;
import Entities.Plane;
import FlightTests.ObjectEqualMethods;
import Model.Validate;

public class FlightSearch implements IFlightSearch{
	
	private IDataBaseMFlight manager;
	private Validate validate;

	public FlightSearch(IDataBaseMFlight manager)
	{
		this.manager = manager; 
		this.validate = new Validate();
	}

	
	@Override
	public Flight GetFlightById(String flightId) {
		
		if (flightId.length() != 6 && isNumeric(flightId)){ return null; };
		
		if (flightId.length() == 6)
		{
			return manager.getFlight(flightId);
		}
		else 
		{
			return null;
		}
	}
	

	@Override
	public List<Flight> GetFlightsBy(String from) {
		// TODO Auto-generated method stub
		return GetFlightsBy(from, null, null);
	}

	@Override
	public List<Flight> GetFlightsBy(String from, String to) {
		// TODO Auto-generated method stub
		return GetFlightsBy(from, to, null);
	}

	@Override
	public List<Flight> GetFlightsBy(String from, String to, String date) {
		// TODO Auto-generated method stub
		
		List<Flight> resultFlights = new ArrayList();
		
		if (to == null && date == null)
		{
			boolean check = validate.validateFrom(from);
			
			if (!check) throw new IllegalArgumentException("The argument is not legal.");
			
			resultFlights = manager.getFlights(from);
		} 
		else if (date == null)
		{
			boolean check = validate.validateFrom(from) && validate.validateTo(to);
			
			if (!check) throw new IllegalArgumentException("The argument is not legal.");
			
			resultFlights = manager.getFlights(from, to);
		}
		else 
		{
			resultFlights = manager.getFlights(from, to, date);
		}
		
		
		return resultFlights;
	}

	
	@Override
	public String OrderFlight(String costumerId, String flightId) {
		// TODO Auto-generated method stub
		if (flightId.length() != 6 || !isNumeric(flightId) || flightId == ""){ return null; };
		if (costumerId.length() != 8 || !isNumeric(costumerId) || costumerId == "") { return null; };
		
		if(costumerId != null && flightId != null){return manager.orderFlight(flightId, costumerId);};
		
		return null;
	}

	@Override
	public Flight[] GetFlightsById(String[] flightIds) {
		
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
	
	public boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    int i = Integer.parseInt(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}

	//Testing area for the class. 
	public static void main(String[] args)
	{
		
	}
	
}
