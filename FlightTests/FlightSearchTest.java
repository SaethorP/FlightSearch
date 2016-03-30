package FlightTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Entities.Customer;
import Entities.Airport;
import Entities.Flight;
import Entities.Plane;
import Model.IFlightSearch;
import Model.MockFlightSearch;

public class FlightSearchTest {
	//Arrange
	private IFlightSearch mockSearch;
	
	@Before
	public void setUp() throws Exception {
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		mockSearch = null; 
	}

	@Test
	public void GetFlightById_Successs() {
		IFlightSearch mockSearch = new MockFlightSearch(); 
		Flight actualFlight = mockSearch.GetFlightById("123456");
				
		assertNotNull(actualFlight);
		
		
	}

	@Test
	public void getFlightSearchIdstest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getFlightSearchByIdtest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getFlightByCustomerIdtest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void editPricetest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void orderFlighttest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void seeMyFlightstest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void cancelFlighttest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void editFlighttest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getCostumerByFlightIdtest() {
		fail("Not yet implemented");
	}
}
