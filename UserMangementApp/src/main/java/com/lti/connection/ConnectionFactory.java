package com.lti.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL="jdbc:oracle:thin:@localhost:1522:OSE";
	private static final String USER="system";
	private static final String PASS="99system";
	
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
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
