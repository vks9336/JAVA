package com.OOPS_in_JAVA.ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try{
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader("namaste.txt"));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
