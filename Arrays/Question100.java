package Arrays;
// Find the Equilibrium index of the Array
import java.util.Scanner;

public class Question100 {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static int equilibriumIndexOf(int arr[]) {

        long sum = 0, leftSum = 0, rightSum = 0;

        for(int elem : arr)
            sum += elem;
        
        rightSum = sum;

        for(int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if(leftSum == rightSum) 
                return i;
            leftSum += arr[i];
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Equilibrium index = " + equilibriumIndexOf(arr));
        sc.close();
    }
}
