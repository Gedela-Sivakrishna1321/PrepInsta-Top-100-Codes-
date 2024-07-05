import java.util.Scanner;
// Program to find the power of number using RECURSION

public class Question55 {

    // Time Complexity - O(n) where n is the value of Power, Space Complexity - O(n)
    public static long power(int base, int power) {
        // Base case
        if(power == 0) {
            return 1;
        }

        // Recursive call
        return base * power(base, power-1);
        
    }
    
    // Work on the optimised code Tomorrow
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();

        long ans = power(base, power);
        System.out.println(base + " ^ " + power + " = " + ans);

        sc.close();
    }
}
