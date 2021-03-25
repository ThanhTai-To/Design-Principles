package com.thanhtai.liskovSubstitution.violation;

public class Square extends Rectangle{

    // A square side must be the same
    public Square(double width, double height) {
        super(width, height);
    }

}
