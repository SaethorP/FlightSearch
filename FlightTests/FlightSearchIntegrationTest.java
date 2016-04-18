package FlightTests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.DatabaseMFlight;
import DataAccess.IDataBaseMFlight;
import Entities.Customer;
import Entities.Flight;
import Model.FlightSearch;
import Model.IFlightSearch;

public class FlightSearchIntegrationTest {

	IDataBaseMFlight manager;
	IFlightSearch flightSearch;
	
	@Before
	public void setUp() throws Exception {
		
		manager = new DatabaseMFlight();
		flightSearch = new FlightSearch(manager);
		
	}

	@After
	public void tearDown() throws Exception {
		manager = null;
		flightSearch = null; 
	}
	
	@Test
	public void getFlightsByCorrect_From() {
		List<Flight> actualFlight = flightSearch.getFlightsBy("Reykjavík");
		assertNotNull(actualFlight);
	}
	

	@Test
	public void orderFlight()
	{
		Customer newCustomer = new Customer();
		newCustomer.SetCostumerName("Haffi Haff");
		newCustomer.SetCostumerId(102000);
		newCustomer.SetCostumerAge("110");
		newCustomer.SetCostumerSSN("1234567890");
		int flightId = 1; 
		
		String result = flightSearch.orderFlight(newCustomer, flightId);
		assertNotNull(result);
	}


}
