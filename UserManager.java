

import java.sql.*;
import java.util.Scanner;




import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    int id;// = sc.nextInt();
    String UserName;// = sc.next();
    String Password;// = sc.next();
    String FirstName;// = sc.next();
    String LastName;// = sc.next();
    int age;// = sc.nextInt();
    String Hobby;// = sc.next();
    int AccountNo;// = sc.nextInt();
    int Balance;// = sc.nextInt();

    public int getId() {
        id = sc.nextInt();
        return id;
    }

    public String getUserName() {
        UserName = sc.next();
        return UserName;
    }

    public String getPassword() {
        Password = sc.next();
        return Password;
    }

    public String getFirstName() {

        FirstName = sc.next();
        return FirstName;
    }

    public String getLastName() {
        LastName = sc.next();
        return LastName;
    }

    public int getAge() {
        age = sc.nextInt();
        return age;
    }

    public String getHobby() {
        Hobby = sc.next();
        return Hobby;
    }

    public int getAccountNo() {
        AccountNo = sc.nextInt();
        return AccountNo;
    }

    public int getBalance() {
        Balance = sc.nextInt();
        return Balance;
    }
}





public class UserManager extends User {
    Connection con = null;
    Statement stmt = null;
    PreparedStatement mystmt = null;
    ResultSet resultset = null;

    void Login() throws SQLException {
        System.out.print("Enter your userName : ");
        Scanner sc = new Scanner(System.in);
        String usrname = sc.next();
        System.out.print("Enter your Password : ");
        String Pswrd = sc.next();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
            if (con != null) {
                stmt = con.createStatement();
            }
            if (stmt != null) {
                resultset = stmt.executeQuery("select * from UserTable");
                System.out.println("Connected");
            }

            if (resultset != null) {
                int i = 0;
                while (resultset.next()) {

                    String str = resultset.getString("UserName");
                    String psd = resultset.getString("Password");

                    if (str.equals(usrname) && psd.equals(Pswrd)) {
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

        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    void register(User usr){
        System.out.println("Fill the required details to register ");

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

            System.out.println("Enter Id > UserName > Password > FirstName > LastName > Age > Hobby > AccountNo > Balance");

        String sql = "INSERT into UserTable (id,UserName,Password,FirstName,LastName,age,Hobby,AccountNo,Balance)";
        sql += "VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,usr.getId());
        ps.setString(2,usr.getUserName());
        ps.setString(3,usr.getPassword());
        ps.setString(4,usr.getFirstName());
        ps.setString(5,usr.getLastName());
        ps.setInt(6,usr.getAge());
        ps.setString(7,usr.getHobby());
        ps.setInt(8,usr.getAccountNo());
        ps.setInt(9,usr.getBalance());

        ps.execute();
        System.out.println("It's working fine >> Now check your database ");
        ps.close();
        }
        catch (SQLException e){
        e.printStackTrace();
    }
    }




    public static void main(String[] args) throws SQLException {
        UserManager obj = new UserManager();
        //obj.Login();
        User usr = new User();
        obj.register(usr);
    }
}
