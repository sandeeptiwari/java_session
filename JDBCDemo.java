package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    private static String affectedRows;

    public static Connection conn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
    }

    public static void main(String[] args) throws SQLException 
    {
        try(Connection conn = conn();
            Statement stmt = conn().createStatement();
            ResultSet resultSet = stmt.executeQuery("Select * from user");
            ) 
        {
        	while(resultSet.next()) {
        		int id = resultSet.getInt(1);
        		String Fname = resultSet.getString("Fname");
        		String Lname = resultSet.getString("Lname");
        		int Salary = resultSet.getInt(4);
        		System.out.println( id +" "+Fname+ " "+Lname+ " "+Salary);
        		
        	}
        /*{
            //int affectedRows = stmt.executeUpdate("insert into user values (104, 'Saurabh', 'Pal', 30000)");
            //int affectedRows = stmt.executeUpdate("update account set amount=1000000 where id = 1");
            //int affectedRows1 = stmt.executeUpdate("delete from user where id=2");
        }*/
        

         //System.out.println("Affected Rows " + affectedRows1);
        }
    }
}
