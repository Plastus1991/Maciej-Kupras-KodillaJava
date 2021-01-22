package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    double  a;
    double  h;

    public Triangle(int a, int h, String name  ) {
        this.a = a;
        this.h = h;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;

    }

    @Override
    public double getField() {
        return (a*h)/2;

    }
}
