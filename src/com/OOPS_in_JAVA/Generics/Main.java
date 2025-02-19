package com.OOPS_in_JAVA.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(12);
        list.add(23);
        list.add(1111);
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0,29);
        System.out.println(list.remove());
        System.out.println(list.size());
        System.out.println(list);



    }
}
