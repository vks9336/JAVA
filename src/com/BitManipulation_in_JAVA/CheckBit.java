package com.BitManipulation_in_JAVA;

import java.util.*;

public class CheckBit {
    public static int checkBit(int data, int position){
        int mask = 1 << position;
            if((data & mask) == 1){
                return 1;
            }
            else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        System.out.print("Enter the position: ");
        int position = sc.nextInt();
        int result = checkBit(data, position);
        if(result == 1){
            System.out.println("Bit at the "+ position + "position is a set bit.");
        }
        else{
            System.out.println("Bit at the "+ position + " position is a clear bit.");
        }
    }
}
