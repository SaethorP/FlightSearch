package DataAccess;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Entities.Airport;
import Entities.Customer;
import Entities.Flight;
import Entities.Plane;

public class DatabaseMFlight implements IDataBaseMFlight {
	
	IDataBaseMFlight manager; 

	public IDataBaseMFlight getManager() {
		return manager;
	}

	public void setManager(IDataBaseMFlight manager) {
		this.manager = manager;
	}
	
	@Override
	public List<Flight> getFlights(String from) {
		// TODO Auto-generated method stub
		List<Flight> flights = new ArrayList<Flight>();
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
		      	String query = "SELECT * from Flights WHERE Fra = '" + from + "'";
		      	
		        ResultSet resultSet = statement.executeQuery(query);
		        while(resultSet.next())
		        {
		        	String flightFrom = resultSet.getString("Fra");
		        	String flightTo = resultSet.getString("Til");
		        	String flightDate = resultSet.getString("Date");
		        	int flightSeats = resultSet.getInt("EmptySeats");
		        	double flightPrice = 1000.00;
		        	
		        	Flight newFlight = new Flight(flightDate, flightTo, flightFrom, flightSeats, flightPrice);
		        	
		        	
		        	flights.add(newFlight);
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
		
		
		return flights;
	}

	@Override
	public List<Flight> getFlights(String from, String to) {
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
				      	String query = "SELECT * from Flights WHERE fra = '" + from + "' AND Til = '" + to +"'";
				      	
				        ResultSet resultSet = statement.executeQuery(query);
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
	public List<Flight> getFlights(String from, String to, String date) {
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
				      	String query = "SELECT * from Flights WHERE Fra = '" + from + "'AND Til = '" + to +"' AND Date = '" + date +"'";
				      	
				        ResultSet resultSet = statement.executeQuery(query);
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
	public String orderFlight(Customer customer, int FlightId) {
		
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
		      	String query = "INSERT INTO Customers(customerId, name, age, ssn, flightId)" 
		      			+ "VALUES (" + customer.GetCostumerId() + ",'" + customer.GetCostumerName() + "','" + customer.GetCostumerAge()+ "','" + customer.GetCostumerSSN()+ "'," + FlightId + " ) ";
		      	
		        statement.executeUpdate(query);
		        
		        
		        int numberOfSeats = 0;
		        query = "Select EmptySeats From Flights WHERE Id = "+ FlightId; 
		        ResultSet resultSet = statement.executeQuery(query);
		        while(resultSet.next())
		        {
		           // iterate & read the result set
		           numberOfSeats = resultSet.getInt("EmptySeats") - 1;
		        }
		        
		        statement.executeUpdate("UPDATE Flights SET EmptySeats='" + numberOfSeats +"' WHERE id='"+ FlightId +"'");
		        
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
	
}
