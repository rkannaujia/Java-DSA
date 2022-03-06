package Array.sorting;

import java.util.Arrays;

public class BubbbleImplementationUsingFunction {
    // time compexity O(N^2)

    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};
        arr=bubble(arr);
        System.out.print(Arrays.toString(arr));

    }
    static int [] bubble(int arr []){
        for(int i=0;i< arr.length-1; i++){
            for(int j=0;j< arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
