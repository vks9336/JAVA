package com.Arrays_in_JAVA;

import java.util.Arrays;

public class MissingNumber {
    private static int missingNumber(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

        int small = 1;

        for (int j : arr) {
            if (j <= 0) continue;
            if (j == small) small++;
            else if (j > small) {
                return small;
            }
        }

        return small;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-8,2,2,-7,8,6};
        System.out.printf("%d", missingNumber(arr));
    }
}
