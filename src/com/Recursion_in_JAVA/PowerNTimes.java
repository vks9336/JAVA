package com.Recursion_in_JAVA;

import java.util.*;

public class PowerNTimes {
    public static int power(int n, int p) {
        if(p == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        int result = n * power(n, p - 1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the power: ");
        int p = scanner.nextInt();
        int pow = power(n, p);
        System.out.println(pow);
    }
}
