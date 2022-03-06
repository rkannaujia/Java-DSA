package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String revstr="";
        for(int i=str.length()-1; i>=0; i--){
            char ch=str.charAt(i);//fetching each character from the string
            revstr+=ch;//adding each fetched character in new string
        }
        System.out.println(revstr);
    }
}
