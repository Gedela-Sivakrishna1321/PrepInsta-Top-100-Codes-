package Arrays;

import java.util.Scanner;
import java.util.LinkedHashMap;
// Sort the Elements according to the frequency of elements

public class Question83 {

    // Time Complexity - O(n)
    public static void sortElementsByFrequency(int arr[]) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int elem : arr) {
            if(!map.containsKey(elem)) {
                map.put(elem, 1);
            }
            else {
                map.put(elem, map.get(elem) + 1);
            }
        }

        int idx = 0;
        for(int key : map.keySet()) {
            int range = map.get(key);
            while(range-- > 0) {
                arr[idx++] = key;
            }
        }
    }

    public static void print(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverse(int arr[]) {
        int n = arr.length;
        for(int i = n-1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        sortElementsByFrequency(arr);
        print(arr);
        printReverse(arr);

        sc.close();
    }
}
