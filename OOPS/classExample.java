package OOPS;

public class classExample {
    public static void main(String[] args) {
      Student s1=new Student();
      s1.name="Rahul";
      s1.age=26;
      s1.display();
    }
}
class Student{
    String name;
    int age;
    public void display(){
        System.out.println("name :"+this.name);
        System.out.println("age :"+this.age);
    }
}
