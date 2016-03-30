package FlightTests;

import static org.junit.Assert.*;
import org.junit.*;
import DataAccess.*;
import Entities.*;
import static org.mockito.Mockito.*;
import java.util.Date;

public class SearchTest {
	
	private Plane plane; 
	private Airport toAirport, fromAirport;
	private Airport[] airports;
	private Flight mockFlight;
	
	ObjectEqualMethods CustomEquals = new ObjectEqualMethods();

	DatabaseMFlight DataManager;
	
	@Before
	public void setUp()
	{
		String flightId = "10";
		Date departure = new Date();
		Date arrive = new Date();
		Plane plane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
		Airport toAirport = new Airport(101, "Reykjavíkur Flugvöllur", "Iceland", "Reykjavík");
		Airport fromAirport = new Airport(900, "Flugvöllur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
		Airport[] airports = {fromAirport, toAirport};
		int[] customers = {1,2,3,4,5,6,7,8,9,10}; 
		double price = 1000.00;
		
		Flight mockFlight = new Flight(flightId, departure, arrive, plane, airports, customers, price);
		
		IDataBaseMFlight IManager = mock(IDataBaseMFlight.class);
		
		when(IManager.getFlight("10")).thenReturn(mockFlight);		
		
		DataManager = new DatabaseMFlight();
		DataManager.setManager(IManager);
		
	}
	// Act
	@After 
	public void tearDown()
	{
		plane = null; 
		airports = null; 
		toAirport = null; 
		fromAirport = null; 
		mockFlight = null;
		
	}
	
	
	@Test
	public void MockTest_GetFlightById()
	{
		// actual
		Flight actualFlight = DataManager.getFlight("10");
		Airport[] actualAirports = actualFlight.getAirports();
		Plane actualPlane = actualFlight.getPlane();
		
		// expected
		Plane expectedPlane = new Plane(666, "HellPlane", "[000],[000],[000],[000]");
		Airport expectedToAirport = new Airport(101, "Reykjavíkur Flugvöllur", "Iceland", "Reykjavík");
		Airport expectedFromAirport = new Airport(900, "Flugvöllur Vestmannaeyja", "Iceland", "Vestmannaeyjar");
		int[] expectedCustomers = {1,2,3,4,5,6,7,8,9,10};
		
		
		assertNotNull(actualFlight);
		assertEquals(10 , actualFlight.getFlightId());
		
		assertTrue(CustomEquals.equalPlane(expectedPlane, actualPlane));
		assertTrue(CustomEquals.equalAirports(expectedFromAirport, actualAirports[0]));
		assertTrue(CustomEquals.equalAirports(expectedToAirport, actualAirports[1]));
		
		assertArrayEquals(expectedCustomers, actualFlight.GetCustomers());
		assertEquals("Reykjavík",actualFlight.getWhereTo());
		assertEquals("Vestmannaeyjar", actualFlight.getWhereFrom());
		
		
	}
	
	
	
     
        
 }


