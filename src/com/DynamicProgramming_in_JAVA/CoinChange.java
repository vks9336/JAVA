package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class CoinChange {
    //tabulation method
    public static int tabulationMethod(int[] coins, int amount){
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int i = 0; i <= amount; i++){
            if(i % coins[0] == 0) dp[0][i] = i / coins[0];
            else dp[0][i] = Integer.MAX_VALUE / 2;
        }
        for(int i = 1; i < n; i++){
            for(int t = 0; t <= amount; t++){
                int notTake = dp[i - 1][t];
                int take = Integer.MAX_VALUE / 2;
                if(t >= coins[i]){
                    take = 1 + dp[i][t - coins[i]];
                }
                dp[i][t] = Math.min(notTake, take);
            }
        }
        return dp[n - 1][amount];
    }
    //memoization method
    public static int memoizationMethod(int index, int amount, int[] coins, int[][] dp){
        if(index == 0){
            if(amount % coins[index] == 0) return amount / coins[index];
            else return Integer.MAX_VALUE / 2;
        }
        if(dp[index][amount] != -1) return dp[index][amount];

        int notTake = memoizationMethod(index - 1, amount, coins, dp);
        int take = Integer.MAX_VALUE / 2;
        if(amount >= coins[index]){
            take = 1 + memoizationMethod(index, amount - coins[index], coins, dp);
        }
        return dp[index][amount] =  Math.min(notTake, take);
    }


    //recursive method
    public static int recursiveMethod(int index, int amount, int[] coins){
        if(index == 0){
            if(amount % coins[index] == 0) return amount / coins[index];
            else return (int) 1e9;
        }

        int notTake = recursiveMethod(index - 1, amount, coins);
        int take = Integer.MAX_VALUE;
        if(amount >= coins[index]){
            take = 1 + recursiveMethod(index, amount - coins[index], coins);
        }
        return Math.min(notTake, take);
    }

    //coin change method
    public static int coinChange(int[] coins, int target){
        int[][] dp = new int[coins.length][target + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
//        int ans = recursiveMethod(coins.length - 1, target, coins);
//        int ans = memoizationMethod(coins.length - 1, target, coins, dp);
        int ans = tabulationMethod(coins, target);
        if(ans >= Integer.MAX_VALUE / 2) return -1;
        return ans;
    }

    //main method
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int target = 11;
        int ans = coinChange(coins, target);
        System.out.println(ans);
    }
}
