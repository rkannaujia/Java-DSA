package pattern;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        /**
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of "+n+" natural number : "+sum);
         **/

        //while loop
        /**
        int i=1;
        while(i<=n){
            sum+=i; //adding each number in sum variable
            i++;
        }
        System.out.println("sum of "+n+" natural number : "+sum);
         **/

        // do while loop
        int i=1;
        do{
            sum+=i;
            System.out.println("sum of "+i+" natural number : "+sum);
            i++;
        }while(i<=n);
    }
}
