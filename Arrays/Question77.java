package Arrays;
import java.util.Scanner;
// Find Second smallest element in array

public class Question77 {

    public static long findSecondSmallest(int arr[]) {

        int smallest = Integer.MAX_VALUE;

        for(int elem : arr)
            smallest = Math.min(smallest, elem);
        
        long sec_smallest = Long.MAX_VALUE;

        for(int elem : arr) {
            if(elem != smallest) {
                sec_smallest = Math.min(elem, sec_smallest);
            }
        }

        return sec_smallest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(findSecondSmallest(arr));

        sc.close();
    }
}
