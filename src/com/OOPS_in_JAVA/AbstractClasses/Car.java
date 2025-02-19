package com.OOPS_in_JAVA.AbstractClasses;

public abstract class Car {
    String name;
    int model;
    boolean is2ndHand;
    String maxSpeed;

    abstract void carType(String carType);
    abstract void carName(String name);

    public void car(){
        System.out.println("This method can show that normal method are also implemented in " +
                "abstract class");
    }

    static void stat(){
        System.out.println("This method show that static method can also be used in abstract classes");
    }

    public Car(String name, int model, boolean is2ndHand, String maxSpeed) {
        this.name = name;
        this.model = model;
        this.is2ndHand = is2ndHand;
        this.maxSpeed = maxSpeed;
    }
}
