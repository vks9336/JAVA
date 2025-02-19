package com.Searching_in_JAVA;
import java.util.Scanner;

public class JumpSearch {

    // Function to perform Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;

        // Finding the block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where the element is present
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // Target is not present
            }
        }

        // Doing a linear search for the target in the block
        while (arr[prev] < target) {
            prev++;

            // If we reached the next block or end of array, return -1
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // If the element is found
        if (arr[prev] == target) {
            return prev;
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Input target element to search
        System.out.print("Enter the element to search: ");
        int target = s.nextInt();

        // Perform Jump Search
        int index = jumpSearch(arr, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        s.close();
    }
}
