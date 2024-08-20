package Arrays;
// Find the count of Even & Odd numbers
import java.util.Scanner;

public class Question91 {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static void countEvenOdd(int arr[]) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i]);
            if((abs & 1) == 0) {
                evenCount++;
            }
        }
        oddCount = arr.length - evenCount;
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        countEvenOdd(arr);
        sc.close();
    }
}
