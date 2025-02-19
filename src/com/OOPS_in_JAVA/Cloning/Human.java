package com.OOPS_in_JAVA.Cloning;

public class Human implements Cloneable{ //clonable is an interface hence we implement it
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
         this.arr = new int[]{2,3,4,5,6,7,8};
    }

    public Object clone() throws CloneNotSupportedException {//it throws an exception
        //this is shallow copy
        return super.clone();
    }
}
