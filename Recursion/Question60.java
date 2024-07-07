package Recursion;
import java.util.Scanner;

// HCF of two numbers

public class Question60 {
    
    public static long hcf(long num1, long num2) {
        // Base case
        if(num1 == 0) {
            return num2;
        }

        if(num2 == 0) {
            return num1;
        }

        if(num1 == num2) {
            return num1;
        }

        // Logic
        if(num1 > num2) {
            num1 = num1 - num2;
        }
        else {
            num2 = num2 - num1;
        }

        // Recursive Call
        return hcf(num1, num2);
    }

    public static long moduloDivisionApproach(long a, long b) {
        // Base case
        if(b == 0) {
            return a;
        }

        return moduloDivisionApproach(b, a % b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println(moduloDivisionApproach(num1, num2));


        sc.close();
    }
}
