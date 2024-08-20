package Arrays;
// Find the Maximum scalar product
import java.util.Scanner;
import java.util.Arrays;

public class Question90 {

    // Time Complexity - O(nlogn) in worst case, Space Complexity - O(n) because temp aray is being used
    public static void mergeSort(int arr[], int si, int ei) {
        if(si == ei) {
            return;
        }

        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    // Time Complexity - O(n), Space Complexity - O(n)
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

    // Time COmplexity - O(nlogn), Space Complexity - O(n)
    public static long maximumScalarProduct(int arr1[], int arr2[]) {
        if(arr1.length != arr2.length) {
            return -1;
        }

        long sum = 0;
        mergeSort(arr1, 0, arr1.length - 1);
        mergeSort(arr2, 0, arr2.length - 1);

        for(int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }

    // Time Complexity - O(nlogn), Space Complexity - O(1)
    public static long maximumScalarProductInbuiltSort(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1 != n2) {
            return -1;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long sum = 0;

        for(int i = 0; i < n1; i++) 
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
        int arr2[] = new int[n2];

        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        
        // System.out.println("Maximum scalar product = " + maximumScalarProduct(arr1, arr2));
        System.out.println("Maximum scalar product = " + maximumScalarProductInbuiltSort(arr1, arr2));
        sc.close();
    }
}
