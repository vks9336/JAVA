package com.OOPS_in_JAVA.FileHandling.CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("F:\\JAVA\\src\\com\\OOPS_in_JAVA\\FileHandling\\CharacterStream\\example.txt")){

            int letters = fr.read();
            while(fr.ready()){
                System.out.print((char)letters + "\t");
                letters = fr.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
