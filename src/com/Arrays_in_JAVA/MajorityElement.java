package com.Arrays_in_JAVA;

import java.util.*;

public class MajorityElement {
    //majority method
    public static List<Integer> majorityElement(int[] nums){

        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        List<Integer> list = new ArrayList<>();

        for(int key : map.keySet()){

            if(map.get(key) >= n / 3){
                list.add(key);
            }

        }

        Collections.sort(list);

        return list;
    }

    //main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        List<Integer> list = majorityElement(nums);

        for(int num : list){
            System.out.printf("%d ", num);
        }
    }
}
