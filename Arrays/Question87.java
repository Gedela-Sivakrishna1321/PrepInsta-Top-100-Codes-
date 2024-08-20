package Arrays;

import java.util.Scanner;
import java.util.HashMap;
//  Find Non Repeating Elements from an Array

public class Question87 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static void findNonRepeatingElements(int arr[]) {
        
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
            if(map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }

    // Space Complexity - O(n), Time Complexity - O(n^2)
    public static void findNonRepeatingElementsLoopApproach(int arr[]) {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        
        for(int i = 0; i < n; i++) {

            // Skip the iteration for visited elements
            if(visited[i]) {
                continue;
            }
            
            // corner case
            if(i == n-1 && !visited[i]) {
                System.out.print(arr[i]);
                System.out.println();
                break;
            }
            
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if(count == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // findNonRepeatingElements(arr);
        findNonRepeatingElementsLoopApproach(arr);
        sc.close();
    }
}
