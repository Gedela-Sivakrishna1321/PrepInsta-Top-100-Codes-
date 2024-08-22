package Arrays;
// Find If two arrays are disjoint are not
import java.util.Scanner;
import java.util.HashMap;

public class Question94 {

    // Time complexity- O(n), Space Complexity- O(n)
    public static boolean isArraysDisjoint(int arr1[], int arr2[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++)
            map.put(arr1[i], 1);
        
        for(int i = 0; i < arr2.length; i++) {
            int elem = arr2[i];

            if(map.containsKey(elem)) {
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
        
        System.out.println("The above arrays are disjoint = " + isArraysDisjoint(arr1, arr2));
        sc.close();
    }
}