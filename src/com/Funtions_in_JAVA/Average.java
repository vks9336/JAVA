package com.Funtions_in_JAVA;

import java.util.*;
public class Average {
    public static void average(double a, double b,double c){
        double avg = (a+b+c)/3;
        System.out.println("The average of " + a + " ," + b + " and " + c + " is: " + avg);
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        average(a,b,c);
    }
}
