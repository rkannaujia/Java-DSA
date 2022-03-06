package Searching.linearSearch;

import java.util.*;
public class SearchInString {
    public static void main(String[] args) {
       String str="Rahul kannaujia";
       char target='a';
       System.out.println(linearSearchInString(str,target));//print true if element character is found in string
    }
 static boolean linearSearchInString(String str, char target){
        if(str.length()==0){
            return false;
        }
        /**
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
         **/
        //make string to a character array and run for loop iterating all over the char arr element
     for(char ch : str.toCharArray()){
         if(ch==target){
             return true;
         }
     }
        return false;
 }
}
