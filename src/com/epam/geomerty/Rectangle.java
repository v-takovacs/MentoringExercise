package com.epam.geomerty;

import java.util.logging.Logger;

public class Rectangle extends GraphicObject {
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    private int length;
    private int width;

    public Rectangle() {
        LOGGER.info("Creating a Rectangle.");
        length = 10;
        width = 5;
    }

    @Override
    public String toString() {
        String toReturn = null;

        try {
            toReturn = super.toString() +
                    ", length = " + length +
                    ", width = " + width +
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
            LOGGER.info("Drawing a Rectangle, current properties are: " + toString());
        }
    }

    @Override
    public void resize(int with) {
        LOGGER.info("Resizing a Rectangle with " + with + ".");
        length += with;
        width += with;
    }

    @Override
    void scale(int with) {
        LOGGER.info("Scaling a Rectangle with " + with + ".");
        length *= with;
        width *= with;
    }

    @Override
    void rotate(int with) {
        LOGGER.info("Rotating a Rectangle with " + with + ".");
        orientation += with;
    }

    @Override
    public double area() throws WrongAttributeException {
        double toReturn = 0;

        if (length <= 0 || width <= 0) {
            throw new WrongAttributeException("The length or width of the Rectangle must be greater than 0.");
        } else {
            toReturn = length * width;
        }

        return toReturn;
    }

    @Override
    public double perimeter() throws WrongAttributeException {
        double toReturn = 0;

        if (length <= 0 && width <= 0) {
            throw new WrongAttributeException("The length and width of the Rectangle must be greater than 0.");
        } else {
            toReturn = 2 * (length + width);
        }

        return toReturn;
    }
}
