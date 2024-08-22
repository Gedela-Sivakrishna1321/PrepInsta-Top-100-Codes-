package Arrays;
// Find the sum of minimum absolute difference by including each element in the array
import java.util.Scanner;
import java.util.Arrays;

public class Question97 {

    // Time Complexity - O(nlogn), Space Complexity - O(1)
    // nlogn complexity because sorting is being used
    public static long minimumAbsoluteDifference(int arr[]) {
        int n = arr.length;
        long sum = 0;
        Arrays.sort(arr);

        sum += Math.abs(arr[0] - arr[1]);
        sum += Math.abs(arr[n-1] - arr[n-2]);

        for(int i = 1; i < n-1; i++) 
            sum += Math.min(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i] - arr[i+1]));

        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Minimum absolute difference = " + minimumAbsoluteDifference(arr));
        sc.close();
    }
}
