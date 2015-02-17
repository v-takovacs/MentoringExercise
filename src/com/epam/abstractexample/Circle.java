package com.epam.abstractexample;

public class Circle extends GraphicObject {
    private int radius;
    private static final double PI = 3.14159;

    public Circle() {
        radius = 10;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + radius +
                ", area = " + area() +
                ", perimeter = " + perimeter();
    }

    @Override
    public void draw() {
        System.out.println("We will draw a Circle here. Current properties are:");
        System.out.println(toString());
    }

    @Override
    public void resize(int with) {
        System.out.println("We are resizing a Circle with " + with + ".");
        radius += with;
        draw();
    }

    @Override
    public double area() {
        return 2 * PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
