package com.epam;

import com.epam.abstractexample.Circle;
import com.epam.abstractexample.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        rectangle.resize();
        circle.moveTo(10, 5);
        circle.resize();
        rectangle.moveTo(50, 100);
    }
}
