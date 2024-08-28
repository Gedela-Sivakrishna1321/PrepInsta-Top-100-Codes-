package Advance_Arrays;
// Move the Negative Elements to the End of the Array
import java.util.Scanner;

public class Question130 {

    // Time: O(n)
    // Space: O(1)
    public static void moveNegativesEnd(int arr[]) {
        int n = arr.length;
        int right = n;

        for(int left = n - 1; left >= 0; left--) {
            if(arr[left] < 0) {
                --right;
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

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
        moveNegativesEnd(arr);
        print(arr);
        sc.close();
    }
}
