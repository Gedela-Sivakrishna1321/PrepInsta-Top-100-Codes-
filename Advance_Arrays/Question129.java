package Advance_Arrays;
// Find the kth max / min element from the Array
import java.util.Scanner;
import java.util.Arrays;

public class Question129 {

    // Time: O(n logn)
    // Space: O(1)
    public static int[] findKthMaxAndMin(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr);
        return new int[] {arr[k-1], arr[n-k]};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int ans[] = findKthMaxAndMin(arr, k);
        System.out.println("Kth Min = " + ans[0]);
        System.out.println("Kth Max = " + ans[1]);
        sc.close();
    }
}
