package Searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arrAsc={1,2,3,4,4,5};
        int [] arrDesc={5,4,3,2,1,-2};
        System.out.println("Element found at index no. : "+orderAgnostic(arrAsc,3));
        System.out.println("Element found at index no. : "+orderAgnostic(arrDesc,-2));
    }
    static int orderAgnostic(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        //find whether is array is sorted is ascending or descending order
        boolean isAsc; //declare a variable to check whether the array is ASc or Desc order
        //we will compare first and last element to check array is Asc or Desc
        if(arr[start]<arr[end]){
            isAsc=true;
        }else{
            isAsc=false;
        }
        //above from line no. 14 to 20 can be written => boolean isAsc =arr[start]<arr[end];
        //if isAsc=true that means array is in Ascending order
        if(isAsc){
            while (start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target > arr[mid]){
                    start=mid+1;
                }else if( target < arr[mid]){
                    end=mid-1;
                }
            }
        }
        //if isAsc=false that means  array is in descending order
        else{
            while (start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }else if(target < arr[mid]){
                    start=mid+1;
                }else if( target > arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
