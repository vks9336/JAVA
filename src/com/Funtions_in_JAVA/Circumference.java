package com.Funtions_in_JAVA;

import java.util.*;

public class Circumference {
    public static double calcircumference(double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circumference = calcircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
    }
    
}
