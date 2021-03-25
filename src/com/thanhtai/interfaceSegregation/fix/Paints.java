package com.thanhtai.interfaceSegregation.fix;

public class Paints implements LinePaint, OvalPaint, CirclePaint,EclipsePaint{
    @Override
    public void drawLine() {
        System.out.println("Draw a line.");
    }

    @Override
    public void drawOval() {
        System.out.println("Draw an oval.");
    }

    @Override
    public void drawCircle() {
        System.out.println("Draw a circle.");
    }

    @Override
    public void drawEclipse() {
        System.out.println("Draw an eclipse.");
    }

    public void draw() {
        System.out.println("Draw all shapes: ");
        drawLine();
        drawOval();
        drawCircle();
        drawEclipse();
        System.out.println("Done.");
    }

}
