package com.nt.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUserInfoInDB {

	public static void main(String[] args) {
		
		Scanner sc = null;
		Connection con = null;
		Statement st = null;
		
		try {
			
			sc = new Scanner(System.in);
			int id = 0;
			String newPassword = null;
			String newName = null;
			//int newAge =0;
			
			if(sc!=null) {
			
				System.out.println("Enter User ID of user to update records");
				id = sc.nextInt();
				System.out.println("Enter new password of user to update");
				newPassword = sc.next();
				System.out.println("Enter User's name of user to update");
				newName = sc.next();
				/*
				 * System.out.println("Enter age of user to update"); newAge = sc.nextInt();
				 */
			}
			//register JDBC Driver
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Saurabh","root","root");
			//create Statement object
			if(con!=null) {
				st = con.createStatement();
			}
			newPassword = "'"+newPassword+"'";
			newName = "'"+newName+"'";
			//prepare SQL query
			String QUERY = "UPDATE USER SET PASSWORD=" + newPassword +",USERNAME=" + newName + " WHERE USERID=" + id;
			System.out.println(QUERY);
			int count = 0;
			if(st!=null) {
				count = st.executeUpdate(QUERY);
			}
			if(count==0) {
				System.out.println("Records not found to update");
			}
			else {
				System.out.println(count + " record(s) updated");
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