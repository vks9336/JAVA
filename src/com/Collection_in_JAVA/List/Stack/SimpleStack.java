package com.Collection_in_JAVA.List.Stack;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("ujjwal");
        names.push("vishal");
        names.push("om");
//        System.out.println(names.pop());
        System.out.println(names.peek());
        for(String name : names){
            System.out.println(name);
        }
    }
}
