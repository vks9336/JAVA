package com.OOPS_in_JAVA.Introduction.Constructor;
//creating a class of car
class Car {
    //attribute of the class car
    String name;
    int model;
    int price;
    boolean is2ndHand;


    //this is a constructor of the class
    //Note: Constructor only and only are method name of the class

    Car(){
    }

    @Override
    public String toString() {
        return "Car[" + name + "\t" + model + "\t" +  price + "\t" +  is2ndHand + "]";
    }
}

