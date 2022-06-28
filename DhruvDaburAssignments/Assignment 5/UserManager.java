package com.example.demo.trainingjdbc;

import java.sql.*;

public class UserManager extends User {

	public static void login(int Id, String Password) throws SQLException {
		Statement stmt4 = conn().createStatement();
		ResultSet resultSet = stmt4.executeQuery("Select * from user");
		int checkid = resultSet.getInt("id");
		String checkpassword = resultSet.getString("password");
		if (checkid == Id && checkpassword == Password) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}

	}

	public static void register(int Id, String FirstName, String LastName, int Age, String Password, String Hobby)
			throws SQLException {
		Statement stmt1 = conn().createStatement();
		int affectedRows = stmt1.executeUpdate("insert into user values('" +Id+ "','" +FirstName+ "','" +LastName+ "','" +Age+ "','" +Password+ "','" +Hobby+ "') ");
		//int affectedRows = stmt1.executeUpdate("insert into user(id,firstName) values('"+ Id +"' , '"+ FirstName +"')");
		System.out.println("Affected Rows " + affectedRows);

	}

	public static void updateById(String Hobby, int Id) throws SQLException {
		Statement stmt2 = conn().createStatement();
		int affectedRows = stmt2.executeUpdate("update user set hobby= '"+Hobby+"' where id='"+Id+"' ");
		
		System.out.println("Affected Rows " + affectedRows);

	}

	public static void deleteUser(int Id) throws SQLException {
		Statement stmt3 = conn().createStatement();
		int affectedRows = stmt3.executeUpdate("delete from user where id='"+Id+"'");
		System.out.println("Affected Rows " + affectedRows);
	}

}
