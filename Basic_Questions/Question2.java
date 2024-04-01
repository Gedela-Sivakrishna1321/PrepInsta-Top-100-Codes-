package Basic_Questions;
import java.util.Scanner;

// Program to Check Whether a Number is Even or Odd

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // Approach 1 - Terenary Operator
        System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");

        // Approach 2 - If else statements
        if(num % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        // Approach 3 - Bitwise Operator
        System.out.println(((num & 1) == 0) ? "Even Number" : "Odd Number");

        sc.close();
    }
}
