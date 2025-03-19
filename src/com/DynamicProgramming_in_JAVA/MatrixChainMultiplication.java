package com.DynamicProgramming_in_JAVA;

import java.util.Scanner;

public class MatrixChainMultiplication {

    //tabulation method
    private static int mcmTabulation(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = 0;
        }

        for(int i = n - 1; i >= 1; i--){
            for(int j = i + 1; j < n; j++){
                int min = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int steps = (arr[i - 1] * arr[k] * arr[j])
                            + dp[i][k] + dp[k + 1][j];
                    min = Math.min(min, steps);
                }
                dp[i][j] = min;
            }
        }

        return dp[1][n - 1];
    }

    //memoization method
    private static int mcmMemoization(int i, int j, int[] arr, int[][] dp){
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int steps = (arr[i - 1] * arr[k] * arr[j])
                    + mcmMemoization(i, k, arr, dp) + mcmMemoization(k + 1, j, arr, dp);
            min = Math.min(min, steps);
        }

        return dp[i][j] = min;
    }

    //recursive method
    private static int mcmRecursive(int i, int j, int[] arr){
        if(i == j) return 0;

        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int steps = (arr[i - 1] * arr[k] * arr[j])
                    + mcmRecursive(i, k, arr) + mcmRecursive(k + 1, j, arr);
            min = Math.min(min, steps);
        }

        return min;
    }

    private static int matrixMultiplication(int[] arr) {
        int i = 1;
        int j = arr.length - 1;
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int k = 0; k < n; k++){
            for(int l = 0; l < n; l++){
                dp[k][l] = -1;
            }
        }
        return mcmTabulation(arr);
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int n = sc.nextInt();

        int[] mat = new int[n];

        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < n; i++){
            mat[i] = sc.nextInt();
        }

        int ans = matrixMultiplication(mat);
        System.out.printf("Minimum number of operations are : %d", ans);
    }
}
