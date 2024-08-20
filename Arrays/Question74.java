package Arrays;
import java.util.Scanner;

// Find the largest element in the array

public class Question74 {

    public static long findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int elem : arr)
            largest = Math.max(largest, elem);
        return largest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Largest Value = " + findLargest(arr));

        sc.close();
    }
}
