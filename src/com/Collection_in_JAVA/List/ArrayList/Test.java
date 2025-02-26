package com.Collection_in_JAVA.List.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2,-5,1,-4,3,-2};
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, currSum = 0;
        for(int num : arr){
            currSum  += num;
            Math.max(maxSum, currSum);
            Math.min(minSum, currSum);
        }
        System.out.println(maxSum - minSum);
    }
}
