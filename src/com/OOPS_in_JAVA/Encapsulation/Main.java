package com.OOPS_in_JAVA.Encapsulation;

public class Main {
    public static void main(String[] args) {
        //this is an object of vehicle class
        Vehicle car;
        car = new Vehicle();
        car.setModel(2012);
        car.setName("Audi");
        car.setNumberPlate("UP 40 BX 0001");
        System.out.println(car);

        //this is object of the vehicle class
        Vehicle car2;
        car2 = new Vehicle();
        car2.setModel(2030);
        car2.setName("Lamborghini X2 Iron Man Edition");
        car2.setNumberPlate("UP 40 VK 0000");
        System.out.println(car2);
    }
}
