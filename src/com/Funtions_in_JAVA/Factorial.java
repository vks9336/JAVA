package com.Funtions_in_JAVA;

import java.util.*;

public class Factorial {
    public static void factorial(int n) {
        int fact = 1;
        if (n < 0) {
            System.out.println("This is a negative number.\nWe cannot find factorial of a negative number.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        factorial(n);
    }
}
