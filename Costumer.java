
public class Costumer {
	
	private int costumerId;
	private String costumerName; 
	private int costumerAge;
	private int costumerSSN; //Social security number, 
	
	// Default constructor.
	Costumer()
	{
		costumerId = (int)Math.random()*101;
		costumerName = "Jón Jónsson";
		costumerAge  = 25;
		costumerSSN  = 1234567890;
	}
	
	Costumer(int id, String name, int age, int SSN)
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
	
	void OrderFlight(Costumer costumer, Flights flight)
	{
		
	}
	
	void SeeMyFlights(Costumer costumer)
	{
		
	}
	
	void CancelFlight(Costumer costumer, Flights flight)
	{
		
	}
	
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}
	
	
	
	
	

}
