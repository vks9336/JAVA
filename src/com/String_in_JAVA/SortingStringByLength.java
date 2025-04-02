package com.String_in_JAVA;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStringByLength {
    //sorting method
    public static void sortStringByLength(String[] str){
        Arrays.sort(str, Comparator.comparingInt(String::length));
    }

    //main
    public static void main(String[] args) {
        String[] str = new String[]{"hello", "new", "duniya", "vivek", "vishesh"};
        sortStringByLength(str);
        for(String s : str){
            System.out.printf("%s ", s);
        }
    }
}
