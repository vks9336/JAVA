package com.OOPS_in_JAVA.Threading.UsingRunnableInterface;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}
