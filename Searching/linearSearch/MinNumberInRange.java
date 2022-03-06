package Searching.linearSearch;

public class MinNumberInRange {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,6,4,5,7,8,13,12};
        System.out.println(minNumberGivenRange(arr,5,9));
    }
    static int minNumberGivenRange(int []arr,int start,int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int min=arr[start];
        for(int i=start; i<=end; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
