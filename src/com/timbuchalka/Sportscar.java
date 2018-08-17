package com.timbuchalka;

public class Sportscar extends Car {

    private boolean convertible;
    private int drive;
    private int exhaust;
    private boolean loud;

    //unique method for Sportscar

    public void uniqueMethod(int someParameter) {
        System.out.println("Sportscar: unique method called with parameter " + someParameter);
    }

    //3rd level constructor
    public Sportscar(String color, int size, int engine, boolean electric, boolean convertible, int drive, int exhaust, boolean loud) {
        super(color, size, 2, 4, 20.5, engine, electric, 4);
        this.convertible = convertible;
        this.drive = drive;
        this.exhaust = exhaust;
        this.loud = loud;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getExhaust() {
        return exhaust;
    }

    public void setExhaust(int exhaust) {
        this.exhaust = exhaust;
    }

    public boolean isLoud() {
        return loud;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }
}
