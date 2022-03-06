package collection.LIST;

import java.util.ArrayList;
import java.util.List;

public class ARRAYLIST {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>() ;
        List<Integer> list1=new ArrayList<>() ;
        list.add("rahul");
        list.add("ram");
        list.add("kannaujia");
        System.out.println("list ->"+list);

       list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("list ->"+list1);
    }
}
