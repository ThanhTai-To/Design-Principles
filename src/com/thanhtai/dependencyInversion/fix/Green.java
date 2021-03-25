package com.thanhtai.dependencyInversion.fix;

public class Green implements Color {
    private final String code = "#3CB043";
    @Override
    public void out() {
        System.out.println("This color is " + code);
    }
}
