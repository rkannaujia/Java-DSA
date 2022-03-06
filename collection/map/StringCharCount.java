package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(map.containsKey(ch)==true){
                int count=map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
