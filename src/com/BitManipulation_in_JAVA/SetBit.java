package com.BitManipulation_in_JAVA;

import java.util.*;
public class SetBit {
    public static int setBit(int data, int position){
        int mask = 1 << position;
        data = (data ^ mask);
        return data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        int result = setBit(data,position);
        System.out.println(result);
    }
}
