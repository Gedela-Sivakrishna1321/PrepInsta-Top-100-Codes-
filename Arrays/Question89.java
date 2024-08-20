package Arrays;
// Find the minimum scalar Product of two Arrays
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Question89 {

    // Time Complexity - O(nlogn) in worst case, Space Complexity - O(n)
    public static void mergeSort(int arr[], int si, int ei) {
        if(si == ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        for(int m = 0, n = si; m < temp.length; m++, n++) {
            arr[n] = temp[m];
        }
    }

    // Time Complexity - O(nlogn), Space Complexity - O(1)
    public static long minimumScalarProduct(int arr1[], int arr2[]) {
        long sum = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        mergeSort(arr1, 0, n1 - 1);
        mergeSort(arr2, 0, n2 - 1);

        for(int i = 0, j = n2 - 1; i < n1 && j >= 0; i++, j--) {
            sum += arr1[i] * arr2[j];
        }
        
        return sum;
    }

    // Time Complexity - O(nlogn), Space Complexity - O(1)
    public static long minimumScalarProductInbuiltSort(int arr1[], Integer arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        long sum = 0;

        for(int i = 0; i < arr1.length; i++)
            sum += arr1[i] * arr2[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for(int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        Integer arr2[] = new Integer[n2];

        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        
        // System.out.println("Minimum scalar product = " + minimumScalarProduct(arr1, arr2));
        System.out.println("Minimum scalar product = " + minimumScalarProductInbuiltSort(arr1, arr2));
        sc.close();
    }
}