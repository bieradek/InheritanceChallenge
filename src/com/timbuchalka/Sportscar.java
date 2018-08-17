package com.timbuchalka;

public class Sportscar extends Car {

    private boolean convertible;
    private int drive;
    private int exhaust;
    private boolean loud;

    //3rd level constructor
    public Sportscar(String color, int size, int engine, boolean electric, boolean convertible, int drive, int exhaust, boolean loud) {
        super(color, size, 2, 4, 20.5, engine, electric, 4);
        this.convertible = convertible;
        this.drive = drive;
        this.exhaust = exhaust;
        this.loud = loud;
    }
}
