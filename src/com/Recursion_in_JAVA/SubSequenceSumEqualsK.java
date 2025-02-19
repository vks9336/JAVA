package com.Recursion_in_JAVA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSequenceSumEqualsK {
    private static boolean backtrack(int index, List<Integer> list,int sum, int[] nums, int k, int n){
        if(index == n){
            return sum == k;
        }


        //pick
        list.add(nums[index]);
        sum += nums[index];
        if(backtrack(index + 1, list, sum, nums, k, n)){
            return true;
        }


        //backtrack
        sum -= nums[index];
        list.removeLast();


        //no pick
        return backtrack(index + 1, list, sum, nums, k, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,1};
        int k = 0;
        int n = nums.length;
        boolean res = backtrack(0,new ArrayList<>(), 0, nums, k, n);
        if(res){
            System.out.println("This array has a sequence which contains sum equal to " + k + ".");
        }
        else {
            System.out.println("This array does not have any sequence which contains sum equal to " + k + ".");
        }
    }
}
