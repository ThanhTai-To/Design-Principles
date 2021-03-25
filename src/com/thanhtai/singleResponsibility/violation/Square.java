package com.thanhtai.singleResponsibility.violation;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calcArea() {
        return side * side;
    }

    // Implement a method to draw a square
    public void draw() {
        System.out.println("Draw a square.");
    }
}
