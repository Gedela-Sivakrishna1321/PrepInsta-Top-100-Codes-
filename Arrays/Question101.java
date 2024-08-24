package Arrays;
// Rotate the Array Left and Right by k times
import java.util.Scanner;

public class Question101 {

    // Time complexity - O(n), Space Complexity - O(1)
    public static void rotateLeftByKTimes(int arr[], int k) {
        int n = arr.length;
        // reverse from i = 0 to < k
        reverse(arr, 0, k - 1);
        // reverse from i = k to n
        reverse(arr, k, n-1);
        // reverse the whole array
        reverse(arr, 0, n-1);
    }

    // Time Complexity - O(n), Space Complexity - O(1)
    public static void rotateRightByKTimes(int arr[], int k) {
        int n = arr.length;
        // reverse from i = 0 to n-k
        reverse(arr, 0, n-k-1);
        // reverse from i = n - k to n
        reverse(arr, n-k, n-1);
        // reverse from i = 0 to n
        reverse(arr, 0, n-1);
    }

    // Time complexity - O(n), Space Complexity - O(1)
    public static void reverse(int arr[], int si, int ei) {

        int left = si, right = ei;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    // Time Complexity - O(n), Space complexity - O(1)
    public static void print(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        // rotateLeftByKTimes(arr, k);
        rotateRightByKTimes(arr, k);
        print(arr);
        sc.close();
    }
}
