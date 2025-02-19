package com.OOPS_in_JAVA.ExceptionHandling.UncheckedException;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new String("VISHAL");
        try{
            Integer num = (Integer) obj;
        }
        catch(ClassCastException e){
            System.out.println(e.getMessage());
//            System.out.println(e);
        }
    }
}
