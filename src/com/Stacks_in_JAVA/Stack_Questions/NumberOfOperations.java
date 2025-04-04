package com.Stacks_in_JAVA.Stack_Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NumberOfOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 16; i >= 1; i--){
            queue.add(i);
        }
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            if(stack.isEmpty() || stack.peek() <= queue.peek()){
                int x = queue.poll();
                stack.push(x);
            }
            else {
                int x = stack.pop();
                queue.add(x);
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
