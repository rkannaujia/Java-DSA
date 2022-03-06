package pattern;

import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
       // printTableUsingFor(n);
        printTableUsingWhile(n);
    }
    /**
    static void printTableUsingFor(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
     }
     **/
    static void printTableUsingWhile(int n){
        int i=1;

        while(i<=n){
            int j=1;
            while (j<=10) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            i++;
        }

    }
}
