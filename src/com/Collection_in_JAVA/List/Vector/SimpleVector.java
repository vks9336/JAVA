package com.Collection_in_JAVA.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class SimpleVector {
    public static void main(String[] args) {
        // this the way to define vector
        Vector<String> vector = new Vector<>();

        // way to add element in the vector -> add(T e);
        vector.add("Harsh");
        vector.add("Janvi Gupta");
        vector.add("Vaibhav");

        // adding element in the vector -> add(int index,T e);
        vector.add(3,"Golu");
        vector.add(4,"Deepak");

        // forEach(); method for printing vector
        vector.forEach(System.out::println);

        //Iterator interface for printing values
        Iterator<String> itr = vector.iterator();
        while(itr.hasNext()){
            System.out.print(itr + "\t");
        }



    }
}
