package com.nt.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletingUserFromDB {

	public static void main(String[] args) {
		
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		
		try{
			
			sc = new Scanner(System.in);
			int id = 0;
			System.out.println("Enter User ID to delete user from databse");
			if(sc!=null) {
				id = sc.nextInt();
			}
			//register JDBC Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Saurabh","root","root");
			//create Statement object
			if(con!=null) {
				st = con.createStatement();
			}
			//prepare SQL query
			String QUERY = "DELETE FROM USER WHERE USERID=" + id;
			int count = 0;
			if(st!=null) {
				count = st.executeUpdate(QUERY);
			}
			if(count==0) {
				System.out.println("Records not found to delete");
			}
			else {
				System.out.println(count + " record(s) deleted");
			}
		}//try
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(sc!=null) 
					sc.close(); 
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
			
		}//finally
		
	}
}