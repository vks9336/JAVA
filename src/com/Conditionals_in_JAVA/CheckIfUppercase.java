package com.Conditionals_in_JAVA;

import java.util.Scanner;

public class CheckIfUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.nextLine().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is UpperCase.");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is Lowercase.");
        }
        else if (Character.isDigit(ch)){
            System.out.println(ch + " is a Numeric value.");
        }
        else{
            System.out.println(ch + " is a Special Character.");
        }

    }
}
