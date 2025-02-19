package com.Pattern_in_JAVA;

import java.util.*;

public class PyramidInvertedNumberPattern {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
