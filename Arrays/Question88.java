package Arrays;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
// Remove Duplicate Elements From An Array

public class Question88 {

    public static void removeDuplicates(int arr[]) {

        Set<Integer> set = new HashSet<>();

        for(int elem : arr)
            set.add(elem);
        
        System.out.println(set);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        removeDuplicates(arr);
        sc.close();
    }
}
