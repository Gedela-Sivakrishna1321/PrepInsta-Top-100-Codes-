package Basic_Questions;
import java.util.Scanner;

//  Find the Sum of First N Natural Numbers

public class Question3 {

    public static int sumOfNaturalNums(int num) {
        // Base case
        if(num == 1)    
            return num;
        
        //  Recursive Call
        int sum = num + sumOfNaturalNums(num - 1);
        
        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Approach 1 - Loops
        int sum = 0;
        for(int i = 1; i <= num; i++)   
            sum += i;
        System.out.println("Sum of First " + num + " natural numbers is : " + sum );

        // Approach 2 - Recursion
        System.out.println("Sum of First "+ num + " natural numbers is : " + sumOfNaturalNums(num));

        // Approach 3 - Formula
        System.out.println("Sum of First " + num + " natural numbers is : " + (num * (num + 1))/2);

        sc.close();
    }
}