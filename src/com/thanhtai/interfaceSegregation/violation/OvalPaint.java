package com.thanhtai.interfaceSegregation.violation;

public class OvalPaint implements Paint{

    @Override
    public void drawOval() {
        System.out.println("Draw an oval.");
    }

    // The rest of methods are not need
    // due to we just want to draw an oval
    @Override
    public void drawLine() {
        System.out.println("Draw a line.");
    }

    @Override
    public void drawCircle() {
        System.out.println("Draw a circle.");
    }

    @Override
    public void drawEclipse() {
        System.out.println("Draw an eclipse.");
    }
}
