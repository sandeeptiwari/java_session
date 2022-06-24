package com.nt.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Establish_Connection {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//register JDBC Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Saurabh","root","root");
			//create Statement object
			if(con!=null)
				st = con.createStatement();
			//send query to database
			if(st!=null)
				rs = st.executeQuery("Select * from User");
			//process ResultSet object
			if(rs!=null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getInt(5));
					System.out.println("\n");
				}
			}
			
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		/*
		 * catch(ClassNotFoundException cnf) { cnf.printStackTrace(); }
		 */
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(rs!=null)
					rs.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
	}
}