package com.OOPS_in_JAVA.Introduction;

public class Main {
    public static void main(String[] args) {
        GetterAndSetter dress = new GetterAndSetter();
        // here we are setting the values of private variables
        dress.setName("Mens T-Shirt");
        dress.setSize('M');
        dress.setPrice(399.5f);

        // I have directly printed the object using to string method
        System.out.println(dress);


        // you can also do this
        // System.out.println(dress.getSize());
        // System.out.println(dress.getName());
        // System.out.println(dress.getPrice());
    }
}
