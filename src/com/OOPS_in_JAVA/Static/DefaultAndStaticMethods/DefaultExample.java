package com.OOPS_in_JAVA.Static.DefaultAndStaticMethods;

public interface DefaultExample {
    default void show(){
        System.out.println("This is a default method inside an interface");
    }

    void show1();

    static void show2(){
        System.out.println("This is a static method inside an interface");
    }
}
