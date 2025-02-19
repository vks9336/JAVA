package com.OOPS_in_JAVA.Inheritance.Multilevel_Inheritance;
//this is the main class where we make object of the classes
public class Main {
    public static void main(String[] args) {
        GrandChild baby = new GrandChild();
        baby.grandChild();
        baby.child();
        baby.father();
        baby.grandfather();//here we can see that baby object has all the methods of its parent classes
        System.out.println("\n");
        Child baby2 = new Child();
        baby2.child();
//        baby2.grandChild();
        baby2.grandfather();//here it have only access to upper class variables and method

    }
}
