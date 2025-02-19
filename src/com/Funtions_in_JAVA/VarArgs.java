package com.Funtions_in_JAVA;

import java.util.Arrays;

public class VarArgs {
    public static void printNum(int ...v){
        // these variable arguments store the values as arrays
        System.out.print(Arrays.toString(v) + " ");
    }

    public static void greet(String name, int rollNo, int ...v){
        // NOTE : we can only use  varArgs as the last argument of the fun()
        System.out.println("Hello " + name);
        System.out.println("Your roll number is " + rollNo);
        System.out.print(Arrays.toString(v) + " ");
    }

    public static void main(String[] args) {
        // In this type of function we provide ...v as a function arguments
        // we can give any number of arguments in ...v function arguments
        printNum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println();
        System.out.println();

        //we can also provide other args to the fun with variable argument
        greet("Vishal Kumar Singh", 187, 1,3,5,6,7,8,9,5,4);
    }
}
