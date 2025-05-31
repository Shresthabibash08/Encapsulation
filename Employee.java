public class Employee {
    //Attribute
    private String name;
    private String jobTitle;
    private double salary;
    //Constructor
    public Employee(String name,String jobTitle,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setJobTitlw(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
}
class Information{
    public static void main(String[]args){
        Employee emp1=new Employee("Bibash","ML Engineer",100000);
        emp1.setSalary(2000000);
        System.out.println("Name= "+emp1.getName()+" Job Title= "+emp1.getJobTitle()+" Salary="+emp1.getSalary());
    }
}
