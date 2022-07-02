package com.nt.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegisterUser {

	public static void main(String[] args) {
		
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		
		try {
			
			sc = new Scanner(System.in);
			int id = 0;
			String username = null;
			String password = null;
			String name = null;
			float age = 0.0f;
			
			if(sc!=null) {
			
				System.out.println("Enter User-ID of new user to insert");
				id = sc.nextInt();
				System.out.println("Enter username of new user");
				username = sc.next();
				System.out.println("Enter password of new user");
				password = sc.next();
				System.out.println("Enter User's name");
				name = sc.next();
				System.out.println("Enter age of user"); 
				age = sc.nextFloat();
				 
			}
			//register JDBC Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Saurabh","root","root");
			//create Statement object
			if(con!=null) {
				st = con.createStatement();
			}
			username = "'" + username + "'";
			password = "'" + password + "'";
			name = "'" + name + "'";
			//prepare SQL query
			String QUERY = "INSERT INTO USER VALUES(" + id + "," + username + "," + password + "," + name + "," + age + ")";
			System.out.println(QUERY);
			int count = 0;
			if(st!=null) {
				count = st.executeUpdate(QUERY);
			}
			if(count==0) {
				System.out.println("Records not inserted");
			}
			else {
				System.out.println(count + " record(s) inserted");
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