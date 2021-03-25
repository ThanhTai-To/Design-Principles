package com.thanhtai.openClosed.violation;

public class ShapePaint {

    public void draw(String typeOfShape) {
        switch(typeOfShape.toLowerCase()) {
            case "square": {
                System.out.println("Draw a square.");
                break;
            }
            case "circle": {
                System.out.println("Draw a circle.");
                break;
            }
            case "eclipse": {
                System.out.println("Draw an eclipse.");
                break;
            }
            default: {
                System.out.println("Not exist type of shape.");
                break;
            }
        }
    }
}
