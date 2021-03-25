package com.thanhtai.dependencyInversion.fix;

public class ColorPicker {
    private Color color;

    public ColorPicker(Color color) {
        this.color = color;
    }

    public void showColorCode() {
        color.out();
    }
}
