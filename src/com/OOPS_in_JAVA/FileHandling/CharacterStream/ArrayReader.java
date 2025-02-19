package com.OOPS_in_JAVA.FileHandling.CharacterStream;

import java.io.CharArrayReader;
import java.io.IOException;

public class ArrayReader {
    public static void main(String[] args) {

        char[] arr = new char[]{'H','E','L','L','O','W'};

        try(CharArrayReader car = new CharArrayReader(arr)){
            int letters ;
            while(car.ready()){
                letters = car.read();
                System.out.print( (char)letters + "\t");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
