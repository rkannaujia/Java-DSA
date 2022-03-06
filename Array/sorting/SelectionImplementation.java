package Array.sorting;

import java.util.Arrays;

public class SelectionImplementation {
    public static void main(String[] args) {
        int arr []={7,8,3,1,2};
        for(int i=0; i <arr.length-1; i++){
          int smallestIndex=i;
          for(int j=i+1; j< arr.length; j++){
              if(arr[smallestIndex]>arr[j]){
                  smallestIndex=j;
              }
          }
          int temp=arr[smallestIndex];
          arr[smallestIndex]=arr[i];
          arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
