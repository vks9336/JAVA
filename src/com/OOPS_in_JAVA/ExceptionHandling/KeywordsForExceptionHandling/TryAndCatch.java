package com.OOPS_in_JAVA.ExceptionHandling.KeywordsForExceptionHandling;

public class TryAndCatch {
    public static void main(String[] args) {
        try{
            //your statement goes here
            int data = 12/0;

            //Exception occurs in try block and handled in catch block
        }
        catch(Exception e){
            //you can catch and handle your exception here
            System.out.println(e);
        }
    }
}
