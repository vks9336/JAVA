package com.OOPS_in_JAVA.Generics.Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vishal = new Student(187,93.2f);
        Student parth = new Student(115,87.2f);
        Student om = new Student(45,77.9f);
        Student rachit = new Student(123,82.2f);
        Student ujjwal = new Student(98,77.7f);

        Student[] list = {vishal, parth, om, rachit, ujjwal};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(vishal.compareTo(parth) > 0){
            System.out.println("Vishal has more marks.");
        }
        else{
            System.out.println("Parth has more marks.");
        }
    }
}
