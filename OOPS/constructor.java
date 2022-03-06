package OOPS;

public class constructor {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("rahul kannaujia",26);
        e2.display();
    }
}
class Employee{
    String name;
    int age;
    Employee(){
        System.out.println("without argument");
    }
    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name :"+this.name);
        System.out.println("age :"+this.age);
    }
}
