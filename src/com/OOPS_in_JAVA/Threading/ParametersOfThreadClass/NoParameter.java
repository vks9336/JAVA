package com.OOPS_in_JAVA.Threading.ParametersOfThreadClass;

public class NoParameter extends Thread {
    public void run(){
        System.out.println("This thread is running......");
    }

    public static void main(String[] args) {
        NoParameter np = new NoParameter();
        np.start();
    }
}
