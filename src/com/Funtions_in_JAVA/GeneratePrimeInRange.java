package com.Funtions_in_JAVA;

import java.util.*;
public class GeneratePrimeInRange {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void generatePrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        generatePrime(start, end);
    }
}
