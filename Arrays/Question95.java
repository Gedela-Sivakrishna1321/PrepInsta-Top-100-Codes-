package Arrays;
// Find If an array is subset of another another array
import java.util.Scanner;
import java.util.HashSet;

public class Question95 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static boolean isArraySubSet(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++)
            set.add(arr1[i]);
        
        for(int i = 0; i < arr2.length; i++) {
            if(!set.contains(arr2[i])) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for(int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        
        System.out.println("The above arrays are subset of one another = " + isArraySubSet(arr1, arr2));
        sc.close();
    }
}
