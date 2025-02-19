package com.OOPS_in_JAVA.Singleton;

public class Singleton {
    private Singleton(){}
    private static Singleton instances;
    public static Singleton getInstance(){
        if(instances == null) {
            instances = new Singleton();
        }
        return instances;
    }

}
