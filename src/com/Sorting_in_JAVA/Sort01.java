package com.Sorting_in_JAVA;

import java.util.Scanner;

public class Sort01 {
    public static void sort01(int[] arr, int start, int end){
        while(start < end){
            if(arr[start] == 1 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start += 1;
                end -= 1;
            }
            else if(arr[start] == 1 && arr[end] == 1){
                end -= 1;
            }
            else if(arr[start] == 0 && arr[end] == 0){
                start += 1;
            }
            else{
                start += 1;
                end -= 1;
            }
        }
    }


    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        System.out.println("Note : The elements should be only 0 and 1");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting your array is : ");
        printArray(arr);
        sort01(arr, 0, arr.length - 1);
        System.out.println("After sorting your array is : ");
        printArray(arr);
    }
}
