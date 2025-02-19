package com.OOPS_in_JAVA.Static.StaticBlock;

public class Main {
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "\t" + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "\t" + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "\t" + StaticBlock.b);
    }
}
