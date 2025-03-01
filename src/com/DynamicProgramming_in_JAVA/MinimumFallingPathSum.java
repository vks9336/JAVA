package com.DynamicProgramming_in_JAVA;

public class MinimumFallingPathSum {
    //Recursive Approach
    public static int minPathSum(int i, int j, int[][] mat){
        int n = mat.length;
        if (j < 0 || j >= n) return Integer.MAX_VALUE;
        if(i == n - 1) return mat[i][j];

        int left = minPathSum(i + 1, j - 1, mat);
        int right = minPathSum(i + 1, j + 1, mat);
        int down = minPathSum(i + 1, j, mat);

        return mat[i][j] + Math.min(down, Math.min(left, right));
    }


    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int ans = (int)1e9 + 7;
        for(int j = 0; j < matrix.length; j++){
            ans = Math.min(ans, minPathSum(0, j, matrix));
        }
        System.out.println(ans);
    }
}
