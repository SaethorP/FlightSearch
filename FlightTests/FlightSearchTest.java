package FlightTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Entities.Customer;
import Entities.Airport;
import Entities.Flight;
import Entities.Plane;

public class FlightSearchTest {
	//Arrange
	private Customer customer1;
	private Airport airport1, airport2;
	private Flight flight1;
	private Plane plane1;
	
	@Before
	public void setUp() throws Exception {
		customer1 = new Customer();
		airport1 = new Airport();
		airport2 = new Airport();
		flight1 = new Flight();
		plane1 = new Plane();
		
	}

	@After
	public void tearDown() throws Exception {
		customer1 = null;
		airport1 = null;
		airport2 = null;
		flight1 = null;
		plane1 = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
