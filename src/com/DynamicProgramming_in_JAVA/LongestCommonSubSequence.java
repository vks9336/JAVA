package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class LongestCommonSubSequence {
    //Tabulation Approach
    public static int tabulationLcs(String str1, String str2){
        if(str1.equals(str2)) return str1.length();
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }


    //Memoization Approach
    public static int memoLcs(int i, int j, String str1, String str2, int[][] dp){
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(str1.charAt(i) == str2.charAt(j)){
            return dp[i][j] = 1 + memoLcs(i - 1, j - 1, str1, str2, dp);
        }
        return dp[i][j] = Math.max(memoLcs(i - 1, j, str1, str2, dp), memoLcs(i, j - 1, str1, str2, dp));
    }


    // Recursive Approach
    public static int lcs(int i, int j, String str1, String str2){
        if(i < 0 || j < 0) return 0;
        if(str1.charAt(i) == str2.charAt(j)){
            return 1 + lcs(i - 1, j - 1, str1, str2);
        }
        return Math.max(lcs(i - 1, j, str1, str2), lcs(i, j - 1, str1, str2));
    }

    //LCS main method
    public static int longestCommonSubSequence(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = lcs(m - 1, n - 1, str1, str2);
        System.out.println(ans);
        return memoLcs(m - 1, n - 1, str1, str2, dp);
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int ans = longestCommonSubSequence(str1, str2);
        int tabuAns = tabulationLcs(str1, str2);
        System.out.println(tabuAns);
        System.out.println(ans);
    }
}
