package com.Stacks_in_JAVA.Building_Stack_using_Array.TwoStackUsingArray;

public class TwoStack {
    public int[] twoStack;
    int size;
    int top1;
    int top2;

    public TwoStack(int size) {
        this.size = size;
        this.twoStack = new int[size];
        this.top1 = -1;
        this.top2 = size;
    }

    public void pushStack1(int data){
        if(top1 < top2 - 1){
            top1++;
            twoStack[top1] = data;
            System.out.println("Item pushed in stack 1!!");
        }
        else System.out.println("Stack OverFlow");
    }

    public void pushStack2(int data){
        if(top1 < top2 - 1){
            top2--;
            twoStack[top2] = data;
            System.out.println("Item pushed in stack 2!!");
        }
        else System.out.println("Stack OverFlow!!");
    }

    public void popStack1(){
        if(top1 >= 0){
            top1--;
            System.out.println("Item popped from stack 1!!");
        }
        else System.out.println("Stack UnderFlow!!");
    }

    public void popStack2(){
        if(top2 <= size){
            top2++;
            System.out.println("Item removed from stack 2!!");
        }
        else System.out.println("Stack UnderFlow!!");
    }

    public int peek1(){
        return twoStack[top1];
    }

    public int peek2(){
        return twoStack[top2];
    }

    public boolean isFull(){
        return top1 == top2 - 1;
    }

    public boolean isEmpty(){
        return top1 == -1 && top2 == size;
    }
}
