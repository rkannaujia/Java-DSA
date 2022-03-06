package OOPS;
import java.util.*;
public class functionOverloading {
    public static void main(String[] args) {
        Area circle=new Area();
        circle.r=10.2f;
        circle.areaMethod(circle.r);
        // triangle object
        Area triangle=new Area();
        triangle.l=10;
        triangle.b=12;
        triangle.areaMethod(triangle.l, triangle.b);
        //rectangle area
        Area rectangle=new Area();
        rectangle.l=13;
        rectangle.r=3.12f;
        rectangle.areaMethod(rectangle.l, rectangle.r);
    }
}
class Area{
    int l;
    float r;
    int b;
    public void areaMethod(float r){
        System.out.println("area of circle is "+(int)(3.14*(Math.sqrt(r))));
    }
    public void areaMethod(int l, int b){
        System.out.println("area of triangle is "+(l*b)/2);
    }
    public void areaMethod(int l, float b){
        System.out.println("area of rectangle is "+(int)(l*b));
    }

}
