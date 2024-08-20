package Arrays;

import java.util.Scanner;
import java.util.HashMap;
// Find the Repeatating Elements from an Array

public class Question86 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static void findRepeatatingElements(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int elem : arr) {
            if(!map.containsKey(elem)) {
                map.put(elem, 1);
            }
            else {
                map.put(elem, map.get(elem) + 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        findRepeatatingElements(arr);
        sc.close();
    }
}
