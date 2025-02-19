package com.Sorting_in_JAVA;

import java.util.Scanner;

public class ShellSort {
    public static void shellSort(int[] arr){
        int n = arr.length;
        for(int gap = n / 2; gap > 0; gap = gap / 2){
            for(int i = gap; i < n; i++){
                int temp = arr[i];
                int j;

                for(j = i; j >= gap && arr[j - gap] > temp; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }



    public static void printArray(int[] arr){
        for(int numb : arr){
            System.out.print(numb + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting your array is : ");
        printArray(arr);
        shellSort(arr);
        System.out.println("After using shell sort your array is : ");
        printArray(arr);
    }
}
