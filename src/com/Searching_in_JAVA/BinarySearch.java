package com.Searching_in_JAVA;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int result = -1;
        int beg = 0;
        int mid;
        int end = arr.length - 1;
        while (beg <= end){
            mid = beg + (end - beg) / 2;
            if(arr[mid] == key){
                result = mid;
                break;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key that needed to be searched.");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if(result == -1){
            System.out.println("Key is not present in the list.");
        }
        else{
            System.out.println("Key is found at " + result + " index.");
        }
    }
}
