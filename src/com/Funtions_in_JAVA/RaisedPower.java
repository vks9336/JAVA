package com.Funtions_in_JAVA;

import java.util.*;
public class RaisedPower {
    public static void main(String[] args) {
        int x, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base: ");
        x = s.nextInt();
        System.out.print("Enter the power: ");
        n = s.nextInt(); 
        System.out.println(Math.pow(x, n));
    }
}
