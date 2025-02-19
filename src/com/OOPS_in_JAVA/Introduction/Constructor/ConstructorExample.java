package com.OOPS_in_JAVA.Introduction.Constructor;

import com.OOPS_in_JAVA.Introduction.Constructor.Car;

public class ConstructorExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Maruti Suzuki X500";
        car.model = 2012;
        car.price = 120000;
        car.is2ndHand = false;

        System.out.println(car);

    }
}
