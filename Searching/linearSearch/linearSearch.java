package Searching.linearSearch;

import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,24,23,64,87,23,-1};
        System.out.println(linearSearchAtIndex(arr,23));//printing the index number
        System.out.println(linearSearchElement(arr,-1));//printing the element
        System.out.println(linearSearchBoolean(arr,55));// printing true and false
    }
    //return the index number
    static int linearSearchAtIndex(int []arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return  -1;
    }
    //return the element
    //-1 can be an element so return a MAX_VALUE
    static int linearSearchElement(int arr[],int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int element : arr){
            if(element== target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    //return true if element exist otherwise return false
    static boolean linearSearchBoolean(int []arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int element : arr){
            if(element== target){
                return true;
            }
        }
        return false;
    }
}
