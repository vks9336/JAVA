package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class MinimumTrianglePathSum {
    //Tabulation Approach
    public static int tabulationMinPathSum(int[][] triangle){
        int n = triangle.length;
        int[][] dp = new int[n][n];
        System.arraycopy(triangle[n - 1], 0, dp[n - 1], 0, n);

        for(int i = n - 2; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                int dia = triangle[i][j] + dp[i + 1][j + 1];
                int down = triangle[i][j] + dp[i + 1][j];
                dp[i][j] = Math.min(dia, down);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", dp[i][j]);
            }
            System.out.println();
        }
        return dp[0][0];
    }



    //Memoization Approach
    public static int memoMinPathSum(int i, int j, int[][] triangle, int[][] dp){
        int n = triangle.length;
        if(i == n - 1) return triangle[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int dia = triangle[i][j] + minPathSum(i + 1, j + 1, triangle);
        int down = triangle[i][j] + minPathSum(i + 1, j, triangle);
        return dp[i][j] =  Math.min(dia, down);
    }


    // Recursive Approach
    public static int minPathSum(int i, int j, int[][] triangle){
        int n = triangle.length;
        if(i == n - 1) return triangle[i][j];
        int dia = triangle[i][j] + minPathSum(i + 1, j + 1, triangle);
        int down = triangle[i][j] + minPathSum(i + 1, j, triangle);
        return Math.min(dia, down);
    }

    public static void main(String[] args) {
        int[][] triangle = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        int n = triangle.length;
//        int[][] dp = new int[n][n];
//        for(int[] row : dp){
//            Arrays.fill(row, -1);
//        }
        int ans = tabulationMinPathSum(triangle);
        System.out.println(ans);
    }
}
