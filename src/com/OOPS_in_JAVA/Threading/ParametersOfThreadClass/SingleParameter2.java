package com.OOPS_in_JAVA.Threading.ParametersOfThreadClass;

public class SingleParameter2 implements Runnable{


    //using runnable interface

    @Override
    public void run() {
        System.out.println("Thread using the runnable interface...");
    }

    public static void main(String[] args) {
        SingleParameter2 sp2 = new SingleParameter2();
        // using thread class again

        Thread t1 = new Thread(sp2);

        t1.start();
    }


}
