package com.Recursion_in_JAVA;

import java.util.*;
public class FibonacciSeries {

    public static void fibonacci(int a, int b, int num){
        if(num == 0){
            return;
        }
        int c = a + b;
        System.out.print("\t" + c );
        a = b;
        b = c;
        fibonacci(a, b, num - 1);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + "\t" + b);
        fibonacci(a, b, num - 2);
    }
}
