package Recursion;
import java.util.Scanner;

// Program to find the smallest number in an array using Recursion

public class Question58 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static int smallest(int arr[], int i, int smallest) {
        // Base case
        if(i == arr.length) {
            return smallest;
        }

        // Math Logic
        smallest = Math.min(smallest, arr[i]);

        // Recursive call
        return smallest(arr, i + 1, smallest);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(smallest(arr, 0, Integer.MAX_VALUE));


        sc.close();
    
    }
}
