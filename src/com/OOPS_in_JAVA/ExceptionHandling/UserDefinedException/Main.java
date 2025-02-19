package com.OOPS_in_JAVA.ExceptionHandling.UserDefinedException;

public class Main {
    public static void main(String[] args) {
        String name = "Parth";
        try{
            if (name != "Vishal"){
                throw new MyException("Please, change the name to Vishal.");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally {

            name = "Vishal";
            System.out.println("I am " + name);
        }
    }
}
