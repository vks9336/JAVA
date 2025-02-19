package com.OOPS_in_JAVA.Inheritance.Hierarchial_Inheritance;
//this is the main class where we implement or make object of all classes
public class Main {
    public static void main(String[] args) {
        //all the classes used here are extends from the Shape class which have the method area()
        //this type of inheritance is known as Hierarchial Inheritance
        //using the circle class to make the object
        Circle c = new Circle();
        c.area(4f);
        //using the rectangle class to make the objet
        Rectangle r = new Rectangle();
        r.area(2.34f,4.5f);
        //using the cuboid class to make the object
        Cuboid cu = new Cuboid();
        cu.area(1.2f,3.14f,5.6f);
    }
}
