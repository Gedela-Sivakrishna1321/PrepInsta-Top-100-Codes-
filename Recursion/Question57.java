package Recursion;
import java.util.Scanner;

// Program to find the largest number in an array

public class Question57 {

    // Time Complexity - O(n)
    public static int largest(int arr[], int i, int max) {
        // Base case
        if(i == arr.length) {
            return max;
        }

        // Math logic
        max = Math.max(max, arr[i]);

        // recursive call
        return largest(arr, i + 1, max);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(largest(arr, 0, Integer.MIN_VALUE));
        
        sc.close();
    }
}
