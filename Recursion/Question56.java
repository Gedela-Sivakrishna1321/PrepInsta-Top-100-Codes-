package Recursion;
import java.util.Scanner;

// Program to check if a number is Prime Number through Recursion

public class Question56 {

    // Time Complexity - O(sqrt(n)), Space Complexity - O(sqrt(n))
    public static boolean isPrime(int num, int i) {
        
        // Handle All the corner cases first
        if(num <= 1) {
            return false;
        }
        
        if(num == 2) {
            return true;
        }
        
        if(num % 2 == 0) {
            return false;
        }
        
        // Base case
        if(i <= Math.sqrt(num)) {

            // Math logic
            if(num % i == 0) {
                return false;
            }

            return isPrime(num, i + 2);

        }
        
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPrime(num, 3));

        sc.close();
    }
    
}
