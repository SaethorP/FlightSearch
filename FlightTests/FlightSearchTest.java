package FlightTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.*;
import Entities.Customer;
import Entities.Airport;
import Entities.Flight;
import Entities.Plane;
import Model.FlightSearch;
import Model.IFlightSearch;
import Model.MockFlightSearch;

public class FlightSearchTest {
	
	IDataBaseMFlight mockManager;
	IFlightSearch flightSearch;
	
	@Before
	public void setUp() throws Exception {
		
		mockManager = new MockDatabaseMFlight();
		flightSearch = new FlightSearch(mockManager);
		
	}

	@After
	public void tearDown() throws Exception {
		mockManager = null;
		flightSearch = null; 
	}

	@Test
	public void getFlightById_ValidInput() {
		
		Flight actualFlight = flightSearch.GetFlightById("123456");
				
		assertNotNull(actualFlight);
			
	}

	@Test
	public void getFlightById_Invalid_ToLongInput() {
		
		Flight actualFlight = flightSearch.GetFlightById("486489468498498498");
		
		assertEquals(null,actualFlight);
	
	}
	
	@Test
	public void getFlightById_Invalid_ToShortInput() {
		
		Flight actualFlight = flightSearch.GetFlightById("486");
		
		assertEquals(null,actualFlight);
	
	}
	
	@Test
	public void getFlightById_Invalid_EmptyString() {
		
		Flight actualFlight = flightSearch.GetFlightById("");
		
		assertEquals(null,actualFlight);
	
	}
	
	@Test
	public void getFlightById_Invalid_CharacterInput() {
		
		Flight actualFlight = flightSearch.GetFlightById("Prumpi");
		
		assertEquals(null,actualFlight);
	
	}
	
	
	
}
