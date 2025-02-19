package com.Sorting_in_JAVA;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Before sorting your array is: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int smallest;
        for (int i = 0; i < array.length; i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.println("\nAfter sorting your array is: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
