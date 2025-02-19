package com.OOPS_in_JAVA.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        //all three reference variable are just pointing to same object
    }
}
