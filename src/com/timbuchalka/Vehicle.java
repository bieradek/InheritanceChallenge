package com.timbuchalka;

public class Vehicle {
    private String color;
    private int size;
    private int doors;

    public Vehicle(String color, int size, int doors) {
        this.color = color;
        this.size = size;
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void move(int speed) {
        System.out.println("Vehicle: moving at " + speed);
    }

    public void changeDirection(int direction) {
        System.out.println("Vehicle: changing the direction to " + direction);
    }
}
