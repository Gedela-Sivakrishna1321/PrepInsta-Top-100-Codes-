package Recursion;
import java.util.Scanner;

// Print F(N) th term, where F(4) = 1 + 2*3 + 4*5*6 + 7*8*9*10 = 5167

public class Question64 {

    // Time Complexity - O(n^2)
    public static long fNth_term(int num) {
        long fin_ans = 0;
        int multiple = 1;
        for(int i = 1; i <= num; i++) {
            long curr_ans = 1;
            for(int j = 1; j <= i; j++) {
                curr_ans *= multiple;
                ++multiple;
            }
            fin_ans += curr_ans;
        }

        return fin_ans;
    }

    // Recursive Approach - Time Complexity - O(n^2)
    public static long recApproach(int i, int N, long fin_ans, int multiple ) {
        // Base condition
        if(i ==  N + 1) {
            return fin_ans;
        }

        long curr_ans = 1;
        // Math logic
        for(int j = 1; j <= i; j++) {
            curr_ans *= multiple;
            ++multiple;
        }

        // Recursive call
        return recApproach(i + 1, N, fin_ans + curr_ans, multiple);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // System.out.println("F("+ N + ") term = " + fNth_term(N));
        System.out.println("F("+ N + ") term = " + recApproach(1, N, 0, 1));

        sc.close();

    }
    
}
