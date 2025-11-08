package com;

public class Car1 {
    private String color;
    private int year;

    // Constructor to set values during object creation
    public Car1(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // Only getters provided — read-only encapsulation
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    // A method that represents a car action
    public void CarStatus() {
        System.out.println("Car Status: Running!");
    }
}
