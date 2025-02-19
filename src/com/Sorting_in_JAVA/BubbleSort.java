package com.Sorting_in_JAVA;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Before sorting your array is: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int didSwap = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                     int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    didSwap += 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        System.out.println("\nAfter sorting your array is: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
