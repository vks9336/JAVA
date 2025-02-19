package com.BitManipulation_in_JAVA;

import java.util.*;
public class UpdateBit {

    public static int updateBit(int data, int position){
        int mask = 1 << position;
        return data ^ mask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        int result = updateBit(data, position);
        System.out.println(result);
    }
}
