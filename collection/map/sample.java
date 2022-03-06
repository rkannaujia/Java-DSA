package collection.map;

import java.util.HashMap;
import java.util.Map;

public class sample {
    public static void main(String[] args) {
        Map<String,Integer> student=new HashMap<String,Integer>();
        student.put("Rahul",1);
        student.put("Rohit",2);
        student.put("pavan",3);
        student.put("Ram",4);
       for(Map.Entry<String, Integer> entry : student.entrySet()){
           System.out.println("name: "+entry.getKey()+" ,Age: "+entry.getValue());
       }
    }
}
