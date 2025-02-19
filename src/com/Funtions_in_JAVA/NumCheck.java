package com.Funtions_in_JAVA;

import java.util.*;
public class NumCheck {
    public static void main(String[] args) {
        int positive = 0, negative = 0,zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue & 0 to stop.");
        int input = sc.nextInt();
        while(input == 1){
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num > 0){
                positive++;
            }
            else if(num < 0){
                negative++;
            }
            else{
                zero++;
            }
            System.out.println("Press 1 to continue & 0 to stop.");
            input = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zero);
    }
}
