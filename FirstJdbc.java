import java.sql.*;
class FirstJdbc
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/audax_labs";
			String username="root";
			String password="R5a7n3a2@";
			Connection con=DriverManager.getConnection(url,username,password);
			if (con.isClosed())
			{
				System.out.println("connection is closed");
			}else
			{
				System.out.println("connection created...");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}