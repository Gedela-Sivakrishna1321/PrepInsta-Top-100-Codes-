package Arrays;
import java.util.Scanner;
// Calculate the sum of array elements

public class Question78 {

    public static long sum(int arr[]) {
        long sum = 0;
        for(int elem : arr)
            sum += elem;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Sum of Array Elements = " + sum(arr));

        sc.close();
    }
}
