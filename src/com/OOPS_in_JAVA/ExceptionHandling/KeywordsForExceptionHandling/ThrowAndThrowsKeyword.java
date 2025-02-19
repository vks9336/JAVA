package com.OOPS_in_JAVA.ExceptionHandling.KeywordsForExceptionHandling;

import java.util.Scanner;

public class ThrowAndThrowsKeyword {
    public static void validate(int age) throws Exception {
        if(age < 18){
            throw new Exception("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        validate(age);
    }
}
