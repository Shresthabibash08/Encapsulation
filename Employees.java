public class Employees {
    private String empName;
    private int empId;
    private double empSalary;
    public double decreaseAmount;
    public double increaseAmount;
    public Employees(String empName,int empId,double empSalary){
        this.empName=empName;
        this.empId=empId;
        this.empSalary=empSalary;
    }
    public void setName(String empName){
        this.empName=empName;
    }
    public void setId(int empId){
        this.empId=empId;
    }
    public void decrementSalary(double decreaseAmount){
        double updatedSalary=empSalary-decreaseAmount;
        if(updatedSalary<0){
            System.out.println("Can't decreased salary this much.");
        }
        else{
            empSalary=updatedSalary;
            System.out.println("Increment ");
        }
    }
     public void incrementSalary(double increaseAmountAmount){
        double updatedSalary=empSalary+decreaseAmount;
        empSalary=updatedSalary;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpId(){
        return empId;
    }
    public double getEmpSalary(){
        return empSalary;
    }
}
class empDetailed{
    public static void main(String[] args) {
        Employees emp1=new Employees("Bibash", 1, 100000);
        emp1.decrementSalary(10000);
    }
}
