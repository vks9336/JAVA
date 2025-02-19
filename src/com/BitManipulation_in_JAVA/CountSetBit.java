package com.BitManipulation_in_JAVA;

import java.util.*;

public class CountSetBit {
    public static int countBit(int data){
        int count = 0;
        while(data!= 0){
           if((data & 1) == 1){
            count+=1;
           }
           data = data >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data you want to count: ");
        int data = sc.nextInt();
        int count = countBit(data);
        System.out.println(count);
    }
}
