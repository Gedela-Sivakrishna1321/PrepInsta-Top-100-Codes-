package Arrays;

import java.util.Scanner;
import java.util.Arrays;
// Find the Longest Palindrome in an Array

public class Question84 {

    public static long longestPalindrome(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        long result = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(isPalindrome(arr[i])) {
                result = arr[i];
                break;
            }
        }

        return result;
    }

    public static boolean isPalindrome(int num) {

        String str = String.valueOf(num);
        int n = str.length();

        for(int i = 0; i < n/2; i++ ) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        long longestPalindrome = longestPalindrome(arr);
        System.out.println("Longest Palindrome in the array = " + longestPalindrome);
        sc.close();
    }
}
