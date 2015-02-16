package com.epam.abstractexample;

abstract public class GraphicObject {
    protected int xPosition;
    protected int yPosition;
    protected int height;
    protected int width;

    public GraphicObject() {
        xPosition = 0;
        yPosition = 0;
        height = 0;
        width = 0;
    }

    public void moveTo(int newX, int newY) {
        System.out.println("We are moving a " + this.getClass().getSimpleName() + ".");
        xPosition = newX;
        yPosition = newY;
        draw();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "xPosition=" + xPosition + ", " +
                "yPosition=" + yPosition + ", " +
                "height=" + height + ", " +
                "width=" + width + "}";
    }

    abstract void draw();
    abstract void resize();
}
