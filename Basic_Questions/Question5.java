package Basic_Questions;
import java.util.Scanner;

// Program to find the sum of numbers in a range 

public class Question5 {

    public static int getSumInRange(int num1, int num2) {
        // Base case
        if(num1 == num2) {
            return num1;
        }

        return num1 + getSumInRange(num1 + 1, num2);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Approach 1 - Loops
        int sum1 = 0;
        for(int i = num1; i <= num2; i++)
            sum1 += i;
        System.out.println("Sum of all numbers b/w " + num1 + ", "+num2+" is : " + sum1);

        // Approach 2 - Formula
        int sum2 = (num2 * (num2 + 1))/2 - ((num1 - 1) * (num1))/2  ;
        System.out.println("Sum of all numbers b/w " + num1 + ", "+num2+" is : " + sum2);

        // Approach 3 - Recursion
        System.out.println("Sum of all numbers b/w " + num1 + ", "+num2+" is : " + getSumInRange(num1, num2));
        
        sc.close();
    }
    
}
