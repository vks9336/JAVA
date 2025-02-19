package com.Recursion_in_JAVA;

import java.util.*;
public class MoveCharToEnd {
    public static String moveToEnd(String str, Character ch){
        int count = 0;
        String newstr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
            else{
                newstr += str.charAt(i);
            }
        }
        for(int i = 0; i < count; i++){
            newstr += ch;
        }
        return newstr;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character that you want to move to the end: ");
        Character ch = sc.next().charAt(0);
        String result = moveToEnd(str, ch);
        System.out.println(result);
    }
}
