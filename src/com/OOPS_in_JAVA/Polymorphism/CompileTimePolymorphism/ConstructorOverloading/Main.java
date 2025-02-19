package com.OOPS_in_JAVA.Polymorphism.CompileTimePolymorphism.ConstructorOverloading;
//making the object of the voloume class in main
public class Main {
    public static void main(String[] args) {
        //this is default one
        Volume v = new Volume();
        //this is for one variable
        Volume cube = new Volume(2);
        //this is for two variables
        Volume cylinder = new Volume(2,10);
        //this is for three variables
        Volume cuboid = new Volume(2,4,5);
    }
}
