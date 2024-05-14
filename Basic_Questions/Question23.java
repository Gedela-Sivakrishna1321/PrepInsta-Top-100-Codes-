package Basic_Questions;
import java.util.Scanner;

// Perfect Number - The number which is equal to the sum of it's factors excluding the number itself is known as
                  // perfect number

public class Question23 {
    
    // Time Complexity - O(n)
    public static boolean isPerfectNumber(int num) {

        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        return num == sum;
    }

    public static boolean isPerfectNumberRecursiveApproach(int num, int i, int sum) {
        // Base case
        if( i <= num / 2) {
            
            // Work
            if(num % i == 0) {
                sum += i;
            }
    
            isPerfectNumberRecursiveApproach(num, i + 1, sum);

        }

        return sum == num;
    }

    public static void rangeOfPerfectNumbers(int start, int end) {

        for(int i = start; i <=end; i++) {
            if(isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        // System.out.println(isPerfectNumber(num));
        // System.out.println(isPerfectNumberRecursiveApproach(num, 1, 0));
           rangeOfPerfectNumbers(start, end);
        sc.close();
    }
}
