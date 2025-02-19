package com.BitManipulation_in_JAVA;

import java.util.*;

public class SetClearBit {

    public static int setClearBit(int data, int position){
        int mask = 1 << position;
        mask = ~ (mask);
        return (data & mask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        int result = setClearBit(data, pos);
        System.out.println(result);
    }
}
