package com.DynamicProgramming_in_JAVA;

import java.util.Scanner;

public class MaximumAbsoluteSum {
    private static int maxAbsSum(int[] nums){
        int maxSum = 0, minSum = 0, currSum = 0;
        for (int num : nums){
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
            minSum = Math.min(minSum, currSum);
        }
        return maxSum - minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Note : The array contains all kind of Integer value (negative and Positive).");
        for (int i = 0; i < n; i++){
            System.out.printf("Enter the value at array index %d : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("The maximum absolute sum of the subArray of the given array is : %d.", maxAbsSum(arr));
    }
}
