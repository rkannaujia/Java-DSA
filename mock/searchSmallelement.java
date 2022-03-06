
package mock;

public class searchSmallelement {
    public static void main(String[] args) {
        int arr[] = {-1, -1, 4, 56, 67};
        int k = 34;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                count++;
            }
        }

        System.out.println(count);
    }
}