package com.OOPS_in_JAVA.Threading.ParametersOfThreadClass;

public class DoubleParameter implements Runnable{
    @Override
    public void run() {
        System.out.println("This is runnable part....");
    }

    public static void main(String[] args) {
        DoubleParameter dp = new DoubleParameter();

        // using thread class

        Thread t1 = new Thread(dp,"Makshad mt bhulna....");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
