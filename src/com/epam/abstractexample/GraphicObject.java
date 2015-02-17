package com.epam.abstractexample;

abstract public class GraphicObject implements Formulaes {
    protected int xPosition;
    protected int yPosition;

    public GraphicObject() {
        xPosition = 0;
        yPosition = 0;
    }

    public void moveTo(int newX, int newY) {
        System.out.println("We are moving a " + this.getClass().getSimpleName() + ".");
        xPosition = newX;
        yPosition = newY;
        draw();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ", xPosition = " + xPosition +
                ", yPosition = " + yPosition;
    }

    abstract void draw();
    abstract void resize(int with);
}
