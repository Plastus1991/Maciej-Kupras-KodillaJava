package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private int a;

    public Circle(String name, int a) {
        this.name = name;
        this.a = a;
    }


    @Override
    public String getShapeName() {
        return name;

    }

    @Override
    public double getField() {
        return 3.14 * a * a;

    }


}
