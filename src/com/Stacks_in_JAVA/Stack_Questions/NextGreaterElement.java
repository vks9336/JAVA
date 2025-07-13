package com.Stacks_in_JAVA.Stack_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() < arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,12,7,1,8,0,9};
        int[] ans = nextGreaterElement(arr);
        for(int a : ans){
            System.out.printf("%d ", a);
        }
    }
}
