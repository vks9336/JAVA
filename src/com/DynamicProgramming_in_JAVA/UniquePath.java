package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class UniquePath {
    //Memoization technique
    private static int uniquePath(int i, int j, int[][] arr, int[][] dp){
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = uniquePath(i - 1, j, arr, dp);
        int left = uniquePath(i, j - 1, arr, dp);

        return dp[i][j] = up + left;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = uniquePath(m - 1, n - 1, grid, dp);
        System.out.printf("Total number of unique paths from (0, 0) to (%d, %d) is : %d.",m - 1, n - 1, ans);
    }
}
