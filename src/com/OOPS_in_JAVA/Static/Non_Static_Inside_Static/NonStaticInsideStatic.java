package com.OOPS_in_JAVA.Static.Non_Static_Inside_Static;

public class NonStaticInsideStatic {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        //here you can call the static method into the static method
        NonStaticInsideStatic.fun();
//        greeting(); non static cannot be used in static block
    }
    static void fun(){
        System.out.println("Having a lot of fun :)");
        //greeting(); you can use the non-static method inside a static method
        //you need make the obj of the class to use the non-static method
        NonStaticInsideStatic obj = new NonStaticInsideStatic();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hey, Have a nice day!!!");
    }
}
