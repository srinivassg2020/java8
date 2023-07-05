package programes;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 5
        // 1 * 2 * 3 * 4 *5
        int f=1;
        for( int i =1; i<=5; i++ ){
            f=f*i;

        }
        System.out.println("Factorial: "+f);
    }
}
