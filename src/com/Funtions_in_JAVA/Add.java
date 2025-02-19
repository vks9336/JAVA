package com.Funtions_in_JAVA;

import java.util.*;
public class Add {
    public static void sum(int a,int b){
        int c = a+b;
        System.out.println("Sum is: "+c);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");   
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sum(a,b);
    }
}
