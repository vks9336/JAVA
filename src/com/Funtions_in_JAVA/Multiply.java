package com.Funtions_in_JAVA;

import java.util.*;

public class Multiply {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = multiply(a, b);
        System.out.println("multiplication of " + a + " and " + b + " is " + c);
    }
}
