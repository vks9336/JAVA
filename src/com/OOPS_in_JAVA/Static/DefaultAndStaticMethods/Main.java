package com.OOPS_in_JAVA.Static.DefaultAndStaticMethods;

public class Main {
    public static void main(String[] args) {
        DefaultExample de = new A();
        de.show(); // calling of default method
        de.show1(); // calling of normal method
        DefaultExample.show2(); // calling of static method
    }
}
