package Arrays;

import java.util.Scanner;
import java.util.HashMap;
// Count the frequency of elements in an Array

public class Question82 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static void countFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int elem : arr) {
            if(!map.containsKey(elem)) {
                map.put(elem, 1);
            }
            else {
                map.put(elem, map.get(elem)+1);
            }
        }

        System.out.println(map);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        countFrequency(arr);

        sc.close();
    }
}
