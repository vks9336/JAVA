package com.Funtions_in_JAVA;

public class MultipleCalls {
    public static void b() {
        //called by main function
        //b function calls a
        a();
    }
    public static void a() {
        //called by main function
        System.out.println("Hiii----");
        //result show in output screen
    }
    public static void main(String[] args) {
        a();
        b();
        a();
    }
}
