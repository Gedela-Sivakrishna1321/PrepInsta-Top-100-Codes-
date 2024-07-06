package Recursion;
import java.util.Scanner;
// Program to find the power of number using RECURSION

public class Question55 {

    // Time Complexity - O(n) where n is the value of Power, Space Complexity - O(n) for recursive stack
    public static long power(int base, int power) {
        
        // Base case x^0 = 1
        if(power == 0) {
            return 1;
        }

        // if we need to find 0^y = 0
        if(base == 0) {
            return 0;
        }

        // Recursive call
        return base * power(base, power-1);
        
    }
    
    // Time Complexity - O(log n) bacause we are calculating half the problem at every step, time reduced
    // Space Complexity - O(log n) because of recursive stack
    public static long powOptimised(int x, int y) {

        long temp;

        // When base is 0
        if(x == 0) {
            return 0;
        }

        // When Power is 0
        if(y == 0) {
            return 1;
        }

        temp = powOptimised(x, y/2);

        if(y % 2 == 0) {
            return temp * temp;
        }
        else {
            return x * temp * temp;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();

        long start = System.nanoTime();
        long ans = power(base, power);
        long end = System.nanoTime();
        long start2 = System.nanoTime();
        long ans2 = powOptimised(base, power);
        long end2 = System.nanoTime();

        System.out.println(base + " ^ " + power + " = " + ans);
        System.out.println("Time Taken = " + (end - start));
        System.out.println(base + " ^ " + power + " = " + ans2);
        System.out.println("Time Taken = " + (end2 - start2));

        sc.close();
    }
}
