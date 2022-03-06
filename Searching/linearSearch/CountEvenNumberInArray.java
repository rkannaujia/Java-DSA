package Searching.linearSearch;

public class CountEvenNumberInArray {
    public static void main(String[] args) {
        int[] nums = {12,345,22,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0; i<nums.length; i++){
            int count=0;
            int n=nums[i];
            while(n > 0){
                n=n/10;
                count++;
            }
            if(((count&1)==0)){
                evenCount++;
            }
        }
        return evenCount;
    }

}
