package Arrays;
// Find max product of sub array in an Array
import java.util.Scanner;

public class Question93 {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static long maxSubArrayProduct(int arr[]) {
        long maxProduct = 1;
        long currProduct = 1;
        for(int i = 0; i < arr.length; i++) {
            currProduct *= arr[i];

            if(currProduct == 0) {
                currProduct = 1;
            }

            maxProduct = Math.max(currProduct, maxProduct);
        }
        return maxProduct;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Max Sub Array Product = " + maxSubArrayProduct(arr));
        sc.close();
    }
}
