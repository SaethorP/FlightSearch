package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Flights
 {
 public static void main(String[] args) throws ClassNotFoundException
  {
   // load the sqlite-JDBC driver using the current class loader
   Class.forName("org.sqlite.JDBC");

   Connection connection = null;
   try
   {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.


      statement.executeUpdate("DROP TABLE IF EXISTS Flights");
      statement.executeUpdate("CREATE TABLE Flights (Id INTEGER, Fra STRING, Til STRING, Date STRING, EmptySeats INTEGER)");

      int ids [] = {1,2,3,4,5,6,7,8,9,10,11,12};
      String fra [] = {"Reykjavik","Akureyri","Ísafjörður","Egilsstaðir","Akureyri","Ísafjörður","Egilsstaðir", "Reykjavík","Akureyri","Ísafjörður","Reykjavík", "Reykjavík"};
      String til [] = {"Akureyri","Reykjavík","Egilsstaðir","Ísafjörður","Reykjavík","Akureyri","Reykjavík","Egilsstaðir","Reykjavík","Reykjavík","Egilsstaðir", "Akureyri"};
      String date [] = {"1/6/2016","1/6/2016","2/6/2016","2/6/2016","3/6/2016","4/6/2016","4/6/2016","5/6/2016","5/6/2016","6/6/2016","7/6/2016","8/6/2016","9/6/2016","10/6/2016"};
      String emptySeats [] = {"10", "10","10","10", "10","10","10", "10","10","10", "10","10"};

      
      
      for(int i=0;i<ids.length;i++){
           statement.executeUpdate("INSERT INTO Flights values(' "+ids[i]+"', '"+fra[i]+"', '"+til[i]+"', '"+date[i]+"' , '"+emptySeats[i]+"')");   
      }

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
}
}