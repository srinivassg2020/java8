package programes;

import java.util.Scanner;

public class ReverseNumberExample1 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

        int rev =0,r;
        while(n>0){
            r= n%10;
            rev= (rev * 10) + r;
            n=n/10;
        }
        System.out.println("Revers Number : "+rev);
    }
}
