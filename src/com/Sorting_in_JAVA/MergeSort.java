package com.Sorting_in_JAVA;
import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int p, int q, int r) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = q - p + 1;  // Number of elements in the left subarray
        int n2 = r - q;      // Number of elements in the right subarray

        // Creating temporary arrays for left and right subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];


        // Copying data to leftArray and rightArray subarrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[p + i];  // Elements from index p to q
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[q + 1 + j];  // Elements from index q+1 to r
        }

        // Initial indexes of left, right and merged subarrays
        int i = 0, j = 0, k = p;

        // Merge the two subarrays into the original array
        while (i < n1 && j < n2 && k <= arr.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        // Copy remaining elements of leftArray if any element is left
    }

    public static void mergeSort(int[] arr, int p, int r) {
        //checking the the index
        if (p < r) {
            int q = (p + r) / 2;  // Finding the middle point
            mergeSort(arr, p, q);  // Sorting first half of the array
            mergeSort(arr, q + 1, r);  // Sorting second half of the array
            merge(arr, p, q, r);  // Merging the sorted halves of the array
        }
    }

    public static void printArray(int[] arr) {
        //using for each method to print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of your array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Before sorting your array is: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);  // Calling the mergeSort method

        System.out.println("After merge sort your array is: ");
        printArray(arr);

        s.close();
    }
}
