package programes;

import java.util.Scanner;

public class PrimeExample {
    public static void main (String[] args){
        // 2, 3, 5 , 7, 11, 13, 17 ..
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c=0;

        for(int i=2; i<=n;i++){
            if (n%i==0){
                c++;
            }
        }
        if(c>2 ){
            System.out.println("Not Prime Number");
        }else{
            System.out.println(n+" Prime Number");
        }
    }
}
