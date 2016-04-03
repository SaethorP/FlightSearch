package Model;
import java.util.Date;

import DataAccess.IDataBaseMFlight;
import Entities.Airport;
import Entities.Customer;	
import Entities.Flight;
import Entities.Plane;
import FlightTests.ObjectEqualMethods;

public class FlightSearch implements IFlightSearch{
	
	private IDataBaseMFlight manager;
	

	public FlightSearch(IDataBaseMFlight manager)
	{
		this.manager = manager; 
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
	public Flight[] GetFlightsById(String[] flightIds) {
		
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
