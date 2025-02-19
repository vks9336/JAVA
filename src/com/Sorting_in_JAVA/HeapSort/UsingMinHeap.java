package com.Sorting_in_JAVA.HeapSort;

import java.util.Scanner;

public class UsingMinHeap {
    public static void minHeapify(int[] arr, int n, int i) {
        int smallest = i; // Initialize smallest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is smaller than root
        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        // If right child is smaller than smallest so far
        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        // If smallest is not root
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            // Recursively heapify the affected subtree
            minHeapify(arr, n, smallest);
        }
    }

    public static void HeapSort(int[] arr) {
        int n = arr.length;

        // Build min heap
        for (int i = n / 2 - 1; i >= 0; i--)
            minHeapify(arr, n, i);

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call min heapify on the reduced heap
            minHeapify(arr, i, 0);
        }

        // Reverse the array to get ascending order
        reverseArray(arr);
    }

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting you array is : ");
        printArray(arr);
        HeapSort(arr);
        System.out.println("Sorted array using Min Heap:");
        printArray(arr);
    }
}
