package com.OOPS_in_JAVA.Introduction;
//here student is a class
public class ClassExample {
static class Student{

    //name,rollno and marks are the attributes of the student class
    String name;
    int rollno;
    double marks;
}

    public static void main(String[] args) {

        //creating an object of student class

       Student vishal = new Student();

        //vishal is the obj of student class

        vishal.name = "Vishal Kumar Singh";
        vishal.rollno = 187;
        vishal.marks = 93.2;
        System.out.println(vishal.name);
        System.out.println(vishal.rollno);
        System.out.println(vishal.marks + " %");
    }
}
