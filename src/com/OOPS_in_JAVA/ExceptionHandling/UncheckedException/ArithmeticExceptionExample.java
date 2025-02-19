package com.OOPS_in_JAVA.ExceptionHandling.UncheckedException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try{ // we use try to see whether the code gives exception or not
            int data = 12;
            int divide = data / 0; //we have divided by zero hence it gives an exception of type Arithmetic Exception
        }
        catch(ArithmeticException e){ //this block catch the exception
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());

            //all above are the method to print the exception that occurs
        }
    }
}
