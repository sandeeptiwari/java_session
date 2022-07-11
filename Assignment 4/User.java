package assignment4;

import java.sql.*;
import java.util.Scanner;

public class User {

    Connection con = null;
    Statement stmt = null;
    ResultSet resultSet = null;
    
    void register()
    {
        System.out.println("Register Here");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the User Id: ");
        int id = sc.nextInt();
        System.out.print("Enter the User Name: ");
        String username = sc.next();
        System.out.print("Set the Password: ");
        String password = sc.next();
        System.out.print("Enter Your First Name: ");
        String firstname = sc.next();
        System.out.print("Enter the Last Name: "); 
        String secondname = sc.next();
        System.out.print("Enter the Age: ");
        int aGe = sc.nextInt();
        System.out.println("Enter Hobby: ");
        String hobby = sc.next();
        System.out.println("Enter Account Number: ");
        int accno = sc.nextInt();
        System.out.println("Enter Balance: ");
        int balance = sc.nextInt();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Mukesh@7250");
            if(con!=null)
            {
                stmt = con.createStatement();
            }
            if(stmt!=null)
            {
                resultSet = stmt.executeQuery("select * from user");
            }
            int affectedrow = stmt.executeUpdate("insert into user(Id,UserName,Password,FirstName,LastName,Age,Hobby,AccountNo,Balance) values (id,UserName,Password,FirstName,LastName,Age,Hobby,AccountNo,Balance)");
            System.out.println(affectedrow);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
    void Login()
    {
        System.out.print("Enter your UserName: ");
        Scanner sc = new Scanner(System.in);
        String uname = sc.next();
        System.out.print("Enter your Password: ");
        String pswd = sc.next();

        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Mukesh@7250");
            if(con!=null)
            {
                stmt = con.createStatement();
            }
            if(stmt!=null)
            {
                resultSet = stmt.executeQuery("select * from user");
            }
            
            System.out.println("Connected");
            if(resultSet!=null) 
            {
                int i = 0;
                while (resultSet.next()) 
                {

                    String str = resultSet.getString("UserName");
                    String psd = resultSet.getString("Password");

                    if (str.equals(uname) && psd.equals(pswd))
                    {
                        i = i+1;
                    }
                    else
                    {
                        i=i;
                    }


                }
                if (i>0)
                {
                    System.out.println("You are Login Successfully ");
                }
                else 
                {
                    System.out.println("You entered wrong UserName and Password. ");
                }
            }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

    }
   

    public static void main(String[] args) {
        User u = new User();

        u.Login();
        //u.register();
    }
}