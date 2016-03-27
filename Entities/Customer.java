package Entities;

public class Customer {
	
	private int _costumerId;
	private String _costumerName; 
	private int _costumerAge;
	private String _costumerSSN; //Social security number, 
	
	// Default constructor.
	public Customer()
	{
		_costumerId = 10;
		_costumerName = "Jón Jónsson";
		_costumerAge  = 25;
		_costumerSSN  = "1234567890";
	}
	
	public Customer(int id, String name, int age, String SSN)
	{
		_costumerId = id;
		_costumerName = name;
		_costumerAge  = age;
		_costumerSSN  = SSN;
	}
	
	// Methods for Costumer
	public String GetCostumerName()
	{
		return _costumerName;
	}
	
	public int GetCostumerId()
	{
		return _costumerId;
	}
	
	public int GetCostumerAge()
	{
		return _costumerAge;
	}
	
	public String GetCostumerSSN()
	{
		return _costumerSSN;
	}
	
	public void SetCostumerName(String name)
	{
		_costumerName = name;
	}
	
	public void SetCostumerId(int id)
	{
		_costumerId = id;
	}
	
	public void SetCostumerAge(int age)
	{
		_costumerAge = age;
	}
	
	public void SetCostumerSSN(String SSN)
	{
		_costumerSSN = SSN;
	}
	
	
	
	//Testing area for the class. 
	public static void main(String[] args){
		
		
		
	}
	
	
	
	
	

}
