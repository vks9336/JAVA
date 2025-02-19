package com.Funtions_in_JAVA;

import java.util.*;

public class OddNumSum {
    public static void sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (i % 2!= 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of " + n + " odd numbers is " + sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        sum(n);
    }
    
}
