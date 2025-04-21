package com.Arrays_in_JAVA;

public class CountHiddenSequences {
    //count the hidden sequences function
    public static int countHiddenSequences(int[] arr, int lower, int upper){
        int currValue = 0;
        int maxValue = 0;
        int minValue = 0;
        int count = 0;

        for(int el : arr){
            currValue += el;
            maxValue = Math.max(maxValue, currValue);
            minValue = Math.min(minValue, currValue);
        }

        count = (upper - lower) - (maxValue - minValue) + 1;

        return Math.max(count, 0);

    }

    //main function
    public static void main(String[] args) {
        int[] arr = new int[]{1,-3,4};
        System.out.print(countHiddenSequences(arr, 1, 6));
    }
}
