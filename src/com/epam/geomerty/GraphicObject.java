package com.epam.geomerty;

import java.util.logging.Logger;

abstract public class GraphicObject implements Formulaes {
    private static final Logger LOGGER = Logger.getLogger(GraphicObject.class.getName());
    protected int xPosition;
    protected int yPosition;
    protected int orientation;

    public GraphicObject() {
        LOGGER.info("Default GraphicObject constuctor was called.");
        xPosition = 0;
        yPosition = 0;
        orientation = 0;
    }

    public void moveTo(int newX, int newY) {
        LOGGER.info("We are moving a " + this.getClass().getSimpleName() + ".");
        xPosition = newX;
        yPosition = newY;
    }

    @Override
    public String toString() {
        return " xPosition = " + xPosition +
                ", yPosition = " + yPosition +
                ", orientation = " + orientation;
    }

    abstract void draw();
    abstract void resize(int with);
    abstract void scale(int with);
    abstract void rotate(int with);
}
