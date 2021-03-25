package com.thanhtai.singleResponsibility.fix;



public class Square implements ShapeInterface {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

}
