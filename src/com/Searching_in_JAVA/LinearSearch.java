package com.Searching_in_JAVA;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                result = i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key that needed to be searched : ");
        int key = sc.nextInt();
        int result = linearSearch(arr, key);
        if(result == -1){
            System.out.println("Key is not present in the list.");
        }
        else{
            System.out.println("Key is found at " + result + " index.");
        }
    }


}
