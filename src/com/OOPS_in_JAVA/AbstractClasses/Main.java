package com.OOPS_in_JAVA.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Car car = new Car();  you could not make object of the abstract classes
        //Car car = new Bugatti(); you can do this
        Car.stat();//as we can see that static method is called directly hence it is allowed in
                   //abstract classes
        System.out.println();
        System.out.println();
        Bugatti bugatti = new Bugatti("Bugatti Sheron",2023,false,"300kmph");
        bugatti.carType("Super Car");
        bugatti.carName("Bugatti Sheron");
        bugatti.car();

        System.out.println("Car model : " + bugatti.model + ", Is the car is used before : " + bugatti.is2ndHand +
                ", Max Speed : " + bugatti.maxSpeed);
        System.out.println();
        System.out.println();

        System.out.println("New car is started from here !!!!");
        System.out.println();
        RollsRoyce rr = new RollsRoyce("Rolls Royce Phantom Limojin",2022,false,"190kmph");
        rr.carName("Rolls Royce Phantom Limojin");
        rr.carType("Royal Car");
        rr.car();

        System.out.println("Car model : " + rr.model + ", Is the car used before : " + rr.is2ndHand +
                ", Max Speed : " + rr.maxSpeed);
    }
}
