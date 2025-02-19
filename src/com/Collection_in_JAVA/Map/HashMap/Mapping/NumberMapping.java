package com.Collection_in_JAVA.Map.HashMap.Mapping;

import java.util.*;

public class NumberMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++){
            System.out.print("Enter the element at " + i + " : ");
            arr[i] = sc.nextInt();
        }

        //pre-compute
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // fetch
        int q = sc.nextInt();
        while(q-- > 0) {
            int number = sc.nextInt();
            System.out.println("The number " + number + " comes " + map.getOrDefault(number, 0) + " times.");
        }
    }
}
