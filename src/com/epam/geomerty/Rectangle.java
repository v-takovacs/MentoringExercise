package com.epam.geomerty;

import java.util.logging.Logger;

@Shape(type="Rectangle")
public final class Rectangle extends GraphicObject {
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    private String name;
    private int length;
    private int width;

    public Rectangle() {
        LOGGER.info("Creating a Rectangle.");
        name = "Default Rectangle";
        length = 0;
        width = 0;
    }

    public Rectangle(String name, int length, int width) {
        LOGGER.info("Creating a Rectangle with length: " + length + ", width: " + width + ".");
        this.name = name;
        this.length = length;
        this.width = width;
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
        //TODO Handle proper orientation (360+, negative stuff)
        LOGGER.info("Rotating a Rectangle with " + with + ".");
        orientation += with;
    }

    @Override
    public double area() throws WrongAttributeException {
        double toReturn;

        if (length <= 0 || width <= 0) {
            throw new WrongAttributeException("The length or width of the Rectangle must be greater than 0.");
        } else {
            toReturn = length * width;
        }

        return toReturn;
    }

    @Override
    public double perimeter() throws WrongAttributeException {
        double toReturn;

        if (length <= 0 && width <= 0) {
            throw new WrongAttributeException("The length and width of the Rectangle must be greater than 0.");
        } else {
            toReturn = 2 * (length + width);
        }

        return toReturn;
    }
}
