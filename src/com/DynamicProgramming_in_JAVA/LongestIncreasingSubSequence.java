package com.DynamicProgramming_in_JAVA;

import java.util.*;

public class LongestIncreasingSubSequence {
    //LIS (Longest Increasing SubSequence) method
    public static int lis(int[] nums){
        int n = nums.length;

        //if there is no elements hence there should be no lis present
        if(n == 0) return 0;

        //1D dp to get the maximum length of lis at the current index
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;

        // loop through the array to get the element
        for(int i = 1; i < n; i++){

            // loop for checking the previous elements
            for(int prev = 0; prev < i; prev++){

                // conditional checking for elements
                if(nums[prev] < nums[i] && 1 + dp[prev] > dp[i]){
                    dp[i] = dp[prev] + 1;
                }
            }

            // taking the max out of all
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    //Print longest increasing subSequence method
    public static List<Integer> printLIS(int[] arr){
        int n = arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] hash=new int[n];
        Arrays.fill(hash,1);

        for(int i=0; i<=n-1; i++){

            hash[i] = i;
            for(int prev_index = 0; prev_index <=i-1; prev_index ++){

                if(arr[prev_index]<arr[i] && 1 + dp[prev_index] > dp[i]){
                    dp[i] = 1 + dp[prev_index];
                    hash[i] = prev_index;
                }
            }
        }

        int ans = -1;
        int lastIndex =-1;

        for(int i=0; i<=n-1; i++){
            if(dp[i]> ans){
                ans = dp[i];
                lastIndex = i;
            }
        }

        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(arr[lastIndex]);

        while(hash[lastIndex] != lastIndex){
            lastIndex = hash[lastIndex];
            temp.add(arr[lastIndex]);
        }

        // reverse the array
        Collections.reverse(temp);
        return temp;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int ans = lis(nums);
        System.out.printf("The longest increasing subSequence is of length : %d", ans);
        System.out.println();

        List<Integer> list =  printLIS(nums);
        for(int l : list){
            System.out.printf("%d ", l);
        }
    }
}
