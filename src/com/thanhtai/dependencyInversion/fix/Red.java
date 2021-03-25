package com.thanhtai.dependencyInversion.fix;

public class Red implements Color {
    private final String code = "#D0312D";
    @Override
    public void out() {
        System.out.println("This color is " + code);
    }
}
