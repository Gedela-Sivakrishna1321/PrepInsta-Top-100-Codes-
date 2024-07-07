package Recursion;
import java.util.Scanner;

// Reverse a Number - recursive Approach

public class Question59 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static long reverse(long num, long rev) {
        // Base case
        if(num == 0) {
            return rev;
        }

        // Logic
        long digit = num % 10;
        rev = rev * 10 + digit;

        // Recursive call
        return reverse(num/10, rev);
    }

    public static void printReverse(long num) {
        // Base case
        if(num < 10) {
            System.out.println(num);
            return;
        }

        // Logic - Print the last digit of number everytime
        System.out.print(num % 10);

        // Recursive call - Call the function for the rest of the number excluding last digit 
                            // because it's already printed
        printReverse(num / 10);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        // System.out.println("Reverse = "+reverse(num, 0));
        printReverse(num);

        sc.close();

    }

}