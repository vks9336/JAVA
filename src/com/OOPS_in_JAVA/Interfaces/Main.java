package com.OOPS_in_JAVA.Interfaces;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();//this is my car
        car.start();//here I started the default car which is set to power engine
        car.startMusic();//music started
        car.accelerate();
        car.brake();
        car.stopMusic();//music stops
        car.upgradeEngine();//here I upgraded my engine to electric engine
        // you can set upgrade your engine to any type by adding properties of that engine
        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();//car stops
    }
}
