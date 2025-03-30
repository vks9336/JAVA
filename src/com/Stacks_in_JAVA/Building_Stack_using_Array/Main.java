package com.Stacks_in_JAVA.Building_Stack_using_Array;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(2);
        stack.push(0);
        stack.push(12);
        stack.push(4);
        stack.push(40);
        stack.push(30);
        stack.push(122);
        stack.push(25);
        stack.push(28);
        stack.push(44);
        stack.printStack();
        stack.pop();
        int data = stack.peek();
        System.out.println(data);
    }
}
