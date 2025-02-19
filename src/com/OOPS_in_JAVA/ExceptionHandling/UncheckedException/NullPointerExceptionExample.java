package com.OOPS_in_JAVA.ExceptionHandling.UncheckedException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
