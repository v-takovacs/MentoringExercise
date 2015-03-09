package com.epam.geomerty;

import java.util.logging.Logger;

@Shape(type="Circle")
public final class Circle extends GraphicObject {
    private static final Logger LOGGER = Logger.getLogger(Circle.class.getName());
    private static final double PI = 3.14159;
    private static final String MESSAGE = "The radius of the Circle must be greater than 0.";
    private String name;
    private int radius;

    public Circle() {
        LOGGER.info("Creating a Circle.");
        name = "Default Circle";
        radius = 0;
    }

    public Circle(String name, int radius) {
        LOGGER.info("Creating a Circle with radius: " + radius + ".");
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String toReturn = null;

        try {
            toReturn = super.toString() +
                    ", name = " + name +
                    ", radius = " + radius +
                    ", area = " + area() +
                    ", perimeter = " + perimeter();
        } catch (WrongAttributeException exception) {
            LOGGER.warning(exception.getMessage());
        }

        return toReturn;
    }

    @Override
    public void draw() {
        String properties = toString();

        if (properties != null) {
            LOGGER.info("Drawing a Circle, current properties are: " + properties);
        }
    }

    @Override
    public void resize(int with) {
        LOGGER.info("Resizing a Circle with " + with + ".");
        radius += with;
    }

    @Override
    void scale(int with) {
        LOGGER.info("Scaling a Circle with " + with + ".");
        radius *= with;
    }

    @Override
    void rotate(int with) {
        //TODO Handle proper orientation (360+, negative stuff)
        LOGGER.info("Rotating a Circle with " + with + ".");
        orientation += with;
    }

    @Override
    public double area() throws WrongAttributeException {
        double toReturn;

        if (radius <= 0) {
            throw new WrongAttributeException(MESSAGE);
        } else {
            toReturn = 2 * PI * Math.pow(radius, 2);
        }

        return toReturn;
    }

    @Override
    public double perimeter() throws WrongAttributeException {
        double toReturn;

        if (radius <= 0) {
            throw new WrongAttributeException(MESSAGE);
        } else {
            toReturn = 2 * PI * radius;
        }

        return toReturn;
    }
}
