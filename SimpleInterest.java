public class SimpleInterest {
    //Attributes
    private double principal;
    private double time;
    private double rate;
    //Constructor
    public SimpleInterest(){

    }
    //Setters
    public void setPrincipal(double principal){
        this.principal=principal;
    }
    public void setTime(double time){
        this.time=time;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    //Getters
    public double getPrincipal(){
        return principal;
    }
    public double getTime(){
        return time;
    }
    public double getRate(){
        return rate;
    }
    //Simple Interest Calculation
    public double getSimpleInterest(){
        double si=(getPrincipal()*getTime()*getRate())/100;
        return si;
    }
}
    class Input{
        public static void main(String[] args) {
            SimpleInterest input=new SimpleInterest();
        input.setPrincipal(11111.11);
        input.setTime(5);
        input.setRate(15);
        System.out.println("The simple interest is: "+input.getSimpleInterest());
        }
    }
