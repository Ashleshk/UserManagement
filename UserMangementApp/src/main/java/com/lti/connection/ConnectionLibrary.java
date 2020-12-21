package com.lti.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionLibrary {
	private static final String URL="jdbc:oracle:thin:@localhost:1522:OSE";
	private static final String USER="hr";
	private static final String PASS="hr";
	
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL, USER, PASS);
			if(con!=null){
				System.out.println("Connected");
				return con;
			}
			else{
				System.out.println("Not connected.");
			}
		} catch (Exception e) {
			 
			System.out.println(e.getMessage());
		}
		return null;
	}
}
