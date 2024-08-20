package Arrays;
import java.util.Scanner;
// Reverse an Array

public class Question79 {

    public static void reverse(int arr[]) {
        int left = 0, right = arr.length-1;

        while(left != right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void print(int arr[]) {
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        reverse(arr);
        print(arr);

        sc.close();
    }
}
