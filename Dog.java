public class Dog {
    //Attributes
    private String name;
    private String breed;
    //Constructor
    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
}
class Example{
    public static void main(String[] args) {
        //Creating Object of Class
       Dog dog1=new Dog("Seri","Golden Retirver");
        Dog dog2=new Dog("Lily","German Shepherd");
        //Setting name of object through setters
        dog1.setName("Puppy");
        dog1.setBreed("BullDog");
        System.out.println("The name of dog1 is "+dog1.getName()+" and breed is "+dog1.getBreed());
        System.out.println("The name of dog2 is "+dog2.getName()+" and breed is "+dog2.getBreed()); 
    }   
    }
