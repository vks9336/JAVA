package com.OOPS_in_JAVA.Encapsulation;

public class Vehicle {
    //these are all the private fields
    private int model;
    private String name;
    private String numberPlate;


    //using getter and setter method to get and set the values of the private field
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    //using to our own toString() method to print the whole object in one call
    @Override
    public String toString() {
        return STR."Vehicle : [Model=\{model}, Name='\{name}', Number Plate='\{numberPlate}']";
    }
}
