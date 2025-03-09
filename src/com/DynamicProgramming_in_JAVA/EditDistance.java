package com.DynamicProgramming_in_JAVA;

import java.util.Arrays;

public class EditDistance {
    //tabulation approach
    public static int tabu(String s, String t){
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++) dp[i][0] = i;
        for(int j = 0; j <= n; j++) dp[0][j] = j;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],
                            Math.min(dp[i - 1][j - 1], dp[i][j - 1]));
                }
            }
        }

        return dp[m][n];
    }

    //memoization approach
    public static int memo(int i, int j, String s, String t, int[][] dp){
        if(i < 0) return j + 1;
        if(j < 0) return i + 1;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = memo(i - 1, j - 1, s, t, dp);
        }
        else{
            return dp[i][j] = 1 + Math.min(memo(i - 1, j, s, t, dp),
                              Math.min(memo(i - 1, j - 1, s, t, dp),
                              memo(i, j - 1, s, t, dp)));
        }
    }

    //recursive approach
    public static int recursive(int i, int j, String s, String t){
        if(i < 0) return j + 1;
        if(j < 0) return i + 1;

        if(s.charAt(i) == t.charAt(j)) return recursive(i - 1, j - 1, s, t);
        else return 1 + Math.min(recursive(i - 1, j, s, t), Math.min(recursive(i - 1, j - 1, s, t), recursive(i, j - 1, s, t)));
    }

    //edit distance method
    public static int editDistance(String s, String t){
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp) Arrays.fill(row, -1);

//        return recursive(m - 1, n - 1, s, t);

//        return memo(m - 1, n - 1, s, t, dp);
        return tabu(s, t);
    }

    //main method
    public static void main(String[] args) {
        String s = "horse";
        String t = "ros";

        int ans = editDistance(s, t);
        System.out.printf("%d", ans);
    }
}
