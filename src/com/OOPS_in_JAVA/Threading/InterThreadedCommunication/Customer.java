package com.OOPS_in_JAVA.Threading.InterThreadedCommunication;

public class Customer {

    int amount = 10000;

    synchronized void withdraw(int amount){

        System.out.println("Going to withdraw....");
        if(this.amount < amount){
            System.out.println("Less balance, waiting for deposit.....");
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }



    synchronized void deposit(int amount){
        System.out.println("Going to deposit....");

        this.amount += amount;

        System.out.println("Deposit completed...");
        notify();
    }
}
