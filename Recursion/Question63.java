package Recursion;
import java.util.Scanner;

// All Permutations of String

public class Question63 {

    // Time Complexity - O(n * n!) because for printing each permutation it takes O(n) time
    // and totally there are N! Permutations
    // Space Complexity - O(n * n!)
    public static void permuteOf(String str, String ans) {

        // Base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // current char

            String rem = str.substring(0, i) + str.substring(i+1); // String excluding current char

            permuteOf(rem, ans + ch);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        permuteOf(str, "");


        sc.close();
    }
    
}
