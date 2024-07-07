package Recursion;
import java.util.Scanner;

// LCM of two numbers

public class Question61 {

    public static long hcf(long a, long b) {
        // Base case
        if(b == 0) {
            return a;
        }

        return hcf(b, a % b);
    }
    
    public static long lcm(long a, long b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println("LCM = "+lcm(num1, num2));

        sc.close();
    }
}
