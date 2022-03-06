package Searching.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,6,4,5,7,8,13,12};
        int target=3;
        System.out.println(sraechInRange(arr,target,2,7));

    }
    static int sraechInRange(int arr[], int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
