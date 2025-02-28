package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class MinimumPathSum {
    //Tabulation method
    private static int minimumPathSumUsingTabulation(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) dp[i][j] = grid[i][j];
                else{
                    int up = (i > 0) ? grid[i][j] + dp[i - 1][j] : Integer.MAX_VALUE;
                    int left = (j > 0) ? grid[i][j] + dp[i][j - 1] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m - 1][n - 1];
    }


    //Memoization method
    private static int minimumPathUsingMemo(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return minimumPathSum(m - 1, n - 1, grid, dp);
    }

    //Memoization helper method
    private static int minimumPathSum(int i, int j, int[][] grid, int[][] dp) {
        if(i == 0 && j == 0) return grid[i][j];
        if(i < 0 || j < 0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int up = (i > 0) ? grid[i][j] + minimumPathSum(i - 1, j, grid, dp) : Integer.MAX_VALUE;
        int left = (j > 0) ? grid[i][j] + minimumPathSum(i, j - 1, grid, dp) : Integer.MAX_VALUE;
        dp[i][j] = Math.min(up, left);
        return dp[i][j];
    }

    //main method
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minimumPathSumUsingTabulation(grid));
    }
}
