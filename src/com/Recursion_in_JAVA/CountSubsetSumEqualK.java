package com.Recursion_in_JAVA;

public class CountSubsetSumEqualK {
    static int[][] dp;

    static int bt(int index, int sum, int k, int[] nums) {
        if (sum > k) return 0;
        if (index == nums.length) {
            return sum == k ? 1 : 0;
        }
        if(dp[index][sum] != -1) return dp[index][sum];
        // pick
        int l = bt(index + 1, sum + nums[index], k, nums);
        // not pick
        int r = bt(index + 1, sum, k, nums);
        return dp[index][sum] = l + r;
    }
    public static void display(){
        for (int[] row : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.printf("%d ", row[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,10,6,8};
        int k = 10;
        dp = new int[arr.length][k + 1];
        int res = bt(0, 0, k, arr);
        display();
        System.out.println(res);
        System.out.println();
    }
}
