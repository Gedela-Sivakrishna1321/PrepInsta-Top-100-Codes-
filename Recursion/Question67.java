package Recursion;
import java.util.Scanner;
// Print the Nth Row of a Pascal triangle

public class Question67 {

    // Time Complexity - O(N), Space Complexity - O(1)
    public static void printNthPascalRow(int n) {

        int prev = 1;
        System.out.print(1 + ", ");

        for(int i = 1; i <= n; i++) {
            int curr = prev * (n+1-i)/i;
            System.out.print(curr + ", ");
            prev = curr;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printNthPascalRow(N);

        sc.close();
    }
}
