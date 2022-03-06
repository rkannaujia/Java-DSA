package collection.SET;

import java.util.HashSet;
import java.util.Set;

public class HashSET {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<String> set1=new HashSet<>();
        set.add(13);
        set.add(10);
        set.add(11);
        set.add(9);
        set.add(-13);
        set.add(null);
       // set.add(null);we can add null value only once
        System.out.println("set :"+set);
        set1.add("Rahul");
        set1.add("kannaujia");
        System.out.println("set :"+set1);
        set1.remove("kannaujia");
        System.out.println("set :"+set1);
    }
}
