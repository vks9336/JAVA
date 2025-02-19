package com.Arrays_in_JAVA;

import java.util.*;

public class IndexSearching{
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = s.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index "+ i + ": ");
            array[i] = s.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
            int x = s.nextInt();
            int position = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] == x) {
                    position = i;
                    System.out.println(x + " is found at index " + position);
                    break;
                }
            }
            if(position == 0){
                System.out.println(+ x +" is not found");
            }
        }
}
