package Advance_Arrays;
// Find the union and intersection of two sorted arrays
import java.util.Scanner;
import java.util.TreeSet;
import java.util.LinkedHashMap;

public class Question131 {

    public static void union(int arr1[], int arr2[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int elem : arr1)
            set.add(elem);
        
        for(int elem : arr2)
            set.add(elem);

        for(int elem : set)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void intersection(int arr1[], int arr2[]) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int elem : arr1)
            map.put(elem, map.getOrDefault(elem, 0) + 1);

        for(int elem : arr2)
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        
        for(int key : map.keySet()) {
            if(map.get(key) == 2)
                System.out.print(key + " ");
            }
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
        // union(arr1, arr2);
        intersection(arr1, arr2);
        sc.close();
    }
}
