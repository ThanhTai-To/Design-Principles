package com.thanhtai.dependencyInversion.violation;

public class ColorPicker {
    /*
    Currently, class ColorPicker depends on class Yellow.
    So when we create a new color (e.g Red, Green,..),
    we need to modify the code. Thus, let Color classes depends on class ColorPicker
    */
    private Yellow color;

    public ColorPicker(Yellow yellow) {
        this.color = yellow;
    }

    public void showColorCode() {
        color.out();
    }

}
