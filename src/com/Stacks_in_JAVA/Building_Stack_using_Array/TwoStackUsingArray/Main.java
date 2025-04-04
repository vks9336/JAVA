package com.Stacks_in_JAVA.Building_Stack_using_Array.TwoStackUsingArray;

public class Main {
    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack(10);
        twoStack.pushStack1(12);
        twoStack.pushStack1(11);
        twoStack.pushStack2(11);
        twoStack.pushStack2(11);
        twoStack.pushStack1(23);
        twoStack.pushStack2(16);
        twoStack.pushStack2(9);
        twoStack.pushStack2(51);
        twoStack.pushStack1(88);
        twoStack.pushStack1(67);
        twoStack.pushStack2(33);
        System.out.println(twoStack.isEmpty());
        System.out.println(twoStack.isFull());
        System.out.println(twoStack.peek1());
        System.out.println(twoStack.peek2());
    }
}
