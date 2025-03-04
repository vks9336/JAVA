package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class TargetSum {
    //tabulation approach
//    public static int tabulationMethod(int[] arr, int target){
//
//    }
//
//    //memoization approach
    public static int memoizationMethod(int index, int sum, int target, int[] arr, int[][] dp){
        if(sum > target) return 0;
        if(index == arr.length) {
            if (sum == target) return 1;
            else return 0;
        }
        if(dp[index][sum] != -1) return dp[index][sum];

        int l = memoizationMethod(index + 1, sum + arr[index], target, arr, dp);

        int r = memoizationMethod(index + 1, sum, target, arr, dp);

        return dp[index][sum] = l + r;
    }
//

    //recursive approach
    public static int recursiveMethod(int index, int sum, int target, int[] arr){
        if(sum > target) return 0;
        if(index == arr.length) {
            if (sum == target) return 1;
            else return 0;
        }

        int l = recursiveMethod(index + 1, sum + arr[index], target, arr);

        int r = recursiveMethod(index + 1, sum, target, arr);

        return l + r;
    }


    //target sum method
    public static int targetSum(int[] arr, int target){
        int n = arr.length;
        int totalSum = 0;
        for (int j : arr) totalSum += j;
        if((totalSum - target) < 0 || (totalSum - target) % 2 == 1) return 0;
        target = (totalSum - target) / 2;
        int[][] dp = new int[n][target + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
//        int ans = recursiveMethod(0, 0, target, arr);
        int ans = memoizationMethod(0, 0, target, arr, dp);
        return ans;
    }


    //main method
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(targetSum(arr, target));
    }
}
