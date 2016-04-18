package Model;
import java.util.ArrayList;
import java.util.List;
import DataAccess.IDataBaseMFlight;
import Entities.Customer;	
import Entities.Flight;
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
	public Flight getFlightById(String flightId) {
		
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
	public List<Flight> getFlightsBy(String from) {
		// TODO Auto-generated method stub
		return getFlightsBy(from, null, null);
	}

	@Override
	public List<Flight> getFlightsBy(String from, String to) {
		// TODO Auto-generated method stub
		return getFlightsBy(from, to, null);
	}

	@Override
	public List<Flight> getFlightsBy(String from, String to, String date) {
		// TODO Auto-generated method stub
		
		List<Flight> resultFlights = new ArrayList<Flight>();
		
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
	public String orderFlight(Customer costumer, int flightId) {
		// TODO Auto-generated method stub
		
		return manager.orderFlight(costumer, flightId);
		
	}

	@Override
	public Flight[] getFlightsById(String[] flightIds) {
		
		return null;
	}

	@Override
	public Flight[] getFlightsByCostumerId(int costumerId) {
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
