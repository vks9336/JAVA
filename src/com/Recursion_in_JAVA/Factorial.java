package com.Recursion_in_JAVA;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to calculate the factorial : ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}
