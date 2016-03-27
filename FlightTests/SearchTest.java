package FlightTests;
import static org.junit.Assert.*;

import org.junit.*;

import Entities.Customer;
import Entities.Flight;

public class SearchTest {
    // Arrange
	private Customer customer1, customer2;
	private int flightId1;
	
	@Before
	public void setUp()
	{
		customer1 = new Customer();
		customer2 = new Customer(69, "Finnur", 120,  "2266998850");
		
		flightId1 = 10;
	}
	// Act
	@After 
	public void tearDown()
	{
		customer1 = null; 
		customer2 = null;
		flightId1 = 10;
	}
	
	// Assert 
	@Test
	public void TestDefaultConstructor() {
		assertEquals("Jón Jónsson",customer1.GetCostumerName());
	}
	
	@Test
	public void TestGetFlight()
	{
		
		
		//Flight actualFlight = getFlight(flightId1);
		
	}

}
