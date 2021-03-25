package com.thanhtai.liskovSubstitution.fix;

public class SquareLiskov implements ShapeLiskov {
    private double side;

    public SquareLiskov(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
