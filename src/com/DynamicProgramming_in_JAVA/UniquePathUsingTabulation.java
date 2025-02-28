package com.DynamicProgramming_in_JAVA;

public class UniquePathUsingTabulation {
    private static int uniquePath(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0) dp[i][j] = 1;
                else{
                    int up = 0, left = 0;
                    if(i > 0) up = dp[i - 1][j];
                    if(j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};
        int ans = uniquePath(grid);
        System.out.printf("Total number of paths from (0, 0) to (%d, %d) is : %d.",grid.length - 1, grid[0].length - 1, ans);
    }
}
