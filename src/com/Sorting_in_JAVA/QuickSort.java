package com.Sorting_in_JAVA;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int beg, int end){
        int pivot = arr[beg];
        int i = beg;
        int j = end;
        while(i < j){
            do {
                i+=1;
            }
            while(arr[i] <= pivot);
            do {
                j-=1;
            }
            while(arr[j] > pivot);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[beg];
        arr[beg] = arr[j];
        arr[j] = temp;
        return j;
    }


    public static void quickSort(int[] arr, int beg, int end){
        if(beg < end){
            int j = partition(arr, beg, end);
            quickSort(arr, beg, j);
            quickSort(arr, j + 1, end);
        }
    }


    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] arr = {12, 34, 56, 1, 6, 75, 2, Integer.MAX_VALUE};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        System.out.println("Before sorting your array is : ");
        printArray(arr);
        System.out.println("After sorting your array is : ");
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
