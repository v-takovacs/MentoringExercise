package com.epam.abstact;

public class Circle extends GraphicObject {
    private int radius;

    public Circle() {
        radius = 10;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "xPosition=" + xPosition + ", " +
                "yPosition=" + yPosition + ", " +
                "radius=" + radius + "}";
    }

    @Override
    public void draw() {
        System.out.println("We will draw a Circle here. Current properties are:");
        System.out.println(toString());
    }

    @Override
    public void resize() {
        System.out.println("We are resizing a Circle with 10.");
        radius += 10;
        draw();
    }
}
