package com.company;


import java.sql.*;
import java.util.Scanner;

class User {
    int id;
    String UserName;
    String Password;
    String FirstName;
    String LastName;
    int age;
    int AccNo;
    int Balance;

}

public class Main extends User {
    Connection con = null;
    Statement stmt = null;
    ResultSet resultSet = null;

    void Login() {
        System.out.println("enter your userName :");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.next();
        System.out.println("enter your password :");
        String Pass = sc.next();


        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "12345");


            if (con != null) {
                stmt = con.createStatement();
                System.out.println("Connected");
            }

            if (stmt != null) {
                resultSet = stmt.executeQuery("select * from emp");
            }

            if (resultSet != null) {
                int i = 0;
                while (resultSet.next()) {

                    String str = resultSet.getString("UserName");
                    String psd = resultSet.getString("Password");

                    if (str.equals(UserName) && psd.equals(Pass)) {
                        i = i + 1;
                    } else {
                        i = i;
                    }


                }
                if (i > 0) {
                    System.out.println("You are logged in successfully ");
                } else {
                    System.out.println("You Entered wrong userName and password. ");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    void register() {
        System.out.println("Fill the required details to register ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Id (Integer) : ");
        int id = sc.nextInt();
        System.out.print("Enter the username : ");
        String UserName = sc.next();
        System.out.print("Set the Password :");
        String Password = sc.next();
        System.out.print("Enter Your First Name : ");
        String FirstName = sc.next();
        System.out.print("Enter the Second Name : ");
        String LastName = sc.next();
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Enter account Number : ");
        int Accno = sc.nextInt();
        System.out.println("Enter Balance : ");
        int Balance = sc.nextInt();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "12345");
            if (con != null) {
                stmt = con.createStatement();
            }
            if (stmt != null) {
                resultSet = stmt.executeQuery("select * from emp");
            }
            int Affectedrow=stmt.executeUpdate("insert into emp(id,UserName,Password,FirstName,LastName,Age,AccNo,Balance) values(id,UserName,Password,FirstName,LastName,age,Accno,Balance) " );
            System.out.println(Affectedrow);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        public static void main (String[]args){

            Main obj = new Main();
            obj.Login();
            obj.register();

        }

    }
