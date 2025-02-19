package com.Pattern_in_JAVA;

import java.util.*;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the total no of lines: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
