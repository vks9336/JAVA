package com.Funtions_in_JAVA;

import java.util.*;

public class GreaterAmong2 {
    public static void greaterAmong2(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        greaterAmong2(a, b);
    }
}
