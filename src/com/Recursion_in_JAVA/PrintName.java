package com.Recursion_in_JAVA;

import java.util.Scanner;

public class PrintName {
    public static void printName(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the name : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        printName(name, n);
    }
}
