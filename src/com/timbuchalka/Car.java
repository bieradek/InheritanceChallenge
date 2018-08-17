package com.timbuchalka;

public class Car extends Vehicle {
    private int wheels;
    private double wheelsize;
    private int engine;
    private boolean electric;
    private int lights;


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWheelsize() {
        return wheelsize;
    }

    public void setWheelsize(double wheelsize) {
        this.wheelsize = wheelsize;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    //3 level constructor
    public Car(String color, int size, int doors, int wheels, double wheelsize, int engine, boolean electric, int lights) {
        super(color, size, doors);
        this.wheels = wheels;
        this.wheelsize = wheelsize;
        this.engine = engine;
        this.electric = electric;
        this.lights = lights;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car: driving at " + speed);
        super.move(speed);
    }

    @Override
    public void changeDirection(int direction) {
        System.out.println("Car: turning in the direction: ");
        super.changeDirection(direction);
    }

    public void changeGears(int gear) {
        System.out.println("Car: changing gear to " + gear);
    }

}
