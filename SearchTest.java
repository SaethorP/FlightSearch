import static org.junit.Assert.*;

import org.junit.*;

public class SearchTest {
    // Arrange
	private Customer customer1, customer2;
	
	
	@Before
	public void setUp()
	{
		customer1 = new Customer();
		customer2 = new Customer(69, "Finnur", 120,  226699885);
	}
	// Act
	@After 
	public void tearDown()
	{
		customer1 = null; 
		customer2 = null;
	}
	
	// Assert 
	@Test
	public void TestDefaultConstructor() {
		assertEquals("Jón Jónsson",customer1.GetCostumerName());
	}

}
