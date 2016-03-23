import java.util.Date;

public class FlightSearch {
	public void GetFlightById(int flightId) {}
	public void GetFlightsById(int[] flightIds) {}
	public void GetFlightsByCostumerId(int costumerId) {}
	
	public int[] GetFlightsIds(Date time ) { return new int[0]; }
	public int[] GetFlightsIds(int price ) { return new int[0];}
	public int[] GetFlightsIds(String destination ) { return new int[0]; }
	
	public int[] GetFlightsIds(Date time, int price ) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination) { return new int[0]; }
	public int[] GetFlightsIds(Date time, int price, String destination, Airport airport) { return new int[0]; }

	
	
	//Testing area for the class. 
			public static void main(String[] args){
				Costumer costumer = new Costumer();
				
				System.out.println( costumer.GetCostumerId() );
			}
	
}
