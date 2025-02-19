package com.OOPS_in_JAVA.SuperKeyword;

public class Child extends Parent {
    int weight;

    Child(int weight) {
        super.weight = -1;
        this.weight = weight;
    }

    Child(int l, int b, int h, int weight) {
        //this super keyword is used to call the variables and constructors of the Parent class
        super(l, b, h);
        System.out.println("I am using the super keyword to import parent constructor to my constructor.");
        this.weight = weight;
    }
}
