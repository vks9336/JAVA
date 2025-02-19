package com.Sorting_in_JAVA;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = Arrays.stream(arr).max().getAsInt();

        // Create a count array to store the count of each unique object
        int[] count = new int[max + 1];

        // Store the count of each element
        for (int j : arr) {
            count[j]++;
        }

        // Modify the count array by adding the previous counts (cumulative sum)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the counting sort
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1, 1, 2, 5, 6, 2, 7, 8, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(arr);

        countingSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
