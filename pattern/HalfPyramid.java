package pattern;

public class HalfPyramid {
    public static void main(String[] args) {
    int n=5;
        /**
         * i=1 j=1
         ** i=2 j=2
         *** i=3 j=3
         **** i=4 j=4
         ***** i=5 j=5
         **/
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
