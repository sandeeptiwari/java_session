import java.sql.*;

//import static java.lang.Class.forName;

public class Database {
    public static void main(String[] args) {

       String url="jdbc:mysql://localhost:3306/vendor";
       String username="root";
       String psw="root1234";
       try{
           System.out.println("Started");
           //Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection(url,username,psw);
           System.out.println("Connected");
           Statement stt=conn.createStatement();
           //ResultSet rslt = stt.executeQuery("select * from gardener_detail");
            int i = stt.executeUpdate("delete from gardener_detail where Gardener_id = 1");
            if(i==0){
                System.out.println("Not Deleted");
            }
            else{
                System.out.println("Deleted");
            }
           /*while(rslt.next()){
               System.out.println(rslt.getInt(1)+" "+rslt.getString(2)+" "+rslt.getString(3)+" "+rslt.getDate(4)+" "+rslt.getLong(5));
           }*/
           //conn.close();
       }
       catch (Exception e){
           e.printStackTrace();
           //System.out.println("catch blok call");
       }
    }
}
