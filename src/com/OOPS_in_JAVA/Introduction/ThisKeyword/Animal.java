package com.OOPS_in_JAVA.Introduction.ThisKeyword;
//creating a class
class Animal {
    int type;  //type can be 1-> omnivorous, 2-> carnivorous and 3-> herbivorous
    String name;
    int age;
    String liveIn;

    Animal(int type, String name, int age, String liveIn){
        //here this keyword point to every object which we create using "Animal" class
        this.type = type;
        this.name = name;
        this.age = age;
        this.liveIn = liveIn;
    }
}

