package com.Pattern_in_JAVA;

import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
