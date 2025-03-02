package com.DynamicProgramming_in_JAVA;

public class ChocolatePickup {
    //Tabulation Method
    public static int tabulationMethod(int n, int m, int[][] grid){
        int[][][] dp = new int[n][m][m];
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if(j1 == j2) dp[n - 1][j1][j2] = grid[n- 1][j1];
                else dp[n - 1][j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }
        for(int i = n - 2; i >= 0; i--){
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    int max = 0;
                    for (int dj1 = -1; dj1 <= 1; dj1++) {
                        for(int dj2 = -1; dj2 <= 1; dj2++){
                            int value = 0;
                            if(j1 == j2) value += grid[i][j1];
                            else value += grid[i][j1] + grid[i][j2];
                            if(j1 + dj1 >= 0 && j1 + dj1 < m && j2 + dj2 >= 0 && j2 + dj2 < m) {
                                value += dp[i + 1][j1 + dj1][j2 + dj2];
                            }
                            max = Math.max(max, value);
                            dp[i][j1][j2] = max;
                        }
                    }
                }
            }
        }
        return dp[0][0][m - 1];
    }



    //Memoization method
    public static int memoizationMethod(int i, int j1, int j2, int n, int m, int[][] grid, int[][][] dp){
        if(j1 < 0 || j2 < 0 || j1 >= m || j2 >= m) return 0;
        if(i == n - 1){
            if(j1 == j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int max = 0;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for(int dj2 = -1; dj2 <= 1; dj2++){
                int value = 0;
                if(j1 == j2) value += grid[i][j1];
                else value += grid[i][j1] + grid[i][j2];
                value += recursionMethod(i + 1, j1 + dj1, j2 + dj2, n, m, grid);
                max = Math.max(max, value);
            }
        }
        return dp[i][j1][j2] = max;
    }
    //Normal Recursion method
    public static int recursionMethod(int i, int j1, int j2, int n, int m, int[][] grid){
        if(j1 < 0 || j2 < 0 || j1 >= m || j2 >= m) return 0;
        if(i == n - 1){
            if(j1 == j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }

        int max = 0;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for(int dj2 = -1; dj2 <= 1; dj2++){
                int value = 0;
                if(j1 == j2) value += grid[i][j1];
                else value += grid[i][j1] + grid[i][j2];
                value += recursionMethod(i + 1, j1 + dj1, j2 + dj2, n, m, grid);
                max = Math.max(max, value);
            }
        }
        return max;
    }

    //main chocolate pickup method
    public static int chocolatePickup(int n, int m, int[][] grid){
        int[][][] dp = new int[n][m][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int recAns = recursionMethod(0, 0, m - 1, n, m, grid);
        int memoAns = memoizationMethod(0,0, m- 1, n, m, grid, dp);
        int tabuAns = tabulationMethod(n, m, grid);
        return tabuAns;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        int n = grid.length;
        int m = grid[0].length;
        int ans = chocolatePickup(n, m, grid);
        System.out.println(ans);
    }
}
