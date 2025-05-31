public class Circle{
    //Attribute
    private int radius;
    //Constructor
    public Circle(){
        }
    //Setter
    public void setRadius(int radius){
        this.radius=radius;
    }
    //Getter
    public int getRadius(){
        return radius;
    }
    //Area calculation
    public double getArea(){
        double area=Math.PI*Math.pow(getRadius(),2);
        return area;
    }
    //Area calculation
    public double getCircumference(){
        double circumference=2*Math.PI*getRadius();
        return circumference;
    }
}
class Calcuation{
        public static void main(String[]args){
            Circle calculation=new Circle();
            calculation.setRadius(10);
            System.out.println("The radius of circle is: "+calculation.getRadius());
            System.out.println("The area of circle is: "+calculation.getArea());
            System.out.println("The circumference of circle is: "+calculation.getCircumference());

            
        }
    }