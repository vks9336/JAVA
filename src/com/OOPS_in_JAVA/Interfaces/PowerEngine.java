package com.OOPS_in_JAVA.Interfaces;

public class PowerEngine implements Engine,Brake{
    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Brake Applied");
    }
}
