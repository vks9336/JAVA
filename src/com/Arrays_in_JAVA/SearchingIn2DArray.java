package com.Arrays_in_JAVA;

import java.util.*;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = s.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element at index [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter the element that you want to search: ");
        int item = s.nextInt();
        int temp = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == item) {
                    temp = 1;
                    System.out.println(item + " is found at index [" + i + "][" + j + "]");
                    break;
                }
            }
        }
       if(temp == 0) {
        System.out.println(item + " is not found in the array");
       }
    }
}
