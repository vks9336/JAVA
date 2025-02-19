package com.Recursion_in_JAVA;

import java.util.Scanner;

public class Sum {
    public static int sum(int n){
         if(n == 0) return 0;
         return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that from where you want to calculate the sum : ");
        int n = sc.nextInt();
        System.out.println("Sum of first n numbers is : " + sum(n));
    }
}
