public class student {
    private int studnetid;
    private String studentname;
    private String studentphone;
    private String studeentcity;

//
//    public student(int studnetid, String studentname, String studentphone, String studeentcity) {
//        this.studnetid = studnetid;
//        this.studentname = studentname;
//        this.studentphone = studentphone;
//        this.studeentcity = studeentcity;
//    }

    public student(String studentname, String studentphone, String studeentcity) {
        this.studentname = studentname;
        this.studentphone = studentphone;
        this.studeentcity = studeentcity;
    }

    public student(){
        super();
        //yodo auto generte constructor
    }

    public int getStudnetid() {
        return studnetid;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public String getStudeentcity() {
        return studeentcity;
    }

    @Override
    public String toString() {
        return "student{" +
                "studnetid=" + studnetid +
                ", studentname='" + studentname + '\'' +
                ", studentphone='" + studentphone + '\'' +
                ", studeentcity='" + studeentcity + '\'' +
                '}';
    }
}
