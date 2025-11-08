package com;

public class Car {
    // Private data fields - hidden from outside access
    private String color;
    private int year;

    // Public getter and setter methods (controlled access)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // A simple method showing car behavior
    public void CarStatus() {
        System.out.println("Car Status: Running!");
    }
}
