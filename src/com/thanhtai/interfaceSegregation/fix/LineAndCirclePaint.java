package com.thanhtai.interfaceSegregation.fix;

public class LineAndCirclePaint implements LinePaint, CirclePaint{
    @Override
    public void drawLine() {
        System.out.println("Draw a line.");
    }

    @Override
    public void drawCircle() {
        System.out.println("Draw a circle.");
    }

    public void draw() {
        System.out.println("Draw Line and Circle: ");
        drawLine();
        drawCircle();
        System.out.println("Done.");
    }
}
