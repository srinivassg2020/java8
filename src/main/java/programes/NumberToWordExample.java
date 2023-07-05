package programes;

import java.util.Scanner;

public class NumberToWordExample {
    /*enum WordInOnce{
        ONE, TEO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        ELEVEN , TWELVE, THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN, NINETEEN,
        TWENTY, THIRTY, FOURTY, FIFTY, SIXTY, SEVENTY, EIGHTy, NINETY, HUNDRED, THOUSAND

    }
    enum WordInTens{

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n<=0){
            System.out.println("Not Positive Number:");
        }
        int disit= 0;
        while(n>0){
            if(n%10 >0 ){
                disit++;
            }
        }


    }*/
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 12345678;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 1234567;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 123456;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 12345;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 1234;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 123;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 12;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 1;
        System.out.println(n+" To "+convertNumberToWord(n));
        n = 0;
        System.out.println(n+" To "+convertNumberToWord(n));
    }

    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "Zero";
        }
        if (number < 0) {
            return "Minus " + convertNumberToWord(Math.abs(number));
        }
        if (number < 20) {
            return units[number];
        }
        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }
        if (number < 1000) {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + convertNumberToWord(number % 100);
        }
        if (number < 100000) {
            return convertNumberToWord(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWord(number % 1000);
        }
        if (number < 10000000) {
            return convertNumberToWord(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " : "") + convertNumberToWord(number % 100000);
        }
        if (number < 1000000000) {
            return convertNumberToWord(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " : "") + convertNumberToWord(number % 10000000);
        }
        return "Number out of range";
    }

}
