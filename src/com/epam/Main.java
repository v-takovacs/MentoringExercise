package com.epam;

import com.epam.abstractexample.Circle;
import com.epam.abstractexample.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.resize(10);
        circle.moveTo(10, 5);
        rectangle.resize(10);
        rectangle.moveTo(50, 100);
    }
}
