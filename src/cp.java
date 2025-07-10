import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
   static Connection con;
    public static Connection createc(){
        // load driver
        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");

            //create the conncetion
            String user="root";
            String password="manas@123";
            String url="jdbc:mysql://localhost:3306/student_manage";
            con= DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }

}
