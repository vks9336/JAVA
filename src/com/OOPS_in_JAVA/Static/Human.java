package com.OOPS_in_JAVA.Static;

public class Human {
    String name;
    int age;
    String gender;
    boolean isMarried;
    //here we have a static variable population
    //all the object created with Human class the population is same for everyone
    static long population;

    public Human(String name, int age, String gender, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        Human.population += 1;
    }


    public int multiply(int a, int b){
        return a * b;
    }

    @Override
    public String toString() {
        return "{ Name : " + name +"\tAge  : " +  age + "\tGender : " +  gender + "\tMarried or not : " +  isMarried + " }";
    }
}
