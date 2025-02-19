package com.Recursion_in_JAVA;

import java.util.*;
public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void Occurance(String str, int index, char element) {
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        else{
            Character ch = str.charAt(index);
            if(ch == element){
                if(first == -1){
                    first = index;
                }
                else{
                    last = index;
                }
            }
        }
        Occurance(str, index + 1, element);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        System.out.print("Enter the element that you want to know the occurance: ");
        Character element = scanner.next().charAt(0);
        Occurance(str, 0 , element);
    }
}
