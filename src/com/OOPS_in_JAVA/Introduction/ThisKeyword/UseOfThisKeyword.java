package com.OOPS_in_JAVA.Introduction.ThisKeyword;

import com.OOPS_in_JAVA.Introduction.ThisKeyword.Animal;

public class UseOfThisKeyword {
    public static void main(String[] args) {
        //created an object dog using animal class
        Animal Dog = new Animal(1,"Dog",2,"Land");

        //created an object shark using animal class
        Animal Shark = new Animal(2,"Shark",24,"Water");

        //now printing all the object
        System.out.println("Type\tName\tAge\t\tLive In");
        System.out.println(Dog.type + "\t\t" + Dog.name + "\t\t" + Dog.age + "\t\t" + Dog.liveIn);
        System.out.println();
        System.out.println(Shark.type + "\t\t" + Shark.name + "\t" + Shark.age + "\t\t" + Shark.liveIn);
    }
}
