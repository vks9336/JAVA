package com.Recursion_in_JAVA;

import java.util.Scanner;

public class PrintToN {
    public static void printNNumbers(int n, int m){
        if(m == n){
            return;
        }
        System.out.print(m + 1 + " ");
        printNNumbers(n, m + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the point to where you want to print number : ");
        int n = sc.nextInt();
        printNNumbers(n, 0);
    }
}
