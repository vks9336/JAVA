package com.Funtions_in_JAVA;

import java.util.*;
public class Armstrong {
    public static int armstrong(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
            if (sum == i) {
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        int result = armstrong(start, end);
        System.out.println(result);
    }
}
