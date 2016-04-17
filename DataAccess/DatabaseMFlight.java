package DataAccess;
import java.util.Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class DatabaseMFlight implements IDataBaseMFlight {
	
	@Override
	public Flight[] getFlights(String from) {
		// TODO Auto-generated method stub
		
		//Class.forName("org.sqlite.JDBC");

		   Connection connection = null;
		   try
		   {
		      // create a database connection
		      connection = DriverManager.getConnection("jdbc:sqlite:Flights.db");

		      Statement statement = connection.createStatement();
		      statement.setQueryTimeout(30);  // set timeout to 30 sec.


		      //statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
		      //statement.executeUpdate("DELETE FROM person WHERE id='1'");

		        ResultSet resultSet = statement.executeQuery("SELECT * from Flights");
		        while(resultSet.next())
		        {
		           // iterate & read the result set
		           System.out.println("Id = " + resultSet.getInt("Id"));
		           System.out.println("Date = " + resultSet.getString("Date"));
		           System.out.println("From = " + resultSet.getString("Fra"));
		           System.out.println("To = " + resultSet.getString("Til"));
		           System.out.println("EmptySeats = " + resultSet.getString("EmptySeats"));

		        }
		       }

		  catch(SQLException e){  System.err.println(e.getMessage()); }       
		   finally {         
		         try {
		               if(connection != null)
		                  connection.close();
		               }
		         catch(SQLException e) {  // Use SQLException class instead.          
		            System.err.println(e); 
		          }
		   }
		
		
		return null;
	}

	@Override
	public Flight[] getFlights(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight[] getFlights(String from, String to, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	IDataBaseMFlight manager; 

	public IDataBaseMFlight getManager() {
		return manager;
	}

	public void setManager(IDataBaseMFlight manager) {
		this.manager = manager;
	}
	
	@Override
	public Flight getFlight(String flightId) {
		// TODO Auto-generated method stub
		
//		Flight returnflight = new Flight();
//		
//		flightInfo info = "Select id, date, airport FROM WHERE "
//		
//		Airport airport = getAirport(info.AirportId);
		
		
		return manager.getFlight(flightId);
	}

	@Override
	public Airport getAirport(int airportId) {
		// TODO Auto-generated method stub
		return manager.getAirport(airportId);
	}

	@Override
	public Customer getCustomer(int CostumerId) {
		// TODO Auto-generated method stub
		return manager.getCustomer(CostumerId);
	}

	@Override
	public Plane getPlane(int planeId) {
		// TODO Auto-generated method stub
		return manager.getPlane(planeId);
	}	

	@Override
	public String orderFlight(String FlightId, String CustomerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
