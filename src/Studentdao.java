import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {
    public static boolean insertStudentToDB(student st) {
        boolean flag = false;
        //jdbc code
        try {
            Connection con = cp.createc();

            String q = "insert into student(sname,sphone,scity) values(?,?,?)";
            //prepared statment
            PreparedStatement psmt = con.prepareStatement(q);

            //set the valuse of parameter
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getStudentname());
            pstmt.setString(2, st.getStudentphone());
            pstmt.setString(3, st.getStudeentcity());

            pstmt.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean deletestudent(int userid) {
        boolean flag = false;
        try {
            Connection con = cp.createc();

            String q = "delete from student where sid=?";
            //prepared statment
            PreparedStatement psmt = con.prepareStatement(q);

            //set the valuse of parameter
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userid);

            pstmt.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static void showall() {
        boolean flag = false;
        try {
            Connection con = cp.createc();

            String q = "select * from student;";
            //prepared statment
            Statement stmt = con.createStatement();
           Resultset set= (Resultset) stmt.executeQuery(q);

           while(((ResultSet) set).next()){
               int id= ((ResultSet) set).getInt(1);
               String name= ((ResultSet) set).getString(2);
               String  phone= ((ResultSet) set).getString(3);
               String city= ((ResultSet) set).getString(4);
               System.out.println("ID :"+id);
               System.out.println("NAME :"+name);
               System.out.println("PHONE :"+phone);
               System.out.println("CITY :"+city);
               System.out.println("_+_+_+_+_+_+_+_+_+_+_+_");

           }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean update(int id, String s,String[] str) {
        boolean flag = false;
        try{
            Connection con = cp.createc();

            String q = "UPDATE student SET sname=?,sphone=?,scity=? WHERE sid=?";
            //prepared statment
            PreparedStatement psmt = con.prepareStatement(q);

            //set the valuse of parameter
            psmt.setString(1, str[0]);
            psmt.setString(2, str[1]);
            psmt.setString(3, str[2]);
            psmt.setInt(4,id);
           int roesafected=psmt.executeUpdate();
           if(roesafected>0){
               flag=true;
           }
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
