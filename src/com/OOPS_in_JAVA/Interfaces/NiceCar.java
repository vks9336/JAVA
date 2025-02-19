package com.OOPS_in_JAVA.Interfaces;

public class NiceCar{
    private Engine engine;
    private final Media player = new CDPlayer();
    private  Brake b = new OilBrake();
    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.acc();
    }
    public void brake(){
        b.brake();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        System.out.println("Wait,engine is upgrading");
        this.engine = new ElectricEngine();
    }
}
