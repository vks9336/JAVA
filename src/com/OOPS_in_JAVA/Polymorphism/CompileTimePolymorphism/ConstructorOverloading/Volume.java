package com.OOPS_in_JAVA.Polymorphism.CompileTimePolymorphism.ConstructorOverloading;

public class Volume {
    //this is how constructor overloading happens
    Volume(){
        System.out.println("No values are passed, hence, it is a default constructor");
    }

    Volume(double side){
        System.out.println("Volume of Cube is : " + side * side * side);
    }

    Volume(double r, double h){
        System.out.println("Volume of Cylinder is : " + Math.PI * r * r * h);
    }

    Volume(double l, double b, double h){
        System.out.println("Volume of Cuboid is :" + l * b * h);
    }


}
