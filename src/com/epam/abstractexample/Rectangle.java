package com.epam.abstractexample;

public class Rectangle extends GraphicObject {
    private int length;
    private int width;

    public Rectangle() {
        length = 10;
        width = 5;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", length = " + length +
                ", width = " + width +
                ", area = " + area() +
                ", perimeter = " + perimeter();
    }

    @Override
    public void draw() {
        System.out.println("We will draw a Rectangle here. Current properties are:");
        System.out.println(toString());
    }

    @Override
    public void resize(int with) {
        System.out.println("We are resizing a Rectangle " + with + ".");
        length += with;
        width += with;
        draw();
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
