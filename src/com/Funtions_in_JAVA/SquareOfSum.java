package com.Funtions_in_JAVA;

import java.util.*;
public class SquareOfSum {
    //main function is called by the operating system----
    //default return type of main function is int----
    public static int squareOfSum(int x, int y) {
        int count = 0;
        count++;
        System.out.println("Function is called "+count+ " times.");
        return square(x + y);
    }   
    public static int square(int x) {
        return (x * x);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int total = squareOfSum(a, b);
        System.out.println(total);
    }
}
