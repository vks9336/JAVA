package com.String_in_JAVA;


public class SimpleString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
    }
}
