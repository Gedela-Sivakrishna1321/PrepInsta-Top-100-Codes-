package Arrays;
import java.util.Scanner;
import java.util.Arrays;

// Sort First Half in Ascending Order & Second Half in Descending Order

public class Question80 {

    public static void sortFirstHalfAscendingSecondHalfDescending(int arr[]) {
        int n = arr.length;

        // First Half in Ascending order
        Arrays.sort(arr, 0, n/2 - 1);

        // Second Half in Descending order
        for(int i = (n/2); i < n; i++ ) {
            
            for(int j = i + 1; j < n; j++) {

                    if(arr[j] > arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
            }
        }
    }

    public static void print(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        sortFirstHalfAscendingSecondHalfDescending(arr);
        print(arr);

        sc.close();
    }
}
