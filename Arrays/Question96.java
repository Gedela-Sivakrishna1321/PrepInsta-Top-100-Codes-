package Arrays;
// Can All the Array Elements be made equal
import java.util.Scanner;

public class Question96 {

    // Time Complexity - O(n * {O(log2(x)) + O(log3(x))}), Space Complexity - O(1)
    // Here O(log2(x)) indicates the number of times the number can be divided by 2 similarly
    // O(log3(x)) indicates the number of times the number can be divided by 3
    public static boolean canArrayElementsBeMadeEqual(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            // Remove all the 2's prime factors of the number
            while(arr[i] % 2 == 0) {
                arr[i] /= 2;
            }

            // Remove all the 3's prime factors of the number
            while(arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }

        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[0]) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Can Elements be made equal = " + canArrayElementsBeMadeEqual(arr));
        sc.close();
    }
}
