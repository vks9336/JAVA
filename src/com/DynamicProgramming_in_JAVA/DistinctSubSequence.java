package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class DistinctSubSequence {
    //tabulation approach
    public static int tabu(String s, String t){

        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++) dp[i][0] = 1;
//        for(int j = 0; j <= n; j++) dp[0][j] = 0;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    //memoization approach
    public static int memo(int i, int j, String s, String t, int[][] dp){
        if(j < 0) return 1;
        if(i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = memo(i - 1, j - 1, s, t, dp) + memo(i - 1, j, s, t, dp);
        }
        else return dp[i][j] = memo(i - 1, j, s, t, dp);
    }

    //recursive approach
    public static int recursive(int i, int j, String s, String t){
        if(j < 0) return 1;
        if(i < 0) return 0;

        if(s.charAt(i) == t.charAt(j)){
            return recursive(i - 1, j - 1, s, t) + recursive(i - 1, j, s, t);
        }
        else return recursive(i - 1, j, s, t);
    }

    //distinct subSequence method
    public static int dss(String s, String t){
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];

        for(int[] row : dp) Arrays.fill(row, - 1);

        return tabu(s, t);

//        return memo(m - 1, n - 1, s, t, dp);

//        return recursive(m - 1, n - 1, s, t);
    }

    //main method
    public static void main(String[] args) {
        String str1 = "babgbag";
        String str2 = "bag";

        int ans = dss(str1, str2);
        System.out.printf("Total number subSequence : %d", ans);
    }
}
