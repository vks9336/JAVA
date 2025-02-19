package com.OOPS_in_JAVA.Enums;

import static com.OOPS_in_JAVA.Enums.Month.December;

public class Main {
    public static void main(String[] args) {
        Month month;
        month = December;
        month.hello();
        System.out.println(Month.valueOf("February"));
        System.out.println(month.ordinal());
        System.out.println(Month.April);

    }
}