package com.DynamicProgramming_in_JAVA;

public class BestTimeToBuyAndSellStocks1 {
    public static int stocks(int[] arr){
//        int min = arr[0];
//        int minIdx = 0;
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] < min){
//                min = arr[i];
//                minIdx = i;
//            }
//        }
//        int max = arr[minIdx];
//        for(int i = minIdx; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//         return max - min;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[]  arr = new int[]{7, 9, 5, 6, 3, 10};
        int ans = stocks(arr);
        System.out.printf("%d", ans);
    }
}
