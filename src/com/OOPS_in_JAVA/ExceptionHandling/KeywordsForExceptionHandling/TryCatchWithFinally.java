package com.OOPS_in_JAVA.ExceptionHandling.KeywordsForExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithFinally {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("Student.txt");
            f.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally {
            System.out.println("No matter what exception occurs this block always be executed");
            int data = 12;
            int sum = data + 1;
            System.out.println(sum);
        }
    }
}
