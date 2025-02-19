package com.Funtions_in_JAVA;

import java.util.*;
public class GCDof2num {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD is: " + num2);
    }
}
