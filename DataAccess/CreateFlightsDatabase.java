package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateFlightsDatabase
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


      statement.executeUpdate("DROP TABLE IF EXISTS Flights");
      statement.executeUpdate("CREATE TABLE Flights (Id INTEGER, Fra STRING, Til STRING, Date STRING, EmptySeats INTEGER)");

      int ids [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47};
      String fra [] = {"Reykjavík","Akureyri","Ísafjörður","Egilsstaðir","Akureyri","Ísafjörður","Egilsstaðir", "Reykjavík","Akureyri","Ísafjörður","Reykjavík", "Reykjavík",
    		  "Reykjavík","Akureyri","Ísafjörður","Egilsstaðir","Akureyri","Ísafjörður","Egilsstaðir", "Reykjavík","Akureyri","Ísafjörður","Reykjavík", "Reykjavík",
    		  "Reykjavík","Akureyri","Ísafjörður","Egilsstaðir","Akureyri","Ísafjörður","Egilsstaðir", "Reykjavík","Akureyri","Ísafjörður","Reykjavík", "Reykjavík",
    		  "Reykjavík","Akureyri","Ísafjörður","Egilsstaðir","Akureyri","Ísafjörður","Egilsstaðir", "Reykjavík","Akureyri","Ísafjörður","Reykjavík"   //47
      };
      String til [] = {"Akureyri","Reykjavík","Egilsstaðir","Ísafjörður","Reykjavík","Akureyri","Reykjavík","Egilsstaðir","Reykjavík","Reykjavík","Egilsstaðir", "Akureyri",
    		  "Egilsstaðir","Ísafjörður","Reykjavík","Akureyri","Reykjavík","Egilsstaðir","Reykjavík","Egilsstaðir","Egilsstaðir", "Akureyri", "Ísafjörður","Akureyri",
    		  "Egilsstaðir","Ísafjörður","Reykjavík","Akureyri","Reykjavík","Egilsstaðir","Reykjavík","Egilsstaðir","Egilsstaðir", "Akureyri", "Ísafjörður","Akureyri",
    		  "Egilsstaðir","Ísafjörður","Reykjavík","Akureyri","Reykjavík","Egilsstaðir","Reykjavík","Egilsstaðir","Egilsstaðir", "Akureyri", "Ísafjörður"
      };
      String date [] = {"01/06/2016","01/06/2016","02/06/2016","02/06/2016","03/06/2016","04/06/2016","04/06/2016",
    		  "05/06/2016","05/06/2016","06/06/2016","07/06/2016","08/06/2016","09/06/2016","10/06/2016", "11/06/2016","11/06/2016","12/06/2016", "12/06/2016",
      		  "13/06/2016", "14/06/2016","15/06/2016","15/06/2016","16/06/2016","16/06/2016","16/06/2016","17/06/2016","18/06/2016","19/06/2016","20/6/2016",
    		  "21/06/2016","21/06/2016","22/06/2016","22/06/2016","23/06/2016","23/06/2016","24/06/2016","24/06/2016","25/06/2016","25/06/2016",
    		  "26/06/2016","27/06/2016","28/06/2016","28/06/2016","29/06/2016","29/06/2016","30/06/2016","30/06/2016"};
      int emptySeats [] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
    		  10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

      // 47
      
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
           System.out.println("EmptySeats = " + resultSet.getInt("EmptySeats"));

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