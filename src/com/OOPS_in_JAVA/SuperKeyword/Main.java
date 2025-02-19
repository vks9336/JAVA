package com.OOPS_in_JAVA.SuperKeyword;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(2,3,4,5);
        Child child2 = new Child(2);
        System.out.println(child.b + "\t" + child.weight);
        System.out.println(child2.weight);
    }
}
