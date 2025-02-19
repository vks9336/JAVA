package com.OOPS_in_JAVA.Static;

public class Main {
    public static void main(String[] args) {
        Human vishal = new Human("Vishal",21,"Male",false);
        Human vaibahv = new Human("Vaibhav",20,"Male",false);
        Human ujjwal = new Human("Ujjwal",21,"Male",false);
        Human om = new Human("OM",21,"Male",false);
        Human sonu = new Human("Sonu Sharma",40,"Male",true);
        Human rachit = new Human("Rachit",21,"Male",false);
        Human himanshu = new Human("Himanshu",22,"Male",false);
        Human adarsh = new Human("Adarsh",22,"Male",false);
//        System.out.println(Human.population);

        int mul = adarsh.multiply(2,3);
        System.out.println(mul);

        System.out.println(adarsh.multiply(2,3));
//        System.out.println("Vishal's Data : [ " + vishal + " ]");
    }
}
