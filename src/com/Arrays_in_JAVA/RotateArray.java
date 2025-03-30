package com.Arrays_in_JAVA;


public class RotateArray {
    private static void reverse(int[] arr, int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int k  = 3;
        System.out.println("Before rotation : ");
        for(int num : arr){
            System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println("After rotation : ");
        rotate(arr, k);
        for(int num : arr){
            System.out.printf("%d ", num);
        }
    }
}
