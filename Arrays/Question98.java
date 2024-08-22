package Arrays;
// Sort an Array arr1 according to the order of arr2
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Question98 {

    // Time Complexity - O(nlogn), Space Complexity - O(n)
    public static void sortAccordingToArray(int arr1[], int arr2[]) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int elem : arr2)
            map.put(elem, 0);
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int elem : arr1) {
            if(map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            }
            else {
                list.add(elem);
            }
        }

        // System.out.print(list);
        Collections.sort(list);
        // System.out.print(list);

        int idx = 0;
        for(int key : map.keySet()) {
            int freq = map.get(key);
            while(freq-- > 0) {
                // System.out.print(idx + " ");
                arr1[idx++] = key;
            }
        }

        for(int elem : list) {
            arr1[idx++] = elem;
        }

    }

    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
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

        sortAccordingToArray(arr1, arr2);
        print(arr1);
        sc.close();
    }
}