package com.Arrays_in_JAVA;

import java.util.*;

public class Matrix2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the element at index [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("The matrix you entered is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
