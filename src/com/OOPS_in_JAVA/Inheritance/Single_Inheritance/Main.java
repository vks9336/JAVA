package com.OOPS_in_JAVA.Inheritance.Single_Inheritance;

public class Main {
    public static void main(String[] args) {
        //this is the object of the child class
        Dog newDog = new Dog();
        //below we have used the method of the parent class
        newDog.eat();
        //this the method of the child class
        newDog.run();
    }
}
