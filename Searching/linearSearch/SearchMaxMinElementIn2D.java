package Searching.linearSearch;

public class SearchMaxMinElementIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println("Maximum element in the matrix :"+serachMax(arr));
        System.out.println("Minimum element in the matrix :"+searchMinIn2D(arr));
    }
    static int serachMax(int [][] arr){
     if(arr.length==0){
         return Integer.MIN_VALUE;
     }
     int max=arr[0][0];
        for (int [] row : arr) {
            for (int element : row) {
                if (max<element) {
                    max=element;
                }
            }
        }
        return max;
        }
       static int searchMinIn2D(int [][] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min=arr[0][0];
           for (int [] row : arr) {
               for (int element : row){
                   if(min>element){
                       min=element;
                   }
               }
           }
           return min;
       }
}
