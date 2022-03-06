package OOPS;

public class copyConstructor {
    public static void main(String[] args) {
     Car c1= new Car();
     c1.name="BMW";
     c1.color="Green";
     c1.speed=200;
     Car c2=new Car(c1);
     c2.display();
    }
}
class Car{
    String name;
    String color;
    int speed;
    Car(){
        System.out.println("without argument");
    }
    //copy constructor
    Car(Car c2){
        this.name=c2.name;
        this.color=c2.color;
        this.speed=c2.speed;
    }
    public void display(){
        System.out.println("Car name :"+this.name);
        System.out.println("Car color :"+this.color);
        System.out.println("Car speed :"+this.speed);
    }
}
