
public class Customer {
	
	private int costumerId;
	private String costumerName; 
	private int costumerAge;
	private int costumerSSN; //Social security number, 
	
	// Default constructor.
	Customer()
	{
		costumerId = 10;
		costumerName = "Jón Jónsson";
		costumerAge  = 25;
		costumerSSN  = 1234567890;
	}
	
	Customer(int id, String name, int age, int SSN)
	{
		costumerId = id;
		costumerName = name;
		costumerAge  = age;
		costumerSSN  = SSN;
	}
	
	// Methods for Costumer
	String GetCostumerName()
	{
		return costumerName;
	}
	
	int GetCostumerId()
	{
		return costumerId;
	}
	
	int GetCostumerAge()
	{
		return costumerAge;
	}
	
	int GetCostumerSSN()
	{
		return costumerSSN;
	}
	
	void SetCostumerName(String name)
	{
		costumerName = name;
	}
	
	void SetCostumerId(int id)
	{
		costumerId = id;
	}
	
	void SetCostumerAge(int age)
	{
		costumerAge = age;
	}
	
	void SetCostumerSSN(int SSN)
	{
		costumerSSN = SSN;
	}
	
	void OrderFlight(Customer costumer, Flight flight)
	{
		
	}
	
	void SeeMyFlights(Customer costumer)
	{
		
	}
	
	void CancelFlight(Customer costumer, Flight flight)
	{
		
	}
	
	void EditFlight(Customer costumer, Flight flight, boolean extraLuggage )
	{
		
	}
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}
	
	
	
	
	

}
