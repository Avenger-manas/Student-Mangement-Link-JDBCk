import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws IOException {
        //to aurti generete method stub
        System.out.println("Welcome To Student Managment App");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 Add Student");
            System.out.println("Press 2 Delete Student");
            System.out.println("Press 3 Update Student");
            System.out.println("Press 4 Display Studnet");
            System.out.println("Press 5 To Exit App");
            int c=Integer.parseInt(br.readLine());
            if(c==1){
                //add student
                System.out.println("enter user name");
                String name=br.readLine();
                System.out.println("enter user phone number");
                String phone=br.readLine();
                System.out.println("enter user city");
                String city= br.readLine();

                //create student object to store student
                student st=new student(name,phone,city);
               boolean ans= Studentdao.insertStudentToDB(st);
               if(ans){
                   System.out.println("Succesfuly added");
               }else{
                   System.out.println("Failed added wrong");
               }
            }else if(c==2){
                //delete student
                System.out.println("Enter the Student Id to Delete");
                int userid=Integer.parseInt(br.readLine());
               boolean f=Studentdao.deletestudent(userid);
               if(f){
                   System.out.println("Succesfully deleted");
               }else{
                   System.out.println("oh no Delete Wrong");
               }


            }else if(c==3){
                System.out.println("Enter The Student Id");
                int id=Integer.parseInt(br.readLine());
                System.out.println("Enter The NEW Name");
                String sname=br.readLine();
                System.out.println("Enter the Student New Phone Number");
                String sphone=br.readLine();
                System.out.println("Enter the Studnet New City");
                String scity=br.readLine();
                String[] updayedata={sname,sphone,scity};
                boolean f=Studentdao.update(id,"",updayedata);
                if(f){
                    System.out.println("Succesfully");
                }else{
                    System.out.println("not Succsfully");
                }

            }
            else if(c==4){
                //display
                System.out.println("Processing Of Display");
                Studentdao.showall();

            }else if(c==5){
                //exit
                break;
            }else{
                System.out.println("Envailid Out Og STATMENT");
            }
        }
        System.out.println("Thankyou My using Application");
        System.out.println("See you Soon");
    }
}