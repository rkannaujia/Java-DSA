package string;

public class CheckStringEquivalentOfTwoArray {
    public static void main(String[] args) {
        String [] arr1={"ab","c"};
        String [] arr2={"a","bc"};
        System.out.println(arrayStringsAreEqual(arr1,arr2));

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     String str1="";
        String str2="";
     for(int i=0; i<word1.length;i++){
         str1+=word1[i];
     }
        for(int i=0; i<word2.length;i++){
            str2+=word2[i];
        }
        return str1.equals(str2);
    }
}
