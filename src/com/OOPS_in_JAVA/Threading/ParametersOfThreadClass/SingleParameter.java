package com.OOPS_in_JAVA.Threading.ParametersOfThreadClass;

public class SingleParameter {
    public static void main(String[] args) {
        // using the thread class

        Thread t1 = new Thread("Makshad mt bhulna");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
