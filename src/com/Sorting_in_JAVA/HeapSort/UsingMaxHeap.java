package com.Sorting_in_JAVA.HeapSort;

import java.util.Scanner;

public class UsingMaxHeap {
    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            maxHeapify(arr, n, largest);
        }
    }

    public static void HeapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);

        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter the element at " + i + " : ");
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {12,4,7,8,9,1};
        System.out.println("Array before sorting using Max Heap : ");
        printArray(arr);
        HeapSort(arr);
        System.out.println("Sorted array using Max Heap:");
        printArray(arr);
    }
}
