package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCustomerTable
 {
 public static void main(String[] args) throws ClassNotFoundException
  {
   // load the sqlite-JDBC driver using the current class loader
   Class.forName("org.sqlite.JDBC");

   Connection connection = null;
   try
   {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:Flights.db");

      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.


      statement.executeUpdate("DROP TABLE IF EXISTS Customers");
      statement.executeUpdate("CREATE TABLE Customers (customerId INT, name STRING, age STRING, ssn STRING, flightId INT)");

      int customerId [] = {100000,100100,100200,100300,100400,100500,100600,100700,100800};
      String name [] = {"Jón", "Siggi", "Breki", "Skúli", "Arnar", "Tanja", "Soffía", "Melkorka", "Lúsífer"};
      String age [] = {"1","2","3","4","5","6","7","8","9"};
      String ssn [] = {"1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890","1234567890"};
      int flightId [] = {1,2,3,4,5,6,7,8,9};
      
      
      for(int i=0;i<customerId.length;i++){
           statement.executeUpdate("INSERT INTO Customers values(' "+customerId[i]+"', '"+ name[i]+"', '" + age[i]+ "', '" + ssn[i]+ "', '" + flightId[i]+"')");
      }

      //statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
      //statement.executeUpdate("DELETE FROM person WHERE id='1'");

        ResultSet resultSet = statement.executeQuery("SELECT * from Customers");
        while(resultSet.next())
        {
           // iterate & read the result set
           System.out.println("CustomerId = " + resultSet.getInt("customerId"));
           System.out.println("Name = " + resultSet.getString("name"));
           System.out.println("age = " + resultSet.getString("age"));
           System.out.println("ssn = " + resultSet.getString("ssn"));
           System.out.println("FlightId = " + resultSet.getInt("flightId"));

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
}
}