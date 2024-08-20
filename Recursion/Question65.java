package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
// Print All the subset sums of arr[] of elements

public class Question65 {

    // Time Complexity - O(2^N)
    // Space Complpexity - O(N), It is the maximum height of the recursive stack can go
    public static void subsetsRecursive(int arr[],  int l, int r, int sum) {

        // Base case
        if(l > r) {
            System.out.print(sum + " ");
            return;
        }

        // Include the element case
        subsetsRecursive(arr, l+1, r, sum + arr[l]);

        // Not Include the element case
        subsetsRecursive(arr, l+1, r, sum);

    }
    
    // Time Complexity - O(N * 2^N) 
    // Space Complexity - O(1)
    public static void subsetsIterative(int arr[], int n) {

        int total = 1 << n; // This gives the total subsets possible for n elements i.e 2 ^ n

        for(int i = 0; i < total; i++) { // This goes 2^N times
            int sum = 0;
            for(int j = 0; j < n; j++) {  // This runs N times for each i value
                if((i & (1 << j)) != 0) {
                    sum += arr[j];
                }
            }
            System.out.print(sum + " ");
        }

    }

    public static void subsetsIterativeOptimised(int arr[], int n) {

        ArrayList<Integer> s = new ArrayList<>();
        s.add(0);

        for(int i = 0; i < n; i++) {
            int v = s.size();
            for(int t = 0; t < v; t++) {
                s.add(s.get(t) + arr[i]);
            }
        }

        // Print the subsets sum values
        for(int val : s) {
            System.out.print(val + " ");
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int len = arr.length;
        // subsetsRecursive(arr, 0, len-1, 0  );
        // subsetsIterative(arr, len);
        subsetsIterativeOptimised(arr, len);

        sc.close();
    }
}
