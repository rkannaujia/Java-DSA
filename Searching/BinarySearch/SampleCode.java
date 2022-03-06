package Searching.BinarySearch;

public class SampleCode {
    public static void main(String[] args) {
        int arr[]={2,3,8,10,16,25};
        int target=25;
        int index=BinarySearchAtIndex(arr,target);
        System.out.println("Element found at index number :"+index);
    }
    //return the index
    //return -1 if does not exists
    static int BinarySearchAtIndex(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; might be possible that(start+end) exceed the range of int in java
           int mid=start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }else if(target>arr[mid]){
               start=mid+1;
           }else{
               //ans found
               return mid;
           }
        }
       return -1;
    }
}
