package Basic_Questions;
import java.util.Scanner;

// Find Nth term in Fibonacci series 

public class Question17 {

    public static int nthFibonacciTerm(int n) {
        // Base case
        if(n == 1) {
            return 0;
        }

        if(n == 2) {
            return 1;
        }

        return nthFibonacciTerm(n - 1) + nthFibonacciTerm(n - 2);
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(nthFibonacciTerm(n));

        sc.close();
    }
}
