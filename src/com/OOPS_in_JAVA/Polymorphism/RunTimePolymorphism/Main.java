package com.OOPS_in_JAVA.Polymorphism.RunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.fun();
        //this will print the method of A
        A ab = new B();
        ab.fun();
        //this will print the method of B
        //because of overriding
        B b = new B();
        b.fun();
        //this will print the method of B
    }
}
