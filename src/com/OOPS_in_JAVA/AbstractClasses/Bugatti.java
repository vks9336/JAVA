package com.OOPS_in_JAVA.AbstractClasses;

public class Bugatti extends Car{
    public Bugatti(String name, int model, boolean is2ndHand, String maxSpeed) {
        super(name, model, is2ndHand, maxSpeed);//calling the constructor using super keyword
    }

    @Override // we need to override the method of the abstract classes to use it
    public void carType(String carType) {
        System.out.println("Hey, I am a super car");
    }

    @Override
    public void carName(String name) {
        System.out.println("My name is " + name);
    }
}
