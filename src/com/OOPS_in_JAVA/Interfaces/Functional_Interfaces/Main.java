package com.OOPS_in_JAVA.Interfaces.Functional_Interfaces;

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Showing something !!!");
            }
        };
        obj.show();


        //we can also do the same thing that we have
        // done above by using lambda expression

        A obj2 = () -> System.out.println("Showing something !!!");

        obj2.show(); // this will also work
    }
}
