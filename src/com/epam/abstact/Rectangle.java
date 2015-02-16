package com.epam.abstact;

public class Rectangle extends GraphicObject {

    public Rectangle() {
        height = 10;
        width = 5;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void draw() {
        System.out.println("We will draw a Rectangle here. Current properties are:");
        System.out.println(toString());
    }

    @Override
    public void resize() {
        System.out.println("We are resizing a Rectangle with 10.");
        height += 10;
        width += 5;
        draw();
    }
}
