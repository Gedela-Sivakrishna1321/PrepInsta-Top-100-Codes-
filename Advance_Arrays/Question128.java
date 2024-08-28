package Advance_Arrays;
// Sort the Array with Elements in Ascending Order
import java.util.Scanner;

public class Question128 {

    // Time: O(n)
    // Space: O(1)
    public static void sortElems(int arr[]) {
        
        int oneCount = 0, twoCount = 0, zeroCount = 0;

        for(int elem : arr) {
            if(elem == 1) {
                oneCount++;
            }
            else if (elem == 2) {
                twoCount++;
            }
            else {
                zeroCount++;
            }
        }
            
        int idx = 0;
       while(zeroCount-- > 0) {
        arr[idx++] = 0; 
       }

       while(oneCount-- > 0) {
        arr[idx++] = 1;
       }

       while(twoCount-- > 0) {
        arr[idx++] = 2;
       }

    }

    // Time: O(n)
    public static void print(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sortElems(arr);
        print(arr);
        sc.close();
    }
}
