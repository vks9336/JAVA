package com.OOPS_in_JAVA.ExceptionHandling.CheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader f ;
            f = new FileReader("JAVA.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
