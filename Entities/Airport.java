package Entities;

public class Airport {

		private int _airportId;
		private String _airportCity;
		private String _airportCountry; 
		private String _airportName;
		
		//Default Constructor
		public Airport() 
		{	
			_airportId = 0; //Unset airport Id is zero
			_airportCity = "City name not initialized";
			_airportCountry = "Country name not initialized";
			_airportName = "Airport name not initialized";
				
		}
		
		//Customer constructor
		public Airport(int id, String name, String country, String city) 
		{
			_airportId = id; //Unset airport Id is zero
			_airportCity = city;
			_airportCountry = country;
			_airportName = name;
		}
		
		//Methods for Airport class. 
		
		
		//Getters
		public String GetAirportName(){	return _airportName; }
		
		public String GetAirportCity(){ return _airportCity; }
		
		public String GetAirportCountry(){ return _airportCountry; }
		
		public int GetAirportId(){ return _airportId; }
		
		//Setters 
		public void SetAirportName(String newName) { _airportName = newName; }
		
		public void SetAirportCity(String newCity) { _airportCity = newCity; }
		
		public void SetAirportCountry(String newCountry) { _airportCountry = newCountry; }
		
		public void SetAirportId(int newAirportId) { _airportId = newAirportId; }
		
		//Testing area for the class. 
		public static void main(String[] args){
			
			// Build a new airport without initializing and check what it says.
			Airport newAirport = new Airport();
			
			System.out.println(  newAirport.GetAirportName()	);
			System.out.println(  newAirport.GetAirportCity()	);
			System.out.println(  newAirport.GetAirportCountry()	);
			System.out.println(  newAirport.GetAirportId()		);
			
			// Change the initilialized values to custom values
			newAirport.SetAirportName("Leifstöð");
			newAirport.SetAirportId(666);
			newAirport.SetAirportCity("Keflavík");
			newAirport.SetAirportCountry("Iceland");
			
			System.out.println(  newAirport.GetAirportName()	);
			System.out.println(  newAirport.GetAirportCity()	);
			System.out.println(  newAirport.GetAirportCountry()	);
			System.out.println(  newAirport.GetAirportId()		);
			
			//Checka hvort að þetta er call by reference. 
			Airport airport2 = newAirport;
			
			airport2.SetAirportName("Hakkað nafn á airport1");
			
			System.out.println(  newAirport.GetAirportName()	);
			
			// Testing the custom constructor 
			Airport fullAirport = new Airport(420, "customAiport", "customLand", "customCity");
			System.out.println(  fullAirport.GetAirportName()	);
			System.out.println(  fullAirport.GetAirportCity()	);
			System.out.println(  fullAirport.GetAirportCountry()	);
			System.out.println(  fullAirport.GetAirportId()		);
			
		}
		
		
}
