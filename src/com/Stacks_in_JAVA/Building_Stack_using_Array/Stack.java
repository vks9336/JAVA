package com.Stacks_in_JAVA.Building_Stack_using_Array;

import java.util.Arrays;

public class Stack {
    private final int[] stack;
    private final int size;
    public int top = -1;
    public Stack(int size){
        stack = new int[size];
        this.size = size;
    }

    public void push(int data){
        if(top == size - 1) {
            System.out.println("Stack overflow !!");
            return;
        }
        stack[++top] = data;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underFlow!!");
            return;
        }
        top--;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow!!");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        for(int i = size - 1; i >= 0; i--){
            System.out.printf("%d ", stack[i]);
        }
    }
}
