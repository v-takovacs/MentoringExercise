package com.epam.geomerty;

import java.util.logging.Logger;

public class Circle extends GraphicObject {
    private static final Logger LOGGER = Logger.getLogger(Circle.class.getName());
    private static final double PI = 3.14159;
    private int radius;

    public Circle() {
        LOGGER.info("Creating a Circle.");
        radius = 0;
    }

    @Override
    public String toString() {
        String toReturn = null;

        try {
            toReturn = super.toString() +
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
        LOGGER.info("Rotating a Circle with " + with + ".");
        orientation += with;
    }

    @Override
    public double area() throws WrongAttributeException {
        double toReturn = 0;

        if (radius <= 0) {
            throw new WrongAttributeException("The radius of the Circle must be greater than 0.");
        } else {
            toReturn = 2 * PI * Math.pow(radius, 2);
        }

        return toReturn;
    }

    @Override
    public double perimeter() throws WrongAttributeException {
        double toReturn = 0;

        if (radius <= 0) {
            throw new WrongAttributeException("The radius of the Circle must be greater than 0.");
        } else {
            toReturn = 2 * PI * radius;
        }

        return toReturn;
    }
}
