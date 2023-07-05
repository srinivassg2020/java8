package programes;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t=n, r=0, sum=0;
        while (n>0 ){
            r = n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==t){
            System.out.println("Palendrome");
        }else{
            System.out.println("not Palendrome");
        }
    }
}
