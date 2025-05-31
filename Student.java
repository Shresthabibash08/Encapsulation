public class Student {
    private String studentName;
    private int studentId;
    private double GPA;
    public Student(String studentName,int studentid,double GPA){
        this.studentName=studentName;
        this.studentId=studentid;
        this.GPA=GPA;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public double getGPA(){
        return GPA;
    }
}
class details{
    public static void main(String[] args) {
        Student student1=new Student("Bibash",1,4.0);
        System.out.println(student1.getGPA());
    }
}