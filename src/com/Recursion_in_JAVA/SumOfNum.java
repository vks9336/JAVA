package com.Recursion_in_JAVA;

import java.util.Scanner;

public class SumOfNum {

    public static int sum(int n){
        int result = 0;
        if(n == 0){
            return 0;
        }
        n = n + sum(n - 1);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int Sum = sum(n);
        System.out.println(Sum);
    }
}
