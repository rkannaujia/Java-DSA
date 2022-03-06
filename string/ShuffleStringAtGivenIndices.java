package string;

import java.util.Arrays;

public class ShuffleStringAtGivenIndices {
    public static void main(String[] args) {
        //input => String = codeleet, indices = [4,5,6,7,0,2,1,3]
        //output => leetcode
        String str="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println("string : "+str+", indices : "+ Arrays.toString(indices));
        System.out.println("shuffeled string : "+shuffleString(str,indices));
    }
    static String shuffleString(String s, int [] indices){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.setCharAt(indices[i],s.charAt(i));
        }
        return sb.toString();
    }
}
