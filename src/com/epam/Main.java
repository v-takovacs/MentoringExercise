package com.epam;

import com.epam.geomerty.Box;
import com.epam.geomerty.Circle;
import com.epam.geomerty.GraphicObject;
import com.epam.geomerty.Rectangle;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Circle circle = new Circle("circle", 10);
        Rectangle rectangle = new Rectangle();
        Rectangle anotherRectangle = new Rectangle("rectangle", 10, 20);

        circle.moveTo(10, 5);
        rectangle.resize(10);
        rectangle.moveTo(50, 100);
        circle.draw();
        rectangle.draw();

        Box<GraphicObject> box = new Box<>();

        box.putInto(circle.getName(), circle);
        box.putInto(rectangle.getName(), rectangle);
        box.putInto(anotherRectangle.getName(), anotherRectangle);

        box.lookInto();

        LOGGER.info(box.getFrom(anotherRectangle.getName()).toString());

    }
}
