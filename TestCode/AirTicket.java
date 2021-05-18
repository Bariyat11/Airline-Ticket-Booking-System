package runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class AirTicket {
	    public AirTicket() {
	    	Connection connection = null;
	        try {
	     
	    	  // Load the MySQL JDBC driver
	    	 
	    	  String driverName = "com.mysql.jdbc.Driver";
	    	 
	    	  Class.forName(driverName);
	    	 
	    	 
	    	  // Create a connection to the database
	    	 
	    	  String serverName = "localhost";
	    	 
	    	  String schema = "flight_booking_db";
	    	 
	    	  String url = "jdbc:mysql://" + serverName +  "/" + schema;
	    	 
	    	  String username = "root";
	    	 
	    	  String password = "";
	    	 
	    	  connection = DriverManager.getConnection(url, username, password);
	    	 
	    	   
	    	 
	    	  System.out.println("Successfully Connected to the database!");
	    	 
	    	   
	    	    } catch (ClassNotFoundException e) {
	    	 
	    	  System.out.println("Could not find the database driver " + e.getMessage());
	    	    } catch (SQLException e) {
	    	 
	    	  System.out.println("Could not connect to the database " + e.getMessage());
	    	  }
	    	 
	    	    try {
	    	 
	    	 
	    	// Get a result set containing all data from test_table
	    	 
	    	Statement statement = connection.createStatement();
	    	 
//	    	ResultSet results = statement.executeQuery("SELECT * FROM customer");
	    	for(int i=0; i<1;i++){
	    		ResultSet results = statement.executeQuery("SELECT * FROM flight_booking_db");
	    	    while(results.next()) {
	    	        String Name = results.getString("name");
	    	        System.out.print(i);
	    	        System.out.println("Name:"+Name);
	    	    }
	    	}
	    }catch (Exception e){
	    	
	    }
	    }
	    private static String airId[] = {"100024"};
	    private static String airName[] = {"Biman Bangladesh"};
	    private static String airpId[] = {"001"};
	    private static String airpName[] = {"Shahjalal International Airport"};
	    private static String deAirId[] = {"001"};
	    private static String arAirId[] = {"003"};
	    
	    public String airlines_listCheck(String airlineId, String airlineName) {
	    	AirTicket A = new AirTicket();
	        String aId = airlineId;
	        String aName = airlineName;
	        String message="fail";
	        for (int i = 0; i < A.airId.length ; i++) {
	            if(A.airId[i].equals(aId)) {
	            	if(A.airName[i].equals(aName)) {
	                message = "pass";
	            	}
	            	else {
	            	message = "fail";
	            }
	        }
	        }
	        return message;
	    }
	    public String airport_listCheck(String airportId, String airportName) {
	    	AirTicket B = new AirTicket();
	        String apId = airportId;
	        String apName = airportName;
	        String message="fail";
	        for (int i = 0; i < B.airpId.length ; i++) {
	            if(B.airpId[i].equals(apId)) {
	            	if(B.airpName[i].equals(apName)) {
	            		message = "pass";
	            	}
	            	else {
	            		message = "fail";
	            	}
	            }
	        }
	        return message;
	        
	    }
	    
	    String flight_listCheck(String departure_airport_id, String arrival_airport_id) {
	    	AirTicket C = new AirTicket();
	        String dAirId = departure_airport_id;
	        String aAirId = arrival_airport_id;
	        String message="fail";
	        for (int i = 0; i < C.deAirId.length ; i++) {
	           if(C.deAirId[i].equals(dAirId)) {
	            	if(C.arAirId[i].equals(aAirId)) {
	                message = "pass";
	                }
	            	else {
	            		message = "fail";	            	
	            	}
	            }
	        }
	        return message;
	        }
}