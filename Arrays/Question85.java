package Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
// Count Distinct Elements in Array

public class Question85 {

    // Time Complexity - O(n^2), Space Complexity - O(n)
    public static int countDistinctElements(int arr[]) {
        int n = arr.length;

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int distinctCount = 0;

        for(int i = 0; i < n; i++) {

            if(visited[i] == true) {
                continue;
            }

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }

            distinctCount++;
        }

        return distinctCount;
    }

    // Time Complexity - O(n), Space Complexity - O(n)
    public static int countDistinctElements2(int arr[]) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int curr = arr[i];
            if(!map.containsKey(curr)) {
                map.put(curr, 1);
            }
            else {
                map.put(curr, map.get(curr) + 1);
            }
        }

        return map.size();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // System.out.println(countDistinctElements(arr));    
        System.out.println(countDistinctElements2(arr));
        sc.close();
    }
}
