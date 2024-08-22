package Arrays;
// Replace the elements in Array with their array according to the sorting
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Question99 {

    // Time Complexity - O(nlogn), Space Complexity - O(n)
    public static void replaceElemByRank(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int elem : arr) 
            list.add(elem);
        
        Collections.sort(list);

        for(int i = 0; i < arr.length; i++) 
            arr[i] = list.indexOf(arr[i]) + 1;
    }

    public static void print(int arr[]) {
        for(int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        replaceElemByRank(arr);
        print(arr);

        sc.close();
    }
}
