package string;

import java.util.Scanner;

public class DefangIPAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1.1.1.1        <=input
        //1[.]1[.]1[.]1  <=output
        String ip= sc.next();
        System.out.println(defangIpAddr(ip));
    }
    static String defangIpAddr(String address){
        String defangIP="";
        for(int i=0; i<address.length(); i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                defangIP+="[.]";
            }else {
                defangIP+=ch;
            }
        }
        return defangIP;
    }
}
