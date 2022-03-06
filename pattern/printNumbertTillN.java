package pattern;

import java.util.Scanner;
//print the n natural number using for,while and do while loop
public class printNumbertTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;//initializing the variable
        /**
        for(;i<=n;i++){
            System.out.print(i+" ");
        }
         **/
        /**
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
          **/
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=n);
    }
}
