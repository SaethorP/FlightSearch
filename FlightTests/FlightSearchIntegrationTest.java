package FlightTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.DatabaseMFlight;
import DataAccess.IDataBaseMFlight;
import DataAccess.MockDatabaseMFlight;
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
	public void getAllFlights() {
		Flight[] actualFlight = flightSearch.GetFlightsBy("Reykjavík");
		assertNotNull(actualFlight);
	}


}
