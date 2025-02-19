package com.OOPS_in_JAVA.Static.StaticBlock;

public class StaticBlock {
    static int a = 4;
    static int b;
    // this is a static block and only get executed once when the class is loaded
    // and the first object is created
    static {
        System.out.println("I am a static block\nI run only one time when the 1st " +
                "object is loaded");
        b = a * 5;
    }
}
