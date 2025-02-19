package com.Recursion_in_JAVA;

import java.util.*;
import java.lang.*;
public class CheckIfSorted {
    public static boolean isSorted(int[] array, int n, int index){
        boolean result = false;
        if(index == n - 1){
            return true;
        }
        if(array[index] < array[index + 1]){
            return isSorted(array, n, index + 1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element at index "+ i + " : ");
            array[i] = scanner.nextInt();
        }
        boolean result = isSorted(array, n, 0);
        System.out.println(result);
    }
}
