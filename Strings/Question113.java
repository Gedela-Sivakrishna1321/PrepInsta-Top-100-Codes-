package Strings;
// Check if a String is Palindrome
import java.util.Scanner;

public class Question113 {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static boolean isPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return true;
        }

        int n = str.length();
        for(int i = 0; i < n; i++ ) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(isPalindrome(str));
        sc.close();
    }
}
