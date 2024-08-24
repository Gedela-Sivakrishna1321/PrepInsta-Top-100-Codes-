package Arrays;
// Block Swap Algorithm to rotate the elements of array 
import java.util.Scanner;


public class Question102 {

    // Time Complexity - O(n)
    public static void leftRotate(int arr[], int si, int d, int n) {

        // corner case
        // If the array needs to be rotated 0 / n times, no need to rotate the array because 
        // after rotating we get the same array, no change in the position of elements.
        if(d == 0 || d == n) {
            return;
        }

        // if A == B then swap once then return 
        if(d == n - d) {
            swap(arr, si, n - d + si, d);
            return;
        }

        // If A is shorter than B
        if(d < n - d) {
            swap(arr, si, n - d + si, d);
            leftRotate(arr, si, d, n - d);
        }
        // If B is shorter than A
        else {
            swap(arr, si, d, n - d);
            leftRotate(arr, n - d + si, 2*d - n, d); 
        }
    }

    public static void swap(int arr[], int fi, int si, int d) {

        for(int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }

    }

    public static void print(int arr[]) {
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int d = sc.nextInt();
        leftRotate(arr, 0, d, n);
        print(arr);
        sc.close();
    }
}