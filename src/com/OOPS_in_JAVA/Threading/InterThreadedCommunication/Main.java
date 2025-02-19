package com.OOPS_in_JAVA.Threading.InterThreadedCommunication;

public class Main {
    public static void main(String[] args) {
        final Customer customer = new Customer(); //

        new Thread(){ // this is an anonymous inner class of Thread class
            public void run(){
                customer.withdraw(15000);
            }
        }.start();


        new Thread(){ // this is an anonymous inner class of Thread class
            public void run(){
                customer.deposit(10000);
            }
        }.start();
    }
}
