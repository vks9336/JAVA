package com.Conditionals_in_JAVA;

import java.util.*;

public class RomanNumbers {
    public static int romanToDecimal(String roman) {
        int decimal = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            switch (ch) {
                case 'I':
                    decimal += 1;
                    break;
                case 'V':
                    if (roman.charAt(i - 1) == 'I') {
                        decimal -= 2;
                    }
                    decimal += 5;
                    break;
                case 'X':
                    if (roman.charAt(i - 1) == 'I') {
                        decimal -= 2;
                    }
                    decimal += 10;
                    break;
                case 'L':
                    if (roman.charAt(i - 1) == 'X') {
                        decimal -= 20;
                    }
                    decimal += 50;
                    break;
                case 'C':
                if (roman.charAt(i - 1) == 'X') {
                    decimal -= 20;
                }
                    decimal += 100;
                    break;
                case 'D':
                if (roman.charAt(i - 1) == 'C') {
                    decimal -= 200;
                }
                    decimal += 500;
                    break;
                case 'M':
                if (roman.charAt(i - 1) == 'C') {
                    decimal -= 200;
                }
                    decimal += 1000;
                    break;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String roman = sc.nextLine();
        int result = romanToDecimal(roman);
        System.out.println(result);
    }
}
