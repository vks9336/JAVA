package com.OOPS_in_JAVA.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vishal = new Human(21,"Vishal Kumar Singh");
//        Human twin = new Human(vishal); this will take more time to execute hence we use clonable interface

        Human twin = (Human)vishal.clone();

        System.out.println(twin.age + "\t" + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 122; // it changes the arr that is assigned to vishal object
        // that's why it is called shallow copy
        System.out.println(Arrays.toString(vishal.arr));

    }
}
