package Recursion;
import java.util.Scanner;
// Find the last non zero digit 

public class Question66 {

    public static long factorial(int num) { // Time Complexity - O(num)
        // Base case
        if(num == 0 || num == 1) {
            return 1;
        }

        return num * factorial(num-1);

    }

    public static byte lastNonZeroDigit(long num) {

        String str = String.valueOf(num);
        byte digit = 0;

        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int val = Character.getNumericValue(ch);
            if( val != 0) {
                 digit = (byte) val;
                 break;
            }
        }

        return digit;
    }
    
    // Time Complexity - O(n)
    public static byte straightForwardApproach(long fact) {

        while(fact % 10 == 0) {
            fact /= 10;
        }

        return (byte)(fact%10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        long fact_num = factorial(num);
        byte digit = lastNonZeroDigit(fact_num);

        // System.out.println("Factorial = " + fact_num);
        System.out.println("Last non zero Digit = " + digit);
        System.out.println("Last non zero Digit = " + straightForwardApproach(fact_num));

        sc.close();

    }
    
}
