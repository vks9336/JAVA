package com.DynamicProgramming_in_JAVA;

public class WildCardMatching {
    //memoization approach
    public static boolean memo(int i, int j, String s, String t, Boolean[][] dp){
        if(i < 0 && j < 0) return true;
        if(i < 0) return false;
        if(j < 0){
            for(int k = i; k >= 0; k--){
                if(s.charAt(i) != '*') return false;
            }
            return true;
        }
        if(dp[i][j] != null) return dp[i][j];

        if(s.charAt(i) == t.charAt(j) || s.charAt(i) == '?'){
            return dp[i][j] = memo(i - 1, j - 1, s, t, dp);
        }
        if(s.charAt(i) == '*'){
            return dp[i][j] =  memo(i - 1, j, s, t, dp)
                    || memo(i, j - 1, s, t, dp);
        }
        return dp[i][j] = false;
    }


    //recursive approach
    public static boolean recursive(int i, int j, String s, String t){
        if(i < 0 && j < 0) return true;
        if(i < 0) return false;
        if(j < 0){
            for(int k = i; k >= 0; k--){
                if(s.charAt(i) != '*') return false;
            }
            return true;
        }

        if(s.charAt(i) == t.charAt(j) || s.charAt(i) == '?'){
            return recursive(i - 1, j - 1, s, t);
        }
        if(s.charAt(i) == '*'){
            return recursive(i - 1, j, s, t) || recursive(i, j - 1, s, t);
        }
        return false;
    }

    //wildcard matching method
    public static boolean isMatch(String s, String t){
        int m = s.length();
        int n = t.length();

        Boolean[][] dp = new Boolean[n][m];

        return memo(n - 1, m - 1, t, s, dp);
    }

    //main method
    public static void main(String[] args) {
        String s = "abcdefcd";
        String t = "abccd";
//        System.out.println("true");
        boolean ans = isMatch(s, t);
        System.out.println(ans);
    }
}
