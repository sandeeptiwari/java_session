package com.example.demo.trainingjdbc;

import java.sql.*;

public class User {

	int Id;
	String FirstName;
	String LastName;
	String Password;
	int Age;
	String Hobby;

	public static void show() throws SQLException {
		throw new SQLException("I am null");
	}

	public static Connection conn() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root", "jondabur0711");
	}

	public static void main(String[] args) {
		try {
			Connection conn = conn();

			Statement stmt = conn().createStatement();
			ResultSet resultSet = stmt.executeQuery("Select * from user");
			UserManager.register(5, "Nimish", "Sardana", 24, "test321", "listening music");
			UserManager.updateById("playing video games", 4);
			
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
