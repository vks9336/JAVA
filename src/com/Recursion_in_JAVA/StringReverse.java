package com.Recursion_in_JAVA;

import java.util.*;
public class StringReverse {
    public static void stringReverse(int index, String str){
        if(index == 0){
            System.out.print(str.charAt(index));
        }
        else{
        System.out.print(str.charAt(index));
            stringReverse(index - 1, str);
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int index = str.length();
        stringReverse(index - 1, str);
    }
}
