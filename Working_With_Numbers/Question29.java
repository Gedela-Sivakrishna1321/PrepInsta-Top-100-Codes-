package Working_With_Numbers;
import java.util.Scanner;

/*  HCF(Highest Common Factor) - The largest number which divides both the numbers  */

public class Question29 {

    // Time Complexity - O(n)
    public static long naiveApproach(long num1, long num2) {

        long min = Math.min(num1, num2);

        for(long i = min; i >= 0; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }

        return -1;
    }

    // Time Complexity - O(n) or O(max(a, b)) because in worst case num1 = n, num2 = 1, It has to perform n - 1 steps
    public static long repeatedSubstraction(long num1, long num2) {

        while(num1 != num2) {
           
            if(num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
       
        }

        return num1;
    }

    public static long repeatedSubstractionRecursion(long num1, long num2) {
        // Base case
        if(num1 == num2) {
            return num1;
        }

        if(num1 > num2) {
            return repeatedSubstractionRecursion(num1 - num2, num2);
        }
        else {
            return repeatedSubstractionRecursion(num1, num2 - num1);
        }

    }

    // Modulo Method
    public static long moduloDivision(long a, long b) {
        return b == 0 ? a : moduloDivision(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        System.out.println("HCF is : " + moduloDivision(num1, num2));
        // Long num = (long) 9223372036854775807;
        // System.out.println(num1);
        // System.out.println(num2);

        sc.close();
    }
}