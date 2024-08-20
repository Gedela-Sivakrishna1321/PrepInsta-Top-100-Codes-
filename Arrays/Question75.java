package Arrays;
import java.util.Scanner;
// Find the smallest element in the Array

public class Question75 {

    public static long findSmallest(int arr[]) {
        long smallest = Long.MAX_VALUE;
        for(int elem : arr) 
            smallest = Math.min(smallest, elem);
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Smallest Value = " + findSmallest(arr));

        sc.close();
    }
}
