package Advance_Arrays;
// Find the Maximum contiguous sub array sum
import java.util.Scanner;

public class Question132 {

    //Time: O(n)
    //Space: O(1)
    public static int maxSubArraySum(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < n; i++) {
            currSum += arr[i];

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Max Sub Array Sum = " + maxSubArraySum(arr));
        sc.close();
    }
}