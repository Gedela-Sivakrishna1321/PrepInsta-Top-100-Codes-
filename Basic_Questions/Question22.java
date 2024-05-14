package Basic_Questions;
import java.util.Scanner;
// Strong Number - A number in which sum of factorial of each digit of number is equal to the number is known 
                //    as Strong Number

public class Question22 {

    public static long fact(int num) {
        // Base case
        if(num == 1) {
            return num;
        }

        return num * fact(num - 1);
    }

    // Factorial of a number
    // Time Complexity - O(n)
    public static long factorial(int num) {
       
        long res = 1;

        for(int i = 1; i <= num; i++)
            res *= i;
        
        return res;
    }

    public static boolean isStrongIterativeApproach(int num) {

        long sum = 0;
        int temp = num;

        // Iterate through the digits of the number
        while(temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num ;
    }
   
    public static boolean isStrongRecursiveApproach(int num, int temp, int sum) {
        // Base case
        if(temp == 0) {
            return num == sum;
        }

        // Work
        int digit = temp % 10;
        sum += factorial(digit);
        
        // Recursive Step
        return isStrongRecursiveApproach(num, temp/10, sum);
    }
   
    public static void rangeOfStrongNumbers(int start, int end) {

        for(int i = start; i <= end; i++ ) {
           
            if(isStrongIterativeApproach(i)) {
                System.out.print(i + " ");
            }
        
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        // int end = sc.nextInt();
        // System.out.println(num + " is a strong number = " + isStrongRecursiveApproach(num, num, 0));
        // rangeOfStrongNumbers(start, end);
        System.out.println(fact(start));

        sc.close();
    }
    
}
