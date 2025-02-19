package com.Recursion_in_JAVA;

import java.util.*;
public class PrintNumber {

    public static void printNumber(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNumber(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printNumber(num);
    }
}
