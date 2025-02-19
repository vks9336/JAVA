package com.OOPS_in_JAVA.ExceptionHandling.UncheckedException;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        try{
            int[] arr = new int[]{1,2,3,4,5};
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == arr[i+1]){  //here we get the exception ArrayIndexOutOfBoundsException
                    System.out.println(arr[i]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
