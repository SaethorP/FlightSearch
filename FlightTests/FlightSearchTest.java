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
		Flight actualFlight = flightSearch.getFlightById("123456");
		assertNotNull(actualFlight);
	}

	@Test
	public void getFlightById_Invalid_ToLongInput() {
		Flight actualFlight = flightSearch.getFlightById("486489468498498498");
		assertEquals(null,actualFlight);
	}
	
	@Test
	public void getFlightById_Invalid_ToShortInput() {
		Flight actualFlight = flightSearch.getFlightById("486");
		assertEquals(null,actualFlight);
	}
	
	@Test
	public void getFlightById_Invalid_EmptyString() {
		Flight actualFlight = flightSearch.getFlightById("");
		assertEquals(null,actualFlight);
	}
	
	@Test
	public void getFlightById_Invalid_CharacterInput() {
		Flight actualFlight = flightSearch.getFlightById("Prumpi");
		assertEquals(null,actualFlight);
	}
	
//	@Test
//	public void orderFlight_Success_ValidInput(){
//		String successString = flightSearch.orderFlight("03088822", "123456");
//		assertEquals("Success", successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_CustosmerIsEmpty(){
//		String successString = flightSearch.orderFlight("", "123456");
//		assertEquals(null, successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_FlightIdIsEmpty(){
//		String successString = flightSearch.orderFlight("03088822", "");
//		assertEquals(null, successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_InvalidCostumerLenghtToLong(){
//		String successString = flightSearch.orderFlight("03088822212121", "123456");
//		assertEquals(null, successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_InvalidCostumerFlightIdLengthToLong(){
//		String successString = flightSearch.orderFlight("03088822", "12345631321");
//		assertEquals(null, successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_InvalidCostumerCustomerLengthToShort(){
//		String successString = flightSearch.orderFlight("0308", "123456");
//		assertEquals(null, successString);
//	}
//	
//	@Test
//	public void orderFlight_FAIL_InvalidCostumerFlightIdLengthToShort(){
//		String successString = flightSearch.orderFlight("03088822", "1234");
//		assertEquals(null, successString);
//	}

	
	
}
