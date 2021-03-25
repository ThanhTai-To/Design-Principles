package com.thanhtai.liskovSubstitution.fix;

public class RectangleLiskov implements ShapeLiskov{

    private double width, height;

    public RectangleLiskov(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*************************
     Relationship between classes: Rectangle(Liskov) is a Shape, Square(Liskov) is a Shape(Liskov)
     Relationship between classes: Rectangle has a Square
     **************************/
    public RectangleLiskov(SquareLiskov squareLiskov) {
        this.width = squareLiskov.getSide();
        this.height = squareLiskov.getSide();
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
