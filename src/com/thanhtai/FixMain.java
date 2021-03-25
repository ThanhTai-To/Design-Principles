package com.thanhtai;


import com.thanhtai.dependencyInversion.fix.Color;
import com.thanhtai.dependencyInversion.fix.ColorPicker;
import com.thanhtai.dependencyInversion.fix.Green;
import com.thanhtai.dependencyInversion.fix.Red;
import com.thanhtai.interfaceSegregation.fix.LineAndCirclePaint;
import com.thanhtai.interfaceSegregation.fix.Paints;
import com.thanhtai.liskovSubstitution.fix.RectangleLiskov;
import com.thanhtai.liskovSubstitution.fix.SquareLiskov;
import com.thanhtai.openClosed.fix.RedCirclePaint;
import com.thanhtai.openClosed.fix.RoundCornerSquarePaint;
import com.thanhtai.openClosed.fix.ShapePaint;
import com.thanhtai.singleResponsibility.fix.Paintor;
import com.thanhtai.singleResponsibility.fix.ShapeInterface;
import com.thanhtai.singleResponsibility.fix.Square;

import java.util.ArrayList;
import java.util.List;

public class FixMain {

    public static void main(String[] args) {

        System.out.println("Fixed examples:");
        // Single responsibility principle
        System.out.println("Single responsibility principle");
        ShapeInterface square = new Square(4.4);
        System.out.println("Square area: " + Math.round(square.calcArea()*100.0)/100.0);
        Paintor paintor = new Paintor(square);
        paintor.draw();


        System.out.println("\nOpen-closed principle");
        List<ShapePaint> shapePaints = new ArrayList<>();
        shapePaints.add(new RoundCornerSquarePaint());
        shapePaints.add(new RedCirclePaint());
        for (ShapePaint shapePaint : shapePaints) {
            shapePaint.draw();
        }


        /*************************
        Relationship between classes: Rectangle(Liskov) is a Shape, Square(Liskov) is a Shape(Liskov)
        Rectangle has a Square
        **************************/
        System.out.println("\nLiskov substitution principle");
        SquareLiskov squareLiskov = new SquareLiskov(8);
        System.out.println("Square area: " + Math.round(squareLiskov.calcArea()*100.0)/100.0);
        RectangleLiskov rectangleLiskov = new RectangleLiskov(squareLiskov) ;
        System.out.println("Rectangle area: " + Math.round(rectangleLiskov.calcArea()*100.0)/100.0);


        System.out.println("\nInterface segregation principle");
        LineAndCirclePaint lineAndCirclePaint = new LineAndCirclePaint();
        lineAndCirclePaint.draw();
        Paints paints = new Paints();
        paints.draw();


        System.out.println("\nDependency Inversion principle");
        ColorPicker colorPicker = new ColorPicker(new Red());
        colorPicker.showColorCode();
        colorPicker = new ColorPicker(new Green());
        colorPicker.showColorCode();


    }
}
