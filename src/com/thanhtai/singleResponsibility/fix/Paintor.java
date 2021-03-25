package com.thanhtai.singleResponsibility.fix;

public class Paintor {

    protected ShapeInterface shape;

    public Paintor(ShapeInterface shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Draw a shape.");
    }

}
