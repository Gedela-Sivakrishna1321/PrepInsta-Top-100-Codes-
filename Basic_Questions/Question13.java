package Basic_Questions;
import java.util.Scanner;

// Palindrome Number 

public class Question13 {

    // Linear Time Complexity O(n)
    public static boolean isPalindrome(int num) {

        if(num < 0) {
            return false;
        }

        int rev = 0, temp = num;

        while(temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return num == rev;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(isPalindrome(num) ? "Palindrome Number" : "Not a Palindrome Number");

        sc.close();
    }
}