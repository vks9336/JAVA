package com.String_in_JAVA;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s, int i, int n){
        if(i >= n / 2) return true;
        if(s.charAt(i) != s.charAt(n - i)) return false;
        return isPalindrome(s, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string that you want to check for palindrome : ");
        String str = sc.nextLine();
        String s = str.replaceAll("a-zA-Z0-9", " ").toLowerCase();
        boolean result = isPalindrome(s,0,s.length() - 1);
        if(result){
            System.out.println("Your string is a Palindromic string.");
        }
        else {
            System.out.println("Your string is not a Palindromic string.");
        }
    }
}
