
public class Airport {

		private int airportId;
		private String airportCity;
		private String airportCountry; 
		private String airportName;
		
		//Default Constructor
		Airport() 
		{	
			airportId = 0; //Unset airport Id is zero
			airportCity = "City name not initialized";
			airportCountry = "Country name not initialized";
			airportName = "Airport name not initialized";
				
		}
		
		//Costum constructor
		Airport(int id, String name, String country, String city) 
		{
			airportId = id; //Unset airport Id is zero
			airportCity = city;
			airportCountry = country;
			airportName = name;
		}
		
		//Methods for Airport class. 
		
		
		//Getters
		String GetAirportName()
		{
			return airportName; 
		}
		
		String GetAirportCity()
		{
			return airportCity; 
		}
		
		String GetAirportCountry()
		{
			return airportCountry; 
		}
		
		int GetAirportId()
		{
			return airportId; 
		}
		
		//Setters 
		void SetAirportName(String newName) {
			airportName = newName;
		}
		
		void SetAirportCity(String newCity) {
			airportCity = newCity;
		}
		
		void SetAirportCountry(String newCountry) {
			airportCountry = newCountry;
		}
		
		void SetAirportId(int newAirportId) {
			 airportId = newAirportId;
		}
		
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
