package com.Arrays_in_JAVA;

import java.util.Scanner;
public class FirstAndLastOccurrence {
    //occurrence method
    public static int[] firstAndLastOccurrence(int[] arr, int target){
        int first = -1, last = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }

        return new int[]{first, last};
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = firstAndLastOccurrence(arr, target);
        System.out.printf("%d   %d", ans[0], ans[1]);
    }
}
