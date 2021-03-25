package com.thanhtai;

import com.thanhtai.dependencyInversion.violation.ColorPicker;
import com.thanhtai.dependencyInversion.violation.Yellow;
import com.thanhtai.interfaceSegregation.violation.OvalPaint;
import com.thanhtai.interfaceSegregation.violation.Paint;
import com.thanhtai.liskovSubstitution.violation.Rectangle;
import com.thanhtai.openClosed.violation.ShapePaint;
import com.thanhtai.singleResponsibility.violation.Square;


public class ViolationMain {

    public static void main(String[] args) {

        System.out.println("Violation examples:");
        System.out.println("Single responsibility principle");
        Square square = new Square(4.0);
        System.out.println("Square area: " + square.calcArea());
        square.draw();


        System.out.println("\nOpen-closed principle");
        ShapePaint squarePaint = new ShapePaint();
        squarePaint.draw("square");


        System.out.println("\nLiskov substitution principle");
        Rectangle rect = new Rectangle(4, 7);
        System.out.println("Rectangle area: " + rect.calcArea());
        rect = new com.thanhtai.liskovSubstitution.violation.Square(2, 5);
        System.out.println("Square area: " + rect.calcArea());


        System.out.println("\nInterface segregation principle");
        Paint ovalPaint = new OvalPaint();
        ovalPaint.drawOval();


        System.out.println("\nDependency Inversion principle");
        ColorPicker colorPicker = new ColorPicker(new Yellow());
        colorPicker.showColorCode();

    }
}
