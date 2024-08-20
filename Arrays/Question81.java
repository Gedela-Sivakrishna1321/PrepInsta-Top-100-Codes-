package Arrays;

import java.util.Arrays;
import java.util.Scanner;
// Sort the Elements of an Array

public class Question81 {

    // Bubble Sort - Move Largest element to the end of the array
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1- i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    // Selection Sort - Move the smallest element to the begining of the array
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    // Insertion Sort - Pick the elements from unsorted part and place them in correct position of sorted part 
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        
        for(int i = 1; i < n; i++) {
            int prev = i-1;
            int current = arr[i];
            while(prev >= 0 && current < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Place current element in it's correct position
            arr[prev + 1] = current;
        }

    }

    // Counting Sort - Count the Frequency of elements, Apply this algorithm when range of elements is less
    public static void countingSort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for(int elem : arr)
            largest = Math.max(largest, elem);

        int count[] = new int[largest + 1];

        for(int elem : arr)
            count[elem]++;
        
        int idx = 0;

        for(int i = 0; i < count.length; i++) {
            int curVal = i;
            while(count[i]-- > 0) {
                arr[idx++] = curVal;
            }
        }
    }

    // Inbuilt Sort - This is the inbuilt method available to sort the elements, Time Complexity - O(nlogn)
    
    // Merge Sort - Divide the Array And Sort them, Time Complexity Worst case - O(nlogn)
    // Merge sort is prefered when we have extra memory
    public static void mergeSort(int arr[], int start, int end) {
        if(start == end) {
            return;
        }

        int mid = start + (end - start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
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

        // Left over elements in left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        // Left over elements on right part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the elements back to original array
        for(int m = 0, idx = si; m < temp.length; m++)
            arr[idx++] = temp[m];

    }

    // Quick Sort - Follows Divide and conquer rule, sorts elements with a pivot element strategy
    // Average Case - O(nlogn), Worst Case - O(n^2) 
    // Worst case in quick sort occurs when the array is in descending order and we are trying to arrange the
    // elements in ascending order and vice versa.
    public static void quickSort(int arr[], int si, int ei) {
        if(si == ei) {
            return;
        }
        else {

            int pivotIdx = partition(arr, si, ei);
            quickSort(arr, si, pivotIdx-1);
            quickSort(arr, pivotIdx+1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int k = -1;

        for(int i = si; i < ei; i++) {
            int currElement = arr[i];
            if(currElement < pivot) {
                k++;
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }

        k++;
        int temp = arr[k];
        arr[k] = pivot;
        arr[ei] = temp;
        return k;
    }

    public static void print(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // bubbleSort(arr);          - O(n^2), Best case - O(n) when the array is already sorted
        // selectionSort(arr);       - O(n^2)
        // insertionSort(arr);       - O(n^2)
        // countingSort(arr);        - O(nlogn) in best case, Worst Case - O(n^2)
        Arrays.sort(arr);        // - O(nlogn)
        // mergeSort(arr, 0, n-1);   - O(nlogn) in worst case
        // quickSort(arr, 0, n-1);   - O(n^2) in worst case, Average case - O(nlogn)
        print(arr);
        
        sc.close();
    }
}