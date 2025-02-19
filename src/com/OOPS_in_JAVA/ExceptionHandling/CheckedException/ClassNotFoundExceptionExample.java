package com.OOPS_in_JAVA.ExceptionHandling.CheckedException;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try{
            Class<?> classname = Class.forName("OOPS_in_JAVA.Birthday");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
