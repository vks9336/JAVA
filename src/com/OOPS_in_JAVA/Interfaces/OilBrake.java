package com.OOPS_in_JAVA.Interfaces;

public class OilBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("Brake Applied");
    }
}
