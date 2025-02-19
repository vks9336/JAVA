package com.OOPS_in_JAVA.Interfaces;

public class ElectricEngine implements Engine,Brake{
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Brake Applied");
    }
}
