package Model;
import java.util.Date;

import DataAccess.IDataBaseMFlight;
import Entities.Airport;
import Entities.Customer;	
import Entities.Flight;

public class FlightSearch implements IFlightSearch{
	
	private IDataBaseMFlight manager;
	private IFlightSearch searcher; 
	

	public FlightSearch(IFlightSearch searcher, IDataBaseMFlight manager)
	{
		this.manager = manager; 
		this.searcher = searcher;
	}
	
	
//	public IFlightSearch getSearch() {
//		return searcher;
//	}
//
//	public void setManager(IFlightSearch searcher) {
//		this.searcher = searcher;
//	}
	
	@Override
	public Flight GetFlightById(String flightId) {
		
		return searcher.GetFlightById(flightId);
	}

	@Override
	public Flight[] GetFlightsById(String[] flightIds) {
		
		return searcher.GetFlightsById(flightIds);
	}

	@Override
	public Flight[] GetFlightsByCostumerId(int costumerId) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsByCostumerId(costumerId);
	}

	@Override
	public int[] GetFlightsIds(Date time) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(time);
	}

	@Override
	public int[] GetFlightsIds(int price) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(price);
	}

	@Override
	public int[] GetFlightsIds(String destination) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(destination);
	}

	@Override
	public int[] GetFlightsIds(Date time, int price) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(time, price);
	}

	@Override
	public int[] GetFlightsIds(Date time, int price, String destination) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(time, price, destination);
	}

	@Override
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport) {
		// TODO Auto-generated method stub
		return searcher.GetFlightsIds(time, price, destination, airport);
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

	//Testing area for the class. 
	public static void main(String[] args)
	{
		
	}
	
}
