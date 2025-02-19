package com.Sorting_in_JAVA;

import java.util.*;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i = 1; i <= arr.length - 1; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Before sorting your array is: ");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        insertionSort(arr);
        System.out.println("\nAfter sorting your array is: ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
